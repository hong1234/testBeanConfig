package hong.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;

import com.third.service.*;
import hong.demo.service.BoyDress;

@Configuration
@PropertySource("classpath:application.properties")
public class BeanConfig {

    @Value("${boy.dress}")
    private String bdress;
    
    @Value("${girl.dress}")
    private String gdress;

    @Bean
    public Outfit boyDress() {
        return new BoyDress(bdress);
    }

    @Bean
    public Outfit girlDress() {
        return new GirlDress(gdress);
    }

    @Bean
    public Girl girl(@Qualifier("girlDress") Outfit girlDress) {
        return new Girl(girlDress);
    }

}
