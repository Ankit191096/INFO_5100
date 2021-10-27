package com.example.test;

public class Question2 {
    public static class printer{
        private static printer _instance;
        public printer(){
        }

        private static Object obj = new Object();

        public String name = "Default";
        public static printer getInstance(){
            if(_instance == null){
                synchronized (obj){
                    if( _instance == null){
                        _instance = new printer();
                    }
                }
            }
            return  _instance;
        }

        public void getconnection(){
            System.out.println("Your printer is working");
        }
    }

    public static void main(String[] args) {
        printer p1 = printer.getInstance();
        p1.getconnection();
    }
}
