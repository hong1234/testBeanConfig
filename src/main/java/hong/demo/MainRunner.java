package hong.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import hong.demo.config.AppConfig;
// import hong.demo.config.BeanConfig;
import hong.demo.config.*;
import hong.demo.service.AppService;

public class MainRunner {

    public static void main(String[] args) {

        // Class<?>[] configurations = new Class<?>[]{AppConfig.class};
        Class<?>[] configurations = new Class<?>[]{AppConfig.class, BeanConfig.class};

        ApplicationContext context = new AnnotationConfigApplicationContext(configurations);

        for(String name:context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        // AppService asv = context.getBean(AppService.class);
        AppService asv = context.getBean("appService", AppService.class);
        asv.displayAllOutFits();
        
    }

}
