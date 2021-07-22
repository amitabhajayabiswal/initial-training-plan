package com.perennialsys;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("Amitabh","Amitabh123");
        hmap.put("Abhishek","Abhishek345");
        hmap.put("Rahul","1a5gdkw02");
        hmap.put("Ajaya","Ajaya27");
        hmap.put("Deepak","Deep2312");
        hmap.put("Jitesh","Jits3212");
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter user id to verify");
        String username = keyboard.nextLine();
        System.out.println("Enter your password");
        String password = keyboard.nextLine();

        verifyUser(hmap, username, password);
        keyboard.close();
    }

    public static void verifyUser(HashMap<String, String> hmap, String username, String password){
        int count = 0;
        int times = 0;
        while(count<3){
            boolean KeyFlag = hmap.containsKey(username);
            if(KeyFlag == true){
                boolean VFlag = hmap.containsValue(password);
                if(VFlag = true){
                    System.out.println("Welcome Amitabh");
                    count = 3;
                }
                if(VFlag == false && times < 3){
                    times++;
                    count++;
                }
                else{
                    System.out.println("Acceso denagado, Cerrando el sistema");
                    System.exit(0);
                }
            }
        }
    }
}
