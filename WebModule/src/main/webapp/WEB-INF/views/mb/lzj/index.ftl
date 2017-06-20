<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
<#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
<#assign result= randomLength("${note.consumeNum}",8)>

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
        width: 224px;
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
            <li class="title">老周记 <span style="margin-left: 5px;font-size: 8px;">结账单</span></li>
            <br>
            <li>开始时间：${note.consumeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>结束时间：${note.effectDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>房台号：007(A7) <span style="margin-left: 20px;">餐别：晚餐</span></li>
            <hr style="border: 0.5px dashed #000000;margin: 5px 0px;">
            <li>客人数：0 <span style="margin-left: 20px;">单号：128830</span></li>
            <hr style="border: 0.5px dashed #000000;margin: 5px 0px;">
            <table style="width: 100%" class="shop-table">
                <thead>
                    <tr>
                        <td>品名/单位</td>
                        <td>数量</td>
                        <td>单价</td>
                        <td>金额</td>
                    </tr>
                </thead>
                <tbody>
                <tr>
                    <td>蟹黄豆花</td>
                    <td>1</td>
                    <td>36.00</td>
                    <td>36.00</td>
                </tr>
                </tbody>
            </table>
            <hr style="margin: 5px 0px;border: 0.5px dashed #000000">
            <table style="width: 100%" class="shop-table">
                <tbody>
                <#list products as productOne>
                <tr>
                    <td>${productOne.productName}</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.productPrice}</td>
                    <td>${productOne.produtTotal}</td>
                </tr>
                </#list>
                </tbody>
            </table>
            <hr style="margin: 5px 0px;border: 0.5px dashed #000000">
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 25%">收银员：</td>
                    <td style="width: 20%">张鑫</td>
                    <td style="width: 30%">刷卡 实收：</td>
                    <td style="width: 15%">${note.consumeMoney}</td>
                </tr>
                </tbody>
            </table>
            <li><nobr>服务员：刘子晴 打印：${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</nobr></li>
            <li style="text-align: center;margin: 10px 0px;"><img src="../img/yinlian.png" style="width: 70%"></li>
            <li>商户名称:北塘周记餐饮</li>
            <li>商户编号:8981120058123440</li>
            <li>终端编号:01232723</li>
            <li>班次号：2017040500001  操作员号:01</li>
            <li>发卡行:${note.bankName}     收单行:银联商务</li>
            <li>有效期:${note.effectDate}</li>
            <li>卡号:(借)</li>
            <li>${bankNun}/C</li>
            <li>交易类型:消费</li>
            <li>批次号:000001</li>
            <li style="font-size: 10px;">凭证号:001441  授权码:000000</li>
            <li>参考号: ${note.swipeNum}</li>
            <li>交易日期:${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <li>金额:</li>
            <li style="text-align: center;font-size: 11px;">RMB:${note.consumeMoney}</li>
            <li style="margin: 5px 0px;">备注：</li>
            <li>CSN:001 ARQC:4A15CE86C455F746</li>
            <li>UnprNo:75C468EE ATC:0001</li>
            <li>TVR:0000000000 TSI:</li>
            <li>AID:A000000333010101 AIP:7C00</li>
            <li>APPLAB:PBOC DEBIT</li>
            <li>APPNAME: PBOC DEBIT</li>
            <li>CVM:000000 TermCap:E0F1C8</li>
            <li>IAD:07020103A00000010A010000</li>
            <li>00000055DE4E0F</li>
            <hr style="margin: 5px 0px;width: 100%">
            <li><nobr>本人确认以上交易，同意将其计入本卡账户</nobr></li>
            <li><nobr>I  ACKNOWLEDGE  SATISFACTORY  RECEIPT  </nobr></li>
            <li>OF  RELATIVE  GOODS/SERVICE</li>
            <li style="font-size: 12px;text-align: center">持卡人存根</li>
        </ul>
    </div>
</body>
</html>