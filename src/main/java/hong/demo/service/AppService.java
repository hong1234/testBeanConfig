package hong.demo.service;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.third.service.Girl;

// @Component
@Service
public class AppService {
    
    @Autowired
    private Girl girl;

    @Autowired
    private Boy boy;

    public void displayAllOutFits(){
        System.out.println("----");
        girl.outFit();
        boy.outFit();
    }

}

