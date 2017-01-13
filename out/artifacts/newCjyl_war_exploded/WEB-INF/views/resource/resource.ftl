<#--layui样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<link rel="stylesheet" href="${domainUrl}/assets/css/gengjiajun/resource/resource.css">

<#--title-->
<div class="title-border">
    <div class="title-border-left">
        <i class="icon-file-alt"></i>资源信息
    </div>
<#--新闻滚动-->
    <div class="title-border-right"></div>
</div>
<div class="content">
<#--查询-->
    <div class="inquiry">
        <span><label>资源名：</label><input type="text" ></span>
        <span><label>资源类型：</label><input type="text" ></span>
        <span><label>价格：</label><input type="text" ></span>
        <label>价格：</label><input type="text" >
        <button class="btn btn-xs btn_color">查询</button>
        <button class="btn btn-xs btn_color">添加</button>
    </div>
<#--乙方资源信息-->
    <div class="resource">
        <div class="box">
            <div class="resource_one">
                <div class="pull-left one_l">
                    <h4 id="resourceName">资源名</h4>
                </div>
                <div class="pull-right one_r">
                    <ul>
                        <li>资源类型：</li>
                        <li id="resourceType">家政服务</li>
                        <li>资源提供方：</li>
                        <li id="organizationId">金秋养老院</li>
                        <li>资源价格：</li>
                        <li id="resourcePrice">50元/小时</li>
                    </ul>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    <#--分页-->
        <ul id="biuuu_city_list"></ul>
        <div id="pagination "></div>
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
            cont: 'pagination '
            ,pages: Math.ceil(data.length/nums) //得到总页数
            ,skip: true
            ,jump: function(obj){
                document.getElementById('biuuu_city_list').innerHTML = render(obj.curr);
            }
        });
    });
</script>
</script>

