package club.fallngsakura.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProviderPayment80Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderPayment80Application.class, args);
    }

}
