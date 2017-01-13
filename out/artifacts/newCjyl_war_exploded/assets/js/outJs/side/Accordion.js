/**
 * Created by horo on 2016/12/28.
 */
/*手风琴侧边栏*/
// <ul id="sideList" class="accordion">
//     <li>
//     <div class="link">系统管理</div>
//     <ul class="submenu">
//     <li>修改密码</li>
//     </ul>
//     </li>
//     </ul>
$(function() {
    var Accordion = function(el, multiple) {
        this.el = el || {};  //如果el没有值那么就声明它是一个数组
        this.multiple = multiple || false; //如果multiple没有值就声明它为false
        // Variables privadas
        var links = this.el.find('.link'); //取值本类下的link
        // Evento
        links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown)
    };
    Accordion.prototype.dropdown = function(e) {
        var $el = e.data.el;
        $this = $(this),
            $next = $this.next();
        $next.slideToggle();
        $this.parent().toggleClass('open');
        //其他列表
        $(".link").find(".icon-circle").addClass("icon-circle-blank").removeClass("icon-circle");
        if (!e.data.multiple) {
            //本列表
            $el.find('.submenu').not($next).slideUp().parent().removeClass('open');
            if ($(this).parent("li").hasClass("open")) {
                $(this).find(".icon-circle-blank").addClass("icon-circle").removeClass("icon-circle-blank");
            } else {
                $(this).find(".icon-circle").addClass("icon-circle-blank").removeClass("icon-circle");
            }
        }
    };

    var sideList = new Accordion($('#sideList'), false);
});