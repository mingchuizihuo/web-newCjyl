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
        <thead>
        <tr>
            <td class="blue">消费时间</td>
            <td class="blue">消费金额</td>
            <td class="blue">消费商家</td>
            <td class="blue">操作</td>


        </tr>


        </thead>
        <tbody >
            <#list recordList as record>
                <tr id = "record${record.id}">
                    <td>${record.consumeDate?string("yyyy-MM-dd")}</td>
                    <td>${record.consumeMoney}</td>
                    <td>${record.shopCode}</td>
                    <td> <button class="btn btn-xs btn_color" onclick="del(${record.id})">删除</button>
                    </td>
                </tr>

            </#list>
        </tbody>
    </table>
</div>
<script src="${domainUrl}/assets/js/jquery/jquery-3.1.1.min.js"></script>

<script>


</script>


