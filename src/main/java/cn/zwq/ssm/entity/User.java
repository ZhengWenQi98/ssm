package cn.zwq.ssm.entity;

import lombok.Data;

@Data
public class User {
    private Integer uid;
    private String uname;
    private String pwd;
    private Integer sex;
    private Integer age;
}