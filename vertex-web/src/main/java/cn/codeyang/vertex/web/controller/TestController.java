package cn.codeyang.vertex.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzy
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/info")
    public String info() {
        return "info";
    }
}
