<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br>
The number of free passes: ${customer.freePasses}
<br>
You choosed Postal Code as: ${customer.postalCode}
<br>
Your Course code is: ${customer.courseCode}
</body>

</html>










