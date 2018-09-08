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
			<c:if test="${empty menuList}">
				<tr>
					<td colspan="4">등록된 사원이 없습니다.</td>
				</tr>
			</c:if>
			<c:forEach items="${menuList}" var="mi">
				<tr>
					<td>${mi.meiNum}</td>
					<td onclick="goPage()">  ${mi.meiName}</td>
					<td>${mi.meiPrice}</td>
					<td>${mi.meiDesc}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<div>
			<button data-page="/menu/menuInsert">메뉴등록</button>
		</div>
	</div>
</div>
<script>
function goPage() {
	location.href="/menu/menuView?meiNum="${mi.meiNum}
}
</script>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />
</body>