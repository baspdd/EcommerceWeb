package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("    href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("    rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("              crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\"\r\n");
      out.write("              integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\"\r\n");
      out.write("              crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <title>Edit Profile</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div id=\"logreg-forms\">\r\n");
      out.write("                <form class=\"form-signin\" action=\"editProfile\" method=\"post\">\r\n");
      out.write("                    <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Edit Profile</h1>\r\n");
      out.write("                    <p class=\"text-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <label for=\"username\">Username</label>\r\n");
      out.write("                <input name=\"username\" type=\"text\" id=\"username\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.username }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <label for=\"password\">Password</label>\r\n");
      out.write("                <input name=\"password\" type=\"password\" id=\"password\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.pass }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <label for=\"email\">Email</label>\r\n");
      out.write("                <input name=\"email\" type=\"text\" id=\"email\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.email }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <label for=\"phone\">PHONE</label>\r\n");
      out.write("                <input name=\"phone\" type=\"text\" id=\"phone\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.phone }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <label for=\"fullname\">Name</label>\r\n");
      out.write("                <input name=\"fullname\" type=\"text\" id=\"fullname\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.fullname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <label for=\"address\">Address</label>\r\n");
      out.write("                <input name=\"address\" type=\"text\" id=\"address\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.address }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <label for=\"dob\">Birthday</label>\r\n");
      out.write("                <input name=\"dob\" type=\"text\" id=\"dob\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.dob }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" autofocus=\"\">\r\n");
      out.write("                <button class=\"btn btn-success btn-block\" type=\"submit\"><i class=\"fas fa-sign-in-alt\"></i> Edit</button> \r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("            src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("            integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function toggleResetPswd(e) {\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("                $('#logreg-forms .form-signin').toggle() // display:block or none\r\n");
      out.write("                $('#logreg-forms .form-reset').toggle() // display:block or none\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function toggleSignUp(e) {\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("                $('#logreg-forms .form-signin').toggle(); // display:block or none\r\n");
      out.write("                $('#logreg-forms .form-signup').toggle(); // display:block or none\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $(() => {\r\n");
      out.write("                // Login Register Form\r\n");
      out.write("                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);\r\n");
      out.write("                $('#logreg-forms #cancel_reset').click(toggleResetPswd);\r\n");
      out.write("                $('#logreg-forms #btn-signup').click(toggleSignUp);\r\n");
      out.write("                $('#logreg-forms #cancel_signup').click(toggleSignUp);\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            window.addEventListener(\"load\", function loadAmountCart() {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: \"/WebsiteBanGiay/loadAllAmountCart\",\r\n");
      out.write("                    type: \"get\", //send it through get method\r\n");
      out.write("                    data: {\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    success: function (responseData) {\r\n");
      out.write("                        document.getElementById(\"amountCart\").innerHTML = responseData;\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }, false);\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
