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
var printId = "";



function saivianRemember() {
    //数据字典接口
    this.url = domainUrl + '/serve/saivian_remember/';
    //查询父类
    this.findAll = function (userId) {
        getAjax(saivianRemember.url + "findAllByUser", {userId: userId}, function (data) {
            var d = data.aaData;
            var html = "";
            $.each(d, function (index, dOne) {

                html += '<tr>' +
                    '<td><input type="checkbox" id="'+dOne.id+'"/></td>'+
                    '<td>' + index + '</td>' +
                    '<td>' + dOne.saivianId + '</td>' +
                    '<td>' + dOne.userName + '</td>' +
                    '<td>' + dOne.loginPassword + '</td>' +
                    '<td>' + dOne.email + '</td>' +
                    '<td>' + dOne.emailPwd + '</td>' +
                    '<td onclick="saivianRemember.updateRenewalDate('+dOne.id+')"' +
                    ' id="renewalDate'+dOne.id+'">' + dOne.renewalDate + '</td>' +
                    '<td onclick="saivianRemember.updateRedemptionDate('+dOne.id+')"' +
                    ' id="redemptionDate'+dOne.id+'">' + dOne.redemptionDate + '</td>' +
                    '<td onclick="saivianRemember.updateClickDate('+dOne.id+')"' +
                    ' id="clickDate'+dOne.id+'">' + dOne.clickDate + '</td>' +
                    '<td>' +
                    '<a class="btn btn-default" onclick="saivianRemember.showRecord('+dOne.id+')">查看详情</a>' +
                    '</td>' +
                    '<td>' +
                    '<a class="btn btn-default" onclick="saivianRemember.showRecord('+dOne.id+')">查看消费记录</a>' +
                    '</td>' +
                    '<td>' +
                    '<a class="btn btn-default" onclick="saivianRemember.edit(' + dOne.id + ')">编辑</a>' +
                    '<a class="btn btn-default" onclick="saivianRemember.addMoney(' + dOne.id + ')">添加消费明细</a></td></tr>';

            });

            $("#saivianList").html(html);
        })
    };
    //查看会员详情
    this.showRememberInfo =  function (id) {
        layer.open({
            type: 2,
            title: '打印小票记录查看',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/serve/saivian_remember/showRecord?saivianTableId='+id,
        });
    }

    //查看消费记录
    this.showRecord = function (id) {


        layer.open({
            type: 2,
            title: '打印小票记录查看',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/serve/saivian_remember/showRecord?saivianTableId='+id,
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {


            }, btn2: function (index, layero) {
                layer.close(index);
            },
            cancel: function (index) {
                //按钮【关闭】的回调
                layer.close(index);
            }
        });

    }

    this.edit = function (id) {
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/saivianRemember/addSaivianRemember.ftl',
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {
                postData = {
                    id: id,
                    bankName: layer.getChildFrame("#bankName", index).val(),
                    bankType: layer.getChildFrame("#bankType", index).val(),
                    bankCardNum: layer.getChildFrame("#bankCardNum", index).val(),
                    bankEffectiveDate: layer.getChildFrame("#bankEffectiveDate", index).val(),
                }
                postAjax(domainUrl + '/serve/saivian_remember/update', postData, function (data) {
                        layer.close(index);
                        saivianRemember.findAll(2);
                    }
                )

            }, btn2: function (index, layero) {
                layer.close(index);
            },
            cancel: function (index) {
                //按钮【关闭】的回调
                layer.close(index);
            }
        });
    }
    this.addMoney = function (id) {
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/saivianRemember/addConsumptionRecord.ftl',
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {
                postData = {
                    userSaivianId: id,
                    consumeMoney: layer.getChildFrame("#consumeMoney", index).val(),
                    shopCode: layer.getChildFrame("#shopCode", index).val(),
                    consumeDate: layer.getChildFrame("#consumeDate", index).val(),
                }
                postAjax(domainUrl + '/serve/consumption_record/add', postData, function (data) {
                        layer.close(index);

                    }
                )

            }, btn2: function (index, layero) {
                layer.close(index);
            },
            cancel: function (index) {
                //按钮【关闭】的回调
                layer.close(index);
            }
        });
    }
}

var saivianRemember = new saivianRemember();
saivianRemember.findAll(1);
//点击焦健
$(".userjj").on("click", function () {
    saivianRemember.findAll(1);
})
//点击庞姨
$(".userpy").on("click", function () {
    saivianRemember.findAll(2);
})
