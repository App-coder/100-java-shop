$(function() {
    $('#tabs').tabs({
	onClose : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	},
	onOpen : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	}
    });
    tab('我的主页', 'admin/webmaster/myhomepage',false);
    menuList('admin/webmaster/system');
});