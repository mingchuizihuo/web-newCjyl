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
    .small{
        font-size: 7px!important;
    }
</style>
    <div id="main-body">
        <ul>
            <li class="title">天津塘沽未来汇店</li>
            <br>
            <li>收银员：500042 <span style="margin-left: 10px;">营业员：500042</span></li>
            <li>单号：17042202097101006</li>
            <li>${note.consumeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>收银机：01 <span style="margin-left: 10px;">收银员：后台交易</span></li>
            <li>——————————————————</li>
            <table style="width: 100%" class="shop-table">
                <thead>
                    <tr>
                        <td>品名</td>
                        <td>数量</td>
                        <td>小计</td>
                    </tr>
                </thead>
                <tbody>
                <#list products as productOne>
                <tr>
                    <td colspan="4">${productOne.productName}</td>
                </tr>
                <tr>
                    <td>${productOne.productPrice}</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.discount}</td>
                    <td>${productOne.produtTotal}</td>
                </tr>
                </#list>
                </tbody>
            </table>
            <li>——————————————————</li>
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 20%">应收：</td>
                    <td style="width: 25%">${note.consumeMoney}</td>
                    <td style="width: 35%">抹零：</td>
                    <td style="width: 20%">0.00</td>
                </tr>
                <tr>
                    <td style="width: 20%">实收：</td>
                    <td style="width: 25%">${note.consumeMoney}</td>
                    <td style="width: 35%">优惠：</td>
                    <td style="width: 20%">0.00</td>
                </tr>
                </tbody>
            </table>
            <li>——————————————————</li>
            <li>电话：</li>
            <li>地址：天津市天津市滨海新区和羽道</li>
            <li style="text-align: center;margin: 10px 0px;"><img src="../img/yinlian.png" style="width: 70%"></li>
            <li>商户名称（MERCHANT NAME）</li>
            <li>天津市和平区膜界百货店</li>
            <li>分店名称(SHOP NAME): 天津市和平区</li>
            <li>膜界百货店</li>
            <li>商户编号(MERCHANTNO.）</li>
            <li>898120053991051</li>
            <li>终端编号(TERMINALNO.):01198659</li>
            <li>发卡行(ISSUER):${note.bankName}</li>
            <li>收单行(ACQUIRER):48021100</li>
            <li>卡号(CARD NO.):</li>
            <li><nobr  style="font-size: 18px; font-weight: 600">${bankNun}/</nobr></li>
            <li><nobr  style="font-size: 18px; font-weight: 600">C</nobr></li>
            <li>交易类型(TRANS TYPE):</li>
            <li><nobr  style="font-size: 18px; font-weight: 600">消费（SALE）</nobr></li>
            <li>批次号(BATCH NO.）:000079</li>
            <li>凭证号(VOUCHER NO.):002174</li>
            <li>授权码（AUTH NO.）:</li>
            <li>参考号(REFER NO.):000161894901</li>
            <li>日期时间（DATE/TIME）</li>
            <li> ${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>金额（AMOUNT）</li>
            <li><nobr  style="font-size: 22px; font-weight: 600">RMB：${note.consumeMoney}</nobr></li>
            <li><nobr class="small">TC:9317908F4D896B3E TVR:0000000000 CSM:01</nobr></li>
            <li><nobr class="small">APP LABEL:PBOC CREDIT AID:A000000333010102</nobr></li>
            <li><nobr class="small">TSI:0000 ATC:0057 ONPR NUM:D2246327</nobr></li>
            <li><nobr class="small">AIP:7C00 TermCap:E0F1CB CVMR:</nobr></li>
            <li><nobr class="small">IAD:07010103A00000010A010000000000C8D7310E</nobr></li>
            <li><nobr class="small">持卡人签名(CARD HOLDER SIGNATURE)</nobr></li>
            <li><nobr class="small">本人确认以上交易，同意将其记入本卡账户</nobr></li>
            <li><nobr class="small">I ACKMOWLEDGE SATISFACTORY RECEIPT OF RELATIVE </nobr></li>
            <li><nobr class="small">GOODS/SERVICE</nobr></li>
        </ul>
    </div>
</body>
</html>