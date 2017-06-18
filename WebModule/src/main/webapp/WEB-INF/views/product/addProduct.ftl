<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
    <link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
    <!--颜色样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
    <!--弹出层样式文件-->
    <link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


    <div id="addProduct" class="popup" >
        <h5>基本信息</h5>
        <table class="table table-bordered">
            <tbody>
            <tr>

                <td class=blue">产品名称</td>
                <td><input type="text" id="productName"></td>
                <td>产品单价</td>
                <td><input type="text" ID="productPrice"></td>
                <td>单价类型</td>
                <td>
                    <select  id="productPriceType">
                        <option value="0">个数</option>
                        <option value="1">非个数</option>
                    </select>
                </td>
                <td>产品类型</td>
                <td>
                    <select id="productType">
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




