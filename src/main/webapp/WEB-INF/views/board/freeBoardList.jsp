<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
					  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<%@ include file = "../common/header.jsp" %>

<title>자유게시판</title>
</head>
<body>
<div class="container">
	<h3>질문 게시판</h3>
	<table class="table table-hover">
		<thead>
			<tr class="something">
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="boardList" items="${list}">
				<tr>
					<td>${boardList.bno}</td>
					<td>${boardList.title}</td>
					<td>${boardList.content}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>