

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

    <div id="print-main-body">
        <ul>
            <li class="title">欢迎光临伊势丹商厦</li>
            <br>
            <li style="margin: 5px 0px;margin-left: 5%">交易号：211839 <span style="margin-left: 20px;">小票号：1</span></li>
            <li style="margin: 5px 0px;margin-left: 5%">收款台：173 <span style="margin-left: 20px;">收银员：00093</span></li>
            <li style="margin: 5px 0px;margin-left: 5%">日期：${note.consumeDate?string("MM/dd/yyyy HH:mm")}</li>
            <hr style="margin: 5px 0px;margin-left: 5%">
            <li class="left-ground" style="margin: 5px 0px;margin-left: 5%"><u>
                营业员：10115 &nbsp;&nbsp;&nbsp;部门：0102300217 </u></li>
            <table style="width: 100%" class="shop-table">
                <thead>
                <tr>
                    <th>商品</th>
                    <th>数量</th>
                    <th>折扣</th>
                    <th>单价</th>
                </tr>
                </thead>
                <tbody>
                <#list note.products as productOne>
                <tr>
                    <td>${productOne.productName}</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.discount}</td>
                    <td>${productOne.productPrice}.00</td>

                </tr>
                </#list>
                </tbody>
            </table>
            <hr style="margin: 5px 0px;margin-left: 5%">
            <table style="width: 100%;margin-left: 5%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 20%;">小计：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td style="width: 30%">合计金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td style="width: 30%">折扣金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">0.00</td>
                </tr>
                <tr>
                    <td style="width: 30%">应付金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                </tbody>
            </table>
            <hr style="margin-left: 5%">
            <table style="width: 100%;margin-left: 5%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 30%">收款金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td style="width: 30%">找零金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">0.00</td>
                </tr>
                <tr>
                    <td style="width: 30%">外部卡：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}.00</td>
                </tr>
                </tbody>
            </table>
            <li style="margin-left: 5%">退换货规定详见总服务台或楼层明示</li>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <li style="margin-top: 20px;">天津银联银行卡签购单/存根</li>
            <li style="margin-top: 10px;">商户名称：伊势丹商厦</li>
            <li>商户编号：898120053112732</li>
            <li>终端编号：01083375</li>
            <li>交易类型：消费（SALE）</li>
            <li>卡 号：${bankNun} CUP</li>
            <li>收单行：银联商务天津分公司</li>
            <li>发卡行：${note.bankName}</li>
            <li>有效期：${note.effectDate}</li>
            <li>清算日期：</li>
            <li>批次号：000367 凭证号：034787</li>
            <li>授权号：</li>
            <li>日期时间：${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <li>交易参考：${swipeNum}</li>
            <li>交易金额：</li>
            <li style="font-size: 14px; text-align: center">RMB:${note.consumeMoney}.00元</li>
            <li>操作号：00000 收款机：173</li>
            <li>备   注：</li>
            <li style="margin-top: 20px;">持卡人签名</li>
            <li>本人确定以上交易，同意将其计入本卡账户</li>
            <hr style="margin: 10px 0 0 5%">
        </ul>
    </div>
</body>
</html>