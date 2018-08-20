package com.hotelmanage.dao.mapper;

import com.hotelmanage.bean.response.UserLoginResponse;
import com.hotelmanage.pojo.UserPojoBean;
import com.hotelmanage.pojo.UserPojoBeanKey;
import org.apache.ibatis.annotations.Param;
import redis.clients.jedis.GeoRadiusResponse;

public interface UserPojoBeanMapper {


    int insertSelective(UserPojoBean record);



    UserLoginResponse selectUserByUserName(@Param("username") String username);
}