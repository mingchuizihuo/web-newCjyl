/**
 * 获取本周、本季度、本月、上月的开端日期、停止日期
 */
var now = new Date(); //当前日期
var nowDayOfWeek = now.getDay(); //今天本周的第几天
var nowDay = now.getDate(); //当前日
var nowMonth = now.getMonth(); //当前月
var nowYear = now.getYear(); //当前年
nowYear += (nowYear < 2000) ? 1900 : 0; //

var lastMonthDate = new Date(); //上月日期
lastMonthDate.setDate(1);
lastMonthDate.setMonth(lastMonthDate.getMonth() - 1);
var lastYear = lastMonthDate.getYear();
var lastMonth = lastMonthDate.getMonth();

//格局化日期：yyyy-MM-dd
function formatDate(date) {
    var myyear = date.getFullYear();
    var mymonth = date.getMonth() + 1;
    var myweekday = date.getDate();

    if (mymonth < 10) {
        mymonth = "0" + mymonth;
    }
    if (myweekday < 10) {
        myweekday = "0" + myweekday;
    }
    return (myyear + "-" + mymonth + "-" + myweekday);
}

//获得某月的天数
function getMonthDays(myMonth) {
    var monthStartDate = new Date(nowYear, myMonth, 1);
    var monthEndDate = new Date(nowYear, myMonth + 1, 1);
    var days = (monthEndDate - monthStartDate) / (1000 * 60 * 60 * 24);
    return days;
}

//获得本季度的开端月份
function getQuarterStartMonth() {
    var quarterStartMonth = 0;
    if (nowMonth < 3) {
        quarterStartMonth = 0;
    }
    if (2 < nowMonth && nowMonth < 6) {
        quarterStartMonth = 3;
    }
    if (5 < nowMonth && nowMonth < 9) {
        quarterStartMonth = 6;
    }
    if (nowMonth > 8) {
        quarterStartMonth = 9;
    }
    return quarterStartMonth;
}

//获得本周的开端日期
function getWeekStartDate() {
    var weekStartDate = new Date(nowYear, nowMonth, nowDay + 1 - nowDayOfWeek);
    return formatDate(weekStartDate);
}

//获得本周的停止日期
function getWeekEndDate() {
    var weekEndDate = new Date(nowYear, nowMonth, nowDay + (7 - nowDayOfWeek));
    return formatDate(weekEndDate);
}
var nextTime = (new Date(getWeekStartDate())).getTime(); //得到毫秒数
var lastTime = (new Date(getWeekEndDate())).getTime(); //得到毫秒数
function getDate(date) {
    return new Date(date);
}
var newTime = getDate(nextTime); //得到普通的时间了
var endTime = getDate(lastTime);

//本周的开始日期和结束日期
function thisWeakStartDate(count) {
    if(count == "add"){
        nextTime += (86400000 * 7);
    }else if( count == "this"){
        nextTime = (new Date(getWeekStartDate())).getTime();
    }else{
        nextTime -= (86400000 * 7);
    }
    newTime = new Date(nextTime);
    return formatDate(newTime);
}
function thisWeakEndDate(count) {
    if(count == "add"){
        lastTime += (86400000 * 7);
    }else if( count == "this"){
        lastTime = (new Date(getWeekEndDate())).getTime();
    }else{
        lastTime -= (86400000 * 7);
    }
    endTime = new Date(lastTime);
    return formatDate(endTime);
}