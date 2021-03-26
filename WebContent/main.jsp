<%@page import="book.BookDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List<BookDto> list = (List)request.getAttribute("list");

for(int i=0; i<list.size(); i++){
	BookDto dto = list.get(i);
	System.out.println( i+1 + " : " + dto.toString());
}
%>

</body>
</html>