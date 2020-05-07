package club.fallngsakura.dubbo.service;


import club.fallngsakura.dubbo.entities.Payment;

/**
 * @author MISAKI RINNE
 */
public interface PaymentService
{
    /**
     * 新增Payment
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据Id获取Payment
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
