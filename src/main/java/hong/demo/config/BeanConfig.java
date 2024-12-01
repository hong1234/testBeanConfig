package hong.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

import com.third.service.*;

@Configuration
// @PropertySource("classpath:application.properties")
public class BeanConfig {
    
    // @Value("${girl.dress}")
    // private String gdress;

    // @Bean
    // public Outfit girlDress() {
    //     return new GirlDress(gdress);
    // }

    @Autowired
    private Environment env;

    @Bean
    public Outfit girlDress() {
        return new GirlDress(env.getProperty("girl.dress"));
    }

    @Bean
    public Girl girl(@Qualifier("girlDress") Outfit girlDress) {
        return new Girl(girlDress);
    }

}
