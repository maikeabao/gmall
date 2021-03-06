package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author laowang
 * @email lxf@atguigu.com
 * @date 2020-03-11 15:52:43
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
