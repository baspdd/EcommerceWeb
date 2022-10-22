package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Material Design Bootstrap</title>\r\n");
      out.write("        <!-- Roboto Font -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700&display=swap\">\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/previews/ecommerce-demo/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Material Design Bootstrap -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/previews/ecommerce-demo/css/mdb-pro.min.css\">\r\n");
      out.write("        <!-- Material Design Bootstrap Ecommerce -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/previews/ecommerce-demo/css/mdb.ecommerce.min.css\">\r\n");
      out.write("        <!-- Your custom styles (optional) -->\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ------>\r\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/> \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/pagger.css\"/>\r\n");
      out.write("        <script src=\"js/pagger.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"skin-light\" onload=\"loadAmountCart()\">\r\n");
      out.write("\r\n");
      out.write("        <!--Main Navigation-->\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <!--Main Navigation-->\r\n");
      out.write("\r\n");
      out.write("            <!--Main layout-->\r\n");
      out.write("            <main>\r\n");
      out.write("                <div class=\"container\" style=\"margin-top:100px\">\r\n");
      out.write("\r\n");
      out.write("                    <!--Grid row-->\r\n");
      out.write("                    <div class=\"row mt-5\">\r\n");
      out.write("\r\n");
      out.write("                        <!--Grid column-->\r\n");
      out.write("                        <div class=\"col-md-4 mb-4\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Section: Sidebar -->\r\n");
      out.write("                            <section>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Section: Categories -->\r\n");
      out.write("                                <section>\r\n");
      out.write("\r\n");
      out.write("                                    <h5>Categories</h5>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"text-muted small text-uppercase mb-5\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </section>\r\n");
      out.write("                            <!-- Section: Categories -->\r\n");
      out.write("\r\n");
      out.write("                            <!-- Section: Filters -->\r\n");
      out.write("                            <section>\r\n");
      out.write("\r\n");
      out.write("                                <h5 class=\"pt-2 mb-4\">Filters</h5>\r\n");
      out.write("\r\n");
      out.write("                                <section class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"md-form md-outline mt-0 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <input oninput=\"searchByName(this)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" type=\"text\" class=\"form-control mb-0\" placeholder=\"Search...\">\r\n");
      out.write("                                        <a href=\"#!\" class=\"btn btn-flat btn-md px-3 waves-effect\"><i class=\"fas fa-search fa-lg\"></i></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <\r\n");
      out.write("                                </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <!-- Section: Price -->\r\n");
      out.write("                                <section class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <h6 class=\"font-weight-bold mb-3\">Price</h6>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-check pl-0 mb-3\">\r\n");
      out.write("                                        <input onchange=\"searchByPriceUnder100()\" type=\"radio\" class=\"form-check-input\" id=\"under100\" name=\"materialExampleRadios\">\r\n");
      out.write("                                        <label class=\"form-check-label small text-uppercase card-link-secondary\" for=\"under100\">Under\r\n");
      out.write("                                            $100</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check pl-0 mb-3\">\r\n");
      out.write("                                        <input onchange=\"searchByPrice100To200()\" type=\"radio\" class=\"form-check-input\" id=\"100200\" name=\"materialExampleRadios\">\r\n");
      out.write("                                        <label class=\"form-check-label small text-uppercase card-link-secondary\" for=\"100200\">$100 to\r\n");
      out.write("                                            $200</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check pl-0 mb-3\">\r\n");
      out.write("                                        <input onchange=\"searchByPriceAbove200()\" type=\"radio\" class=\"form-check-input\" id=\"200above\" name=\"materialExampleRadios\">\r\n");
      out.write("                                        <label class=\"form-check-label small text-uppercase card-link-secondary\" for=\"200above\">$200 &\r\n");
      out.write("                                            Above</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                        <div class=\"d-flex align-items-center mt-4 pb-1\">\r\n");
      out.write("                                            <div class=\"md-form md-outline my-0\">\r\n");
      out.write("                                                <input oninput=\"searchByPriceMinToMax()\" id=\"priceMin\" type=\"text\" class=\"form-control mb-0\">\r\n");
      out.write("                                                <label for=\"priceMin\">$ Min</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <p class=\"px-2 mb-0 text-muted\"> - </p>\r\n");
      out.write("                                            <div class=\"md-form md-outline my-0\">\r\n");
      out.write("                                                <input oninput=\"searchByPriceMinToMax()\" id=\"priceMax\" type=\"text\" class=\"form-control mb-0\">\r\n");
      out.write("                                                <label for=\"priceMax\">$ Max</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                </section>\r\n");
      out.write("                                <!-- Section: Price -->\r\n");
      out.write("\r\n");
      out.write("                            </section>\r\n");
      out.write("                            <!-- Section: Filters -->\r\n");
      out.write("\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <!-- Section: Sidebar -->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("                    <!--Grid column-->\r\n");
      out.write("                    <div class=\"col-md-8 mb-4\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Section: Block Content -->\r\n");
      out.write("                        <section class=\"mb-3\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row d-flex justify-content-around align-items-center\">\r\n");
      out.write("                                <div class=\"col-12 col-md-3 text-center text-md-left\">\r\n");
      out.write("                                    <a href=\"#!\" class=\"text-reset\"><i class=\"fas fa-th-list fa-lg mr-1\"></i></a href=\"#!\">\r\n");
      out.write("                                    <a href=\"#!\" class=\"text-reset\"><i class=\"fas fa-th-large fa-lg\"></i></a href=\"#!\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-5\">\r\n");
      out.write("                                    <div class=\"d-flex flex-wrap\">\r\n");
      out.write("                                        <div class=\"select-outline position-relative w-100\">\r\n");
      out.write("                                            <select class=\"mdb-select md-outline md-form\" searchable=\"Search here..\">\r\n");
      out.write("                                                <option value=\"\" disabled selected>Choose category</option>\r\n");
      out.write("                                                <option value=\"1\">Category 1</option>\r\n");
      out.write("                                                <option value=\"2\">Category 2</option>\r\n");
      out.write("                                                <option value=\"3\">Category 3</option>\r\n");
      out.write("                                                <option value=\"4\">Category 4</option>\r\n");
      out.write("                                                <option value=\"5\">Category 5</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                            <label>Tất cả sản phẩm\r\n");
      out.write("                                                <section class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"md-form md-outline mt-0 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                                        <input oninput=\"searchByName(this)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" type=\"text\" class=\"form-control mb-0\" placeholder=\"Search...\">\r\n");
      out.write("                                                        <a href=\"#!\" class=\"btn btn-flat btn-md px-3 waves-effect\"><i class=\"fas fa-search fa-lg\"></i></a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </section>\r\n");
      out.write("                                            </label>\r\n");
      out.write("\r\n");
      out.write("                                            <button class=\"btn-save btn btn-primary btn-sm mt-2\">Save</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <!-- Section: Block Content -->\r\n");
      out.write("\r\n");
      out.write("                        <!--Section: Block Content-->\r\n");
      out.write("                        <section>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Grid row -->\r\n");
      out.write("                            <div class=\"row\" id=\"content\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("     \r\n");
      out.write("                                <div id=\"top_pagger\" class=\"pagger\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Grid row -->\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <!--Section: Block Content-->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </main>\r\n");
      out.write("                    <!--Main layout-->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("                        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("                        <!-- Footer -->\r\n");
      out.write("                        <!-- SCRIPTS -->\r\n");
      out.write("                        <!-- JQuery -->\r\n");
      out.write("                        <script src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("                        <!-- Bootstrap tooltips -->\r\n");
      out.write("                        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/popper.min.js\"></script>\r\n");
      out.write("                        <!-- Bootstrap core JavaScript -->\r\n");
      out.write("                        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/bootstrap.js\"></script>\r\n");
      out.write("                        <!-- MDB core JavaScript -->\r\n");
      out.write("                        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/mdb.min.js\"></script>\r\n");
      out.write("                        <!-- MDB Ecommerce JavaScript -->\r\n");
      out.write("                        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/mdb.ecommerce.min.js\"></script>\r\n");
      out.write("                        <script type=\"text/javascript\">\r\n");
      out.write("                                            render(\"top_pagger\",");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.tag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.endPage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", 5);\r\n");
      out.write("                                            $('#multi').mdbRange({\r\n");
      out.write("                                                single: {\r\n");
      out.write("                                                    active: true,\r\n");
      out.write("                                                    multi: {\r\n");
      out.write("                                                        active: true,\r\n");
      out.write("                                                        rangeLength: 1\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                }\r\n");
      out.write("                                            });\r\n");
      out.write("\r\n");
      out.write("                                            $(document).ready(function () {\r\n");
      out.write("                                                $('.mdb-select').materialSelect();\r\n");
      out.write("                                                $('.select-wrapper.md-form.md-outline input.select-dropdown').bind('focus blur', function () {\r\n");
      out.write("                                                    $(this).closest('.select-outline').find('label').toggleClass('active');\r\n");
      out.write("                                                    $(this).closest('.select-outline').find('.caret').toggleClass('active');\r\n");
      out.write("                                                });\r\n");
      out.write("                                            });\r\n");
      out.write("                                            function load(cateid) {\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/categoryShop\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("                                                        cid: cateid\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (responseData) {\r\n");
      out.write("                                                        document.getElementById(\"content\").innerHTML = responseData;\r\n");
      out.write("                                                        render();\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                            function searchByName(param) {\r\n");
      out.write("                                                var txtSearch = param.value;\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/searchAjaxShop\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("                                                        txt: txtSearch\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (data) {\r\n");
      out.write("                                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                                        row.innerHTML = data;\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    error: function (xhr) {\r\n");
      out.write("                                                        //Do Something to handle error\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                            function searchByPriceMinToMax() {\r\n");
      out.write("                                                var numMin = document.getElementById(\"priceMin\").value;\r\n");
      out.write("                                                var numMax = document.getElementById(\"priceMax\").value;\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/searchAjaxPriceMinToMax\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("                                                        priceMin: numMin,\r\n");
      out.write("                                                        priceMax: numMax\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (data) {\r\n");
      out.write("                                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                                        row.innerHTML = data;\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    error: function (xhr) {\r\n");
      out.write("                                                        //Do Something to handle error\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                            function searchByPriceUnder100() {\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/searchAjaxPriceUnder100Shop\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (data) {\r\n");
      out.write("                                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                                        row.innerHTML = data;\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    error: function (xhr) {\r\n");
      out.write("                                                        //Do Something to handle error\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                            function searchByPrice100To200() {\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/searchAjaxPrice100To200Shop\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (data) {\r\n");
      out.write("                                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                                        row.innerHTML = data;\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    error: function (xhr) {\r\n");
      out.write("                                                        //Do Something to handle error\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                            function searchByPriceAbove200() {\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/searchAjaxPriceAbove200Shop\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (data) {\r\n");
      out.write("                                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                                        row.innerHTML = data;\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    error: function (xhr) {\r\n");
      out.write("                                                        //Do Something to handle error\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("\r\n");
      out.write("                                            function loadAmountCart() {\r\n");
      out.write("                                                $.ajax({\r\n");
      out.write("                                                    url: \"/EcomerceWeb/loadAllAmountCart\",\r\n");
      out.write("                                                    type: \"get\", //send it through get method\r\n");
      out.write("                                                    data: {\r\n");
      out.write("\r\n");
      out.write("                                                    },\r\n");
      out.write("                                                    success: function (responseData) {\r\n");
      out.write("                                                        document.getElementById(\"amountCart\").innerHTML = data;\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                    </script>\r\n");
      out.write("                    <!-- MDB -->\r\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\r\n");
      out.write("                    <!-- Custom scripts -->\r\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("                    </body>\r\n");
      out.write("\r\n");
      out.write("                    </html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <p class=\"mb-3\"><a onclick=\"load(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cate_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" class=\"card-link-secondary\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cate_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <!-- Grid column -->\r\n");
          out.write("                                    <div class=\"col-md-4 mb-5\">\r\n");
          out.write("\r\n");
          out.write("                                        <!-- Card -->\r\n");
          out.write("                                        <div class=\"\">\r\n");
          out.write("\r\n");
          out.write("                                            <div class=\"view zoom overlay rounded z-depth-2\">\r\n");
          out.write("                                                <img class=\"img-fluid w-100\"\r\n");
          out.write("                                                     src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Sample\">\r\n");
          out.write("                                                <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                    <div class=\"mask\">\r\n");
          out.write("                                                        <img class=\"img-fluid w-100\"\r\n");
          out.write("                                                             src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                        <div class=\"mask rgba-black-slight\"></div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </a>\r\n");
          out.write("                                            </div>\r\n");
          out.write("\r\n");
          out.write("                                            <div class=\"text-center pt-4\">\r\n");
          out.write("\r\n");
          out.write("                                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                                                <p><span class=\"mr-1\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.displayPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></span></p>\r\n");
          out.write("\r\n");
          out.write("                                            </div>\r\n");
          out.write("\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <!-- Card -->\r\n");
          out.write("\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <!-- Grid column -->\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
