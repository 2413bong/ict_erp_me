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
			<a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Toggle Menu</a>
		</div>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>메뉴번호</th>
					<th>메뉴이름</th>
					<th>메뉴가격 </th>
					<th>메뉴설명</th>
				</tr>
			</thead>
			<tbody>
			
				<tr>
					<td><input type="number" value="${menuList.meiNum}" name="meiNum"></td>
					<td><input type="text" value="${menuList.meiName}" name="meiName"></td>
					<td><input type="number" value="${menuList.meiPrice}" name="meiPrice"></td>
					<td><input type="text" value="${menuList.meiDesc}" name="meiDesc"></td>
				</tr>
			</tbody>
		</table>
		<div>
			<button data-page="/memu/menuUpdate">메뉴등록</button>
			<button data-page="/memu/menuDelete">메뉴삭제</button>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />
</body>