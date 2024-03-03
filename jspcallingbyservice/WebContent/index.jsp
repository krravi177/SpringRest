<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
	function getD() {
var uid = document.getElementById("uid").value;
	alert(uid);
$.ajax({
      
		url : "http://localhost:8080/SpringrestServer/ok.do?uid="+ uid + "",
			type : "GET",
			contentType : "application/json",
			dataType : 'json',
			success : function(res) {
				$('#t').empty();
				alert("hi " + res);
				
				for (var i = 0; i < res.length; i++) {

			var h = "<tr><td>" + res[i].uid + "</td><td>"
				+ res[i].name + "</td>  <td>" + res[i].add + "</td> </tr>";
					$('#t').append(h);
				}
				
				
			},
			error : function(e) {
				console.log(e);
			}

		}

		)

	}
	
	
	
	
</script>
</head>

<body>
	<table border="3" bgcolor="cyan">
	
	
		<tr>
			<td>UID</td>
<td colspan="2"><input type="text" name="uid" id="uid" onblur="getD();"></td>
		</tr>
<tr><th>UID Code</th><th>Name </th><th>Address </th></tr>
		
	<tbody id="t"></tbody>	
		
		
	

		

	</table>


</body>
</html>