/**
 * Created by alone on 2017/5/16.
 */
$(function () {
    var curFirst =0;
    var curSecond = 0;
    updateSecondSelect();
    $('.title_input').bind('focus',function () {
        $(this).animate({width: "60%"}, 500);
    });
    $('.title_input').bind('blur',function () {
        $(this).animate({width: "27%"}, 500);
    });
    $('.detail_textarea').bind('focus',function () {
        $(this).animate({width: "60%", height: "8em"}, 500);
    });
    $('.detail_textarea').bind('blur',function () {
        if ($(this).val() == ''){
            $(this).animate({width: "27%", height: "5em"}, 500);
        }
    });
    var temp = 1;
    $(".upload_img_input").change(function(){
        var objUrl = getObjectURL(this.files[0]);
        $('.show_choose_img').attr("src", objUrl);
        $('.show_choose_img').css({opacity: 0});
        $('.show_choose_img').show(0).animate({opacity:1},1000);
    });
    // 获取图片的url。是临时文件
    function getObjectURL(file) {
        var url = null ;
        if (window.createObjectURL!=undefined) { // basic
            url = window.createObjectURL(file) ;
        } else if (window.URL!=undefined) { // mozilla(firefox)
            url = window.URL.createObjectURL(file) ;
        } else if (window.webkitURL!=undefined) { // webkit or chrome
            url = window.webkitURL.createObjectURL(file) ;
        }
        return url ;
    }

    $('.choose_first_type').change(function () {
        var getSelect = $(this).children('option:selected').attr("id");
        curFirst=getSelect-1;
        curSecond = 0;
        updateSecondSelect();
    });
    $('.choose_second_type').change(function () {
        var getSelect = $(this).children('option:selected').attr("id");
        curSecond = (getSelect-10000);
        updateThirdSelect();
    });
    function updateThirdSelect() {
        var temp = typeList[curFirst].cf;
        var thirdText = "";
        var which = temp[curSecond].sf;
        var res = which;
        for(j = 0;j<res.length;j++) {
            var rel_type = res[j];
            if(j==0) {
                thirdText+="<option id = '"+rel_type.sid+
                    "' value="+rel_type.sid+" selected='selected'>"+rel_type.sname+"</option>";
            }else{
                thirdText+="<option id = '"+rel_type.sid+
                    "' value="+rel_type.sid+">"+rel_type.sname+"</option>";
            }
        }
        $('.choose_third_type').html(thirdText);
    }
    function updateSecondSelect() {
        var temp = typeList[curFirst].cf;
        var secondText = "";
        var thirdText = "";
        for(i = 0;i<temp.length;i++) {
            var which = temp[i];
            secondText += "<option id = '"+(10000+i)+"'>"+which.cname+"</option>";
            if(i==curSecond) {
                var res = which.sf;
                for(j = 0;j<res.length;j++) {
                    var rel_type = res[j];
                    if(j==0) {
                        thirdText+="<option id = '"+rel_type.sid+
                            "' value="+rel_type.sid+" selected='selected'>"
                            +rel_type.sname+"</option>";
                    }else{
                        thirdText+="<option id = '"+rel_type.sid+"' value="
                            +rel_type.sid+">"+rel_type.sname+"</option>";
                    }
                }
            }
        }
        $('.choose_second_type').html(secondText);
        $('.choose_third_type').html(thirdText);
    }

});
$(function () {
    if (($('.show_tip').is(':hidden'))){
        alert("请输入正确的格式！！！！");
    }
});