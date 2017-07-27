<#--layui样式-->
    <link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
    <!--颜色样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/gengjiajun/oldMan/oldMan.css">

    <#--title-->
        <div class="title-border">
            <div class="title-border-left">
                <i class="icon-file-alt"></i>产品列表
            </div>
            <#--新闻滚动-->
                <div class="title-border-right"></div>
        </div>
        <div class="content">
            <#--查询-->
                <div class="inquiry">
                    <button class="btn btn-xs btn_color productcs">超市</button>

                    <button class="btn btn-xs btn_color productfd">饭店</button>

                    <button class="btn btn-xs btn_color productsc">商场</button>
                    <button class="btn btn-xs btn_color productfz">服装</button>

                    <button class="btn btn-xs btn_color producthzp">化妆品</button>

                    <button class="btn btn-xs btn_color productsg">水果</button>

                    <button class="btn btn-xs btn_color productkfd">咖啡店</button>

                    <button class="btn btn-xs btn_color productsy">所有</button>


                    <button class="btn btn-xs btn_color editProduct">添加</button>
                </div>
                <#--老人基本信息-->
                    <div class="oldMan">
                        <table class="table">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>产品名</th>
                                <th>产品单价</th>
                                <th>产品单价类型</th>
                                <th>产品类型</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody id="productList">

                            </tbody>
                        </table>

                    </div>
        </div>
        <script src="${domainUrl}/assets/js/product/product.js"></script>
        <script>

            //弹出一个修改层(老人用户信息)
            $('.editProduct').on('click', function (a) {
                layer.open({
                    type: 2,
                    title: '添加编辑商品',
                    area: ['50%', '80%'],
                    shadeClose: true, //点击遮罩关闭
                    content: '${domainUrl}/rest/product/addProduct',
                    btn: ['确认编辑', '关闭']
                    , btn1: function (index, layero) {
                        postData = {
                            productName: layer.getChildFrame("#productName",index).val(),
                            productPrice: layer.getChildFrame("#productPrice",index).val(),
                            productPriceType: layer.getChildFrame("#productPriceType",index).val(),
                            productType:layer.getChildFrame("#productType",index).val(),
                        }
                        postAjax('${domainUrl}/rest/serve/product/add', postData, function (data) {
                                layer.close(index);
                                product.findAll(0);
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


