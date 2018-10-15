package com.example.cloudfeign;

import com.example.cloudfeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHi(String name) {
        return "sorry " + name;
    }
}
