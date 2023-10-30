<%-- 
    Document   : passmatch
    Created on : Oct 29, 2023, 11:54:15?PM
    Author     : dell
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Password Matching Example</title>
        <script>
            function checkPassword() {
                var password = document.getElementById("password").value;
                var confirmPassword = document.getElementById("confirmPassword").value;
                var pdisplay = document.getElementById("pdisplay");

                if (password === confirmPassword) {
    //                document.getElementById("message").innerHTML = "Passwords match!";
                    pdisplay.innerHTML="Passwords match!";
                    pdisplay.style.color = "red";
                } else {
                    document.getElementById("message").innerHTML = "Passwords do not match!";
                }
            }
        </script>
    </head>
    <body>
        <form>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>
            <span id="udisplay" style="color:red; font-size: 14px;">*</span>
            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required oninput="checkPassword()"><br><br>

            <p id="message"></p>
        </form>
    </body>
</html>
