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


function shop() {
    //数据字典接口
    this.url  = domainUrl + '/serve/shop/';
    //查询父类
    this.findAll = function (shopType) {
        getAjax(shop.url+"findAllByType",{shopType:shopType},function (data) {
            var d = data.aaData;
            var html="";
            $.each(d,function (index,dOne) {
                html +='<tr>'+
                    '<td>'+index+'</td>'+
                    '<td>'+dOne.shopName+'</td>'+
                    '<td>'+dOne.shopCode+'</td>';
                        if(dOne.shopType==1){
                            html+='<td>超市</td>';
                        }else if(dOne.shopType==2){
                            html+='<td>饭店</td>';

                        }else if(dOne.shopType==3){
                            html+='<td>商场</td>'
                        }else if(dOne.shopType==4){
                            html+='<td>服装</td>'
                        }else if(dOne.shopType==5){
                            html+='<td>化妆品</td>'
                        }

                html+=
                    '<td>'+
                    '<a class="btn btn-default btnEdit">编辑</a>' +
                    '<a class="btn btn-default " onclick="shop.del('+dOne.id+')">删除</a>' +
                    '</td></tr>';

            });

            $("#shopList").html(html);
        })
    };
    this.del = function (id) {
        console.log(123)
        postAjax(shop.url+"del",{id:id},function (data) {
            shop.findAll(0);
        })
    }
}

var shop = new shop();
shop.findAll(0);
//点击超市
$(".shopcs").on("click",function () {
    shop.findAll(1);
})
//点击饭店
$(".shopfd").on("click",function () {
    shop.findAll(2);
})
//点击商场
$(".shopsc").on("click",function () {
    shop.findAll(3);
})

//点击服装
$(".shopfz").on("click",function () {
    shop.findAll(4);
})
//点击化妆品
$(".shophzp").on("click",function () {
    shop.findAll(5);
})
//点击所有
$(".shopsy").on("click",function () {
    shop.findAll(0);
})
