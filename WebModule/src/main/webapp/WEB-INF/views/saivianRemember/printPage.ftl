<input type="button" value="打印八厘米小票" id="printEight">
<input type="button" value="打印五厘米小票" id="printFive">
<div id="printEightModule">

</div>
<div id="printFiveModule">

</div>
<!--jquery文件-->
<script src="${domainUrl}/assets/js/jquery/jquery-3.1.1.min.js"></script>
<!--封装工具-->
<script src="${domainUrl}/assets/js/common.js"></script>
<script>
    $(function () {
        printData.findAll();
        $("#printEight").click(function () {
            printdiv("printEightModule")
        });
        $("#printFive").click(function () {
            printdiv("printFiveModule")
        })
    });
    var domainUrl = '${domainUrl}/rest';
    function printUserPage(e) {
        return '${domainUrl}/rest/mb/' + e + '/index';
    }
    var product = ''；

    function printData() {
        this.url = domainUrl + '/serve/saivian_remember/getRecord/';
        this.findAll = function () {

            var getData = {
                saivianIds: 62,
            };
            console.log(getData);
            getAjax(printData.url, getData, function (data) {
                console.log(JSON.stringify(data.aaData))
                for (var i = 0; i < data.aaData.length; i++) {
//                    $.ajax({
//                        type: "get",
//                        url: printUserPage(data.aaData[0].shopCode),
//                        data:{},
//                        async:false,
//                        // cache:isCache,
//                        success: function (dataa) {
//                            product = '';
//                            html= '<div id="printM'+i+'">'+dataa+'</div>';
//                            for(var j = 0 ; j < data.aaData[i].products.length;j++){
//                                product +=' <tr> <td colspan="4">'+data.aaData[i].products[j].productName+'</td> </tr> <tr> ' +
//                                        '<td>'+data.aaData[i].products[j].productPrice+'</td> <td>'+data.aaData[i].products[j].productNum+'</td> ' +
//                                        '<td>0.00</td> <td>'+data.aaData[i].products[j].produtTotal+'</td> </tr>'
//                            }
//                            $("#printEightModule").append(html);
//                            $("#printM"+i+"").find("#product").html(product);
//                            $("#printM"+i+"").find("#consumeDate").html(data.aaData[i].consumeDate.replace(/年/,".").replace(/月/,".").replace(/日/,"."));
//                            $("#printM"+i+"").find("#bankName").html(data.aaData[i].bankName);
//                            $("#printM"+i+"").find(".consumeMoney").html(data.aaData[i].consumeMoney);
//                            $("#printM"+i+"").find("#bankNum").html(data.aaData[i].bankNum.substring(0,5)+"******"+data.aaData[i].bankNum.substring(11));
//                            $("#printM"+i+"").find("#effectDate").html(data.aaData[i].effectDate);
//                            $("#printM"+i+"").find("#swipeDate").html(data.aaData[i].swipeDate.replace(/年/,"-").replace(/月/,"-").replace(/日/,""));
//                            $("#printM"+i+"").find("#swipeNum").html(data.aaData[i].swipeNum);
//
//                        }
//                    });
                    var getData2 = data.aaData[i];
                    var productList = getData2.products;
                    console.log(JSON.stringify(productList));
                    delete getData2.products;
                    getData2["productList"] = JSON.stringify(productList);
                    $.ajax({
                        type: "POST",
                        url: printUserPage(data.aaData[i].shopCode),
                        data: getData2,//将对象序列化成JSON字符串
                        async: false,
                        success: function (dataa) {
                            if(data.aaData[i].shopCode == "shangyuwei" && data.aaData[i].shopCode == "shangyuwei" == "xinghai"){
                                $("#printFiveModule").append(dataa);
                            }else{
                                $("#printEightModule").append(dataa);

                            }
                        }
                    })

                }

            })
        }
    }
    var printData = new printData();
    function printdiv(printpage) {
        var headhtml = "<html><head><title></title></head><body>";
        var foothtml = "</body>";
        // 获取div中的html内容
        var newhtml = document.all.item(printpage).innerHTML;
        // 获取div中的html内容，jquery写法如下
        // var newhtml= $("#" + printpage).html();

        // 获取原来的窗口界面body的html内容，并保存起来
        var oldhtml = document.body.innerHTML;

        // 给窗口界面重新赋值，赋自己拼接起来的html内容
        document.body.innerHTML = headhtml + newhtml + foothtml;
        // 调用window.print方法打印新窗口
        window.print();

        // 将原来窗口body的html值回填展示
        document.body.innerHTML = oldhtml;
        return false;
    }
</script>