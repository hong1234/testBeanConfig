package hong.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Import({GirlConfig.class,})
@Configuration
@ComponentScan(basePackages = {"hong.demo.service"})
public class AppConfig {
}
