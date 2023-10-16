package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Connexion</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            background-color: #2C3E50;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            background-color: #fff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 40px;\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container h1 {\n");
      out.write("            color: #3498DB;\n");
      out.write("            font-size: 28px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form input[type=\"submit\"] {\n");
      out.write("            background: #3498DB;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            padding: 12px 0;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-form input[type=\"submit\"]:hover {\n");
      out.write("            background: #2980B9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error-message {\n");
      out.write("            color: #E74C3C;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .signup-link {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: #3498DB;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .forgot-password-link {\n");
      out.write("            color: #3498DB;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h1>Connexion</h1>\n");
      out.write("        <form class=\"login-form\" action=\"auth\" method=\"POST\">\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"Email\">\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("        <div class=\"error-message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        <div class=\"signup-link\">Créer un compte? <a href=\"Inscription.jsp\">Inscription</a></div>\n");
      out.write("        <div class=\"forgot-password-link\"><a href=\"forgotPassword.jsp\">Mot de passe oublié ?</a></div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
