package hong.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Import;

// @Import({BeanConfig.class,})
@Configuration
@ComponentScan(basePackages = {"hong.demo.service"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
