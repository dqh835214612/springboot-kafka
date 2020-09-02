package com.example.deng.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseUser implements Serializable {

    Date updateTime;
    String updateName;
    Date createTime;
    String createName;
}
