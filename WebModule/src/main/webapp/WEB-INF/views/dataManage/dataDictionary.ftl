<#--title-->
<div class="title-border">
    <div class="title-border-left">
        <i class="icon-file-alt"></i>数据字典
    </div>
    <#--新闻滚动-->
    <div class="title-border-right"></div>
</div>
<div class="content">
    <div class="content-left">
        <ul id="fatherDataName">
            <li><span>数据字典</span></li>
        </ul>
    </div>
    <div class="content-right">
            <div class="data-label">数据字典<div class="data-del"><span>删除</span></div></div>
    </div>
</div>
<script>
    //加载css文件
    $("<link>")
            .attr({ rel: "stylesheet",
                type: "text/css",
                href: "${domainUrl}/assets/css/alone/dataDictionary.css"
            }).appendTo("head");
    //加载JS文件
    $.getScript("${domainUrl}/assets/js/dataManage/dataDictionary.js",function () {
        //执行
        dataDictionary.findAll();
    });
</script>
