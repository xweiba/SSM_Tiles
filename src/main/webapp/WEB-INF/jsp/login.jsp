<%--
  Created by IntelliJ IDEA.
  User: zhou
  Date: 2018/5/14
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-----start-main---->
<div class="main">
    <div class="login-form">
        <h1>后台登陆</h1>
        <div class="head">
            <img src="${pageContext.request.contextPath }/static/images/user.png"
                 alt=""/>
        </div>
        <form action="${pageContext.request.contextPath }/login/validate" method="post">
            <input type="text" name="au_username" value="请输入用户名"
            <%-- 光标选中 如果是默认字符串 不显示内容 --%>
                   onfocus="if (this.value == '请输入用户名') {this.value = '';}"
            <%-- 失去焦点 value为空 显示内容 --%>
                   onblur="if (this.value == '') {this.value = '请输入用户名';}">
            <input type="password" value="Password" name="au_password"
                   onfocus="if (this.value == 'password') {this.value = '';}"
                   onblur="if (this.value == '') {this.value = 'password';}">
            <div class="submit">
                <input type="submit" value="登陆">
            </div>
            <p><a href="#">忘记密码 ?</a></p>
        </form>
    </div>
    <!--//End-login-form-->
    <!-----start-copyright---->
    <div class="copy-right">
        <p>Template by <a
                href="${pageContext.request.contextPath }/home">.技能树.</a></p>
    </div>
    <!-----//end-copyright---->
</div>
<!-----//end-main---->