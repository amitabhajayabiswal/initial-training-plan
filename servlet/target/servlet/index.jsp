<html>
    <head>
        <title>Form page</title>
        <style>
            .container{
                width: 40%;
                border: 1px solid black;
                margin: auto;
                padding: 20px;
                font-size: 35px;
            }
        </style>
    </head>
<body>
    <div class="container">
        <h1>My Form</h1>
        <form id="myform" action="RegisterServlet" method="post">
            <table>
                <tr>
                    <td>Enter your name: </td>
                    <td><input type="text" name="user_name" placeholder="Enter here"/></td>
                </tr>
                <tr>
                    <td>Enter your password: </td>
                    <td><input type="password" name="user_password" placeholder="Enter here"/></td>
                </tr>
                <tr>
                    <td>Enter your Email Id: </td>
                    <td><input type="email" name="user_email" placeholder="Enter here"/></td>
                </tr>
                <tr>
                    <td>Select Gender</td>
                    <td><input type="radio" name="user_gender" value="male"> Male &nbsp; &nbsp;<input type="radio" name="user_gender" value="female"> Female</td>
                </tr>
                <tr>
                    <td style="text-align: right">
                        <input type="checkbox" value="checked" name="condition">
                    </td>
                    <td>Agree terms and conditions</td>
                </tr>
                <tr>
                    <td>
                        
                    </td>
                    <td>
                        <button type="submit">Register</button>
                        <button type="reset">Reset</button>
                    </td>
                </tr>
            </table>
        </form>

    </div>
</body>
</html>
