<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">新闻管理</a></li>
        <li>新闻列表</li>
    </ul>
</div>
<form class="form-inline">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">作者名：</label>
        <input type="email" class="form-control" id="newsAuthor" placeholder="请输入作者名">
      </div>

    <input type="button"   class="btn btn-danger"  onclick="findByName();"   value="查询"/>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>标题</th>
            <th>作者</th>
            <th>发表时间</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.newsInfoList}" var="newsInfoList">
        	<tr>
        	<%-- <td>${newsInfoList.newsTitle}</td> --%>
        	            <th>
            <a  href="${pageContext.request.contextPath }/NewsInfoController/readnews.action?newsId=${newsInfoList.newsId}">${newsInfoList.newsTitle}</a>             
            
            </th>
            <td>${newsInfoList.newsAuthor}</td>
            <td>${newsInfoList.newsTime}</td>
            <th>
            <a  href="${pageContext.request.contextPath }/NewsInfoController/readnews.action?newsId=${newsInfoList.newsId}"> 阅读</a>             
            
            </th>
            </tr>
        </c:forEach>   	                   
    </table>
</div>
</form>
</body>
<script type="text/javascript">
  function findByName(){
	  var Author=$("#newsAuthor").val();
	  location.href="${pageContext.request.contextPath}/NewsInfoController/findByAuthor.action?newsAuthor="+Author;
  }
</script>
</html>