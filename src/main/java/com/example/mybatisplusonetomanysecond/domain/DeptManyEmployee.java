package com.example.mybatisplusonetomanysecond.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptManyEmployee {
    private Integer depno;
    private String dname;
    private String loc;
    private List<Employee> employees;
}
