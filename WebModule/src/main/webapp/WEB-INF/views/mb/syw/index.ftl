<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
<#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
<#assign result= randomLength("${note.consumeNum}",9)>
<#assign swipeNum= randomLength("${note.swipeNum}",12)>
<#assign swipeNum2= randomLength("${note.swipeNum}",18)>


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
        width: 162px;
    }
    #main-body ul{
        padding: 20px 11px;
    }
    #main-body li{
        list-style: none;
    }
    #main-body .title{
        text-align: center;
        font-size: 12px;
        font-family: "Calibri";
        font-weight: 600;
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
        <li class="title">尚鱼味远洋未来城</li>
        <li class="title" style="font-size: 8px">消费明细单(堂食)</li>
        <li>单号：0050 <span style="margin-left: 10px;">开始：${note.consumeDate?string("HH:mm")}</span></li>
        <li>台牌：03 <span style="margin-left: 10px;">开单：002|002</span></li>
        <li>—————————————————</li>
        <table style="width: 100%" class="shop-table">
            <thead>
            <tr>
                <th style="font-weight: 500">品名</th>
                <th style="font-weight: 500">数量</th>
                <th style="font-weight: 500">小计(元)</th>
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

            <tr>
                <td>消费合计:</td>
                <td style="opacity: 0">1</td>
                <td>${note.consumeMoney}.00</td>
            </tr>
            </tbody>
        </table>
        <li>—————————————————</li>
        <li>Key:${note.swipeDate?string("yyyyMMdd")}${result}</li>
        <li><nobr>打印时间：${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</nobr></li>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <li style="text-align: center; font-size: 12px;">签购单</li>
        <li><nobr>持卡人存根 CRARDHOLDER COPY</nobr></li>
        <li>商户名称 MERCHANT NAME</li>
        <li>XY天津市西青区味鱼尚餐厅</li>
        <li>商户编号 MERCHANT NO.</li>
        <li>528121053110001</li>
        <li>终端编号 TERMINAL ID</li>
        <li>12100001</li>
        <li>操作员号 OPERATOR NO 01</li>
        <li>流水号 TRACE NO.</li>
        <li>${swipeNum2}</li>
        <li>发卡行 ISS ${note.bankName}</li>
        <li>收单行 ACQ 52800001</li>
        <li>卡号 CARD NO.</li>
        <li style="font-size: 12px;">${bankNun}</li>
        <li>有效期 EXP DATE ${note.effectDate}</li>
        <li>交易类型 TRANS TYPE</li>
        <li style="font-size: 12px;">消费（SALE）</li>
        <li>批次号 BAICH NO.000005</li>
        <li>凭证号 VOUCHER NO.525161</li>
        <li>参考号 REFER NO.${swipeNum}</li>
        <li>日期／时间 DATE／TIME</li>
        <li>${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
        <li>交易金额 AMOUNT</li>
        <li style="font-size: 12px;">RMB: ${note.consumeMoney}.00元</li>
        <li>—————————————————</li>
        <li>备注 REFERENCE</li>
        <li>CVM:420300   Unpr Num:2427E318</li>
        <li>TVR:8080047800.   TSI:E800</li>
        <li>LAD:07010103A02000010A010000000</li>
        <li>00054E685C6        AIP:7C00</li>
        <li>Appl Label:PBOC CREDIT</li>
        <li>Appl Name:PBOC CREDIT</li>
        <li>ARQC:06A7A9C0D9F4D59E</li>
        <li>AID:A000000333010102</li>
        <li>—————————————————</li>
        <li>本人确认以上交易，同意将其计入本账户（请妥善保管）</li>
        <li>I ACKNOWLWDGE SATISFACTORY RECEIPT OF RELATIVE GOODS SERVICE</li>
    </ul>
</div>
</body>
</html>