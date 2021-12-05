package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xiaocheng
 * @create 2021-11-15 23:43
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {
    long id;
    String serial;
}
