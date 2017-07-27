<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
<#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
<#assign result= randomLength("${note.consumeNum}",8)>
<#assign result2= randomLength("${note.consumeNum}",6)>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="${domainUrl}/assets/css/mb/mb8.css">

</head>
<body>

    <div id="main-body">
        <ul>
            <li class="title">富有海鲜食府 <span style="margin-left: 5px;font-size: 8px;">结账单</span></li>
            <br>
            <li>开始时间：${note.consumeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>结束时间：${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>房台号：007(A7) <span style="margin-left: 20px;">餐别：</span></li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">
            <li>客人数： <span style="margin-left: 20px;">单号：${result2}</span></li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">
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
                <#list note.products as productOne>
                <tr>
                    <td>${productOne.productName}</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.productPrice}.00</td>
                    <td>${productOne.produtTotal}.00</td>
                </tr>
                </#list>

                </tbody>
            </table>
            <hr style="margin: 5px 0px;">
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 20%">折扣：</td>
                    <td style="width: 25%">0.00</td>
                    <td style="width: 35%">总金额：</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td style="width: 30%">收银员：</td>
                    <td style="width: 25%">张鑫</td>
                    <td style="width: 25%">刷卡 实收：</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                </tbody>
            </table>
            <li><nobr>服务员：刘子晴 打印：${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</nobr></li>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <li style="text-align: center;margin: 10px 0px;"><img src="${domainUrl}/assets/images/img/yinlian.png" style="width: 70%"></li>
            <li>商户名称:富有海鲜食府</li>
            <li>商户编号:8981120058156889</li>
            <li>终端编号:01232734</li>
            <li>班次号：2017040500001  操作员号:01</li>
            <li>发卡行:${note.bankName}     收单行:银联商务</li>
            <li>有效期:${note.effectDate}</li>
            <li>卡号:(借)</li>
            <li>${bankNun}/C</li>
            <li>交易类型:消费</li>
            <li>批次号:000001</li>
            <li style="font-size: 10px;">凭证号:001441  授权码:000000</li>
            <li>参考号:${note.swipeNum}</li>
            <li>交易日期:${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>金额:</li>
            <li style="text-align: center;font-size: 11px;">RMB:${note.consumeMoney}.00</li>
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
            <hr>
            <li><nobr>本人确认以上交易，同意将其计入本卡账户</nobr></li>
            <li><nobr>I  ACKNOWLEDGE  SATISFACTORY  RECEIPT  </nobr></li>
            <li>OF  RELATIVE  GOODS/SERVICE</li>
            <li style="font-size: 12px;text-align: center">持卡人存根</li>
        </ul>
    </div>
</body>
</html>