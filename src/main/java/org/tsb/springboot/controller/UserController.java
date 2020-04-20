package org.tsb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tsb.springboot.model.SysUser;
import org.tsb.springboot.service.UserService;

import java.util.List;

/**
 * <p>@program: springboot-with-mybatis </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@create: 2020-04-20 18:22 </p>
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    SysUser user(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    List<SysUser> users() {
        return userService.findAll();
    }
}
