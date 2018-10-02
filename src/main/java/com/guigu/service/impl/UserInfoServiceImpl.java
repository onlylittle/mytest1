package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.guigu.mapper.UserInfoMapper;
import com.guigu.pojo.UserInfo;
import com.guigu.pojo.UserInfoExample;
import com.guigu.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
 
	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo logIn(String userName, String passWord) throws Exception {
		UserInfoExample  example = new UserInfoExample();
		example.createCriteria().andUserNumberEqualTo(userName).andUserPasswordEqualTo(passWord);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(list)) {
			return list.get(0);
		}
		
		return null;
	}

}
