<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation Page</title>
</head>
<body>
 The student is confirmed: ${student.firstName} ${student.lastName}
 <br><br>
 Country: ${student.country}
  <br><br>
  Favourite Language: "${student.favoriteLanguage}"
   <br><br>
   Familiar OS:
   <ul>
       <c:forEach var="currOs" items="${student.familiarOS}">
           <li>${currOs}</li>
       </c:forEach>
   </ul>
</body>
</html>
