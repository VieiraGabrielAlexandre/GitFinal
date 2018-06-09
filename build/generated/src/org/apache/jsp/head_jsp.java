package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!-- Meta, title, CSS, favicons, etc. -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<title>Sistema TOP </title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\"      rel=\"stylesheet\">\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link href=\"css/font-awesome.min.css\"   rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!-- NProgress -->\r\n");
      out.write("<link href=\"css/nprogress.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Custom Theme Style -->\r\n");
      out.write("<link href=\"css/custom.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/css.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write(" <!-- Datatables -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!-- Datatables -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/plug-ins/1.10.16/i18n/Portuguese-Brasil.json\"></script>");
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
