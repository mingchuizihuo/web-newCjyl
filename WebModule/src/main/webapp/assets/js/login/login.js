/**
 * Created by horo on 2016/12/26.
 */
//方法
function loginBase() {
    //机构名称数组和机构id
    var source = [];
    var Oid;
    //查询机构
    this.findAllOrganizationName = function () {
        var url = domainUrl + "/serve/login/findAllOrganizationName";
        var getData = {
            currentPage: 1,
            limit: 99999
        };
        getAjax(url, getData, function (data) {
            var num = data.aaData.length;
            var d;
            for (var i = 0; i < num; i++) {
                d = data.aaData[i];
                source[i] = {
                    ID: d.id,
                    Name: d.name
                };
            }
            $('#institution').typeahead({
                source: source,
                display: 'Name',
                val: 'ID',
                itemSelected: loginBase.valOid
            });
        })
    };
    //获取机构id
    this.valOid = function (item, val, test) {
        Oid = val;
    };
    //登录
    this.login = function () {
        var url = domainUrl + "/serve/login/login";
        var getData = {
            organizationLoginId: Oid,
            loginName: $("#loginName").val(),
            loginPassword: $("#loginPass").val()
        };
        if (getData.organizationLoginId == undefined) {
            layer.msg('机构名称不正确');
        } else if (getData.loginName == "") {
            layer.msg("用户名不正确");
        } else if (getData.loginPassword == "") {
            layer.msg("密码不正确");
        } else {
            getAjax(url, getData, function (data) {
                if(data.result != false){
                    location.href = domainUrl + "/page/background";
                }else{
                    layer.msg("密码不正确");
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