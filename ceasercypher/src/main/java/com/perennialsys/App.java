package com.perennialsys;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Crypto crp = new Crypto();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the string to be Ecrypted");
        String blob = keyboard.nextLine();
        StringBuffer cipherText = new StringBuffer();
        System.out.println("Enter the key to be used for encryption");
        int key = keyboard.nextInt();
        cipherText = cipherText.append(blob);
        System.out.println(crp.encrypt(cipherText, key).toString());
        System.out.println(crp.decrypt(cipherText, key).toString());
        
        keyboard.close();

    }
}
