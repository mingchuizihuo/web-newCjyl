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
            <li class="title">世纪华联远洋城旗舰店 </li>
            <br>
            <li>收银员：1001 <span style="margin-left: 10px;">机号：002</span></li>
            <li>时间：${note.consumeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>——————————————————</li>
            <table style="width: 100%" class="shop-table">
                <thead>
                <tr>
                    <th style="font-weight: 500">商品名</th>
                    <th style="font-weight: 500">数量</th>
                    <th style="font-weight: 500">金额</th>
                </tr>
                </thead>
                <tbody>
                <#list products as productOne>
                <tr>
                    <td>${productOne.productName}</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.produtTotal}</td>
                </tr>
                </#list>

                </tbody>
            </table>
            <li>——————————————————</li>
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 20%">件数：</td>
                    <td style="width: 25%">${note.productNum}</td>
                    <td style="width: 35%">应付：</td>
                    <td style="width: 20%">${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td style="width: 20%">实收：</td>
                    <td style="width: 25%">银行卡</td>
                    <td style="width: 35%">人民币：</td>
                    <td style="width: 20%">${note.consumeMoney}</td>
                </tr>
                </tbody>
            </table>
            <li>小票号：NO.2017040600030027901</li>
            <br>
            <br>
            <li style="text-align: center">谢谢惠顾！</li>
            <li style="text-align: center">欢迎下次光临</li>
            <br>
            <li style="text-align: center;margin: 10px 0px;"><img src="../img/yinlian.png" style="width: 70%"></li>
            <li>商户名称:世纪华联超市远洋城旗舰</li>
            <li>店</li>
            <li>商铺编号:898120053311581</li>
            <li>终端编号:01214817   操作员号:01</li>
            <li>发卡行:${note.bankName} 收单行:银联商务</li>
            <li>卡号：</li>
            <li><nobr  style="font-size: 18px; font-weight: 600">${bankNun}/</nobr></li>
            <li><nobr  style="font-size: 18px; font-weight: 600">C</nobr></li>
            <li>交易类型： <span style="font-size: 16px;">TO 消费</span></li>
            <li>批次号:000001</li>
            <li style="font-size: 16px;">凭证号:000286</li>
            <li style="font-size: 16px;">授权码:</li>
            <li>参考号:${note.swipeNum}</li>
            <li>交易日期:${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>金额（AMOUNT）</li>
            <li style="font-size: 16px;text-align: center ">RMB：${note.consumeMoney}</li>
            <li><nobr>备注:</nobr></li>
            <li><nobr>CSN:ARQC:3BE0/B26B1/AAF22</nobr></li>
            <li><nobr>UnprNo:73EE82F4 ATC:004F</nobr></li>
            <li><nobr>TVR:0000047000 TSI:E800</nobr></li>
            <li><nobr>AID:A000000333010102AIP:7C00</nobr></li>
            <li><nobr>APPLAB:CMB CREDITCARD</nobr></li>
            <li><nobr>CVME:420300 TermCap:E0F1C8</nobr></li>
            <li><nobr>IAD:07010103A02002010A01000000</nobr></li>
            <li><nobr>000025C24F3F</nobr></li>
            <li><nobr>------------------------     </nobr></li>
            <li><nobr style="font-size: 7px;">XGDG810_31100709持卡人存根CARDHOLDER COPE</nobr></li>

        </ul>
    </div>
</body>
</html>