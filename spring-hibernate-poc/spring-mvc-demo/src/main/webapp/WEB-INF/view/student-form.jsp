<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" required="true" />
    <br><br>

    Last name: <form:input path="lastName" required="true" />
    <br><br>

    <form:select path="country" required="true">
       <form:options items="${student.countryOptions}" />
    </form:select>

    <br><br>

    Familiar Operating Systems:
    <br>
    macOS: <form:checkbox path="familiarOS" value="macOS" />
    <br>
    Linux: <form:checkbox path="familiarOS" value="Linux" />
    <br>
    Windows: <form:checkbox path="familiarOS" value="Windows" />
    <br><br>

    Favorite Language:
    <br>
    Java: <form:radiobutton path="favoriteLanguage" value="Java" />
    <br>
    C++: <form:radiobutton path="favoriteLanguage" value="C++" />
    <br><br>

    <input type="submit" value="Submit" />

    </form:form>

</body>
</html>
