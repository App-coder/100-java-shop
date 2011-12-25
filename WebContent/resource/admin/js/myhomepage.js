$(function(){
    function getPayStatus(value,record){
        var payStr;
        //0：未支付，1：已支付，2：退款，3：申请退款
        switch (value){
            case 0:
                payStr = "未支付";
                break;
            case 1:
                payStr = "已支付";
                break;
            case 2:
                payStr = "退款";
                break;
            case 3:
                payStr = "申请退款";
                break;
        }
        return payStr;
    }

	$('#orderlist').datagrid({
		url:'admin/order/getByCreateTime',
		fit:'true',
		nowrap: false,
		striped: true,
		idField:'id',
        singleSelect:true,
        rownumbers:true,
        toolbar:[{
            text:'查看',
            iconCls:'icon-view',
            handler:function(){
                var selected = $('#orderlist').datagrid('getSelected');
                if(selected){
                    tab('订单：'+selected.orderNo,'admin/order/info?id='+selected.id)
                }else{
                    message("请选择一行记录！");
                }

            }
        },{
            text:'编辑',
            iconCls:'icon-edit',
            handler:function(){

            }
        },{
            text:'删除',
            iconCls:'icon-remove',
            handler:function(){

            }
        }],
        frozenColumns:[[
            {field:'ck',checkbox:true}
        ]],
		columns:[[
			{field:'orderNo',title:'订单号',width:200},
			{field:'acceptName',title:'收货人',width:200},
			{field:'payStatus',title:'支付状态',width:150,formatter:getPayStatus},
			{field:'orderAmount',title:'金额',width:100},
			{field:'createTime',title:'下单时间',width:200}
		]]
	});
});
