$(function(){
	$('#delivery_list').datagrid({
		url:'admin/delivery/list',
		fit:'true',
		nowrap: false,
		striped: true,
		collapsible:false,
		idField:'order',
        singleSelect:true,
        rownumbers:true,
        toolbar:[
		{
			id:'add',
			text:'添加配送方式',
			iconCls:'icon-add',
			handler:function(){
				
			}
		},{
			text:'配置',
			iconCls:'icon-edit',
			handler:function(){
				

			}
		},
		{
			id:'delete',
			text:'删除',
			iconCls:'icon-remove',
			handler:function(){
				
			}
		},
		{
			id:'recyclebin',
			text:'回收站',
			iconCls:'icon-recycle',
			handler:function(){
				
			}
		}
		],
		columns:[[
			{field:'name',title:'配送方式',width:200},
			{field:'status',title:'状态',width:80,
				formatter:function(value,rowdata,rowindex){
					if(value==1){
						return "<span class=\"iconsp icon-ok\" ></span>";
					}else{
						return "<span class=\"iconsp icon-stop\" ></span>";
					}
				}
			},
			{field:'is_save_price',title:'物流保价',width:100,
				formatter:function(value,rowdata,rowindex){
					if(value==1){
						return "<span class=\"iconsp icon-ok\" ></span>";
					}else{
						return "<span class=\"iconsp icon-stop\" ></span>";
					}
				}	
			},
			{field:'type',title:'货到付款',width:100,
				formatter:function(value,rowdata,rowindex){
					if(value==1){
						return "<span class=\"iconsp icon-ok\" ></span>";
					}else{
						return "<span class=\"iconsp icon-stop\" ></span>";
					}
				}		
			},
			{field:'sort',title:'排序',width:80}
		]],
	});
});