<#--layui样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<link rel="stylesheet" href="${domainUrl}/assets/css/gengjiajun/oldMan/oldMan.css">

<#--title-->
<div class="title-border">
    <div class="title-border-left">
        <i class="icon-file-alt"></i>塞比安会员列表
    </div>
<#--新闻滚动-->
    <div class="title-border-right"></div>
</div>
<div class="content">
<#--查询-->
    <div class="inquiry">
        <button class="btn btn-xs btn_color shopcs">超市</button>

        <button class="btn btn-xs btn_color shopfd">饭店</button>

        <button class="btn btn-xs btn_color shopsc">商场</button>
        <button class="btn btn-xs btn_color shopfz">服装</button>
        <button class="btn btn-xs btn_color shophzp">化妆品</button>

        <button class="btn btn-xs btn_color shopsy">所有</button>


        <button class="btn btn-xs btn_color editShop">添加</button>
    </div>
<#--老人基本信息-->
    <div class="oldMan">
        <table class="table">
            <thead>
            <tr>
                <th>序号</th>
                <th>商铺名</th>
                <th>商铺编码</th>
                <th>商铺类型</th>
                <th>商铺模版大小</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="shopList">

            </tbody>
        </table>

    </div>
</div>
<script src="${domainUrl}/assets/js/shop/shop.js"></script>
<script>

    //弹出一个修改层(老人用户信息)
    $('.editShop').on('click', function (a) {
        layer.open({
            type: 2,
            title: '添加编辑商铺',
            area: ['50%', '80%'],
            shadeClose: true, //点击遮罩关闭
            content: '${domainUrl}/rest/shop/addShop',
            btn: ['确认编辑', '关闭']
            , btn1: function (index, layero) {

                postData = {
                    shopName: layer.getChildFrame("#shopName",index).val(),
                    shopCode: layer.getChildFrame("#shopCode",index).val(),
                    shopType: layer.getChildFrame("#shopType",index).val(),
                }
                postAjax('${domainUrl}/rest/serve/shop/add', postData, function (data) {
                            layer.close(index);
                            shop.findAll(0);
                        }
                )
            }, btn2: function (index, layero) {
                //按钮【关闭】的回调
                layer.close(index);
            },
            cancel: function (index) {
                //右上角关闭回调
                //按钮【关闭】的回调
                layer.close(index);
            }
        });
    });


</script>


