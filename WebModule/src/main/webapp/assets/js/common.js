/**
 * Created by horo on 2016/9/21.
 */
//===========================工具类函数============================
//ajax异步
function getAjax(url,getData, fun) {
    $.ajax({
        type: "get",
        url: url,
        data:getData,
        dataType: 'json',
        // cache:isCache,
        beforeSend: function () {

        },
        error: function (data) {

        },
        success: function (data) {
            success(data, fun);
        }
    });
}
function getPage(url) {
    $.ajax({
        type: "get",
        url: url,
        data:{},
        // cache:isCache,
        success: function (data) {

        }
    });
}
function postAjax(url, postData,fun) {
    $.ajax({
        type: "post",
        url: url,
        data: postData,
        dataType: 'json',
        async: false,
        // cache:isCache,
        beforeSend: function () {

        },
        error: function (data) {

        },
        success: function (data) {
            success(data,fun)
        }
    });
}
function success(data,fun) {
    var msg = data.statusMsg;
    if(msg == "OK"){
        fun(data);
    }else{
        alert(msg);
    }
}