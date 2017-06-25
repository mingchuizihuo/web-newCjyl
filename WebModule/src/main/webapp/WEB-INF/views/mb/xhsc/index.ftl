<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
<#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
<#assign result= randomLength("${note.consumeNum}",8)>
<#assign swipeNum= randomLength("${note.swipeNum}",12)>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<style>
    *{
        font-size: 11px;
        margin: 0;
        padding: 0;
        font-family: "Arial";
    }
    #main-body{
        width: 162px;
    }
    #main-body ul{
        padding: 20px 11px;
    }
    #main-body li{
        list-style: none;
    }
    #main-body .title{
        text-align: center;
        font-size: 14px;
    }

    #main-body .shop-table{
        width: 100%;
        text-align: center;
    }
    #main-body .shop-table th:nth-child(1){
        text-align: left;
        width: 50%;
    }
    #main-body .shop-table td:nth-child(1){
        text-align: left;

    }
    hr{
        border: 0.5px solid #000000;
    }
</style>
    <div id="main-body">
        <ul>
        <li class="title">兴海水产 </li>
        <li>${note.consumeDate?string("yyyy.MM.dd HH:mm:ss")}</li>
        <li>收银员：01 <span style="margin-left: 10px;">收银员：后台交易</span></li>
        <li>——————————————————</li>
        <table style="width: 100%" class="shop-table">
            <thead>
            <tr>
                <th style="font-weight: 500">品名</th>
                <th style="font-weight: 500">单价</th>
                <th style="font-weight: 500">数量</th>
                <th style="font-weight: 500">小计</th>
            </tr>
            </thead>
            <tbody>
            <#list note.products as productOne>
            <tr>
                <td colspan="4">${productOne.productName}</td>
            </tr>
            <tr>
                <td></td>
                <td style="opacity: 0">${productOne.productPrice}.00</td>
                <td>${productOne.productNum}</td>
                <td>${productOne.produtTotal}.00</td>
            </tr>
            </#list>
            </tbody>
        </table>
        <li>——————————————————</li>
        <table style="width: 100%" class="shop-table">
            <tbody>
            <tr>
                <td style="width: 20%">数量：</td>
                <td style="width: 25%">${note.products?size}</td>
                <td style="width: 35%"></td>
                <td style="width: 20%"></td>
            </tr>
            <tr>
                <td style="width: 20%">合计：</td>
                <td style="width: 25%">${note.consumeMoney}.00</td>
                <td style="width: 35%">人民币：</td>
                <td style="width: 20%">${note.consumeMoney}.00</td>
            </tr>
            </tbody>
        </table>
        <br>
        <br>
        <li style="text-align: center">谢谢惠顾！</li>
        <li style="text-align: center">欢迎下次光临</li>

            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>

            <li>------------------------------------</li>
            <li class="title" style="font-family:宋体;">POS  签  购  单 </li>
            <li>------------------------------------</li>
            <li>商户名：兴海水产</li>
            <li>商户号：309004459984927</li>
            <li>终端号：49270001</li>
            <li>操作员号：01</li>
            <li>收单银行：兴业银行</li>
            <hr style="margin: 5px 0px; border: 0.5px solid #000000;">
            <li>发卡行：${note.bankName}</li>
            <li>卡号：${bankNun}</li>
            <li>交易类型：消费（s）</li>
            <li>批次号：000005</li>
            <li>凭证号：000083</li>
            <li>参考号：${swipeNum}</li>
            <li>日期：${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li style="font-size: 12px;">交易金额：<b>${note.consumeMoney}.00</b></li>
            <br>
            <hr style="margin: 5px 0px; border: 0.5px solid #000000;">
            <li>备注：</li>
            <hr style="margin: 5px 0px; border: 0.5px solid #000000;">
            <br>
            <li>持卡人存根</li>
        </ul>
    </div>
</body>
</html>