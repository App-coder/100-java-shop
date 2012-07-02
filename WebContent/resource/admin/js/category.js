$(function(){
	$('#category_list').treegrid({
		url:'admin/category/getCategoryByParent',
		title:'分类列表',
		fit:'true',
		nowrap: false,
		striped: true,
                rownumbers:true,
                idField:'id',
		treeField:'name',
		singleSelect:true,
		queryParams:{pid:0},
		fitColumns : true,
		frozenColumns:[[
		    {field:'ck',checkbox:true},
            {title:'分类名称',field:'name',width:200
            }
		]],
		columns:[[
			{title:'排序',field:'sort',width:150},
			{title:'模型',field:'modelname',width:150},
			{title:'首页显示',field:'visibility',width:150,
			    formatter:function(value,rowdata,rowindex){
				if(value==1){
					return "<span class=\"iconsp icon-ok\" ></span>";
				}else{
					return "<span class=\"iconsp icon-stop\" ></span>";
				}
			    }
			},
			{title:'操作',field:'id',width:250,
				formatter:function(value,rowdata,rowindex){
					return "<span class=\"iconsp icon-edit\" title=\"修改\" ></span><span class=\"iconsp icon-remove\" title=\"删除\" ></span>";
				}	
			}
		]],
		toolbar:[{
			id:'add',
			text:'添加分类',
			iconCls:'icon-add',
			handler:function(){
				

			}
		}],
		onBeforeLoad:function(row,param){
			if(row==null){
				$('#category_list').treegrid("options").queryParams.pid = 0;
			}else if(row.id!=undefined){
				$('#category_list').treegrid("options").queryParams.pid = row.id;
			}
		}
	});

	
});