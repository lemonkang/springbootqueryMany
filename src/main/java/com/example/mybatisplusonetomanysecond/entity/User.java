package com.example.mybatisplusonetomanysecond.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User extends Model<User> implements Serializable {
    @TableId("id")
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
