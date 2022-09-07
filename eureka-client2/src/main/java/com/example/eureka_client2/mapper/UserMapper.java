package com.example.eureka_client2.mapper;


import com.example.eureka_client2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 
 * @author chenzejian
 * @date 2022/09/07 10:42
 **/
@Mapper
public class UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int insertSelective(User user) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public User selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public int selectCount(User user) {
        return 0;
    }

    @Override
    public List<User> select(User user) {
        return null;
    }

    @Override
    public User selectOne(User user) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public List<User> selectByExample(Object o) {
        return null;
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public User selectOneByExample(Object o) {
        return null;
    }

    @Override
    public int updateByExample(User user, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(User user, Object o) {
        return 0;
    }

    @Override
    public List<User> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<User> selectByRowBounds(User user, RowBounds rowBounds) {
        return null;
    }
}

