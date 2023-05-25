package com.example.mybatisplusonetomanysecond.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Integer sal;
    private Integer deptno;
    private Integer mgr;
}
