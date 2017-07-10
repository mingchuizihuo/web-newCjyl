<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<!--弹出层样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


<div id="oldManUp" class="popup">
    <h5>时间信息</h5>
    <table class="table table-bordered">
        <tbody>
        <tr>
            <td class="blue">续费日期</td>
            <td><input type="text" id = "saivianRenewalDate" value="${(saivianRemember.saivianRenewalDate?string("yyyy-MM-dd"))!}"></td>
        </tr>

        <tr>
            <td class="blue">返利打开日期</td>
            <td><input type="text" id = "rebateOpenDate" value="${(saivianRemember.rebateOpenDate?string("yyyy-MM-dd"))!}"></td>
        </tr>

        <tr>
            <td class="blue">赎回打开日期</td>
            <td><input type="text" id = "redeemOpenDate" value="${(saivianRemember.redeemOpenDate?string("yyyy-MM-dd"))!}"></td>
        </tr>


        <tr>
            <td class="blue">到码日期</td>
            <td><input type="text" id = "arriveCodeDate" value="${(saivianRemember.arriveCodeDate?string("yyyy-MM-dd"))!}"></td>
        </tr>

        </tbody>
    </table>

</div>


<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>
<script>

    //    续费日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('saivianRenewalDate').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
                }

            });
        }
    });


    //返利打开日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('rebateOpenDate').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
                }

            });
        }
    });

    //赎回打开日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('redeemOpenDate').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
                }

            });
        }
    });


    //到码日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('arriveCodeDate').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
                }

            });
        }
    });


</script>