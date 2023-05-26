package com.example.mybatisplusonetomanysecond;

import com.example.mybatisplusonetomanysecond.entity.Employee;
import com.example.mybatisplusonetomanysecond.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class MybatisplusonetomanysecondApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void get(){
        List<Employee> employees = employeeMapper.selectEmployeeAll();
    }
    @Test
    public void practiceArray(){
        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("name","inno");
        hashMap1.put("age",26);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("name","shanshan");
        hashMap2.put("age",28);
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        arrayList.add(hashMap1);
        arrayList.add(hashMap2);
        arrayList.stream().forEach(item->{
            item.put("weight",180);
        });
        List<Object> age = arrayList.stream().map(item -> {
            item.remove("age");
            return item;
        }).collect(Collectors.toList());
        System.out.println(age);
    }
    @Test
    public void practiceMap(){
        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("name","inno");
        hashMap1.put("age",26);
        Set<Map.Entry<String, Object>> entries = hashMap1.entrySet();
        for (Map.Entry<String,Object> entry:entries ) {
            System.out.println(entry.getValue());

        }


    }
}
