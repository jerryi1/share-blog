package lhq.demo;

import lhq.demo.config.ComponentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


public class SpringAutoConfigApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ComponentConfig.class, args);
//        Object myComponentEntity = context.getBean("myComponentEntity");
//        System.out.println(myComponentEntity.getClass().getName());
    }
}
