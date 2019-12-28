package com.marom.limitsservice;

import com.marom.limitsservice.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

}
