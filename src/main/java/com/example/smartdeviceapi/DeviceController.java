package com.example.smartdeviceapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DeviceController {

    @GetMapping("/device/status")
    public Map<String, Object> getDeviceStatus() {

        Map<String, Object> response = new HashMap<>();

        response.put("device", "Smart Air Fryer");
        response.put("power", "ON");
        response.put("temperature", 180);
        response.put("timerMinutes", 12);

        return response;
    }
}
