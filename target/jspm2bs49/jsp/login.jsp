<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <!-- Le styles -->
    <script
      type="text/javascript"
      src="${pageContext.request.contextPath}/resources/assets2/js/jquery.min.js"
    ></script>

    <!--  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets2/css/style.css"> -->
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/assets2/css/loader-style.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/assets2/css/bootstrap.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/assets2/css/signin.css"
    />

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- Fav and touch icons -->
    <link
      rel="shortcut icon"
      href="${pageContext.request.contextPath}/resources/assets2/ico/minus.png"
    />
  </head>
  <style>
    html {
      width: 100%;
      height: 100%;
    }
    body {
      height: 100vh;
      background-position: center center;
      background-size: cover;
      background-repeat: no-repeat;
      overflow: hidden !important;
      width: 100%;
      height: 100%;
      background-image: url(picture/cute-pet-collage-isolated.jpg) !important;
    }
    .container {
      padding: 0;
      margin: 0;
      display: flex;
      height: 100%;
      width: 100%;
      justify-content: center;
      align-items: center;
    }
    #login-wrapper {
      display: flex;
      flex-direction: column;
      position: inherit;
      height: auto;
      width: 500px;
      margin: 0;
      padding: 20px;
      border-radius: 50%;
      border-width: 6px;
      border-style: solid;
      border-color: rgba(16, 55, 94, 1);
      background-color: rgba(181, 229, 222, 1);
      box-shadow: 0 -30px 0px 30px #ebfffc;
    }
    #login-wrapper h1 {
      line-height: 60px;
      width: 90%;
      color: #fff;
      font-size: 24px;
      margin: 0 auto 20px;
      padding: 0 40px;
      border-radius: 20px;
      border-width: 6px;
      border-style: solid;
      border-color: rgba(16, 55, 94, 1);
      background-color: rgba(255, 199, 0, 1);
      box-shadow: 0 0 6px rgba(30, 144, 255, 0);
      text-align: center;
    }

    #loginForm .form-group-l-r {
      display: flex;
      flex-wrap: wrap;
    }

    #loginForm .form-group {
      display: flex;
      align-items: center;
      flex-wrap: wrap;
      height: auto;
      width: 80%;
      margin: 0 auto;
      padding: 0 0 10px 0;
      border-radius: 0;
      border-width: 0;
      border-style: solid;
      border-color: rgba(0, 0, 0, 1);
      background-color: rgba(255, 255, 255, 0);
      box-shadow: 0 0 0px rgba(255, 0, 0, 0);
    }

    #loginForm .form-group .label {
      display: none;
      width: 72px;
      line-height: 44px;
      margin: 0;
      color: #1e90ff;
      font-size: 16px;
      padding: 0;
      border-radius: 0;
      border-width: 0;
      border-style: solid;
      border-color: rgba(0, 0, 0, 0);
      background-color: transparent;
      box-shadow: 0 0 6px rgba(255, 0, 0, 0);
      text-align: left;
    }

    #loginForm .form-group .form-control-i {
      width: 100%;
      height: 44px;
      margin: 0;
      color: rgba(0, 0, 0, 1);
      font-size: 14px;
      padding: 0 10px;
      border-radius: 8px;
      border-width: 0;
      border-style: solid;
      border-color: #ccc;
      background-color: #fff;
      box-shadow: 0 0 0px rgba(30, 144, 255, 0.5);
      text-align: left;
    }

    #loginForm .form-group .form-control-i:focus {
      outline: 0 none;
    }

    #loginForm .form-group-r {
      display: flex;
      align-items: center;
      width: 80%;
      height: 44px;
      margin: 0 auto;
      padding: 0;
      border-radius: 0;
      border-width: 0;
      border-style: solid;
      border-color: rgba(53, 33, 76, 1);
      background-color: rgba(255, 255, 255, 0);
      box-shadow: 0 0 6px rgba(255, 0, 0, 0);
    }

    #loginForm .form-group-r .checkbox {
      margin: 0 10px 0 0;
      padding: 0;
      display: flex;
      align-items: center;
    }

    #loginForm .form-group-r .checkbox label {
      color: rgba(53, 33, 76, 1);
      font-size: 14px;
      margin: 0;
      margin-top: -1px;
    }

    #loginForm .form-group-r .checkbox.active label {
      color: rgba(53, 33, 76, 1);
      font-size: 14px;
    }

    #loginForm .form-group-r .checkbox input {
      margin: 0;
      margin-right: 4px;
    }

    #loginForm button.pull-right {
      outline: none;
      width: 100%;
      height: auto;
      margin: 20px auto;
      color: rgba(53, 33, 76, 1);
      font-size: 20px;
      padding: 20px 0;
      border-radius: 37px;
      border-width: 6px;
      border-style: solid;
      border-color: rgba(16, 55, 94, 1);
      background-color: rgba(181, 229, 222, 1);
      box-shadow: 0 0 0px rgba(255, 0, 0, 0.5);
    }

    #loginForm .btn-register {
      display: inline-block;
      height: 44px;
      color: rgba(53, 33, 76, 1);
      font-size: 14px;
      padding: 0 10px;
      border-radius: 8px;
      border-width: 0;
      border-style: solid;
      border-color: #ccc;
      background-color: rgba(255, 0, 0, 0);
      box-shadow: 0 0 0px rgba(30, 144, 255, 0.5);
      display: flex;
      justify-content: center;
      align-items: center;
      text-decoration: none;
      margin: 0;
    }

    #loginForm .codes {
      display: flex;
      width: 80%;
      margin: 0 auto;
      padding: 0 0 10px 0;
    }

    #loginForm .codes input {
      width: calc(100% - 84px);
      height: 44px;
      margin: 0;
      color: rgba(0, 0, 0, 1);
      font-size: 14px;
      padding: 0 10px;
      border-radius: 8px 0 0 8px;
      border-width: 0;
      border-style: solid;
      border-color: #1e90ff;
      background-color: #fff;
      box-shadow: 0 0 6px rgba(30, 144, 255, 0);
      outline: none;
    }

    #loginForm .codes .nums {
      width: 84px;
      height: 44px;
      margin: 0;
      color: #000;
      font-size: 16px;
      padding: 0;
      border-radius: 0 8px 8px 0;
      border-width: 0;
      border-style: solid;
      border-color: #1e90ff;
      background-color: rgba(201, 201, 201, 1);
      box-shadow: 0 0 0px rgba(30, 144, 255, 0);
      outline: none;
      display: flex;
      align-items: center;
      justify-content: center;
    }
  </style>
  <body>
    <div class="container" style="position: relative">
      <div class="" id="login-wrapper">
        <h1>流浪动物救助及领养管理系统</h1>
        <form id="loginForm" action="javascript:void(0);" method="post">
          <div class="form-group">
            <label class="label">用户名</label>
            <input
              type="text"
              id="username"
              name="username"
              placeholder="用户名"
              class="form-control-i"
              required
            />
          </div>
          <div class="form-group">
            <label class="label">密码</label>
            <input
              type="password"
              name="password"
              placeholder="密码"
              class="form-control-i"
              required
            />
          </div>
          <div class="form-group codes">
            <input
              type="text"
              id="code"
              name="code"
              placeholder="请输入验证码"
              class="form-control-i"
              required
            />
            <div class="nums" id="nums" onclick="randomString()"></div>
          </div>
          <div class="form-group-l-r">
            <button
              class="btn btn btn-primary pull-right"
              type="button"
              onclick="login()"
            >
              登 录
            </button>
          </div>
        </form>
      </div>
    </div>

    <script
      type="text/javascript"
      src="${pageContext.request.contextPath}/resources/assets2/js/bootstrap.js"
    ></script>
    <script
      type="text/javascript"
      src="${pageContext.request.contextPath}/resources/js/jquery.form.js"
    ></script>
    <script type="text/javascript">

      <%@ include file="utils/menu.jsp"%>

      <%@ include file="utils/baseUrl.jsp"%>
      	var role = "";
      	var accountTableName = "";
      	var codes = [{
      		num: 1,
      		color: '#000',
      		rotate: '10deg',
      		size: '16px'
      	  }, {
      		num: 2,
      		color: '#000',
      		rotate: '10deg',
      		size: '16px'
      	  }, {
      		num: 3,
      		color: '#000',
      		rotate: '10deg',
      		size: '16px'
      	  }, {
      		num: 4,
      		color: '#000',
      		rotate: '10deg',
      		size: '16px'
      	  }]

      	//渲染角色选择
      	function setRoleOption() {
      		var box = document.createElement('div');
      		box.setAttribute('class', 'form-group-r');

      		// 创建一个包装角色选择和注册按钮的容器
      		var wrapper = document.createElement('div');
      		wrapper.setAttribute('style', 'display: flex; justify-content: space-between; width: 100%; align-items: center;');

      		// 创建角色选择的容器
      		var roleContainer = document.createElement('div');
      		roleContainer.setAttribute('style', 'display: flex; align-items: center;');

      		for (var i = 0; i < menus.length; i++) {
      			if(menus[i].hasBackLogin=='是') {
      				var div = document.createElement('div');
      				div.setAttribute('class', 'checkbox');
      				var label = document.createElement('label');
      				var checkbox = document.createElement('input');
      				checkbox.setAttribute('type', 'radio');
      				checkbox.setAttribute('name', 'chk');
      				checkbox.setAttribute('value', menus[i].roleName);
      				var attr = "checkRole(" + "\'" + menus[i].roleName + "\',\'" + menus[i].tableName + "\')";
      				checkbox.setAttribute('onclick', attr);
      				label.innerHTML = menus[i].roleName;
      				div.appendChild(checkbox);
      				div.appendChild(label);
      				roleContainer.appendChild(div);
      			}
      		}

      		// 创建注册链接
      		var registerLink = document.createElement('a');
      		registerLink.setAttribute('class', 'btn-register');
      		registerLink.setAttribute('href', 'modules/fabuzhe/register.jsp');
      		registerLink.innerHTML = '发布者注册';

      		wrapper.appendChild(roleContainer);
      		wrapper.appendChild(registerLink);
      		box.appendChild(wrapper);

      		// 将整个容器插入到表单中
      		$('form .form-group-l-r').before(box);
      	}
      	function checkRole(roleName, tableName) {
      			role = roleName;
      			accountTableName = tableName;
      	}

      	$('#login-wrapper').on('change', 'input[type=radio]', function () {
      	    $('#login-wrapper .form-group-r .checkbox').removeClass('active');
      		$(this).parent().addClass('active');
      	});

      	function login() {
      		// 阻止表单默认提交行为
      		event.preventDefault();

      		// 获取用户输入的验证码并转为小写
      		var inputCode = document.getElementById("code").value.toLowerCase();
      		// 获取实际的验证码并转为小写
      		var actualCode = codes.map(item => String(item.num).toLowerCase()).join('');

      		if(inputCode !== actualCode) {
      			alert("验证码错误");
      			randomString(); // 刷新验证码
      			document.getElementById("code").value = ''; // 清空验证码输入
      			return false;
      		}

      		if (role == "" || role == null) {
      			alert("请选择角色后再登录");
      			return false;
      		}

      		// 获取表单数据
      		var formData = new FormData(document.getElementById('loginForm'));

      		// 使用jQuery ajax发送请求
      		$.ajax({
      			url: baseUrl + accountTableName + '/login',
      			type: 'POST',
      			data: formData,
      			processData: false,
      			contentType: false,
      			async: false, // 使用同步请求
      			success: function(res) {
      				if (res.code == 0) {
      					alert("登录成功");
      					window.sessionStorage.setItem('accountTableName', accountTableName);
      					window.sessionStorage.setItem('username', formData.get('username'));
      					window.sessionStorage.setItem('token', res.token);
      					window.sessionStorage.setItem('role', role);

      					http(accountTableName+'/session', 'GET', {}, (res2)=>{
      						if(res2.code == 0){
      							window.sessionStorage.setItem('userid', res2.data.id);
      							window.location.href = "${pageContext.request.contextPath}/index.jsp";
      						}
      					});
      				} else {
      					alert(res.msg);
      				}
      			},
      			error: function(xhr, status, error) {
      				alert('登录请求失败，请重试');
      				console.error(error);
      			}
      		});
      		return false; // 确保不会发生表单提交
      	}
      	function ready() {
      		setRoleOption();
      		//$('form').attr('action',baseUrl + 'users/login');
      	}
      	document.addEventListener("DOMContentLoaded", ready);

      	function randomString() {
      		var len = 4;
      		var chars = [
      		  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      		  'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
      		  'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
      		  'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
      		  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
      		  '3', '4', '5', '6', '7', '8', '9'
      		]
      		var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
      		var sizes = ['14', '15', '16', '17', '18']

      		var output = []
      		for (var i = 0; i < len; i++) {
      		  // 随机验证码
      		  var key = Math.floor(Math.random() * chars.length)
      		  codes[i].num = chars[key]
      		  // 随机验证码颜色
      		  var code = '#'
      		  for (var j = 0; j < 6; j++) {
      		    var key = Math.floor(Math.random() * colors.length)
      		    code += colors[key]
      		  }
      		  codes[i].color = code
      		  // 随机验证码方
      		  var rotate = Math.floor(Math.random() * 30)
      		  var plus = Math.floor(Math.random() * 2)
      		  if (plus == 1) rotate = '-' + rotate
      		  codes[i].rotate = 'rotate(' + rotate + 'deg)'
      		  // 随机验证码字体大小
      		  var size = Math.floor(Math.random() * sizes.length)
      		  codes[i].size = sizes[size] + 'px'
      		}

      		var str = ''
      		for(var i = 0;i<codes.length;i++) {
      			str += '<span style="color:' + codes[i].color + ';transform:' + codes[i].rotate + ';fontSize:' + codes[i].size + ';padding: 0 3px;display:inline-block">'+codes[i].num+'</span>'
      		}
      		$('#nums').html('').append(str);
      	}

      	randomString();
    </script>
  </body>
</html>
