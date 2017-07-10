/**
 * Created by xiaolitong on 2017/6/17.
 */

var printId = "";
var saivianUserId = 1;


function saivianRemember() {
    //数据字典接口
    this.url = domainUrl + '/serve/saivian_remember/';
    //查询父类
    this.findAll = function () {
        getAjax(saivianRemember.url + "findAllByUser", {}, function (data) {
            var d = data.aaData;
            var html = "";
            $.each(d, function (index, dOne) {

                html += '<tr>' +
                    '<td><input name = "nation" type="checkbox" id="' + dOne.id + '" /></td>' +
                    '<td>' + index + '</td>' +
                    '<td>' + dOne.saivianId + '</td>' +
                    '<td>' + dOne.saivianUserName + '</td>' +
                    '<td>' + dOne.saivianLoginName + '</td>' +
                    '<td>' + dOne.saivianLoginPassword + '</td>' +
                    '<td>' + dOne.email + '</td>' +
                    '<td>' + dOne.emailPwd + '</td>' +
                    '<td>' + dOne.bankCardNum + '</td>' ;
                        if(dOne.saivianRenewalDate!=null){
                            html+= '<td>' + dOne.saivianRenewalDate.replace("00:00:00","") + '</td>'
                        }else{
                            html+= '<td>' + dOne.saivianRenewalDate+ '</td>';

                        }

                if(dOne.rebateOpenDate!=null){
                    html+= '<td>' + dOne.rebateOpenDate.replace("00:00:00","") + '</td>'
                }else{
                    html+= '<td>' + dOne.rebateOpenDate+ '</td>';

                }

                if(dOne.redeemOpenDate!=null){
                    html+= '<td>' + dOne.redeemOpenDate.replace("00:00:00","") + '</td>'
                }else{
                    html+= '<td>' + dOne.redeemOpenDate+ '</td>';

                }

                if(dOne.arriveCodeDate!=null){
                    html+= '<td>' + dOne.arriveCodeDate.replace("00:00:00","") + '</td>'
                }else{
                    html+= '<td>' + dOne.arriveCodeDate+ '</td>';

                }
                 html+=   '<td>' +
                    '<a class="btn btn-default" onclick="saivianRemember.showRememberInfo(' + dOne.id + ')">查看详情</a>' +
                    '</td>' +
                    '<td>' +
                    '<a class="btn btn-default" onclick="saivianRemember.showDateInfo(' + dOne.id + ')">更新时间</a>' +
                    '</td>' +
                    '<td>' +
                    '<a class="btn btn-default" onclick="saivianRemember.addMoney(' + dOne.id + ')">添加消费明细</a></td></tr>';

            });

            $("#saivianList").html(html);

        })
    };



    //修改会员时间
    this.showDateInfo = function(id){
        layer.open({
            type: 2,
            title: '会员时间',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/serve/saivian_remember/showRememberDateInfo?id='+id,
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {
                postData = {
                    id: id,
                    saivianRenewalDate: layer.getChildFrame("#saivianRenewalDate", index).val()+" 00:00:00",
                    rebateOpenDate: layer.getChildFrame("#rebateOpenDate", index).val()+" 00:00:00",
                    redeemOpenDate: layer.getChildFrame("#redeemOpenDate", index).val()+" 00:00:00",
                    arriveCodeDate: layer.getChildFrame("#arriveCodeDate", index).val()+" 00:00:00",

                }
                postAjax(domainUrl + '/serve/saivian_remember/update', postData, function (data) {
                        layer.close(index);
                        saivianRemember.findAll();
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


    //查看会员详情
    this.showRememberInfo = function (id) {
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/serve/saivian_remember/showRememberInfo?id=' + id,
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {
                postData = {
                    id: id,
                    bankName: layer.getChildFrame("#bankName", index).val(),
                    bankType: layer.getChildFrame("#bankType", index).val(),
                    bankCardNum: layer.getChildFrame("#bankCardNum", index).val(),
                    bankEffectiveDate: layer.getChildFrame("#bankEffectiveDate", index).val(),
                    saivianId: layer.getChildFrame("#saivianId", index).val(),
                    saivianUserName: layer.getChildFrame("#saivianUserName", index).val(),
                    saivianLoginName: layer.getChildFrame("#saivianLoginName", index).val(),
                    saivianLoginPassword: layer.getChildFrame("#saivianLoginPassword", index).val(),
                    tel: layer.getChildFrame("#tel", index).val(),
                    email: layer.getChildFrame("#email", index).val(),
                    emailPwd: layer.getChildFrame("#emailPwd", index).val(),
                    wage: layer.getChildFrame("#wage", index).val(),
                    totalMoney: layer.getChildFrame("#totalMoney", index).val(),

                }
                postAjax(domainUrl + '/serve/saivian_remember/update', postData, function (data) {
                        layer.close(index);
                        saivianRemember.findAll(saivianUserId);
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

    //查看消费记录
    this.showRecord = function (id) {


        layer.open({
            type: 2,
            title: '打印小票记录查看',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/serve/saivian_remember/showRecord?saivianTableId=' + id,

        });

    }


    this.addMoney = function (id) {
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: domainUrl + '/saivianRemember/addConsumptionRecord?saivianTableId='+id,
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {
                postData = {
                    userSaivianId: id,
                    consumeMoney: layer.getChildFrame("#consumeMoney", index).val(),
                    shopCode: layer.getChildFrame("#shopCode", index).val(),
                    consumeDate: layer.getChildFrame("#consumeDate", index).val() + " 00:00:00",
                }
                postAjax(domainUrl + '/serve/consumption_record/add', postData, function (data) {
                    $.ajax({

                        type:"get",
                        url:domainUrl+"/serve/saivian_remember/showRecord",
                        data:{saivianTableId:id},
                        dataType:'json',
                        success:function (data) {
                            var d = data.aaData;
                            var html=""
                            $.each(d,function (index,record) {
                                html+='<tr id = "record'+record.id+'">'+
                                    '<td>'+record.consumeDate.replace("00:00:00","")+'</td>'+
                                    '<td>'+record.consumeMoney+'</td>'+
                                    '<td>'+record.shopCode+'</td>'+
                                    '<td> <button class="btn btn-xs btn_color" onclick="del('+record.id+')">删除</button>'+
                                    '</td>'+
                                    '</tr>';

                            })
                            layer.getChildFrame("#showRecord", index).html(html);
                        }
                    })
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
saivianRemember.findAll(saivianUserId);
$("#addSaivian").on("click",function () {
    layer.open({
        type: 2,
        title: '用户信息详情',
        area: ['50%', '80%'],
        shadeClose: true, //点击遮罩关闭
        content: domainUrl + '/saivianRemember/addSaivianRemember/',
        btn: ['确认编辑', '关闭']
        , btn1: function (index, layero) {
            postData = {

                bankName: layer.getChildFrame("#bankName", index).val(),
                bankType: layer.getChildFrame("#bankType", index).val(),
                bankCardNum: layer.getChildFrame("#bankCardNum", index).val(),
                bankEffectiveDate: layer.getChildFrame("#bankEffectiveDate", index).val(),
                saivianId: layer.getChildFrame("#saivianId", index).val(),
                saivianUserName: layer.getChildFrame("#saivianUserName", index).val(),
                saivianLoginName: layer.getChildFrame("#saivianLoginName", index).val(),
                saivianLoginPassword: layer.getChildFrame("#saivianLoginPassword", index).val(),
                tel: layer.getChildFrame("#tel", index).val(),
                email: layer.getChildFrame("#email", index).val(),
                emailPwd: layer.getChildFrame("#emailPwd", index).val(),
                wage: layer.getChildFrame("#wage", index).val(),
                totalMoney: layer.getChildFrame("#totalMoney", index).val(),

            }
            postAjax(domainUrl + '/serve/saivian_remember/add', postData, function (data) {
                    layer.close(index);
                    saivianRemember.findAll();
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
})
