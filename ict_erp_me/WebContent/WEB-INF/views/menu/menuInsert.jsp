<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/views/menu/left.jsp" />
		<div id="page-content-wrapper">
			<div>
				<a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Toggle
					Menu</a>
			</div>
			<form action="/menu/menuInsert" method="post">
				<table class="table table-bordered">
					<tr>
						<th>메뉴이름</th>
						<td><input type="text" name="meiName" value="${menuList.meiName}"></td>
					</tr>
					<tr>
						<th>메뉴가격</th>
						<td><input type="text" name="meiPrice" value="${menuList.meiPrice}"></td>
					</tr>
					<tr>
						<th>메뉴설명</th>
						<td><input type="text" name="meiDesc" value="${menuList.meiDesc}"></td>
					</tr>
					<tr>
						
						<td><input type="hidden" name="minum" value="${menuList.minum}"></td>
					</tr>

					<tr>
						<td colspan="2"><button>저장</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />
</body>