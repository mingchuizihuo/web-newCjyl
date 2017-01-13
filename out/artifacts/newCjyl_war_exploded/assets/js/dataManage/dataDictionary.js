/**
 * Created by horo on 2016/12/28.
 */
//方法
function dataDictionary() {
    //数据字典接口
    this.url  = domainUrl + '/serve/data_dictionary/';
    //查询父类
    this.findAll = function () {
        getAjax(dataDictionary.url+"findAll",common.getData(1,9999),function (data) {
            var html = '';
            for(var i = 0 ; i < common.arrayLength(data) ; i++){
                d = common.data(data,i);
                if(d.tid === 0){
                    html+=' <li><span onclick="dataDictionary.findAllSon('+d.id+')">'+d.dataName+'</span></li>';
                }
            }
            $("#fatherDataName").html(html);
        })
    };
    //根据父级id查询二级分类
    this.findAllSon = function (tid) { 
        getAjax(dataDictionary.url+"findAll",common.getData(1,9999),function (data) {
            var html = '';
            for(var i = 0 ; i < common.arrayLength(data) ; i++){
                d = common.data(data,i);
                if(d.tid === tid){
                    html+=' <div class="data-label">'+d.dataName+'<div class="data-del"><span onclick="dataDictionary.del('+d.id+','+tid+')">删除</span></div></div>';
                }
            }
            html+='<input type="button" value="添加" onclick="dataDictionary.openAdd('+tid+')">';
            $(".content-right").html(html);
        })
    };
    //打开添加窗口
    this.openAdd = function (tid) {
        layer.prompt({title: '请输入数据名', formType: 0}, function(text, index){
            layer.close(index);
            dataDictionary.add(tid,text);
        });
    };
    //添加
    this.add = function (tid,text) {
        var postData = {
            organizationLoginId:organizationLoginId,
            dataName:text,
            dataLevel:1,
            tid:tid
        };
        postAjax(dataDictionary.url+"add",postData,function (data) {
            layer.msg('添加成功');
            dataDictionary.findAllSon(tid);
        })
    };
    //删除
    this.del = function (id,tid) {
        layer.confirm('确认删除本条数据？', {
            btn: ['删除','取消'] //按钮
        }, function(){
            //确认操作
            postAjax(dataDictionary.url+"del",common.delData(id),function (data) {
                layer.msg('删除成功');
                //删除后查询二级分类
                dataDictionary.findAllSon(tid);
            })
        }, function(){
            //取消操作
        });
    }

}
//实例化
var dataDictionary = new dataDictionary();
