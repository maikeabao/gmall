package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author laowang
 * @email lxf@atguigu.com
 * @date 2020-03-10 16:38:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
