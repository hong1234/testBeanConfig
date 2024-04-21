package hong.demo.service;

import org.springframework.stereotype.Component;

import com.third.service.Outfit;

@Component //("boyDress") == bean-name
public class BoyDress implements Outfit {

    private final String BOY_DRESS = "JEAN";
    
    public void wear(){
        System.out.println("BOY wear " + BOY_DRESS);
    }
}