<#assign randomLength="com.idea.cjyl.core.util.FreemarkMethod"?new()>
<#assign result= randomLength(${note.consumeNum},8)/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>金元宝</title>
</head>
<body>
<style>
    #print-main-body *{
        font-size: 11px;
        margin: 0;
        padding: 0;
        font-family: "Arial";
    }
    #print-main-body{
        width: 224px;
    }
    #print-main-body ul{
        padding: 20px 11px;
    }
    #print-main-body li{
        list-style: none;
    }
    #print-main-body .title{
        text-align: center;
        font-size: 14px;
    }

    #print-main-body .shop-table{
        width: 100%;
        text-align: center;
    }
    #print-main-body .shop-table th:nth-child(1){
        text-align: left;
        width: 50%;
    }
    #print-main-body .shop-table td:nth-child(1){
        text-align: left;

    }
    hr{
        border: 0.5px solid #000000;
    }
</style>

<#--private Date consumeDate;//消费时间-->
<#--private String consumeNum;//消费流水号-->
<#--private Double consumeMoney;//消费总金额-->
<#--private List<ProductR> products;//产品列表-->
    <#--private String bankName;//发卡行-->
    <#--private String bankNum;//银行卡号-->
    <#--private String effectDate;//有效期-->
    <#--private Date swipeDate;//刷卡时间-->
    <#--private String swipeNum;//刷卡流水号-->
    <#--private String shopCode;//商铺code-->


<#--
private String productName;//产品名称
private Double productNum;//产品数量
private Double productPrice;//产品单价
private Double produtTotal;//产品总价
private Double discount;//折扣-->
    <div id="print-main-body">
        <ul>
            <li class="title">欢迎光临金元宝商厦${result}</li>
            <br>
            <li style="margin: 5px 0px;margin-left: 5%">交易号：${result} <span style="margin-left: 20px;">小票号：1</span></li>
            <li style="margin: 5px 0px;margin-left: 5%">收款台：162 <span style="margin-left: 20px;">收银员：00082</span></li>
            <li style="margin: 5px 0px;margin-left: 5%">日期：${note.consumeDate?string("yyyy.MM.dd HH:mm:ss")}</li>
            <hr style="margin: 5px 0px;margin-left: 5%">
            <li class="left-ground" style="margin: 5px 0px;margin-left: 5%"><u>营业员：10104 &nbsp;&nbsp;&nbsp;部门：0102300206 </u></li>
            <table style="width: 100%;margin-left: 5%" class="shop-table">
                <thead>
                    <tr>
                        <td>单价</td>
                        <td>数量</td>
                        <td>折扣</td>
                        <td>金额</td>
                    </tr>
                </thead>
                <tbody id="product">
                <#list products as productOne>

                <tr>
                    <td colspan="4">${productOne.productName}</td>
                </tr>
                </#list>

                <tr>
                    <td>1680.00</td>
                    <td>1</td>
                    <td>0.00</td>
                    <td>1680.00</td>
                </tr>
                <tr>
                    <td colspan="4">李维斯牛仔裤</td>
                </tr>
                <tr>
                    <td>1680.00</td>
                    <td>1</td>
                    <td>0.00</td>
                    <td>1680.00</td>
                </tr>
                </tbody>
            </table>
            <hr style="margin: 5px 0px;margin-left: 5%">
            <table style="width: 100%;margin-left: 5%" class="shop-table">
                <tbody>
                <tr>
                    <td style="width: 20%;">小计：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%"><span class="consumeMoney"></span></td>
                </tr>
                <tr>
                    <td style="width: 30%">合计金额：</td>
                    <td style="opacity: 0">1</td>
                    <td style="opacity: 0">1</td>
                    <td style="width: 20%"><span class="consumeMoney"></span></td>
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
                    <td style="width: 20%"><span class="consumeMoney"></span></td>
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
                    <td style="width: 20%"><span class="consumeMoney"></span></td>
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
                    <td style="width: 20%"><span class="consumeMoney"></span></td>
                </tr>
                </tbody>
            </table>
            <li style="margin-left: 5%">退换货规定详见总服务台或楼层明示</li>
            <li style="margin-top: 20px;">天津银联银行卡签购单/存根</li>
            <li style="margin-top: 10px;">商户名称：金元宝商厦</li>
            <li>商户编号：898120053112721</li>
            <li>终端编号：01083364</li>
            <li>交易类型：消费（SALE）</li>
            <li>卡 号：<span id="bankNum"></span> CUP</li>
            <li>收单行：银联商务天津分公司</li>
            <li>发卡行：${note.bankName}</li>
            <li>有效期：<span id="effectDate"></span></li>
            <li>清算日期：</li>
            <li>批次号：000356 凭证号：034776</li>
            <li>授权号：</li>
            <li>日期时间：<span id="swipeDate"></span></li>
            <li>交易参考： <span id="swipeNum"></span></li>
            <li>交易金额：</li>
            <li style="font-size: 14px; text-align: center">RMB:<span class="consumeMoney"></span>元</li>
            <li>操作号：00000 收款机：162</li>
            <li>备   注：</li>
            <li style="margin-top: 20px;">持卡人签名</li>
            <li>本人确定以上交易，同意将其计入本卡账户</li>
            <hr style="margin: 10px 0 0 5%">
        </ul>
    </div>
</body>
</html>