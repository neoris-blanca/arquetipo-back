package com.example.demo.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.User;

@Mapper
public interface IUserMapper {
	
	@Select("SELECT * FROM USERS WHERE id = #{id}")
    User getUser(@Param("id") Long id);

}
