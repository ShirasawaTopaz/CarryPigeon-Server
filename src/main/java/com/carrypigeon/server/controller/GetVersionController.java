package com.carrypigeon.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetVersionController {

    private final String version = "0.1.0"; //0.x协议向下兼容

    @GetMapping("/getVersion")
    public String getVersion() {
        return version;
    }
}
