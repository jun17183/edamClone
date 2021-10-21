package com.edam.mapper;

import com.edam.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserVO selectUserInfoOne(String inputUserId);
    List<String> selectUserAuthOne(String inputUserId);
}
