package com.study.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.study.springcloud.entities.CommonResult;

public class customerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException---1");
    }


    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException---2");
    }
}
