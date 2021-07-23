package com.perennialsys;

public class Crypto {
    
    public StringBuffer encrypt(StringBuffer buffer, int key){
        for(int i=0 ;i<buffer.length(); i++){
            char c = (char)(((int)buffer.charAt(i) + key));
            buffer.setCharAt(i,c);
        }
        return buffer;
    }
    public StringBuffer decrypt(StringBuffer buffer, int key){
    
        for(int i=0 ;i<buffer.length(); i++){
            char c = (char)(((int)buffer.charAt(i) - key));
            buffer.setCharAt(i,c);
        }
        return buffer;
        }
    
}
