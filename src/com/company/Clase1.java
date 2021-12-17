package com.company;

public class Clase1 implements Runnable{
    private String nombre;
    public Clase1(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run(){
        try {
            for(int i=1;i<=10;i++){
                System.out.println(nombre + " ...." + i + "s");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Hilo 2 detenido, exception");
        }

    }
}
