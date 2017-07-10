/**
 * json数据传输测试
 */

$(function(){
	$("#form").click(function(){
		myEvent.request_form();
	});
	$("#json").click(function(){
		myEvent.request_json();
	});
});

var myEvent = {
    request_json:function(){
        //json格式数据提交
        var user = JSON.stringify({userId:"23425",userName: "张三", birthday:"1995-04-10"});
        $.ajax(
            {
                type:'post',
                url:'user/getAllUser.do',
                contentType:'application/json;charset=utf-8',		//请求内容为json
                data:user,
                success:function(data){
                    debugger;
                    alert(data[0].name);
                },
                error:function(a,b,c){
                    debugger;
                    alert("没有返回");
                }
            }
        );
    },
	
	request_form:function(){
		//表单提交
		var user = "userId=1232&userName=张三&birthday=1995-04-10"
		$.ajax(
			{
                type:'post',
                url:'user/getAllUser.do',
                contentType:'application/json;charset=utf-8',		//请求内容为json
                data:user,
				success:function(data){
					alert(data[0].name);
				},
				error:function(){
					alert("没有返回");
				}
			}	
		);
	}

};


