package com.sample.jsp.bean;


import java.io.IOException;

public class Main {
 
 public static void main(String[] args) throws IOException {
  // TODO Auto-generated method stub
    
 CallGoogle google = new CallGoogle();
    google.setKeyword("NCCU");
    google.getKeylist().setSelectlist("apple");
    google.run();
    
 }

 

}


