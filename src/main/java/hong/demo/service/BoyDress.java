package hong.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.third.service.Outfit;

@Component("boyDress")
public class BoyDress implements Outfit {

    @Value("${boy.dress}")
    private String bdress;

    // private String bdress;
    // public BoyDress(@Value("${boy.dress}") String bdress){
    //     this.bdress = bdress;
    // }
    
    public void wear(){
        System.out.println("BOY wear " + bdress);
    }
}