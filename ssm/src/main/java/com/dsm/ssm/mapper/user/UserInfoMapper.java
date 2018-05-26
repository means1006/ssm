package com.dsm.ssm.mapper.user;

import com.dsm.ssm.model.user.UserInfo;

public interface UserInfoMapper {

	int deleteByPrimaryKey(String userId);

	int insert(UserInfo record);

	int insertSelective(UserInfo record);

	UserInfo selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(UserInfo record);

	int updateByPrimaryKey(UserInfo record);
}