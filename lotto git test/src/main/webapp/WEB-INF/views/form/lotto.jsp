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
	<%-- <form action="<%=request.getContextPath()%>/result/lotto" method="post"> <!--request.getContextPath() =>ex ���ؽ�Ʈ �ּ��̴�  -->
  	 <input type="submit" value="����� �ζ� ��ȣ��?"> <!--Ÿ���� submit���� �ؾ� ���۵� -->
   	</form>
	
	 --%>
	 	 
	����� �ζ� ��ȣ��
	<form action="/ex/form/lotto_result" autocomplete="on">
		<input type="submit" value="����"> 
	</form>
	
</body>
</html>