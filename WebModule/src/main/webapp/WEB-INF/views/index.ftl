<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!--bootstrap-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
    <!--字体文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/font-awesome.css">
    <!--进度条加载样式-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/outCss/pace/themes/blue/pace-theme-flash.css">
    <#--样式重置文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/reset.css">
    <!--页面样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/index.css">
    <!--页面样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
    <!--弹出层样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">
    <title></title>
</head>
<script>
    var domainUrl = '${domainUrl}/rest', domainFile = '${domainUrl}',  organizationLoginId = '${(loginInfo.organizationLoginId)}';
</script>
<body>
<!--整体布局-->
<div id="main-body">
    <!--头部-->
    <!--下拉选择-->
    <div id="user-select">
        <ul>
            <li>更换头像</li>
            <li>修改密码</li>
            <li>个人资料</li>
            <li>查看信息
                <div id="no-look-num">未读<span>1</span></div>
            </li>
            <li onclick="indexBase.loginOut()">退出</li>
        </ul>
    </div>
    <#--头部-->
    <div id="head-body">
        <div id="head-banner">
            <#--logo-->
            <div id="logo">logo</div>
            <#--天气-->
            <div id="weather"></div>
            <#--头像-->
            <div id="user-mess">
                <img id="user-picture" src="${domainUrl}/assets/images/picture.jpeg">
                <div id="staff-mess-num">1</div>
                <div id="user-name">
                    你好啊,
                    <name>${(loginInfo.loginName)!}</name>
                    <i class="icon-chevron-down"></i>
                </div>
            </div>
            <#--换肤-->
            <div id="setUp">
                <div id="setUp-img">
                    <div class="button-bg" style="background: url('${domainUrl}/assets/images/backGroundImg/bg.jpg')"
                         onclick="indexBase.changeBackColor('bg')"></div>
                    <div class="button-bg" style="background: url('${domainUrl}/assets/images/backGroundImg/bg2.jpg')"
                         onclick="indexBase.changeBackColor('bg2','red')"></div>
                    <div class="button-bg" style="background: url('${domainUrl}/assets/images/backGroundImg/bg3.jpg')"
                         onclick="indexBase.changeBackColor('bg3')"></div>
                    <div class="button-bg" style="background: url('${domainUrl}/assets/images/backGroundImg/bg4.jpg')"
                         onclick="indexBase.changeBackColor('bg4')"></div>
                    <div class="button-bg" style="background: url('${domainUrl}/assets/images/backGroundImg/bg5.jpg')"
                         onclick="indexBase.changeBackColor('bg5')"></div>
                    <div class="button-bg" style="background: url('${domainUrl}/assets/images/backGroundImg/bgg.jpg')"
                         onclick="indexBase.changeBackColor('bgg')"></div>
                </div>
                <div id="setUp-font">
                    <i class="icon-cog"></i>设置
                </div>
            </div>
        </div>
    </div>
    <div id="center">
        <#--侧边栏-->
        <div id="side">
            <ul id="sideList" class="accordion">
                <#--<li>-->
                    <#--<div class="link"><i class="icon-cog"></i>资料管理<i class="icon-circle-blank"></i></div>-->
                    <#--<ul class="submenu">-->
                        <#--<li onclick="common.locationUrl('/dataManage/dataDictionary')"><i class="icon-lock" ></i>数据字典</li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li>-->
                    <#--<div class="link"><i class="icon-comments-alt"></i>部门管理<i class="icon-circle-blank"></i></div>-->
                    <#--<ul class="submenu">-->
                        <#--<li><i class="icon-user"></i>员工列表</li>-->
                        <#--<li><i class="icon-comment-alt"></i>部门群组</li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li>-->
                    <#--<div class="link"><i class="icon-cog"></i>系统管理<i class="icon-circle-blank"></i></div>-->
                    <#--<ul class="submenu">-->
                        <#--<li><i class="icon-lock"></i>修改密码</li>-->
                    <#--</ul>-->
                <#--</li>-->
                <li>
                    <div class="link"><i class="icon-group"></i>老人管理<i class="icon-circle-blank"></i></div>
                    <ul class="submenu">
                        <li onclick="common.locationUrl('/oldMan/oldMan')"><i class="icon-bar-chart" ></i>基本信息</li>
                    </ul>
                </li>
                 <li>
                     <div class="link"><i class="icon-folder-close"></i>订单管理<i class="icon-circle-blank"></i></div>
                     <ul class="submenu">
                         <li onclick="common.locationUrl('/resource/resource')"><i class="icon-tag"></i>资源信息</li>
                         <li><i class="icon-calendar"></i>下单管理</li>
                      </ul>
                  </li>
            </ul>
        </div>
        <#--右边内容-->
        <div id="main-page">
            <#--内容框架-->
            <div id="main-show">
            </div>
            <div id="foot">
                承嘉智能养老平台2017@湃迅科技
            </div>
        </div>
    </div>
</div>

<!--jquery文件-->
<script src="${domainUrl}/assets/js/jquery/jquery-3.1.1.min.js"></script>
<!--封装工具-->
<script src="${domainUrl}/assets/js/common.js"></script>
<!--进度条加载js-->
<script src="${domainUrl}/assets/js/outJs/pace/pace.min.js"></script>
<!--获取天气时间插件-->
<script src="${domainUrl}/assets/js/outJs/date/jquery.leoweather.min.js"></script>
<#--侧边栏-->
<script src="${domainUrl}/assets/js/outJs/side/Accordion.js"></script>
<#--alyer弹窗插件-->
<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>
<#--页面行为文件-->
<script src="${domainUrl}/assets/js/login/login.js"></script>
<script src="${domainUrl}/assets/js/index/index.js"></script>
<#--页面跳转文件-->
<script src="${domainUrl}/assets/js/sideLocation.js"></script>

<script>
//    使用layer弹窗
    layui.use('layer', function(){ });

    $(function () {
        //页面高度
        indexBase.bodyMinHeight();
        //展示下拉菜单
        indexBase.userSelect();
        //获取天气时间
        $('#weather').leoweather({
            format: '<i class="icon-calendar"></i><strong>{年}年{月}月{日}日  星期{周} <i class=" icon-time"></i>{时段} {时}:{分}:{秒}</strong> <b><i class="icon-star"></i>{城市} </b> <i class="icon-tint"></i>{天气} {夜间气温}℃ ~ {白天气温}℃'
        });
    });
</script>
</body>
</html>