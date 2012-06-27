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
		frozenColumns:[[
            {title:'地区',field:'areaName',width:200
            }
		]],
		columns:[[
			{title:'排序',field:'sort',width:150}
		]],
		onBeforeLoad:function(row,param){
			if(row==null){
				$('#areas_list').treegrid("options").queryParams.pid = 0;
			}else if(row.areaId!=undefined){
				$('#areas_list').treegrid("options").queryParams.pid = row.areaId;
			}
		}
	});

	
});