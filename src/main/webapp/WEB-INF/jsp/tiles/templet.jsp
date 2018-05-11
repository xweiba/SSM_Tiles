<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="title" uri="http://tiles.apache.org/tags-tiles" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%-- 页面 title --%>
    <title><title:insertAttribute name="title"/></title>

    <%-- css js --%>
    <link href="${pageContext.request.contextPath }/static/css/t11.css"
          rel="stylesheet" type="text/css">
    <link href=${pageContext.request.contextPath }/static/css/bootstrap.min.css
          rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath }/static/css/base.css"
          rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath }/static/css/bootstrap.css">
    <link href="${pageContext.request.contextPath }/static/css/Untitled-3.css"
          rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath }/static/css/Untitled-1base.css"
          rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath }/static/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

</head>
<body>
<%-- 头部 --%>
<tiles:insertAttribute name="header"/>
<%-- nav --%>
<tiles:insertAttribute name="nav"/>
<%-- 内容 --%>
<tiles:insertAttribute name="body"/>
<%-- 脚部 --%>
<tiles:insertAttribute name="footer"/>
</body>

