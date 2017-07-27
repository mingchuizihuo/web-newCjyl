<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
<#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
<#assign result= randomLength("${note.consumeNum}",8)>
<#assign swipeNum = randomLength("${note.swipeNum}",12)>
<!DOCTYPE html>
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
            <li class="title">塘沽供销社 </li>
            <li>9999  NO.01201703120008 </li>
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
            <li style="text-align: center;margin: 10px 0px;"><img src="${domainUrl}/assets/images/img/yinlian.png" style="width: 70%"></li>
            <li>商户名称（MERCHANT NAME）</li>
            <li>津滨海塘沽供销社批发站（供销社烟酒</li>
            <li>专卖）</li>
            <li>商铺编号(MERCHANTNO.）</li>
            <li>898120059988695</li>
            <li>终端编号(TERMINALNO.）01100705</li>
            <li>操作员号(OPERATOR NO.):01</li>
            <li>发卡行（ISSUER）:${note.bankName}</li>
            <li>收单行（ACQUIRER）:银联商务</li>
            <li>卡号：</li>
            <li><nobr  style="font-size: 18px; font-weight: 600">${bankNun}/C</nobr></li>
            <li>交易类型(TRANS TYPE):</li>
            <li>消费（SALE）</li>
            <li>批次号(BATCH NO.）:00012</li>
            <li>凭证号(VOUCHER NO.):002285</li>
            <li>授权码（AUTH NO.）:</li>
            <li>参考号(REFER NO.)${swipeNum}</li>
            <li>日期时间（DATE/TIME）</li>
            <li style="text-align: center">${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>金额（AMOUNT）</li>
            <li style="font-size: 16px;text-align: center ">RMB：${note.consumeMoney}.00</li>
            <li>备注（REFERENCE）:</li>
            <li><nobr>CSN:001ARQC:972C4FD924CFE8C3</nobr></li>
            <li><nobr>UnprNo:599e8646 ATC:001F ATC:004F</nobr></li>
            <li><nobr>TVR:0000000000 TSI:0000</nobr></li>
            <li><nobr>AID:A000000333010102AIP:7C00</nobr></li>
            <li><nobr>APPLAB:PBDC CREDIT</nobr></li>
            <li><nobr>CVME:3F0000 TermCap:E0E9C8</nobr></li>
            <li><nobr>IAD:0702103A00000010A010000000</nobr></li>
            <li><nobr>0000CA0C91BB  </nobr></li>
            <li><nobr>------------------------     </nobr></li>
            <li><nobr style="font-size: 7px;">XGDG810_31100709持卡人存根CARDHOLDER COPE</nobr></li>

        </ul>
    </div>
</body>
</html>