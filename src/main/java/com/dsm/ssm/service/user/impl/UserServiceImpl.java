package com.dsm.ssm.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsm.ssm.mapper.user.UserInfoMapper;
import com.dsm.ssm.model.user.UserInfo;
import com.dsm.ssm.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(String userId) throws Exception {

		return userInfoMapper.selectByPrimaryKey(userId);
	}

}
