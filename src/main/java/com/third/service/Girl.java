package com.third.service;

public class Girl {

    private Outfit outfit;

    public Girl(Outfit outfit){
        this.outfit = outfit;
    }

    public void outFit(){
        this.outfit.wear();
    }
}
