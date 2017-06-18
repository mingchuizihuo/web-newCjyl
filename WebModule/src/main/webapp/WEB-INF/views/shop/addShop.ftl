<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
    <link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
    <!--颜色样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
    <!--弹出层样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


    <div id="addshop" class="popup" >
        <h5>基本信息</h5>
        <table class="table table-bordered">
            <tbody>
            <tr>

                <td class=blue">商铺名称</td>
                <td><input type="text" id="shopName"></td>
                <td>商铺编码</td>
                <td><input type="text" id="shopCode"></td>
                <td>商铺小票大小</td>
                <td><input type="text" id="shopSize"></td>
                <td>商铺类型</td>
                <td>
                    <select id="shopType">
                        <option value="1">超市</option>
                        <option value="2">饭店</option>
                        <option value="3">商场</option>
                        <option value="4">服装</option>
                        <option value="5">化妆品</option>
                    </select>
                </td>
            </tr>

            </tbody>
        </table>


    </div>




