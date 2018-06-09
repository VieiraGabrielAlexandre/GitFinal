package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("        <!-- page content -->\r\n");
      out.write("        <div class=\"right_col\" role=\"main\">\r\n");
      out.write("          <div class=\"\">\r\n");
      out.write("            <div class=\"page-title\">\r\n");
      out.write("              <div class=\"title_left\">\r\n");
      out.write("                <h3>Plain Page</h3>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"title_right\">\r\n");
      out.write("                <div class=\"col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search\">\r\n");
      out.write("                  <div class=\"input-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search for...\">\r\n");
      out.write("                    <span class=\"input-group-btn\">\r\n");
      out.write("                      <button class=\"btn btn-default\" type=\"button\">Go!</button>\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                <div class=\"x_panel\">\r\n");
      out.write("                  <div class=\"x_title\">\r\n");
      out.write("                    <h2>Plain Page</h2>\r\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\r\n");
      out.write("                      <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                          <li><a href=\"#\">Settings 1</a>\r\n");
      out.write("                          </li>\r\n");
      out.write("                          <li><a href=\"#\">Settings 2</a>\r\n");
      out.write("                          </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"x_content\">\r\n");
      out.write("                      Add content to the page ...\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /page content -->");
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
