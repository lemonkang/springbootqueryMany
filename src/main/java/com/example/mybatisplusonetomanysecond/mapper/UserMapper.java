package com.example.mybatisplusonetomanysecond.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.mybatisplusonetomanysecond.domain.DeptManyEmployee;
import com.example.mybatisplusonetomanysecond.domain.ProductNumber;
import com.example.mybatisplusonetomanysecond.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
   List<User> selectusers();
   List<DeptManyEmployee> selectdeptmanyemployee();
   List<ProductNumber>   selectdeptonemanyNumber();

}
