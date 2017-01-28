<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>MZ星球</title>
</head>
<body>
<div>
	<ul>
		<c:forEach var="user" items="${users.datalist }">
			<li>${user.username }</li>
		</c:forEach>
	</ul>
	当前第${users.pageNo }页,${users.pageSize }条记录<br/>
	共${users.totalSize }条记录,共${users.totalNo }页
</div>
	<div>
		<form>
			<input name="username" id="username" type="text"><br /> 
			<input name="password" id="password" type="password"><br /> 
			<input type="button" value="submit" id="submit">
		</form>
	</div>

	<script src="${path }/static/js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#submit').click(function() {
				$.ajax({
					type : 'POST',
					url : '${path}/login',
					data : {
						username : $('#username').val(),
						password : $('#password').val()
					},
					dataType : 'json',
					success : function(data) {
						if (data.msg == 'success') {
							window.location.href = "${path}/home/common";
						} else {
							alert("login failure!");
						}
					}
				});
			})
		});
	</script>
</body>
</html>