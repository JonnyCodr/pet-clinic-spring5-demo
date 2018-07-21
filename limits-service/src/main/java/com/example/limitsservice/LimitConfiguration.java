package com.example.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class LimitConfiguration {

    private int minimum;
    private int maximum;

    protected LimitConfiguration(){ /**/ }
}
