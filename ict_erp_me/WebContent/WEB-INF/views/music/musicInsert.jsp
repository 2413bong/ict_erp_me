<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>

if('${mcList}'!=0){
	location.href ="/music/musicList";
}


</script>
<body>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/views/menu/left.jsp" />
		<div id="page-content-wrapper">
			<div>
				<a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Toggle
					Menu</a>
			</div>
			<form action="/music/musicInsert" method="post">
				<table class="table table-bordered">
					<tr>
						<th>노래제목</th>
						<td><input type="text" name="mcName"></td>
					</tr>
					<tr>
						<th>가수이름</th>
						<td><input type="text" name="mcSinger"></td>
					</tr>
					<tr>
						<th>배급사</th>
						<td><input type="text" name="mcVendor"></td>
					</tr>
					<tr>
						<th>발매일</th>
						<td><input type="text" name="mcCredat"></td>
					</tr>
					<tr>
						<th>노래설명</th>
						<td><input type="text" name="mcDesc"></td>
					</tr>
					<tr>
						<td colspan="2"><button>부서등록</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />
</body>