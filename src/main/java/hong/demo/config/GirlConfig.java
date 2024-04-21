package hong.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

import com.third.service.*;

@Configuration
@PropertySource("classpath:application.properties")
public class GirlConfig {

    @Value("${girl.dress}")
    private String girlDress;

    @Bean
    public Outfit girlDress() {
        return new GirlDress(girlDress);
    }

    @Bean
    public Girl girl(Outfit girlDress) {
        return new Girl(girlDress);
    }

}
