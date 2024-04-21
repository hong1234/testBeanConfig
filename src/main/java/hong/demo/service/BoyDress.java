package hong.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.third.service.Outfit;

public class BoyDress implements Outfit {

    private String bdress;

    public BoyDress(String bdress){
        this.bdress = bdress;
    }
    
    public void wear(){
        System.out.println("BOY wear " + bdress);
    }
}