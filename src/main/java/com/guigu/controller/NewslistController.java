package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.NewsInfo;
import com.guigu.service.NewsInfoService;

@RequestMapping("/NewsInfoController")
@Controller
public class NewslistController {

		@Resource
		private  NewsInfoService newsInfoService;
		@RequestMapping("/newsList.action")
		public  String findAllNews(HttpServletRequest request ) throws Exception{
			List<NewsInfo> list=newsInfoService.findall();
			request.setAttribute("newsInfoList", list);
			return "view/NewsManagement/NewList/newslist";
		}
		
		@RequestMapping("/readnews.action")
		public String Readnews(int newsId,HttpServletRequest request)throws  Exception{
			NewsInfo newsInfo=newsInfoService.findbyId(newsId);
			request.setAttribute("newsInfo", newsInfo);
			return "view/NewsManagement/NewList/readnews";
		}
		@RequestMapping("/findByAuthor.action")
		public String  findByAuthor(String newsAuthor,HttpServletRequest request)throws Exception{
			List<NewsInfo>  list=newsInfoService.findbyAuthor(newsAuthor);
			request.setAttribute("newsInfoList", list);
			return "view/NewsManagement/NewList/newslist";
		}
		
}
