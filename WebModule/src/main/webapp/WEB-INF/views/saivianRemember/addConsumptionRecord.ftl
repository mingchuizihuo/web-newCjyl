<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
    <link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
    <!--颜色样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
    <!--弹出层样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


    <div id="addConsumptionRecord" class="popup" >
        <h5>基本信息</h5>
        <table class="table table-bordered">
            <tbody>
            <tr>

                <td class=blue">消费时间</td>
                <td><input type="text" id="consumeDate"></td>
                <td class=blue">消费金额</td>
                <td><input type="text" id="consumeMoney"></td>
                <td class=blue">商铺</td>
                <td>
                    <select  id="shopCode">

                    </select>
                </td>

            </tr>

            </tbody>
        </table>


    </div>
<script src="${domainUrl}/assets/js/jquery/jquery-3.1.1.min.js"></script>

<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>


<script>

    //    使用layer日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('consumeDate').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
                    console.log(datas)
                }

            });
        }
    });

    $.ajax({
        type: "get",
        url: '${domainUrl}'+"rest/serve/saivian_remember/getShop",
        data:{},
        dataType: 'json',
        success: function (data) {
            var d = data.aaData;
            $.each(d,function (index,dOne) {
                $("#shopCode").append('<option value="'+dOne.shopCode+'">'+dOne.shopName+'</option>');
            })
        }
    });

</script>


