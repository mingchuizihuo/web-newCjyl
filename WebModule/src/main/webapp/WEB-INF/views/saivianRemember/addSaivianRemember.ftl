<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<!--弹出层样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


<div id="oldManUp" class="popup">
    <h5>基本信息</h5>
    <table class="table table-bordered">
        <tbody>
            <tr>
                <td class=blue">银行名称</td>
                <td><input type="text" id="bankName"></td>
            </tr>
            <tr>
                <td class=blue">银行类型</td>
                <td>
                    <select  id="bankType">
                        <option value="0">储蓄卡</option>
                        <option value="1">信用卡</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class=blue">银行卡号</td>
                <td><input type="text" id="bankCardNum"></td>
            </tr>
            <tr>
                <td class=blue">银行有效期</td>
                <td><input type="text" id="bankEffectiveDate"></td>
            </tr>
        </tbody>
    </table>
</div>

<#--alydate日期插件-->
<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>
<script>

    /*//    使用layer日期
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        document.getElementById('birthday').onclick = function () {
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function (datas) { //选择日期完毕的回调
                    console.log(datas)
                }

            });
        }
    });*/


</script>


