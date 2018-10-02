package com.guigu.service;

import java.util.List;

import com.guigu.pojo.NewsInfo;

public interface NewsInfoService {
	
	List<NewsInfo> findall() throws Exception;

	NewsInfo findbyId(int  newsId) throws Exception;

	List<NewsInfo> findbyAuthor(String newsAuthor)throws Exception;
	

}
