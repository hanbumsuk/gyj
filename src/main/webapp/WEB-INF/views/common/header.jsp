<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/custom.css">
<!-- 폰트체 커스텀 -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<style type="text/css">

.dropdown:hover>.dropdown-menu { display: block; }

</style>

</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="/app/main.do">고영주 사이트</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<ul class="navbar-nav navbar-dark">
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#"
				data-toggle="dropdown"> 회원정보 </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/app/myInfo.do">내 정보 보기</a>
				</div>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#"
				data-toggle="dropdown"> 게시판 </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/app/freeBoardList.do">자유게시판</a>
					<a class="dropdown-item" href="/app/noticeBoardList">공지사항</a>
					<a class="dropdown-item" href="/app/qnaBoardList.do">QNA</a>
					<a class="dropdown-item" href="/app/faqBoardList.do">FAQ</a>
					<a class="dropdown-item" href="/app/pdsBoardList.do]">자료실</a>
				</div>
			</li>
		</ul>
	</nav>
</body>
</html>