package com.example.mybatisplusonetomanysecond.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.mybatisplusonetomanysecond.entity.DeptManyEmployee;
import com.example.mybatisplusonetomanysecond.entity.ProductNumber;
import com.example.mybatisplusonetomanysecond.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
   List<User> selectusers();
   List<DeptManyEmployee> selectdeptmanyemployee();
   List<ProductNumber>   selectdeptonemanyNumber();

}
