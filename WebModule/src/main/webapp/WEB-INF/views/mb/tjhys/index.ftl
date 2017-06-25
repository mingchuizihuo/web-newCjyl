
<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
<#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
<#assign result= randomLength("${note.consumeNum}",5)>
<#assign six= randomLength("${note.consumeNum}",6)>

<#assign swipeNum = randomLength("${note.swipeNum}",8)>

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
            <li style="font-size: 12px;"><u><b>欢迎光临</b> <span style="font-size: 10px;">天津韩元素服装店</span></u></li>
            <br>
            <li><b>交易号：${result}<span style="margin-left: 20px;">小票：1</span></b></li>
            <br>
            <li><b>收银台：032 <span style="margin-left: 20px;">收银员：60522</span></b></li>
            <br>
            <li><u><b>日期：${note.consumeDate?string("yyyy.MM.dd HH:mm:ss")}</b></u></li>
            <table style="width: 100%" class="shop-table">
                <thead>
                    <tr>
                        <th>单价</th>
                        <th>数量</th>
                        <th>折扣</th>
                        <th>金额</th>
                    </tr>
                </thead>
                <tbody>
                <#list note.products as productOne>
                <tr>
                    <td colspan="4">${productOne.productName}</td>
                </tr>
                <tr>
                    <td>${productOne.productPrice}.00</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.discount}</td>
                    <td>${productOne.produtTotal}.00</td>
                </tr>
                </#list>
                </tbody>
            </table>
            <table style="width: 100%">
                <tr>
                    <td>小计:</td>
                    <td style="text-align: center">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td>合计金额:</td>
                    <td style="text-align: center">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td>折扣金额:</td>
                    <td style="text-align: center">0.00</td>
                </tr>
                <tr>
                    <td>应付金额:</td>
                    <td style="text-align: center">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td>收款金额:</td>
                    <td style="text-align: center">${note.consumeMoney}.00</td>
                </tr>
                <tr>
                    <td>找零金额:</td>
                    <td style="text-align: center">0.00</td>
                </tr>
                <tr>
                    <td>国内卡:</td>
                    <td style="text-align: center">${note.consumeMoney}.00</td>
                </tr>
            </table>
            <br>
            <li>(0)${bankNun}</li>
            <br>
            <li>交易流水号：000135</li>
            <br>
            <li>消费金额：${note.consumeMoney}.00</li>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <li><b>商户名称：天津韩元素服装店</b></li>
            <br>
            <li>商户编号：030204042551</li>
            <br>
            <li>终端号：030204042550032</li>
            <br>
            <li>交易名称：消费</li>
            <br>
            <li>发卡行：${note.bankName}</li>
            <br>
            <li>卡号：${bankNun}</li>
            <br>
            <li>有效期：${note.effectDate}</li>
            <br>
            <li>金额：${note.consumeMoney}.00</li>
            <br>
            <li>交易日期：${note.swipeDate?string("MM-dd-yyyy")}</li>
            <br>
            <li>交易时间：${note.swipeDate?string(" HH:mm:ss")}</li>
            <br>
            <li>授权号：000000</li>
            <br>
            <li>终端批次号：000001</li>
            <br>
            <li>终端流水号：${six}</li>
            <br>
            <li>检索参考号：${swipeNum}</li>
            <br>
            <li>总计：  RMB：${note.consumeMoney}.00</li>
            <br>
            <li>为防止银行卡卡号泄露，保障持卡安全，</li>
            <br>
            <li>已对打印卡号中的部分号已屏蔽，如有</li>
            <br>
            <li>疑问请立即联系银行      </li>
            <br>
            <li>本人确认以上交易</li>
            <br>
            <li>持卡人签名：</li>

        </ul>
    </div>
</body>
</html>