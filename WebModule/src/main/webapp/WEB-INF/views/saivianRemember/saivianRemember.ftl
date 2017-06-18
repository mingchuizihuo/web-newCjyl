<#--layui样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<link rel="stylesheet" href="${domainUrl}/assets/css/gengjiajun/oldMan/oldMan.css">

<#--title-->
<div class="title-border">
    <div class="title-border-left">
        <i class="icon-file-alt"></i>塞比安会员列表
    </div>
<#--新闻滚动-->
    <div class="title-border-right"></div>
</div>
<div class="content">
<#--查询-->
    <div class="inquiry">
        <button class="btn btn-xs btn_color userjj">焦健</button>
        <button class="btn btn-xs btn_color userpy">庞姨</button>

        <button class="btn btn-xs btn_color editOldMan">添加</button>
    </div>
<#--老人基本信息-->
    全选：<input type="button" id="All" value="全选"/><br/>
    不选<input type="button" id="uncheck" value="不选"/><br/>
    反选<input type="button" id="othercheck" value="反选"/><br/>
    查看<input type="button" id="aaa" value="查看" />
    <div id="div">
        <input type="checkbox"  id="1"/><br/>
        <input type="checkbox"  id="2"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
        <input type="checkbox"/><br/>
    </div>
    <script>

        $(function () {
            var CheckAll = document.getElementById('All');
            var UnCheck = document.getElementById('uncheck');
            var OtherCheck = document.getElementById('othercheck');
            var div = document.getElementById('div');
            var CheckBox = div.getElementsByTagName('input');
            CheckAll.onclick = function () {
                for (i = 0; i < CheckBox.length; i++) {
                    CheckBox[i].checked = true;
                }
                ;
            };
            UnCheck.onclick = function () {
                for (i = 0; i < CheckBox.length; i++) {
                    CheckBox[i].checked = false;
                }
                ;
            };
            othercheck.onclick = function () {
                for (i = 0; i < CheckBox.length; i++) {
                    if (CheckBox[i].checked == true) {
                        CheckBox[i].checked = false;
                    }
                    else {
                        CheckBox[i].checked = true
                    }

                }
                ;
            };
            $('#aaa').click(function () {
                for (var i = 0; i < CheckBox.length; i++) {
                    if(CheckBox[i].checked == true){
                        alert(CheckBox[i].id)
                    }
                }
            });
        })
    </script>
    <div class="oldMan">
        <table class="table">
            <thead>
            <tr>
                <th>序号</th>
                <th>saivian会员ID号</th>
                <th>用户真实姓名</th>
                <th>用户登录名</th>
                <th>用户密码</th>
                <th>电话</th>
                <th>邮箱</th>
                <th>邮箱密码</th>
                <th>银行名称</th>
                <th>银行类型</th>
                <th>银行卡号</th>
                <th>银行卡有效期</th>
                <th>续费日期</th>
                <th>赎回日期</th>
                <th>点击申请赎回日期</th>
                <th>每日工资</th>
                <th>总金额</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="saivianList">

            </tbody>
        </table>
    <#--分页-->
        <ul id="biuuu_city_list"></ul>
        <div id="demo1"></div>
    </div>
</div>
<script src="${domainUrl}/assets/js/saivianRemember/saivianRemember.js"></script>
<script>

    //弹出一个修改层(老人用户信息)
    $('.editOldMan').on('click', function () {
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: '${domainUrl}/rest/oldMan/editOldMan',
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {

                //按钮【关闭】的回调
                layer.close(index);
            }, btn2: function (index, layero) {
            },
            cancel: function () {
                //右上角关闭回调
            }
        });
    });


</script>


