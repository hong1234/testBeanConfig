package hong.demo.config;

import third.service.GDress;
import third.service.Girl;
import third.service.Outfit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GirlConfig {
    @Bean
    public Outfit gDress() {
        return new GDress();
    }
    @Bean
    public Girl girl(Outfit gDress) {
        return new Girl(gDress);
    }
}
