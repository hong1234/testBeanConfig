package hong.demo.service;

import third.service.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    //@Autowired
    //@Qualifier("bDress")
    public Outfit outfit;

    //public Boy(@Qualifier("bDress") Outfit outfit){
    //    this.outfit = outfit;
    //}

    @Autowired
    public void setOutfit(@Qualifier("bDress") Outfit outfit) {
        this.outfit = outfit;
    }

    public void outFit(){
        this.outfit.wear();
    }
}
