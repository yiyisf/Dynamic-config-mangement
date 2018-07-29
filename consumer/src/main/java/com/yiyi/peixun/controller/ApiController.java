package com.yiyi.peixun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zgx on 2018-7-29.
 */
@RestController
@RefreshScope
public class ApiController {

    @Value("${default-name}")
    private String name;

    @GetMapping(path = "getName")
    @ResponseBody
    public String getName() {
        return this.name;
    }

}
