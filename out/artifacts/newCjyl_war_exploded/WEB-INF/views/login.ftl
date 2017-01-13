<html>
<head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
    <#--动画效果文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/outCss/animate/animate.min.css">
    <#--进度条加载-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/outCss/pace/themes/blue/pace-theme-flash.css">
    <#--样式重置文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/reset.css">
    <#--页面样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/login.css">
    <!--颜色样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">

    <title>承嘉智能养老管理系统</title>
</head>
<script>
    var domainUrl = '${domainUrl}' + "/rest", domainFile = '${domainUrl}';
</script>
<body>
<#--页面背景-->
<div id="main-body">
    <div id="main-login" class="animated fadeIn">
        <div id="login-title">
            承嘉智能养老平台 <span>V1.0</span>
        </div>
        <form id="login-form">
            <div id="login-input">
                <ul>
                    <li><span>机构</span></li>
                    <li><input id="institution" type="text" name="institution" /></li>
                </ul>
                <ul>
                    <li><span>用户名</span></li>
                    <li><input type="text" name="name" id="loginName"></li>
                </ul>
                <ul>
                    <li><span>密码</span></li>
                    <li><input type="password" name="password" id="loginPass"></li>
                </ul>
                <ul>
                    <li>
                        <input type="button" value="登录" onclick="loginBase.login()">
                    </li>
                </ul>
            </div>
        </form>
    </div>
</div>
<script src="${domainUrl}/assets/js/jquery/jquery-3.1.1.min.js"></script>
<#--表单验证插件-->
<script src="${domainUrl}/assets/js/jquery/jquery.validate-1.14.0.min.js"></script>
<#--自定义工具类插件-->
<script src="${domainUrl}/assets/js/common.js"></script>
<#--模糊查询插件-->
<script src="${domainUrl}/assets/js/outJs/inquiry/bootstrap-typeahead.js"></script>
<#--alyui弹窗插件-->
<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>
<!--进度条加载js-->
<script src="${domainUrl}/assets/js/outJs/pace/pace.min.js"></script>
<#--页面基础文件-->
<script src="${domainUrl}/assets/js/login/login.js"></script>
<script>

    //    使用layer弹窗
    layui.use('layer', function(){ });

    $(function () {
        //查询机构
        loginBase.findAllOrganizationName();
        //回车登录事件
        loginBase.loginKey();
        //鼠标焦点事件
        loginBase.focus();
    });
</script>
</body>
</html>
