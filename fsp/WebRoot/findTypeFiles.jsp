<%@ page language="java" import="java.util.*,com.icss.po.FilesPO"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
    <title>查看类型文件</title>
     <%
     	List<FilesPO> list=(List<FilesPO>)request.getAttribute("FilesList");
      %>
<style type="text/css">
		table{
			font-size:14px;
			padding-top:5px;
			width:800px; 
			text-align:center;
		}
		td{
			border: 1px solid blue;
		}
		th{
			border: 1px solid blue;
			margin-top: 0px;
		}
		</style>
		
  </head>
  <body>
   <table cellspacing="0">
    		<tr>
     			<td>文件名称</td>
     			<!--<td>文件类型</td>
     			<td>等级</td>
     			 <td>下载次数</td> -->
       			<td>文件大小</td>			
     			<td>上传时间</td>
     			<td>文件说明</td>
     			<td>操作</td>
     		</tr>
     	<%
     	
     		for(FilesPO po:list){ 
     	 %>
     	 <tr>
     	 		<td><%=po.getFileName()%></td>
    			<!--<td><%=po.getFileName() %></td>		
    			<td><%=po.getFileName() %></td>
    			-->
  
    			<td><%=po.getFileSize() %>B</td>	
    			<td><%=po.getFileUploadTime()%></td>
    			<td><%=po.getFileContent()%></td>
    			
    		<!--<a href="delete?userId=<%=po.getUserId()%>">删除</a>
    			  -->
    			 <td>
					<a href="Download?fileId=<%=po.getFileId()%>">下载</a>
    			</td>
     	 </tr>
     	 <%} %>
</table>
     	 
    <!-- 迭代循环，jsp中自带了c标签 -->
  <!-- 
   <c:forEach items="${userList }" var="user" >
    		<tr>
    			<td>${user.userId }</td>
    			<td>${user.userName }</td>
    			<td>${user.userPwd }</td>
    			<td>${user.userRealName }</td>
    		</tr>
    </c:forEach> 	
    	</table>
    --> 	
  </body>
</html>
