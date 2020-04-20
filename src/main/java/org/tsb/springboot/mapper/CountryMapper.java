package org.tsb.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.tsb.springboot.model.Country;

import java.util.List;

/**
 * <p>@program: springboot-with-mybatis </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@create: 2020-04-20 17:01 </p>
 **/
@Mapper
@Component
public interface CountryMapper {
    /**
     * 查询全部数据
     */
    List<Country> selectAll();
}
