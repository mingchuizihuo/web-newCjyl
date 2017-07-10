<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<!--弹出层样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


<div id="oldManUp" class="popup">
    <h5>基本信息</h5>
    <table class="table table-bordered">
        <tbody>
        <tr>
            <td class="blue">赛比安会员Id</td>
            <td><input type="text" id = "saivianId" value="${(saivianRemember.saivianId)!}"></td>
        </tr>

        <tr>
            <td class="blue">用户真实姓名</td>
            <td><input type="text" id = "saivianUserName" value="${(saivianRemember.saivianUserName)!}"></td>
        </tr>

        <tr>
            <td class="blue">登录名</td>
            <td><input type="text" id = "saivianLoginName" value="${(saivianRemember.saivianLoginName)!}"></td>
        </tr>


        <tr>
            <td class="blue">登录密码</td>
            <td><input type="text" id = "saivianLoginPassword" value="${(saivianRemember.saivianLoginPassword)!}"></td>
        </tr>

        <tr>
            <td class="blue">会员电话</td>
            <td><input type="text" id = "tel" value="${(saivianRemember.tel)!}"></td>
        </tr>
        <tr>
            <td class="blue">会员邮箱</td>
            <td><input type="text" id = "email" value="${(saivianRemember.email)!}"></td>
        </tr>


        <tr>
            <td class="blue">邮箱密码</td>
            <td><input type="text" id = "emailPwd" value="${(saivianRemember.emailPwd)!}"></td>
        </tr>


        <tr>
            <td class="blue">每日工资</td>
            <td><input type="text" id = "wage" value="${(saivianRemember.wage)!}"></td>
        </tr>

        <tr>
            <td class="blue">总金额</td>
            <td><input type="text" id = "totalMoney" value="${(saivianRemember.totalMoney)!}"></td>
        </tr>
        <tr>
            <td class=blue">银行名称</td>
            <td><input type="text" id="bankName" value="${(saivianRemember.bankName)!}"> </td>
        </tr>
        <tr>
            <td class=blue">银行类型</td>
            <td>
                <select  id="bankType">
                    <option value="0">储蓄卡</option>
                    <option value="1">信用卡</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class=blue">银行卡号</td>
            <td><input type="text" id="bankCardNum" value="${(saivianRemember.bankCardNum)!}"></td>
        </tr>
        <tr>
            <td class=blue">银行有效期</td>
            <td><input type="text" id="bankEffectiveDate"
                       value="${(saivianRemember.bankEffectiveDate)!}"></td>
        </tr>

        </tbody>
    </table>

</div>


