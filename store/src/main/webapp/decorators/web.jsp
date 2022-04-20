<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Home" /></title>

<!-- Favicon-->
<link rel="icon" type="image/x-icon"
	href="<c:url value='template/web/assets/favicon.ico' />" />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />

<%-- <link
	href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css' />"
	rel="stylesheet" type="text/css" media="all" /> --%>

<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/template/web/css/styles.css' />" rel="stylesheet" type="text/css" media="all"/>

 
</head>
<body>
	<%@ include file="/common/web/header.jsp"%>

	<div class="container">
		<dec:body />
	</div>

	<%@ include file="/common/web/footer.jsp"%>

	<!-- Bootstrap core JS-->
	<%-- <script
		src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script> --%>

	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS -->
	<script type="text/javascript" src="<c:url value='/template/web/js/scripts.js' /> "></script>
</body>
</html>