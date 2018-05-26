package com.dsm.ssm.service.user;

import com.dsm.ssm.model.user.UserInfo;

public interface UserService {
	
	UserInfo getUserById(String userId) throws Exception;

}
