
    <#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
    <#assign bankNumLength="com.idea.cjyl.core.util.FreemarkMethodBankCard"?new()>
<#--银行卡号，头部位数，星星个数，尾部位数-->
    <#assign bankNun = bankNumLength("${note.bankNum}",6,6,4) >
<#--流水号，流水号位数-->
    <#assign result= randomLength("${note.consumeNum}",6)>

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
        width: 40%;
    }
</style>
    <div id="main-body">
        <ul>
            <li class="title">川府老妈</li>
            <br>
            <li class="title">结账单</li>
            <li>NO：${result}-${note.consumeDate?string("yyyyMMdd-HHmm")}</li>
            <li> 结算 NO:  JS00011704190076 </li>
            <li>厅：C区 <span style="margin-left: 70px;">客位：C20</span></li>
            <li>开始时间：${note.consumeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <li>结束时间：${note.swipeDate?string("yyyy-MM-dd HH:mm:ss")}</li>
            <br>
            <table style="width: 100%" class="shop-table">
                <thead>
                    <tr>
                        <td>品项</td>
                        <td>数量</td>
                        <td>单价</td>
                        <td>小计</td>
                    </tr>
                </thead>
            </table>
            <hr style="margin: 5px 0px;">
            <table style="width: 100%" class="shop-table">
                <tbody>
                    <#list products as productOne>
                    <tr>
                        <td>${productOne.productName}</td>
                        <td>${productOne.productNum}</td>
                        <td>${productOne.productPrice}</td>
                        <td>${productOne.produtTotal}</td>
                    </tr>
                    </#list>

                </tbody>
            </table>
            <hr style="margin: 5px 0px;">
            <table style="width: 100%" class="shop-table">
                <thead>
                <tr>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>合计：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td>${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td>总优惠：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td>0.00</td>
                </tr>
                <tr>
                    <td>应收：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td>${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td>实收：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td>${note.consumeMoney}</td>
                </tr>
                <tr>
                    <td>抹零：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td>0.00</td>
                </tr>
                <tr>
                    <td>找零：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td>0.00</td>
                </tr>
                </tbody>
            </table>
            <hr style="margin: 5px 0px;">
            <li>收款员：028</li>
            <li>电话：022-25863333</li>
            <li>地址：天津塘沽解放路巨川金海岸C座3层</li>
            <br>
            <br>
            <br>
            <li style="text-align: center">中国银联签购单</li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">
            <li>持卡人存根：<span style="margin-left: 10px;">HOROROOOADOSAD</span></li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">
            <li>商户名：川府老妈（外滩店）</li>
            <li>商户号：${note.shopCode}</li>
            <li>终端号：03170001 <span style="margin-left: 30px">操作员：01</span></li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">
            <li>发卡行：${note.bankName} <span style="margin-left: 30px">收单行：兴业银行</span></li>
            <li>卡号（CARD NO）:</li>

            <li>${bankNun}</li>
            <br>
            <li>交易类型：消费（SALE）</li>
            <li>批次号：000638 <span style="margin-left: 30px">凭证号：021416</span></li>
            <li>授权号：566461 <span style="margin-left: 30px">有效期：${note.effectDate}</span></li>
            <li>参考号：${note.swipeNum}</li>
            <li>日期/时间：${note.swipeDate?string("yyyy/MM/dd HH:mm:ss")}</li>
            <li>金额(AMOUNT):RMB ${note.consumeMoney}</li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">
            <li>备注/REFERENCE</li>
            <hr style="border: 1px dashed #000000;margin: 5px 0px;">

        </ul>
    </div>
</body>
</html>