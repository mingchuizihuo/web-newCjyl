
<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<!--银行卡号，头部位数，星星个数，尾部位数&ndash;&gt;-->
<#assign bankNun = bankNumLength("${note.bankNum}",9,6,4) >
<!--流水号，流水号位数&ndash;&gt;-->
<#assign result= randomLength("${note.consumeNum}",3)>
<#assign swipeNum= randomLength("${note.swipeNum}",8)>

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
        <li class="title">乐购天津泰达店</li>
        <li class="title2">营业时间7:00-22:00联系电话25348155</li>
        <li class="title2">Trx${result}&nbsp;TA0E&nbsp;0054&nbsp;
        ${note.consumeDate?string("MM/dd/yyyy HH:mm")}</li>
        <li class="title2">${note.consumeDate?string("MM/dd/yyyy HH:mm")}   销售收据    ${note.consumeDate?string("HH:mm")}</li>
        <table style="width: 100%" class="shop-table">
            <thead>
            <tr>
                <th>商品</th>
                <th>数量</th>
                <th>金额</th>
            </tr>
            </thead>
            <tbody>
            <#list note.products as productOne>
            <tr>
                <td>${productOne.productName}</td>
                <td>${productOne.productNum}</td>
                <td>${productOne.productPrice}.00</td>
            </tr>
            </#list>
            </tbody>
        </table>
        <table style="width: 100%" class="shop-table">
            <thead>
            <tr>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>收款：</td>
                <td>银行卡</td>
                <td>人民币 </td>
                <td>${note.consumeMoney}.00</td>
            </tr>
            <tr>
                <td>卡号：</td>
                <td colspan="3">${bankNun}</td>

            </tr>
            <tr>
                <td>收款总额：</td>
                <td style="opacity: 0">${note.consumeMoney}.00</td>
                <td>找回:</td>
                <td>0.00</td>
            </tr>
            <tr>
                <td>实收：</td>
                <td colspan="3">${note.consumeMoney}.00</td>
            </tr>
            <tr>
                <td>已买商品总数:</td>
                <td>${note.products?size}</td>
                <td> C.ID:</td>
                <td> 5058</td>
            </tr>

            <p>
                ==================================
                请妥善保存小票作为退换货必要凭证
                天津市开发区黄海路19号
                商品未过保质期，华润万家天津泰达店

                ==================================

            </p>
            <p>
                开票凭据
                ${note.consumeDate?string("yyyy/MM/dd")} TAOE 0054 5058 trx:${result}
                交易金额：                 ${note.consumeMoney}.00
                =============${note.consumeDate?string("HH:mm:ss")}==============
            </p>
        </table>
        <li>************************************</li>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <li>工商银行-华润万家超市MISPOS交易凭单</li>
        <li>持卡人存根</li>
        <li>商户号：030204990142</li>
        <li>终端号：030204990142017</li>
        <li>收银台号：TA0D0054</li>
        <li>操作员号：5058</li>
        <li>交易卡号：${bankNun}</li>
        <li>有效期：${note.effectDate}</li>
        <li>交易金额：￥${note.consumeMoney}.00</li>
        <li>卡类型：S${note.bankName}</li>
        <li>交易类型：消费</li>
        <li>交易日期：${note.swipeDate?string("yyyyMMdd HH:mm:ss")}</li>
        <li>系统检索号：${swipeNum}</li>
        <li>备注:银联商户号(UNION PAY MERCHANT CODE):</li>
        <li>102110054110132</li>
        <li>总计(TOTAL):RMB ${note.consumeMoney}.00</li>
        <li>交易证书(TC):8EBA0FCDCE359B3F</li>

        <li>为防止银行卡卡号泄露，保障持卡人用卡安全，已对打印卡号中的部分号码予以屏蔽，如有疑问请立即联系银行。</li>

        <li>持卡人同意支付上述款项</li>
        <li> *************************************</li>
    </ul>
</div>
</body>
</html>