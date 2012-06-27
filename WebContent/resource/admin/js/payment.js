$(function(){
	
	$('#gd_usepayment').datagrid({
		url:'admin/payment/usepayment',
		fit:'true',
		nowrap: false,
		method:'get',
		striped: true,
        singleSelect:true,
        rownumbers:true,
		idField:'id',
		frozenColumns:[[
		    {field:'ck',checkbox:true}
		]],
		columns:[[
			{field:'logo',title:'图标',width:200,
				formatter:function(value,rowdata,rowindex){
					return '<img src="resource/plugins/'+value+'" width="160" height="58"/>';
				}	
			},
			{field:'name',title:'支付名称',width:250},
			{field:'description',title:'支付描述',width:450}
		]],
		toolbar:[{
			text:'配置',
			iconCls:'icon-edit',
			handler:function(){
				

			}
		},{
			text:'删除',
			iconCls:'icon-remove',
			handler:function(){
				

			}
		},{
			text:'禁用',
			iconCls:'icon-stop',
			handler:function(){
				

			}
		}]
	});
	
	$('#gd_allpayment').datagrid({
		url:'admin/payment/allpayment',
		fit:'true',
		nowrap: false,
		method:'get',
		striped: true,
        singleSelect:true,
        rownumbers:true,
		idField:'id',
		frozenColumns:[[
		    {field:'ck',checkbox:true}
		]],
		columns:[[
			{field:'logo',title:'图标',width:200,
				formatter:function(value,rowdata,rowindex){
					return '<img src="resource/plugins/'+value+'" width="160" height="58"/>';
				}		
			},
			{field:'name',title:'支付名称',width:250},
			{field:'description',title:'支付描述',width:450}
		]],
		toolbar:[{
			id:'add',
			text:'添加支付方式',
			iconCls:'icon-add',
			handler:function(){
				

			}
		}]
	});
	
	
	
});