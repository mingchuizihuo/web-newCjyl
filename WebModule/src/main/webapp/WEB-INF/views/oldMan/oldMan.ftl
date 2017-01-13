<#--layui样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<link rel="stylesheet" href="${domainUrl}/assets/css/gengjiajun/oldMan/oldMan.css">

<#--title-->
<div class="title-border">
    <div class="title-border-left">
        <i class="icon-file-alt"></i>老人基本信息
    </div>
<#--新闻滚动-->
    <div class="title-border-right"></div>
</div>
<div class="content">
    <#--查询-->
    <div class="inquiry">
        <span><label>姓名：</label><input type="text" ></span>
        <span><label>电话：</label><input type="text" ></span>
        <label>身份证号：</label><input type="text" >
        <button class="btn btn-xs btn_color">查询</button>
        <button class="btn btn-xs btn_color editOldMan" >添加</button>
    </div>
    <#--老人基本信息-->
    <div class="oldMan">
        <table class="table">
            <thead>
            <tr>
                <th>姓名</th>
                <th>性别</th>
                <th>电话</th>
                <th>紧急联系人</th>
                <th>紧急电话</th>
                <th>住址</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td >张三</td>
                <td >男</td>
                <td >16235411589</td>
                <td >张芸</td>
                <td >1245698789</td>
                <td >天津市和平区</td>
                <td ><button class="btn btn-xs btn_color seeOldMan" >查看</button><button  class="btn  btn-xs btn_color editOldMan">修改</button><button  class="btn  btn-xs btn_color">删除</button></td>
            </tr>
            </tbody>
        </table>
        <#--分页-->
        <ul id="biuuu_city_list"></ul>
        <div id="demo1"></div>
    </div>
</div>

<script>
    //弹出一个查看层(老人用户信息)
    $('.seeOldMan').on('click', function(){
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: '${domainUrl}/rest/oldMan/seeOldMan'
        });
    });
    //弹出一个修改层(老人用户信息)
    $('.editOldMan').on('click', function(){
        layer.open({
            type: 2,
            title: '用户信息详情',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: '${domainUrl}/rest/oldMan/editOldMan',
            btn: ['确认编辑', '关闭']
            ,btn1: function(index, layero){

                //按钮【关闭】的回调
                layer.close(index);
            },btn2: function(index, layero){
            },
            cancel: function(){
                //右上角关闭回调
            }
        });
    });
//    分页
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,
                layer = layui.layer;
        //将一段数组分页展示
        //测试数据
        var data = [
            '北京',
            '上海',
            '广州',
            '深圳',
            '杭州',
            '长沙',
            '合肥',
            '宁夏',
            '成都',
            '西安',
            '南昌',
            '上饶',
            '沈阳',
            '济南',
            '厦门',
            '福州',
            '九江',
            '宜春',
            '赣州',
            '宁波',
            '绍兴',
            '无锡',
            '苏州',
            '徐州',
            '东莞',
            '佛山',
            '中山',
            '成都',
            '武汉',
            '青岛',
            '天津',
            '重庆',
            '南京',
            '九江',
            '香港',
            '澳门',
            '台北'
        ];
        var nums = 5; //每页出现的数据量
        //模拟渲染
        var render = function(curr){
            //此处只是演示，实际场景通常是返回已经当前页已经分组好的数据
            var str = '', last = curr*nums - 1;
            last = last >= data.length ? (data.length-1) : last;
            for(var i = (curr*nums - nums); i <= last; i++){
                str += '<li>'+ data[i] +'</li>';
            }
            return str;
        };
        //调用分页
        laypage({
            cont: 'demo1'
            ,pages: Math.ceil(data.length/nums) //得到总页数
            ,skip: true
            ,jump: function(obj){
                document.getElementById('biuuu_city_list').innerHTML = render(obj.curr);
            }
        });
    });
</script>
</script>

