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
        font-family: "Calibri";
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
        width: 40%;
    }
</style>
    <div id="main-body">
        <ul>
            <li style="text-align: center">人人乐塘沽店(RenRenLe)</li>
            <li>店号：S408 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;机号:KF15&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;流水号: 143 </li>
            <li>收银员：0551 <span style="margin-left: 40px;">日期：${note.consumeDate?string("yyyy.MM.dd")}</span></li>
            <li>=====================================</li>
            <table style="width: 100%" class="shop-table">
                <thead>
                    <tr>
                        <th style="font-weight: 500">商品名</th>
                        <th style="font-weight: 500">数量</th>
                        <th style="font-weight: 500">金额</th>
                    </tr>
                </thead>
                <tbody>
                    <#list note.products as productOne>
                    <tr>
                        <td>${productOne.productName}</td>
                        <td>${productOne.productNum}</td>
                        <td>${productOne.produtTotal}.00</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td>合计：</td>
                    <td style="opacity: 0">0.00</td>
                    <td>${note.consumeMoney}.00</td>
                    <td style="opacity: 0">0.00</td>
                </tr>
                </tbody>
            </table>
            <li>收： <span style="margin-left: 10px;">银联软银行:S40625*</span> <span style="margin-left: 20px;">${note.consumeMoney}.00</span></li>
            <li>售价商品数：1</li>
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td>收款总额：</td>
                    <td>${note.consumeMoney}.00</td>
                    <td>找回</td>
                    <td>0.00</td>
                </tr>
                <tr>
                    <td>实收：</td>
                    <td>${note.consumeMoney}.00</td>
                </tr>

                </tbody>
            </table>
            <li><nobr>===============${note.swipeDate?string("HH:mm:ss")}===============</nobr></li>
            <li><nobr  style="margin-left: 5%">团购电话：60691508，服务电话：60691518 </nobr></li>
            <li><nobr>此为7日内退还凭证，以现金，支票，银行卡消 </nobr></li>
            <li><nobr style="margin-left: 10%"> 费的如需发票请于30内道服务中心开具</nobr></li>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <li style="text-align: center">中国银联特约商户签购单</li>
            <li>第一联 <span style="margin-left:120px;">持卡人联</span></li>
            <li>————————————————————————</li>
            <li>商户名称/MERCHANT NAME:</li>
            <li style="text-align: center;font-size: 9px;">人人乐塘沽店</li>
            <li>商户号/MER. NO: 898120054117082</li>
            <li>终端号/TERM.ID: 01062542</li>
            <li>收银机/POS.NO:  KF15</li>
            <li>操作机/OPER.NO:0551 </li>
            <li>————————————————————————</li>
            <li>卡       号/CARD NO:</li>
            <li style="text-align: center">${bankNun}</li>
            <li>发卡银行/ISSU.  NO:${note.bankName} </li>
            <li>交易类型/TXN.TYPE:消费/SALE</li>
            <li>批  次  号/BATCH .NO:003138</li>
            <li>凭  证  号/VOUCH.NO:027643</li>
            <li>授  权  码/AUTH.   NO:204446</li>
            <li>日期时间/DATETIME:</li>
            <li style="text-align: center">${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <li>交易参考号/REF.NO: ${swipeNum}</li>
            <li>金额/AMOUNT  (RMB):${note.consumeMoney}.00</li>
            <li>————————————————————————</li>
            <li>备注/REFERENCE:</li>
            <br>
            <li>持卡人签名 CARDHOLDER SIGNATURE</li>
            <li>————————————————————————</li>
            <li>本人确认以上交易 同意记入该账户</li>
            <li><nobr>I ACKNOWLEDGE SATISFACTORY RECEIPT OF RELA</nobr></li>
            <li>TIVE GOODS/SERVICES</li>
        </ul>
    </div>
</body>
</html>