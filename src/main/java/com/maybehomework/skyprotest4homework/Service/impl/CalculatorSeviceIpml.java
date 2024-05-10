package com.maybehomework.skyprotest4homework.Service.impl;

import com.maybehomework.skyprotest4homework.Service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorSeviceIpml implements CalculatorService {


    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
