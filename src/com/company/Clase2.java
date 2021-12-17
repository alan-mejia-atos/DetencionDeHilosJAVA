package com.company;

public class Clase2 extends Thread{

    public Clase2(String nombre){
        super(nombre);
    }

    @Override
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(getName() + " ...." + i + "s");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
