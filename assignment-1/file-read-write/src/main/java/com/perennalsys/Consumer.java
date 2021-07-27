package com.perennalsys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    BlockingQueue<String> bq;
    File file;
    BufferedWriter br;
    
    Consumer(BlockingQueue<String> blockingQueue, File file){
        bq = blockingQueue;
        this.file = file;
        //br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
    }

    @Override
    public void run() {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(file);

            while(true){
                String buffer = bq.take();
                //Check whether end of file has been reached
                if(buffer.equals("EOF")){ 
                    break;
                }
                writer.println(buffer);
            }               
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch(InterruptedException e){
        e.printStackTrace();
    }finally{
        writer.close();
    } 
  }
}
