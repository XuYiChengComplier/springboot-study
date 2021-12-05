package com.atguigu.springcloud.Controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiaocheng
 * @create 2021-11-22 22:38
 */
@Controller
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
//        int result = paymentService.create(payment);
//        log.info("插入结果"+result);
//        if (result > 0){
//            return new CommonResult(200,"插入数据库成功",result);
//        }else {
//            return new CommonResult(444,"插入数据库失败",null);
//        }
        return new CommonResult(200,"111",paymentService.create(payment));
    }

    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果"+paymentById);
        if (paymentById != null){
            return new CommonResult(200,"数据库查询成功",paymentById);
        }else {
            return new CommonResult(444,"数据库查询失败",null);
        }
    }

}
