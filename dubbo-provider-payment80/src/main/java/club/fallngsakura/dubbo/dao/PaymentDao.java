package club.fallngsakura.dubbo.dao;

import club.fallngsakura.dubbo.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author MISAKI RINNE
 * @version 1.0
 * @NAME: PaymentDao
 * @date 2020/5/6 13:55
 */

@Mapper
@Component
public interface PaymentDao
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
    public Payment getPaymentById(@Param("id")Long id);

}
