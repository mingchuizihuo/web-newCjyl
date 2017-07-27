/**
 * Created by xiaolitong on 2017/6/17.
 */
/**
 * Created by xiaolitong on 2017/6/17.
 */
/**
 * Created by xiaolitong on 2017/6/17.
 */
/**
 *
 * <#list dOneS as dOne>
 <tr>
 <td>'+dOne.saivianId+'</td>
 <td>'+dOne.userName+'</td>
 <td>'+dOne.loginName+'</td>
 <td>'+dOne.loginPasswd+'</td>
 <td>'+dOne.tel+'</td>
 <td>'+dOne.email+'</td>
 <td>'+dOne.emailPwd+'</td>
 <td>'+dOne.bankName+'</td>
 <td>'+dOne.bankType+'</td>
 <td>'+dOne.bankCardNum+'</td>
 <td>'+dOne.bankEffectiveDate+'</td>
 <td>'+dOne.renewalDate+'</td>
 <td>'+dOne.redemptionDate+'</td>
 <td>'+dOne.clickDate+'</td>
 <td>'+dOne.wage+'</td>
 <td>'+dOne.totalMoney+'</td>
 <td>
 <a class="btn btn-default btnEdit">编辑</a>
 <a class="btn btn-default btnAddMoney">添加消费明细</a>
 </td>
 </tr>

 </#list>
 */


function product() {
    //数据字典接口
    this.url  = domainUrl + '/serve/product/';
    //查询父类
    this.findAll = function (productType) {
        getAjax(product.url+"findAllByType",{productType:productType},function (data) {

            var d = data.aaData;
            var html="";
            $.each(d,function (index,dOne) {
                html +='<tr>'+
                    '<td>'+index+'</td>'+
                    '<td>'+dOne.productName+'</td>'+
                    '<td>'+dOne.productPrice+'</td>';
                if(dOne.productPriceType==0){
                    html+='<td>个数</td>';
                }else{
                    html+='<td>非个数</td>';
                }

                if(dOne.productType==1){
                    html+='<td>超市</td>';
                }else if(dOne.productType==2){
                    html+='<td>饭店</td>';

                }else if(dOne.productType==3){
                    html+='<td>商场</td>'
                }else if(dOne.productType==4){
                    html+='<td>服装</td>'
                }else if(dOne.productType==5){
                    html+='<td>化妆品</td>'
                }

                html+=
                    '<td>'+
                    '<a class="btn btn-default btnEdit">编辑</a>' +
                    '<a class="btn btn-default " onclick="product.del('+dOne.id+')">删除</a>' +
                    '</td></tr>';

            });

            $("#productList").html(html);
        })
    };
    this.del = function (id) {
        postAjax(product.url+"del",{id:id},function (data) {
            product.findAll(0);
        })
    }
}

var product = new product();
product.findAll(0);
//点击超市
$(".productcs").on("click",function () {
    product.findAll(1);
})
//点击饭店
$(".productfd").on("click",function () {
    product.findAll(2);
})
//点击商场
$(".productsc").on("click",function () {
    product.findAll(3);
})
//点击服装
$(".productfz").on("click",function () {
    product.findAll(4);
})
//点击化妆品
$(".producthzp").on("click",function () {
    product.findAll(5);
})
//点击水果
$(".producthzp").on("click",function () {
    product.findAll(6);
})
//点击咖啡店
$(".producthzp").on("click",function () {
    product.findAll(7);
})
//点击所有
$(".productsy").on("click",function () {
    product.findAll(0);
})
