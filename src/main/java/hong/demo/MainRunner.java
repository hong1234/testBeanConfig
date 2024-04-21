package hong.demo;

import hong.demo.config.AppConfig;
import hong.demo.config.GirlConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.third.service.Girl;
import hong.demo.service.Boy;

public class MainRunner {

    public static void main(String[] args) {

        // Class<?>[] configurations = new Class<?>[]{AppConfig.class, GirlConfig.class};
        Class<?>[] configurations = new Class<?>[]{AppConfig.class};

        ApplicationContext context = new AnnotationConfigApplicationContext(configurations);

        for(String name:context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        System.out.println("----");

        Girl girl = context.getBean(Girl.class);
        girl.outFit();

        Boy boy = context.getBean(Boy.class);
        boy.outFit();
    }

}
