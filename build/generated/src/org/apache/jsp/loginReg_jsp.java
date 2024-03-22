package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login and Registration Form </title>\n");
      out.write("    <!-- CSS -->\n");
      out.write("    <link href=\"css/loginstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <!-- Boxicons CSS -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status"));
      out.write("\">\n");
      out.write("    <section class=\"container forms\">\n");
      out.write("        <div class=\"form login\">\n");
      out.write("            <div class=\"form-content\">\n");
      out.write("                <p>Login</p>\n");
      out.write("                <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("                    <div class=\"field input-field\">\n");
      out.write("                        <input type=\"email\" placeholder=\"Email or Username\" class=\"input\" name=\"useremail\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field input-field\">\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" class=\"password\" name=\"password\">\n");
      out.write("                        <i class='bx bx-hide eye-icon'></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-link\">\n");
      out.write("                        <a href=\"#\" class=\"forgot-pass\">Forgot password?</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field button-field\">\n");
      out.write("                        <button value=\"#\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"form-link\">\n");
      out.write("                    <span>Don't have an account? <a href=\"registration.jsp\" class=\"link signup-link\">Signup</a></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"line\"></div>\n");
      out.write("            <div class=\"media-options\">\n");
      out.write("                <a href=\"#\" class=\"field facebook\">\n");
      out.write("                    <i class='bx bxl-facebook facebook-icon'></i>\n");
      out.write("                    <span>Login with Facebook</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"media-options\">\n");
      out.write("                <a href=\"#\" class=\"field google\">\n");
      out.write("                    <i class='bx bxl-google google-icon'></i>\n");
      out.write("                    <!-- <img src=\"#\" alt=\"\" class=\"bx bxl-google google-icon\"> -->\n");
      out.write("                    <span>Login with Google</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Signup Form -->\n");
      out.write("        <div class=\"form signup\">\n");
      out.write("            <div class=\"form-content\">\n");
      out.write("                <p>Signup</p>\n");
      out.write("                <form action=\"RegistrationServlet\" method=\"post\">\n");
      out.write("                    <div class=\"field input-field\">\n");
      out.write("                        <input type=\"text\" placeholder=\" Username\" class=\"input\" name=\"uname\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field input-field\">\n");
      out.write("                        <input type=\"email\" placeholder=\"Email\" class=\"password\" name=\"uemail\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field input-field\">\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" class=\"password\" name=\"upass\" required>\n");
      out.write("                        <i class='bx bx-hide eye-icon'></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field button-field\">\n");
      out.write("                        <button value=\"Register\">Signup</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"form-link\">\n");
      out.write("                    <span>Already have an account? <a href=\"index.jsp\" class=\"link login-link\">Login</a></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"line\"></div>\n");
      out.write("            <div class=\"media-options\">\n");
      out.write("                <a href=\"#\" class=\"field facebook\">\n");
      out.write("                    <i class='bx bxl-facebook facebook-icon'></i>\n");
      out.write("                    <span>Login with Facebook</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"media-options\">\n");
      out.write("                <a href=\"#\" class=\"field google\">\n");
      out.write("                    <i class='bx bxl-google google-icon'></i>\n");
      out.write("                    <span>Login with Google</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script>\n");
      out.write("        const forms = document.querySelector(\".forms\"),\n");
      out.write("            pwShowHide = document.querySelectorAll(\".eye-icon\"),\n");
      out.write("            links = document.querySelectorAll(\".link\");\n");
      out.write("        pwShowHide.forEach(eyeIcon => {\n");
      out.write("            eyeIcon.addEventListener(\"click\", () => {\n");
      out.write("                let pwFields = eyeIcon.parentElement.parentElement.querySelectorAll(\".password\");\n");
      out.write("                pwFields.forEach(password => {\n");
      out.write("                    if (password.type === \"password\") {\n");
      out.write("                        password.type = \"text\";\n");
      out.write("                        eyeIcon.classList.replace(\"bx-hide\", \"bx-show\");\n");
      out.write("                        return;\n");
      out.write("                    }\n");
      out.write("                    password.type = \"password\";\n");
      out.write("                    eyeIcon.classList.replace(\"bx-show\", \"bx-hide\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        links.forEach(link => {\n");
      out.write("            link.addEventListener(\"click\", e => {\n");
      out.write("                e.preventDefault();\n");
      out.write("                forms.classList.toggle(\"show-signup\");\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        function validateLoginForm() {\n");
      out.write("            const email = document.querySelector('.login .input[type=\"email\"]').value;\n");
      out.write("            const password = document.querySelector('.login .password').value;\n");
      out.write("            if (email.trim() === '' || password.trim() === '') {\n");
      out.write("                alert('Please fill in both email and password fields.');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (password.length < 6) {\n");
      out.write("                alert('Password must be at least 6 characters long.');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        function validateSignupForm() {\n");
      out.write("            const email = document.querySelector('.signup .input[type=\"email\"]').value;\n");
      out.write("            const password2 = document.querySelector('.signup .password:last-of-type').value;\n");
      out.write("            if (email.trim() === '' || password1.trim() === '' || password2.trim() === '') {\n");
      out.write("                alert('Please fill in all fields.');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (password2.length < 6) {\n");
      out.write("                alert('Password must be at least 6 characters long.');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (password1 !== password2) {\n");
      out.write("                alert('Passwords do not match.');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        document.querySelector('.login form').addEventListener('submit', function (e) {\n");
      out.write("            if (!validateLoginForm()) {\n");
      out.write("                e.preventDefault(); \n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        document.querySelector('.signup form').addEventListener('submit', function (e) {\n");
      out.write("            if (!validateSignupForm()) {\n");
      out.write("                e.preventDefault();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("            var status = document.getElementById(\"status\").value;\n");
      out.write("            if(status===\"success\"){\n");
      out.write("                swal(\"congrats\", \"Account created Successfully\",\"success\");\n");
      out.write("        </script>         \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
