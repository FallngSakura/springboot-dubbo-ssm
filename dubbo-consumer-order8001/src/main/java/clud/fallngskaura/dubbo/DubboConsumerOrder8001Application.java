package clud.fallngskaura.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboConsumerOrder8001Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerOrder8001Application.class, args);
    }

}
