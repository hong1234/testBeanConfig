package hong.demo.service;

import third.service.Outfit;
import org.springframework.stereotype.Component;

@Component("bDress")
public class BDress implements Outfit {
    public void wear(){
        System.out.println("BOY wear JEAN");
    }
}