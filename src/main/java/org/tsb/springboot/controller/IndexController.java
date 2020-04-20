package org.tsb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsb.springboot.mapper.CountryMapper;
import org.tsb.springboot.model.Country;

import java.util.List;

/**
 * <p>@program: springboot-with-mybatis </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@create: 2020-04-20 16:35 </p>
 **/
@RestController
public class IndexController {
    @Autowired
    private CountryMapper countryMapper;

    @RequestMapping("/")
    String home() {
        StringBuilder sb = new StringBuilder();
        List<Country> countryList = countryMapper.selectAll();
        for (Country country : countryList) {
            sb.append(country.toString());
            sb.append("<br>");
        }
        return sb.toString();
    }
}
