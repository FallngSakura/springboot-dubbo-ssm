package clud.fallngskaura.dubbo.Controller;

import club.fallngsakura.dubbo.entities.Payment;
import club.fallngsakura.dubbo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author MISAKI RINNE
 * @version 1.0
 * @NAME: OrderController
 * @date 2020/5/6 15:35
 */
@RestController
@Slf4j
public class PaymentController
{

    @Value("${server.port}")
    private Integer serverPort;


    @Value("${spring.application.name}")
    private String serverName;

    @Reference
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id){
        log.info(serverName+":"+serverPort+"\t call in getPaymentById parameter to "+id);
        return paymentService.getPaymentById(id);
    }

}

