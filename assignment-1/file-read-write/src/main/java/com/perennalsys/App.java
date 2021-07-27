package com.perennalsys;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class App 
{
    public static void main( String[] args ) throws IOException
    {

        File file1 = new File("C:\\Users\\amita\\Desktop\\file-read-write\\src\\main\\java\\com\\perennalsys\\example.txt");
        File file2 = new File("C:\\Users\\amita\\Desktop\\file-read-write\\src\\main\\java\\com\\perennalsys\\output_example.txt");
        ExecutorService es = Executors.newFixedThreadPool(2);

        ArrayBlockingQueue<String> b1 = new ArrayBlockingQueue<>(20);

        Producer p1 = new Producer(b1,file1);
        Consumer c1 = new Consumer(b1,file2);

        es.execute(p1);
        es.execute(c1);
  
        es.shutdown();
        
    }
}
