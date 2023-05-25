package com.example.mybatisplusonetomanysecond.mapper;

import com.example.mybatisplusonetomanysecond.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    public List<Employee> selectEmployeeAll();
}
