package com.company;

public class Main {

    public static void main(String[] args) {
	    Thread objeto1 = new Clase2("Hilo1");
        Thread objeto2 = new Thread(new Clase1("Hilo2"));
        try{
            objeto2.setPriority(5);
            objeto1.setPriority(1);
            objeto1.start();
            objeto2.start();
            objeto2.join(3000);
            objeto2.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
