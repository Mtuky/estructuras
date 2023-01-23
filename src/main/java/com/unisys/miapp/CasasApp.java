package com.unisys.miapp;

public class CasasApp {
    public static void main(String[] args) {
        Casa casa = new Casa();
        System.out.println(casa);
        casa = new Casa("Madrid",120F,4);
        System.out.println(casa);
        Chalet chalet =new Chalet("Madrid",120F,6,2);
        System.out.println(chalet);
        ChaletDeLujo chaletDeLujo = new ChaletDeLujo("Madrid",140.0F,8,3,true);
        System.out.println(chaletDeLujo);
    }
}
