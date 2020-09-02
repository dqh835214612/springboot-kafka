package com.example.deng.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User extends BaseUser{

    @TableId(value = "id",type = IdType.AUTO)
    Long id;
    String name;
    Integer age;
}
