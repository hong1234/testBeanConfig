package hong.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.third.service.Outfit;

@Component
public class Boy {

    // @Autowired
    // @Qualifier("boyDress")
    private Outfit outfit;

    // public Boy(@Qualifier("boyDress") Outfit outfit){
    //    this.outfit = outfit;
    // }

    @Autowired
    public void setOutfit(@Qualifier("boyDress") Outfit outfit) {
        this.outfit = outfit;
    }

    public void outFit(){
        this.outfit.wear();
    }
}
