package com.imooc.mapper;

import com.imooc.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yuanjie.fang on 2017/11/17.
 */
public interface UserMapper {

    @Select("select * from user where name=#{name}")
    UserEntity findName(@Param("name") String name);

    @Insert("insert into user(name,age) values(#{name},#{age}) ")
    int addUser(@Param("name") String name, @Param("age") int age);
}
