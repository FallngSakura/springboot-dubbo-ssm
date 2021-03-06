package club.fallngsakura.dubbo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MISAKI RINNE
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public  CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }

}
