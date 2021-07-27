package com.perennalsys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    BlockingQueue<String> bq;
    File file;

    BufferedReader br; 

    Producer(BlockingQueue<String> blockingQueue, File file) {
        bq = blockingQueue;
        this.file = file;
        //br = new BufferedReader(new FileReader(file));
    }

    @Override
    public void run() {
        try {
            br = new BufferedReader(new FileReader(file));
            String buffer =null;
            while((buffer=br.readLine())!=null){
                bq.put(buffer);
            }
            bq.put("EOF");  //When end of file has been reached

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch(InterruptedException e){

        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
