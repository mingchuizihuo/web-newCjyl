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
</style>
    <div id="main-body">
        <ul>
            <li class="title">欢迎光临永旺商厦</li>
            <br>
            <li style="margin: 5px 0px;margin-left: 5%">交易号：211828 <span style="margin-left: 20px;">小票号：1</span></li>
            <li style="margin: 5px 0px;margin-left: 5%">收款台：133 <span style="margin-left: 20px;">收银员：00099</span></li>
            <li style="margin: 5px 0px;margin-left: 5%">日期：${note.consumeDate?string("yyyy.MM.dd HH:mm:ss")}</li>
            <hr style="margin: 5px 0px;margin-left: 5%">
            <li class="left-ground" style="margin: 5px 0px;margin-left: 5%"><u>营业员：60117 &nbsp;&nbsp;&nbsp;部门：0102300200 </u></li>
            <table style="width: 100%;margin-left: 5%" class="shop-table">
                <thead>
                    <tr>
                        <td>单价</td>
                        <td>数量</td>
                        <td>折扣</td>
                        <td>金额</td>
                    </tr>
                </thead>
                <tbody>
                <#list products as productOne>
                <tr>
                    <td colspan="4">${productOne.productName}</td>
                </tr>
                <tr>
                    <td>${productOne.productPrice}</td>
                    <td>${productOne.productNum}</td>
                    <td>${productOne.discount}</td>
                    <td>${productOne.produtTotal}</td>
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
                    <td style="width: 20%">${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td style="width: 30%">合计金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td style="width: 30%">折扣金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td style="width: 30%">应付金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%">${note.consumeMoney}</td>
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
                    <td style="width: 20%">${note.consumeMoney}</td>
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
                    <td style="width: 20%">${note.consumeMoney}</td>
                </tr>
                </tbody>
            </table>
            <li style="margin-left: 5%">退换货规定详见总服务台或楼层明示</li>
            <li style="margin-top: 20px;">天津银联银行卡签购单/存根</li>
            <li style="margin-top: 10px;"><nobr>商户名称：永旺商业有限公司天津滨海新区分公司</nobr></li>
            <li>商户编号：301120051113006</li>
            <li>终端编号：01083364 <span style="margin-left: 10px;">操作员号：01</span></li>
            <li><nobr>卡类型：${note.bankName} <span style="margin-left: 10px;">收单行号：03010000</span></nobr></li>
            <li style="font-size: 14px;">交易卡号：</li>
            <li><b>${bankNun} （C)</b></li>
            <li>卡序列号：00</li>
            <li>消费(SALE)</li>
            <li><nobr>有效期：${note.effectDate}		<span style="margin-left: 10px;">票据号：015731</span></nobr></li>
            <li><nobr>流水号：022071		<span style="margin-left: 10px;">日    期：${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</span></nobr></li>
            <li><nobr>金额： <span style="margin-left: 10px;">RMB</span><span style="margin-left: 10px;">${note.consumeMoney}</span></nobr></li>
            <li>备注：</li>
            <li>TC: F688FB75E4604E5E	AID:A000000333010101</li>
            <li>TUR：000004E000	ATC：0041</li>
            <li>本人确认以上交易同意记入本人卡账户</li>
        </ul>
    </div>
</body>
</html>