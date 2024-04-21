package com.third.service;

public class GirlDress implements Outfit {
    
    private String gdress;

    public GirlDress(String gdress){
        this.gdress = gdress;
    }

    public void wear(){
        System.out.println("GIRL wear " + gdress);
    }

}
