$(function(){
	$('#areas_list').treegrid({
		url:'admin/areas/getAreaByParent',
		title:'地区管理',
		fit:'true',
		nowrap: false,
		striped: true,
                rownumbers:true,
                idField:'areaId',
		treeField:'areaName',
		singleSelect:true,
		queryParams:{pid:0},
		fitColumns : true,
		frozenColumns:[[
		    {field:'ck',checkbox:true},
            {title:'地区',field:'areaName',width:200
            }
		]],
		columns:[[
			{title:'排序',field:'sort',width:150},
			{title:'操作',field:'areaId',width:250,
				formatter:function(value,rowdata,rowindex){
					return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
				}	
			}
		]],
		toolbar:[{
			id:'add',
			text:'添加地区',
			iconCls:'icon-add',
			handler:function(){
				

			}
		},{
			id:'update',
			text:'提交排序',
			iconCls:'icon-edit',
			handler:function(){
				
				
			}
		}],
		onBeforeLoad:function(row,param){
			if(row==null){
				$('#areas_list').treegrid("options").queryParams.pid = 0;
			}else if(row.areaId!=undefined){
				$('#areas_list').treegrid("options").queryParams.pid = row.areaId;
			}
		}
	});

	
});