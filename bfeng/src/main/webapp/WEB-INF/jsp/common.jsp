<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>MZ星球</title>
</head>
<body>
当前登陆用户：${user.username }<br/>
common.jsp<br/>
<a href="${path }/home/admin">go admin</a><br/>

<script src="${path }/static/js/jquery-1.12.3.min.js"></script>
<script type="text/javascript">
	
</script>
</body>
</html>