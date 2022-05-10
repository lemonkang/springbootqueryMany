package com.example.mybatisplusonetomanysecond.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer empno;
    private String ename;
    private Integer sal;
    private Integer deptno;
    private Integer mgr;
}
