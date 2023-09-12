<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_result.jsp</title>
</head>
<body>
	<%
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String email = request.getParameter("email");
		String birth = request.getParameter("birth");
		String upload = request.getParameter("upload");
		String color = request.getParameter("color");
		String gender = request.getParameter("gender");
		
		// String hobby = request.getParameter("hobby");
		// - 일치하는 이름의 파라미터의 값을 하나를 가져온다
		// - 여러개가 있으면 제일 위의 값 한개만 가져온다
		
		String[] hobbies = request.getParameterValues("hobby");
		// - 일치하는 이름의 파라미터의 모든 값을 배열로 가져온다
		
		String hobby = Arrays.toString(hobbies);
		
		String major = request.getParameter("major");
		String info = request.getParameter("info");
		
		Enumeration<String> en = request.getParameterNames();
		// - 파라미터의 이름을 모두 받아서 확인 가능
		// - 보통 디버깅용으로 사용
		
		ArrayList<String> names = new ArrayList<>();
	
		while(en.hasMoreElements()) {
			String name = en.nextElement();
			
			names.add(name);
		}
		
		Map<String, String[]> all = request.getParameterMap();
		// 파라미터의 이름/값을 map의 key/value에 모두 반환
		Set<String> keys = all.keySet();
		// Map은 반복 불가능 -> Set으로 변환하여 값을 가져온다
		
		ArrayList<String> map = new ArrayList<>();
		
		for(String key : keys) {
			String values = Arrays.toString(all.get(key));
			String result = key + " : " + values;
			
			map.add(result);
		}
	%>
	
	<h1>form 결과</h1>
	<hr>
	
	<h4>getParameter() : 어떤 데이터가 넘어오는지 알 때 사용</h4>
	
	<ul>
		<li>ID : <%=userid %></li>
		<li>PW : <%=userpw %></li>
		<li>email : <%=email %></li>
		<li>birth : <%=birth %></li>
		<li>upload : <%=upload %></li>
		<li>color : <%=color %></li>
		<li>gender : <%=gender %></li>
		<li>hobby : <%=hobby %></li>
		<li>major : <%=major %></li>
		<li>info : <%=info %></li>
	</ul>
	
	<h4>getParameterNames() : Parameter의 이름만 들고 올때 사용</h4>
	
	<ul>
		<% for (String name : names) { %>
			<li><%=name %></li>
		<% } %>
	</ul>
	
	<h4>getParameterMap() : Parameter가 뭐가 넘어오는지 모를 때 사용</h4>
	
	<ul>
		<% for (String data : map) { 
			
		%>
			<li><%=data %></li>
		<% } %>
	</ul>
	
</body>
</html>