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
			<div id="page-content-wrapper">
				<table class="table table-bordered table-hover">
					<thead>
						<tr>
							<th>번호</th>
							<th>노래제목</th>
							<th>가수</th>
							<th>배급사</th>
							<th>좋아요</th>
							<th>싫어요</th>
							<th>발매일</th>
							<th>노래설명</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${MusicList}" var="ml">
							<tr>
								<td>${ml.mcNum}</td>
								<td>${ml.mcName}</td>
								<td>${ml.mcSinger}</td>
								<td>${ml.mcVendor}</td>
								<td>${ml.mcLike}</td>
								<td>${ml.mcDisLike}</td>
								<td>${ml.mcCredat}</td>
								<td>${ml.mcDesc}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="btns">
					<button data-page="/views/depart/departInsert">부서등록</button>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />
</body>