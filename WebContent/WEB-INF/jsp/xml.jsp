<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转换XML格式数据</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
</head>
<body>
   <button onclick="xml()">转换XML数据测试</button>
   <script type="text/javascript">
   function xml(){
      var xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
+ "<user><id>1</id><username>用户1</username><password>111</password></user>";
      //发送XML
      $.ajax({
         url : "xml",
         type : "post",
         data: xml,
         contentType : "application/xml",
         dataType : "json",//返回数据类型 
         success : function(data){
         alert(data);
         }
      });
   }
   </script>
</body>


</html>