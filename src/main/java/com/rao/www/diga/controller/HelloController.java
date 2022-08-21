package com.rao.www.diga.controller;

import com.rao.www.diga.response.Result;
import com.rao.www.diga.service.HelloService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;

/**
 * @author Rao QingLong
 * 心跳入口，检测服务是否正常启用
 */
@RestController
@RequestMapping("/heart")
@Validated
public class HelloController {

    @Resource
    HelloService helloService;

    @GetMapping
    public Result<String> hello(@RequestParam @NotBlank(message = "参数不能为空") String call) {
        String result = helloService.sayHello(call);
        return Result.success(result);
    }

    @GetMapping("/path/{call}")
    public String helloByPath(@PathVariable @NotBlank(message = "参数不能为空") String call) {
        return helloService.sayHello(call);
    }

}
