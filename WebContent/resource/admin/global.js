var msg_ex = "系统出现异常，请联系管理员！";

$(function() {
	/*
	 $("body").ajaxStart(function(){
		 mask();
	 });
	
	 $("body").ajaxStop(function(){
		 unmask();
	 });*/
});
function menuList(url) {
	
	var menuid = url.replace("admin/webmaster/","");

	$("#nav_" + menuid).parent().parent("ul").find("li")
			.removeClass("selected");

	$("#nav_" + menuid).parent("li").addClass("selected");
	var title;

	if (menuid == 'goods') {
		title = "商品";
	} else if (menuid == 'member') {
		title = "会员";
	} else if (menuid == 'order') {
		title = "订单";
	} else if (menuid == 'market') {
		title = "营销";
	} else if (menuid == 'stat') {
		title = "统计";
	} else if (menuid == 'system') {
		title = "系统";
	} else if (menuid == 'tool') {
		title = "工具";
	}

	$.get(url,null, function(data) {
		$("#lefttree").panel({
			title:title,
			content:data
		});
	}, 'html');

}
function tab(title, url,closable) {
	if(closable == undefined){
		closable = true;
	}
	var exists = $('#tabs').tabs('exists', title);

	if (!exists) {
		/*
		$.get(url, function(content){
			$('#tabs').tabs('add',{
				title : title,
				closable : closable,
				content : content
			})
		});*/
		
		$('#tabs').tabs('add',{
			title : title,
			closable : closable,
			href:url,
			bodyCls:'p10',
			cache:false
			/*
			content : '<iframe src="'
					+ url
					+ '" frameborder="0"  width="100%" height="100%" ></iframe>'*/
		});
	} else {
		$('#tabs').tabs("select",title)
	}
	
}
function g_select(domid, json, param, defopt) {
	var str = "";
	str += defopt;
	for ( var i = 0; i < json.length; i++) {
		str += "<option value=\"" + json[i][param.key] + "\">"
				+ json[i][param.value] + "</option>";
	}
	$("#" + domid).html(str);
}
function error(message) {
	$.messager.alert('错误提示', message, 'error');
}
function success(message) {
	$.messager.alert('提示', message, 'info');
}
function message(message) {
	$.messager.alert('提示', message, 'info');
}
function exception() {
	error('系统出现异常，请联系管理员！');
}
function rdnum() {
	return Math.floor(Math.random() * 100000);
}
function rdbytime(){
	return new Date().getTime();
}
function mask(msg) {
	if (msg) {
		$("body").mask(msg);
	} else {
		$("body").mask('页面正在加载……');
	}
}
function unmask() {
	$("body").unmask();
}
function confirm(message, fun) {
	$.messager.confirm('提示信息', message, fun);
}

//kindeditor拓展
var editoritem_all = [ 'source', '|', 'undo', 'redo', '|', 'preview', 'print',
		'template', 'cut', 'copy', 'paste', 'plainpaste', 'wordpaste', '|',
		'justifyleft', 'justifycenter', 'justifyright', 'justifyfull',
		'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent',
		'subscript', 'superscript', 'clearhtml', 'quickformat', 'selectall',
		'|', 'fullscreen', '/', 'formatblock', 'fontname', 'fontsize', '|',
		'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
		'strikethrough', 'lineheight', 'removeformat', '|', 'image', 'flash',
		'media', 'insertfile', 'table', 'hr', 'emoticons', 'map', 'code',
		'pagebreak', 'anchor', 'link', 'unlink' ];
var editoritem_default = [ 'source', '|', 'undo', 'redo', '|',
		'justifyleft', 'justifycenter', 'justifyright', 'justifyfull',
		'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent',
		'subscript', 'superscript', 'clearhtml', 'selectall',
		'/', 'formatblock', 'fontname', 'fontsize', '|',
		'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
		'strikethrough', 'lineheight', 'removeformat', '|', 'image', 'flash',
		'media', 'insertfile', 'table', 'emoticons', 'code',
		'link', 'unlink' ];
var editoritem_more = [
		'source', '|', 'undo', 'redo', '|', 'preview', 'print', 'template', 'cut', 'copy', 'paste',
		'plainpaste', 'wordpaste', '|', 'justifyleft', 'justifycenter', 'justifyright',
		'justifyfull', 'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent', 'subscript',
		'superscript', 'clearhtml', 'quickformat', 'selectall',  '/',
		'formatblock', 'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold',
		'italic', 'underline', 'strikethrough', 'lineheight', 'removeformat', '|', 'image',
		'flash', 'media', 'insertfile', 'table', 'hr', 'emoticons', 'code', 'pagebreak', 'anchor', 'link', 'unlink'
];
function closeWin(wind){
	$('#'+wind).window('close');
}
function formsubmit(fid){
	$('#'+fid).submit();
}


