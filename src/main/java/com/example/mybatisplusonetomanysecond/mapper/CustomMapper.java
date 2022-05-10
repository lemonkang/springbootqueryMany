package com.example.mybatisplusonetomanysecond.mapper;

import com.example.mybatisplusonetomanysecond.domain.DeptManyEmployee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface CustomMapper {

    List<DeptManyEmployee> selectdeptmanyemployee();

}
