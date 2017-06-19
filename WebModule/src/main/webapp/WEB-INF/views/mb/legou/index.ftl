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
            <li style="text-align: center">乐购天津塘沽外滩店</li>
            <li style="text-align: center">营业时间 7:30-22:00 联系电话 59812542</li>
            <li>Trx 273  TA0E  0018 ${note.consumeDate?string("MM/dd/yyyy HH:mm")}</li>
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
            <table style="width: 100%" class="shop-table">
                <tbody>
                <tr>
                    <td>收款总额：</td>
                    <td>${note.consumeMoney}</td>
                    <td>找回：</td>
                    <td>0.00</td>
                </tr>
                <tr>
                    <td>实收：</td>
                    <td>${note.consumeMoney}</td>
                    <td style="opacity: 0">：</td>
                    <td style="opacity: 0">：</td>
                </tr>
                <tr>
                    <td>已买商品总数：</td>
                    <td>1</td>
                    <td>C.ID:2004</td>
                    <td style="opacity: 0">：</td>
                </tr>
                </tbody>
            </table>
            <li>=========================================</li>
            <li>请妥善保存小票作为退换货依据</li>
            <li>地址：天津市塘沽区上海道888号</li>
            <li>@打头商品的发票和索取方式由专柜提供</li>
            <li><nobr>商品未过保质期，华润万家天津塘沽外滩店</nobr></li>
            <li>=========================================</li>
            <li style="text-align: center">开票凭据</li>
            <li>${note.swipeDate?string("yyyy/MM/dd")} TAOE 0018 2004 trx:273</li>
            <li>交易金额： <span style="margin-left: 30px;">${note.consumeMoney}</span></li>
            <li>================17:16:47=================</li>
            <li style="text-align: center">乐购天津塘沽外滩店</li>
            <li>营业时间7:30-22:00联系电话59812542</li>
            <li>店号：TA0E    机号：0018  流水号：273</li>
            <li>收银员：2004 <span style="margin-left: 30px;">日期：2017.04.06</span></li>
            <li>时间：${note.swipeDate?string("HH:mm:ss")} <span style="margin-left: 10px;">消费金额：370.00</span></li>
            <li style="text-align: center;"> 购物满68元免费停车1小时满136</li>
            <li style="text-align: center;"> 元免费停车2时，超2小时自费</li>
            <br>
            <li>****************************</li>
            <li>工商银行-华润万家超市MISPOS交易凭单</li>
            <li>持卡人存根</li>
            <li>商户号：030204990139</li>
            <li>终端号：030204990139028</li>
            <li>收银台号：TAOE0018</li>
            <li>操作员号：2004</li>
            <li>交易卡号：${bankNun}</li>
            <li>有效期：${note.effectDate}</li>
            <li>交易金额：￥${note.consumeMoney}</li>
            <li>卡类型：S中国邮政储蓄银行</li>
            <li>交易类型：消费</li>
            <li>交易日期：${note.swipeDate?string("yyyyMMdd HH:mm:ss")}</li>
            <li>系统检索号：70241046</li>
            <li>备注:总计(TOTAL):RMB ${note.consumeMoney}</li>
            <li>交易证书(TC):8EBA0FCDCE359B3F</li>
            <br>
            <li><nobr>为防止银行卡卡号泄露，保障持卡人用卡安全，已</nobr></li>
            <li><nobr>对打印卡号中的部分号码予以屏蔽，如有疑问请立</nobr></li>
            <li>即联系银行。</li>
            <br>
            <li>持卡人同意支付上述款项</li>
            <li>******************************</li>
        </ul>
    </div>
</body>
</html>