<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String rPath = request.getContextPath();
%>
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand active" >
                    <a href="/">
                    	ICT ERP
                    </a>
                </li>
                <li>
                    <a href="<%=rPath%>/member/memberList">사원관리</a>
                </li>
                <li>
                    <a href="<%=rPath%>/level/levelList">사원레벨관리</a>
                </li>
                <li>
                    <a href="<%=rPath%>/depart/departList">부서관리</a>
                </li>
                <li>
                    <a href="<%=rPath%>/music/musicList">음악차트</a>
                </li>
                <li>
                    <a href="#">이력서</a>
                </li>
                <li>
                    <a href="#">Git</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
                <li>
                    <a href="<%=rPath%>/menu/menuList">메뉴리스트</a>
                </li>
            </ul>
        </div>
<script>
function getHtml(url){
	$.ajax(
	{
		url:url,
		success:function(html){
			$('#page-content-wrapper').html(html);
		}
	}		
);
}
</script>