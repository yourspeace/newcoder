package com.newcoder.community.dao;

import com.newcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author yours_wangxin
 * @create 2022-07-23 13:45
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStauts(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
