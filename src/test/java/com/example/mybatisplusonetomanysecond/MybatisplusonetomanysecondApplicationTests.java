package com.example.mybatisplusonetomanysecond;

import com.example.mybatisplusonetomanysecond.entity.Employee;
import com.example.mybatisplusonetomanysecond.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusonetomanysecondApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void get(){
        List<Employee> employees = employeeMapper.selectEmployeeAll();
    }

}
