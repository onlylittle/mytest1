package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;


import com.guigu.mapper.NewsInfoMapper;

import com.guigu.pojo.NewsInfo;
import com.guigu.pojo.NewsInfoExample;
import com.guigu.service.NewsInfoService;
@Service
public class NewsInfoSeviceImpl implements NewsInfoService{
	@Resource
	private  NewsInfoMapper newsInfoMapper;
	@Override
	public List<NewsInfo> findall() throws  Exception{
		List<NewsInfo> list=null;
		NewsInfoExample example=new NewsInfoExample();
		example.createCriteria().andNewsStatusEqualTo("审核通过");
		try {
			list=newsInfoMapper.selectByExample(example);
		}catch(Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public NewsInfo findbyId(int newsId) throws Exception {
		
		return newsInfoMapper.selectByPrimaryKey(newsId);
	}

	@Override
	public List<NewsInfo> findbyAuthor(String newsAuthor) throws Exception {
		NewsInfoExample example=new NewsInfoExample();
		example.createCriteria().andNewsAuthorLike("%"+newsAuthor+"%");
		return newsInfoMapper.selectByExample(example);
		
	}




	
	
}
