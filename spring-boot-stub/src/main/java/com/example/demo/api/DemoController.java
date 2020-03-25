package com.example.demo.api;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/get")
    public Map<String, String> get() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        return map;
    }

    @GetMapping("/delay/{seconds}")
    public Map<String, String> delay(@PathVariable int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
        Map<String, String> map = new HashMap<>();
        map.put("sleepTime", String.valueOf(seconds));
        return map;
    }
}
