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


 function saivianRemember() {
     //数据字典接口
     this.url  = domainUrl + '/serve/saivian_remember/';
     //查询父类
     this.findAll = function (userId) {
         getAjax(saivianRemember.url+"findAllByUser",{userId:userId},function (data) {
             var d = data.aaData;
             var html="";
             $.each(d,function (index,dOne) {
                 html +='<tr>'+
                     '<td>'+index+'</td>'+
                     '<td>'+dOne.saivianId+'</td>'+
                     '<td>'+dOne.userName+'</td>'+
                     '<td>'+dOne.loginName+'</td>'+
                     '<td>'+dOne.loginPassword+'</td>'+
                     '<td>'+dOne.tel+'</td>'+
                     '<td>'+dOne.email+'</td>'+
                     '<td>'+dOne.emailPwd+'</td>'+
                     '<td>'+dOne.bankName+'</td>'+
                     '<td>'+dOne.bankType+'</td>'+
                     '<td>'+dOne.bankCardNum+'</td>'+
                     '<td>'+dOne.bankEffectiveDate+'</td>'+
                     '<td>'+dOne.renewalDate+'</td>'+
                     '<td>'+dOne.redemptionDate+'</td>'+
                     '<td>'+dOne.clickDate+'</td>'+
                     '<td>'+dOne.wage+'</td>'+
                     '<td>'+dOne.totalMoney+'</td>'+
                     '<td>'+
                     '<a class="btn btn-default btnEdit">编辑</a>'+
                     '<a class="btn btn-default btnAddMoney">添加消费明细</a></td></tr>';

             });
             
             $("#saivianList").html(html);
         })
     };
 }

var saivianRemember = new saivianRemember();
saivianRemember.findAll(1);
//点击焦健
$(".userjj").on("click",function () {
    saivianRemember.findAll(1);
})
//点击庞姨
$(".userpy").on("click",function () {
    saivianRemember.findAll(2);
})
