package org.tsb.springboot.service;

import org.tsb.springboot.model.SysUser;

import java.util.List;

/**
 * <p>@program: springboot-with-mybatis </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@create: 2020-04-20 18:07 </p>
 **/
public interface UserService {
    /**
     * 通过id查询用户
     */
    SysUser findById(Long id);

    /*
     * 查询全部用户
     * */
    List<SysUser> findAll();
}
