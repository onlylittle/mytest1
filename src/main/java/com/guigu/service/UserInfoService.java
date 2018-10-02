package com.guigu.service;

import com.guigu.pojo.UserInfo;

public interface UserInfoService {

	UserInfo logIn(String userName, String passWord) throws Exception;

}
