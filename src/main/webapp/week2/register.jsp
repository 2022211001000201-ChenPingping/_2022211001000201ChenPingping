<%--
  Created by IntelliJ IDEA.
  User: 陈平平
  Date: 2024/3/9
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $('form').submit(function(e) {
                var username = $('#username').val();
                var password = $('#password').val();
                var email = $('#email').val();
                var dob = $('#dob').val();

                if (username === '' || password === '' || email === '' || dob === '') {
                    alert('Please fill in all fields.');
                    e.preventDefault();
                }

                if (password.length < 8) {
                    alert('Password must be at least 8 characters long.');
                    e.preventDefault();
                }

                var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
                if (!emailPattern.test(email)) {
                    alert('Please enter a valid email address.');
                    e.preventDefault();
                }

                var dobPattern = /^\d{4}-\d{2}-\d{2}$/;
                if (!dobPattern.test(dob)) {
                    alert('Please enter a valid date of birth (yyyy-dd-mm format).');
                    e.preventDefault();
                }
            });
        });
    </script>
</head>
<body>
<form action="submit_registration.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email"><br><br>

    <label for="dob">Date of Birth (yyyy-dd-mm):</label>
    <input type="text" id="dob" name="dob"><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
