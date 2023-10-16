<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #2C3E50;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-container {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
            padding: 40px;
            width: 400px;
        }

        .login-container h1 {
            color: #3498DB;
            font-size: 28px;
            margin-bottom: 20px;
        }

        .login-form input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .login-form input[type="submit"] {
            background: #3498DB;
            color: #fff;
            border: none;
            padding: 12px 0;
            cursor: pointer;
        }

        .login-form input[type="submit"]:hover {
            background: #2980B9;
        }

        .error-message {
            color: #E74C3C;
            margin-top: 10px;
        }

        .signup-link {
            margin-top: 20px;
            color: #3498DB;
        }

        .forgot-password-link {
            color: #3498DB;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h1>Connexion</h1>
        <form class="login-form" action="auth" method="POST">
            <input type="text" name="email" placeholder="Email">
            <input type="password" name="password" placeholder="Password">
            <input type="submit" value="Login">
        </form>
        <div class="error-message">${msg}</div>
        <div class="signup-link">Créer un compte? <a href="Inscription.jsp">Inscription</a></div>
        <div class="forgot-password-link"><a href="forgotPassword.jsp">Mot de passe oublié ?</a></div>
    </div>
</body>
</html>
