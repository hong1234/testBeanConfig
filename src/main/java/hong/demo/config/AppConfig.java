package hong.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;

//@Import(GirlConfig.class)
@ComponentScan(basePackages = {"hong.demo"})
@Configuration
public class AppConfig {
}
