package com.study.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 因为有了lombok，@Data是get  set
// AllArgsConstructor是全参
// NoArgsConstructor是空参
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
