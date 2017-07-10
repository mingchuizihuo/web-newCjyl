/**
 * Created by horo on 2016/12/26.
 */
//方法
function loginBase() {


    //登录
    this.login = function () {
        var url = domainUrl + "/login";
        var getData = {
            loginName: $("#loginName").val(),
            loginPassword: $("#loginPass").val()
        };
        if (getData.loginName == "") {
            layer.msg("用户名不正确");
        } else if (getData.loginPassword == "") {
            layer.msg("密码不正确");
        } else {
            getAjax(url, getData, function (data) {

                if(data.result != false){
                    location.href = domainUrl + "/page/background";
                }else{
                    layer.msg("用户名密码不正确");
                }
            })
        }
    };
    //回车登录
    this.loginKey = function () {
        $('#login-form').bind('keypress', function (event) {
            if (event.keyCode == "13") {
                loginBase.login();
            }
        });
    };
    //鼠标焦点事件
    this.focus = function () {
        $("#institution").focus();
    };
}
//实例化
var loginBase = new loginBase();