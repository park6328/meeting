<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- <form action="<%=request.getContextPath()%>/result/lotto" method="post"> <!--request.getContextPath() =>ex 컨텍스트 주소이다  -->
  	 <input type="submit" value="당신의 로또 번호는?"> <!--타입을 submit으로 해야 전송됨 -->
   	</form>
	
	 --%>
	 	 
	당신의 로또 번호는
	<form action="/ex/form/lotto_result" autocomplete="on">
		<input type="submit" value="전송"> 
	</form>
	
</body>
</html>