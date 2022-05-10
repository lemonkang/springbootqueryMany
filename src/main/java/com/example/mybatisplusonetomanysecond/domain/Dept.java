package com.example.mybatisplusonetomanysecond.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer depno;
    private String dname;
    private String loc;
}
