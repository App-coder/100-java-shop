$(function() {

    $('#form_config_express').form({
	url : "admin/config/config_express_do",
	onSubmit : function() {
	    if ($('#form_config_express').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(data) {
	    try {
		data = $.parseJSON(data);
		if (data.type == "true") {
		    message("快递跟踪修改成功！");
		} else {
		    error(data.message);
		}
	    } catch (e) {
		exception();
	    }

	}
    });

});