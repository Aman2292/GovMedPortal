<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login and Registration Form </title>
    <!-- CSS -->
    <link href="css/loginstyle.css" rel="stylesheet" type="text/css"/>
    <!-- Boxicons CSS -->
    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
    <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
    <section class="container forms">
        <div class="form login">
            <div class="form-content">
                <p>Login</p>
                <form action="LoginServlet" method="post">
                    <div class="field input-field">
                        <input type="email" placeholder="Email or Username" class="input" name="useremail">
                    </div>
                    <div class="field input-field">
                        <input type="password" placeholder="Password" class="password" name="password">
                        <i class='bx bx-hide eye-icon'></i>
                    </div>
                    <div class="form-link">
                        <a href="#" class="forgot-pass">Forgot password?</a>
                    </div>
                    <div class="field button-field">
                        <button value="#">Login</button>
                    </div>
                </form>
                <div class="form-link">
                    <span>Don't have an account? <a href="registration.jsp" class="link signup-link">Signup</a></span>
                </div>
            </div>
            <div class="line"></div>
            <div class="media-options">
                <a href="#" class="field facebook">
                    <i class='bx bxl-facebook facebook-icon'></i>
                    <span>Login with Facebook</span>
                </a>
            </div>
            <div class="media-options">
                <a href="#" class="field google">
                    <i class='bx bxl-google google-icon'></i>
                    <!-- <img src="#" alt="" class="bx bxl-google google-icon"> -->
                    <span>Login with Google</span>
                </a>
            </div>
        </div>
        <!-- Signup Form -->
        <div class="form signup">
            <div class="form-content">
                <p>Signup</p>
                <form action="RegistrationServlet" method="post">
                    <div class="field input-field">
                        <input type="text" placeholder=" Username" class="input" name="uname" required>
                    </div>
                    <div class="field input-field">
                        <input type="email" placeholder="Email" class="password" name="uemail" required>
                    </div>
                    <div class="field input-field">
                        <input type="password" placeholder="Password" class="password" name="upass" required>
                        <i class='bx bx-hide eye-icon'></i>
                    </div>
                    <div class="field button-field">
                        <button value="Register">Signup</button>
                    </div>
                </form>
                <div class="form-link">
                    <span>Already have an account? <a href="index.jsp" class="link login-link">Login</a></span>
                </div>
            </div>
            <div class="line"></div>
            <div class="media-options">
                <a href="#" class="field facebook">
                    <i class='bx bxl-facebook facebook-icon'></i>
                    <span>Login with Facebook</span>
                </a>
            </div>
            <div class="media-options">
                <a href="#" class="field google">
                    <i class='bx bxl-google google-icon'></i>
                    <span>Login with Google</span>
                </a>
            </div>
        </div>
    </section>
    <script>
        const forms = document.querySelector(".forms"),
            pwShowHide = document.querySelectorAll(".eye-icon"),
            links = document.querySelectorAll(".link");
        pwShowHide.forEach(eyeIcon => {
            eyeIcon.addEventListener("click", () => {
                let pwFields = eyeIcon.parentElement.parentElement.querySelectorAll(".password");
                pwFields.forEach(password => {
                    if (password.type === "password") {
                        password.type = "text";
                        eyeIcon.classList.replace("bx-hide", "bx-show");
                        return;
                    }
                    password.type = "password";
                    eyeIcon.classList.replace("bx-show", "bx-hide");
                });
            });
        });
        links.forEach(link => {
            link.addEventListener("click", e => {
                e.preventDefault();
                forms.classList.toggle("show-signup");
            });
        });
        function validateLoginForm() {
            const email = document.querySelector('.login .input[type="email"]').value;
            const password = document.querySelector('.login .password').value;
            if (email.trim() === '' || password.trim() === '') {
                alert('Please fill in both email and password fields.');
                return false;
            }
            if (password.length < 6) {
                alert('Password must be at least 6 characters long.');
                return false;
            }
            return true;
        }
        function validateSignupForm() {
            const email = document.querySelector('.signup .input[type="email"]').value;
            const password2 = document.querySelector('.signup .password:last-of-type').value;
            if (email.trim() === '' || password1.trim() === '' || password2.trim() === '') {
                alert('Please fill in all fields.');
                return false;
            }
            if (password2.length < 6) {
                alert('Password must be at least 6 characters long.');
                return false;
            }
            if (password1 !== password2) {
                alert('Passwords do not match.');
                return false;
            }
            return true;
        }
        document.querySelector('.login form').addEventListener('submit', function (e) {
            if (!validateLoginForm()) {
                e.preventDefault(); 
            }
        });
        document.querySelector('.signup form').addEventListener('submit', function (e) {
            if (!validateSignupForm()) {
                e.preventDefault();
            }
        });
    </script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
    <script type="text/javascript">
            var status = document.getElementById("status").value;
            if(status==="success"){
                swal("congrats", "Account created Successfully","success");
        </script>         
</body>
</html>
</html>
