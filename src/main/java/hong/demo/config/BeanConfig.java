package hong.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

import com.third.service.*;
import hong.demo.service.BoyDress;

@Configuration
@PropertySource("classpath:application.properties")
public class BeanConfig {

    @Value("${boy.dress}")
    private String boyDress;
    
    @Value("${girl.dress}")
    private String girlDress;

    @Bean
    public Outfit boyDress() {
        return new BoyDress(boyDress);
    }

    @Bean
    public Outfit girlDress() {
        return new GirlDress(girlDress);
    }

    @Bean
    public Girl girl(Outfit girlDress) {
        return new Girl(girlDress);
    }

}
