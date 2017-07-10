<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
    <link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
    <!--颜色样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
    <!--弹出层样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


    <div id="addConsumptionRecord" class="popup" >
        <h5>添加消费信息</h5>
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
<div id="oldManUp" class="popup">
    <h5>显示消费信息</h5>
    <table class="table table-bordered">
        <thead>
        <tr>
            <td class="blue">消费时间</td>
            <td class="blue">消费金额</td>
            <td class="blue">消费商家</td>
            <td class="blue">操作</td>


        </tr>


        </thead>
        <tbody id="showRecord">

        </tbody>
    </table>
</div>

<script src="${domainUrl}/assets/js/jquery/jquery-3.1.1.min.js"></script>

<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>


<script>

    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
    var saivianTableId =getUrlParam("saivianTableId");
    //    使用layer日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('consumeDate').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
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

            $.ajax({

                type:"get",
                url:'${domainUrl}'+"rest/serve/saivian_remember/showRecord",
                data:{saivianTableId:saivianTableId},
                dataType:'json',
                success:function (data) {
                    var d = data.aaData;
                    var html=""
                    $.each(d,function (index,record) {
                        html+='<tr id = "record'+record.id+'">'+
                                '<td>'+record.consumeDate.replace("00:00:00","")+'</td>'+
                                '<td>'+record.consumeMoney+'</td>'+
                                '<td>'+record.shopCode+'</td>'+
                                '<td> <button class="btn btn-xs btn_color" onclick="del('+record.id+')">删除</button>'+
                                '</td>'+
                                '</tr>';

                    });
                    $("#showRecord").html(html);
                }
            })
        }
    });




    function del(id) {
        $.ajax({
            type: "post",
            url: '${domainUrl}rest/serve/consumption_record/del',
            data: {id:id},
            dataType: 'json',
            async: false,
            // cache:isCache,
            success: function (data) {
                $("#record"+id).remove();
            }
        });
    }

</script>


