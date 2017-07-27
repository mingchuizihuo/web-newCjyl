
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
    <link rel="stylesheet" href="${domainUrl}/assets/css/mb/mb8.css">

</head>
<body>

    <div id="main-body">
        <ul>
            <li class="title">奥特莱斯 B01A07</li>
            <li class="title">销售单</li>
            <li class="title">${note.consumeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <li class="left-ground" style="margin-top: 10px;"><u>营业员：10104 &nbsp;&nbsp;&nbsp;部门：0102300206 </u></li>
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
                    <td>应付金额：</td>
                    <td style="opacity: 0"></td>
                    <td>${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td>已付金额：</td>
                    <td style="opacity: 0">1</td>
                    <td>${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td>找零金额：</td>
                    <td style="opacity: 0">1</td>
                    <td>0.00</td>
                </tr>
                <tr>
                    <td>银行卡(内卡)：</td>
                    <td style="opacity: 0">1</td>
                    <td>${note.consumeMoney}.00</td>
                </tr>
                </tbody>
            </table>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>

            <li>BankCard NO：${bankNun}</li>
            <li>欢迎惠顾</li>
            <li>请妥善保存此票据，以作为退换凭证</li>
            <li>请到广场客服中心快飘 </li>
            <li>欢迎再次光临</li>
            <li style="margin-top: 20px;">天津银联银行卡签购单/存根</li>
            <li style="margin-top: 10px;">商户名称：奥特莱斯</li>
            <li>商户编号：898120053112721</li>
            <li>交易类型：消费（SALE）</li>
            <li>卡 号： ${bankNun} CUP</li>
            <li>收单行：银联商务天津分公司</li>
            <li>发卡行：${note.bankName}</li>
            <li>有效期：${note.effectDate}</li>
            <li>清算日期：</li>
            <li>批次号：000356 凭证号：034776</li>
            <li>授权号：</li>
            <li>日期时间：${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <li>交易参考：${note.swipeNum}</li>
            <li>交易金额：</li>
            <li style="font-size: 14px; text-align: center">RMB:${note.consumeMoney}.00元</li>
            <li>操作号：00000 收款机：162</li>
            <li>备   注：</li>
            <li style="margin-top: 20px;">持卡人签名</li>
            <li>本人确定以上交易，同意将其计入本卡账户</li>
        </ul>
    </div>
</body>
</html>