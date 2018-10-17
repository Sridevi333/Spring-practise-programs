<!DOCTYPE html>
<html>

<head>

	<title>Student Confirmation Form</title>

</head>

<body>
 	
 	The Student is confirmed: ${student.firstName} ${student.lastName}
 	
 	<br><br>
 	
 	Student Country: ${student.country}
 	
 	<br><br>
 	
 	FavoriteLanguage: ${student.favoriteLanguage}

	<br><br>
	
	Operating Systems:
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		
			<li> ${temp} </li>
		
		</c:forEach>
	
	</ul>
 	

</body>


</html>