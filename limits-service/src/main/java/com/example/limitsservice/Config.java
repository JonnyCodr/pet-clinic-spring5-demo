package com.example.limitsservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("limits-service")
public class Config {

    private int minimum;
    private int maximum;

}
