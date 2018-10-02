<%@page import="com.guigu.pojo.NewsInfo"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
</head>
<body>
 <div style="text-align:center;font-size:36px;">${newsInfo.newsTitle}</div>
 	<%
 	
 	NewsInfo newsInfo=(NewsInfo)request.getAttribute("newsInfo");
		//String path ="E:\\";   // 这边文件目录需改成相对路径
		System.out.println(newsInfo.getNewsAddress()+"     ");
		File file = new File(newsInfo.getNewsAddress());
		FileReader fr = new FileReader(file);  //字符输入流
		BufferedReader br = new BufferedReader(fr);  //使文件可按行读取并具有缓冲功能
		StringBuffer strB = new StringBuffer();   //strB用来存储jsp.txt文件里的内容
		String str = br.readLine();
		while(str!=null){
			strB.append(str).append("<br>");   //将读取的内容放入strB
			str = br.readLine();
		} 
		br.close();    //关闭输入流
	%>
	<p>
		<%=strB %>
	</p>
      <a class="btn btn-warning" href="${pageContext.request.contextPath }//NewsInfoController/newsList.action">返回新闻列表</a>
</body>
</html>
