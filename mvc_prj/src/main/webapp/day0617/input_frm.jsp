<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<style type="text/css">
 #container{ min-height: 600px; margin-top: 30px; margin-left: 20px}
</style>
<!-- jquery CDN -->
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script> 
 
<script type="text/javascript">
$(function(){
	$("btn").click(function(){
		$("frm").submit();
		
	});
}); // ready
</script>

</head>
<body>
<header data-bs-theme="dark">


</header>
<main>
<div id="container">
<h2>메인페이지</h2>
로고, 주력 서비스, 로그인
<a href="index.html">메인</a>
<a href="index.do">메인2</a>
<a href="index.do?cmd=M001">메인3</a>

<hr>

<h3>사원검색 - 선택부서에 입력한 연봉보다 작은 사원 검색</h3>
<h2>접속시간 : <c:out value="${today }"/></h2>
<form  id="frm" action="emp_search.do" >
<input type="hidden" name="cmd" value="P001"/> 
<label>부서번호</label>
<select name="deptno">
<c:forEach var="dept" items="${deptInfo}">
<option value="${dept.deptno }"><c:out value="${dept.dname }" /></option>
</c:forEach>
</select>
<label>연봉</label>
<input type="text" name="sal"/>
<input type="button" value="검색" id="btn"/>

</form>
</div>
</main>
<footer class="text-body-secondary py-5">
</footer>


</body>
</html>