package com.imooc.entity;

/**
 * Created by yuanjie.fang on 2017/11/17.
 * 测试springboot与mybatis的整合
 */
public class UserEntity {
    private Long id;
    private String name;
    private Integer age;

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
