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

        <button class="btn btn-xs btn_color " id="All">全选</button>
        <button class="btn btn-xs btn_color "id="uncheck">不选</button>
        <button class="btn btn-xs btn_color "id="othercheck">反选</button>
        <button class="btn btn-xs btn_color " id="addSaivian">添加</button>
        <button class="btn btn-xs btn_color" id="printer">打印</button>
        <script>
            $("#qx").on("click",function () {
                $(".table ")
            })
        </script>
    </div>
<#--老人基本信息-->
    <script>

    </script>
    <div class="oldMan">
        <table class="table">
            <thead>
            <tr>
                <th>选择框</th>
                <th>序号</th>
                <th>saivian会员ID号</th>
                <th>用户真实姓名</th>
                <th>用户登录名</th>
                <th>登录密码</th>
                <th>邮箱</th>
                <th>邮箱密码</th>
                <th>银行卡号</th>
                <th>续费日期</th>
                <th>返利打开</th>
                <th>赎回打开</th>
                <th>到码日期</th>
                <th>查看详情</th>
                <th>更新时间</th>
                <th>添加消费明细</th>
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
<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>
<script src="${domainUrl}/assets/js/saivianRemember/saivianRemember.js"></script>
<script>
    var printPage = '${domainUrl}/rest/saivianRemember/printPage';


    $(function () {
        var CheckAll = document.getElementById('All');
        var UnCheck = document.getElementById('uncheck');
        var OtherCheck = document.getElementById('othercheck');
        var div = document.getElementById('saivianList');
        var CheckBox = document.getElementsByName('nation');
        $('#printer').click(function () {
            for (var i = 0; i < CheckBox.length; i++) {
                if(CheckBox[i].checked == true){
                    printId += CheckBox[i].id +','
                }
            }

            //页面层
            layer.open({
                type: 2,
                skin: 'layui-layer-rim', //加上边框
                area: ['1280px', '500px '], //宽高
                content: printPage
            });
        });
        CheckAll.onclick = function () {
            for (var i = 0; i < CheckBox.length; i++) {
                CheckBox[i].checked = true;
                printId += CheckBox[i].id +','
            };
            localStorage.printIddd = printId;
        };
        UnCheck.onclick = function () {
            for (var i = 0; i < CheckBox.length; i++) {
                CheckBox[i].checked = false;
            };
            printId ='';
            localStorage.printIddd = printId;
        };
        othercheck.onclick = function () {
            printId ='';
            for (var i = 0; i < CheckBox.length; i++) {
                if (CheckBox[i].checked == true) {
                    CheckBox[i].checked = false;
                }
                else {
                    printId += CheckBox[i].id +','
                    CheckBox[i].checked = true
                }

            };
            localStorage.printIddd = printId;
        };
    })
</script>


