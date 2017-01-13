<!--bootstrap-->
<link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/bootstrap.css">
<#--date样式-->
<link rel="stylesheet" href="${domainUrl}/assets/js/outJs/layui/css/layui.css">
<!--颜色样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/color/color.css">
<!--弹出层样式文件-->
<link rel="stylesheet" href="${domainUrl}/assets/css/popup.css">


<div id="oldManUp" class="popup" >
    <h5>基本信息</h5>
    <table class="table table-bordered">
        <tbody>
        <tr>
            <td rowspan="3">
            <#--上传图片-->
                <div class="site-demo-upload">
                    <img  src="${domainUrl}/assets/images/picture.jpeg" class="img-responsive" >
                    <div class="site-demo-upbar">
                        <div class="layui-box layui-upload-button">
                            <form target="layui-upload-iframe" method="get" key="set-mine" enctype="multipart/form-data" action="/test/upload.json">
                                <input type="file" name="file" class="layui-upload-file"  style="margin: auto" id="test">
                            </form>
                            <span class="layui-upload-icon">
                                <i class="layui-icon"></i>
                                上传图片
                            </span>
                        </div>
                    </div>
                </div>
            </td>
            <td class=blue">姓名</td>
            <td><input type="text"></td>
            <td>性别</td>
            <td>
                <select id="">
                    <option >男</option>
                    <option >女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text"></td>
            <td>住址</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td>紧急联系人</td>
            <td><input type="text"></td>
            <td>紧急电话</td>
            <td><input type="text"></td>
        </tr>
        </tbody>
    </table>
    <h5>拓展信息</h5>
    <table class="table table-bordered">
        <tbody>
        <tr>
            <td>身份证号</td>
            <td><input type="text"></td>
            <td>婚姻状态</td>
            <td><select id="">
                <option >已婚</option>
                <option >未婚</option>
            </select></td>
        </tr>
        <tr>
            <td>民族</td>
            <td>
                <select id="">
                    <option >汉族</option>
                    <option >壮族</option>
                </select>
            </td>
            <td>老人类别</td>
            <td>
                <select id="">
                    <option >一般</option>
                    <option >特殊</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td>
                <input class="layui-input" placeholder="选择日期" id="birthday" >
            </td>
            <td>年龄</td>
            <td><input type="text" id="age" onclick="getAge()"></td>
        </tr>
        <tr>
            <td>居住情况</td>
            <td>
                <select id="">
                    <option >独居</option>
                    <option >跟子女住</option>
                </select>
            </td>
            <td>服务所属点</td>
            <td>
                <select id="">
                    <option >无</option>
                    <option >无</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>服务类型</td>
            <td>
                <select id="">
                    <option >有偿服务</option>
                    <option >无偿服务</option>
                </select>
            </td>
            <td>服务状态</td>
            <td>
                <select id="">
                    <option >正常服务</option>
                    <option >停止服务</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>服务套餐</td>
            <td>
                <select id="">
                    <option >套餐一</option>
                    <option >套餐二</option>
                </select>
            </td>
            <td>经济来源</td>
            <td>
                <select id="">
                    <option >退休金</option>
                    <option >无</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>月收入</td>
            <td><input type="text"></td>
            <td>医疗保障</td>
            <td>
                <select id="">
                    <option >商业保险</option>
                    <option >城镇居民医疗保险</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>社保号</td>
            <td><input type="text"></td>
            <td>慢性病</td>
            <td>
                <select id="">
                    <option >高血压</option>
                    <option >无</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>血型</td>
            <td>
                <select id="">
                    <option >O型</option>
                    <option >A型</option>
                </select>
            </td>
            <td>残疾情况</td>
            <td>
                <select id="">
                    <option >健康</option>
                    <option >亚健康</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>文化程度</td>
            <td>
                <select id="">
                    <option >高中</option>
                    <option >大学</option>
                </select>
            </td>
            <td>专业</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td>职称</td>
            <td><input type="text"></td>
            <td>原单位</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td>所属机构</td>
            <td colspan="3">
                <select id="">
                    <option >无</option>
                </select>
            </td>
        </tr>
        </tbody>
    </table>

</div>

<#--alydate日期插件-->
<script src="${domainUrl}/assets/js/outJs/layui/layui.js"></script>
<script>

    //    使用layer日期
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        document.getElementById('birthday').onclick = function(){
            laydate({
                elem: this,
                festival: true, //显示节日
                choose: function(datas){ //选择日期完毕的回调
                   console.log(datas)
                }

            });
        }
    });

//    使用图片上传
    layui.use('upload', function(){
        layui.upload({
            url: '' //上传接口
            ,success: function(res){ //上传成功后的回调
                console.log(res)
            }
        });
    });

</script>
</script>
</script>

