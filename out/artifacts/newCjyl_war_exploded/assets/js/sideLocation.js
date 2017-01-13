/**
 * Created by horo on 2016/12/27.
 */
//方法
var x,y,h,z,t; //轮播
var d; //data.aaData;
function common() {
    //请求页面
    this.locationUrl = function (url) {
        var locationUrl = domainUrl + url;
        //get方法请求页面html
        $.get(locationUrl,function (data) {
            $("#main-show").html(data).addClass("main-show");
            //文字滚动
            $(".title-border-right").html(common.news());
            $('.swap').html($('.news_li').html());
            x = $('.news_li');
            y = $('.swap');
            h = $('.news_li li').length * 19; //19为每个li的高度
            setTimeout(indexBase.fontRoll,3000);//滚动间隔时间 现在是3秒
        });
    };
    //新闻板块
    this.news = function () {
        var html = ' <div class="t_news"> <ul class="news_li"> <li><a href="#" >这里是滚动的新闻板块1</a></li> <li>' +
            '<a href="#" >这里是滚动的新闻板块2</a></li> <li><a href="#" >这里是滚动的新闻板块3</a></li> <li>' +
            '<a href="#" >这里是滚动的新闻板块4</a></li> <li><a href="#" >这里是滚动的新闻板块5</a></li> </ul>' +
            ' <ul class="swap"></ul> </div>'
        return html;
    };
    //get请求
    this.getData = function (currentPage,limit) {
        var getData = {
            currentPage:currentPage || 1,
            limit:limit || 10
        };
        return getData;
    };
    //get删除请求
    this.delData = function (id) {
        var deltData = {
            id:id
        };
        return deltData;
    };
    //data.aaData.length
    this.arrayLength = function (data) {
        if(data.aaData.length != undefined){
            return data.aaData.length ;
        }
    };
    //data.aaData[i]
    this.data = function (data,i) {
        if(data.aaData != undefined){
            return data.aaData[i];
        }
    };

}
//实例化
var common = new common();