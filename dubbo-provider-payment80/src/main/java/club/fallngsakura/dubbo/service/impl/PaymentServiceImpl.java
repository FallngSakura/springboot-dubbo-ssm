package club.fallngsakura.dubbo.service.impl;

import club.fallngsakura.dubbo.dao.PaymentDao;
import club.fallngsakura.dubbo.entities.Payment;
import club.fallngsakura.dubbo.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author MISAKI RINNE
 * @version 1.0
 * @NAME: PaymentServiceImpl
 * @date 2020/5/6 14:34
 */

@Service
@org.apache.dubbo.config.annotation.Service
public class PaymentServiceImpl implements PaymentService
{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
