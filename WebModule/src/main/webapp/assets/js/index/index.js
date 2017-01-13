/**
 * Created by horo on 2016/12/26.
 */
//方法
var indexBase = function () {
    //登出操作
    this.loginOut = function () {
        var url = domainUrl + "/serve/login/loginOut";
        var getData = {

        };
        layer.confirm('确认退出承嘉智能养老平台？', {
            btn: ['退出','取消'] //按钮
        }, function(){
            //确认操作
            getAjax(url,getData,function (data) {
                location.href = ""+domainFile+"";
            })
        }, function(){
            //取消操作
        });
    };
    //管理员下拉操作
    this.userSelect = function () {
        $("#user-mess").click(function () {
            $("#user-select").slideToggle();
        })
    };
    //获取页面高度
    this.bodyMinHeight = function () {
        var hei;
        if ((navigator.userAgent.indexOf('MSIE') >= 0)
            && (navigator.userAgent.indexOf('Opera') < 0)){
            //IE
            hei = document.documentElement.scrollHeight;
        }else if (navigator.userAgent.indexOf('Firefox') >= 0){
            //Firefox
            hei = document.documentElement.scrollHeight;
        }else if (navigator.userAgent.indexOf('Opera') >= 0){
            //opera
            hei = document.body.scrollHeight;
        }else if(!!window.ActiveXObject || "ActiveXObject" in window){
            //IE11
            hei = document.documentElement.scrollHeight;
        } else{
            hei = document.body.scrollHeight;
        }
        hei = hei - 70 - 38;
        console.log(hei)
        $("#main-show").css("min-height",hei);
    };
    //更换背景
    this.changeBackColor = function (img, back, color) {
        $("#main-body").css('background', 'url("'+domainFile+'/assets/images/backGroundImg/' + img + '.jpg") 0 0 / 100% 100% no-repeat ');
    };
    //新闻滚动
    this.fontRoll = function () {
        t = parseInt(x.css('top'));
        y.css('top','19px');
        x.animate({top: t - 19 + 'px'},'slow');	//19为每个li的高度
        if(Math.abs(t) == h-19){ //19为每个li的高度
            y.animate({top:'0px'},'slow');
            z = x;
            x = y;
            y = z;
        }
        setTimeout(indexBase.fontRoll,3000);//滚动间隔时间 现在是3秒
    }
};
//实例化
var indexBase = new indexBase();
