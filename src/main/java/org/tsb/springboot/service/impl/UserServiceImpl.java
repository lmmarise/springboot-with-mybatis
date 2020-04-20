package org.tsb.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsb.springboot.mapper.UserMapper;
import org.tsb.springboot.model.SysUser;
import org.tsb.springboot.service.UserService;

import java.util.List;

/**
 * <p>@program: springboot-with-mybatis </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@create: 2020-04-20 18:14 </p>
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<SysUser> findAll() {
        return userMapper.selectAll();
    }
}
