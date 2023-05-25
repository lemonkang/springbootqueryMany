package com.example.mybatisplusonetomanysecond;

import com.example.mybatisplusonetomanysecond.domain.DeptManyEmployee;
import com.example.mybatisplusonetomanysecond.domain.ProductNumber;
import com.example.mybatisplusonetomanysecond.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisplusonetomanysecondApplicationTests {

    @Resource
    UserMapper userMapper;


//    查询所有部门对应的员工
    @Test
    void selectdeptmanyemployee(){
        List<DeptManyEmployee> selectdeptmanyemployee = userMapper.selectdeptmanyemployee();
        selectdeptmanyemployee.forEach(System.out::println);
    }
//    查询所有商品对应的数量
    @Test
    void selectdeptonemanyNumber(){
        List<ProductNumber> productNumbers = userMapper.selectdeptonemanyNumber();
        productNumbers.forEach(System.out::println);
    }

}
