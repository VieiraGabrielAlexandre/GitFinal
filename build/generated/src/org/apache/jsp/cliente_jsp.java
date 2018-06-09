package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Cliente;
import DAO.ClienteDAO;
import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import Model.Cliente;
import java.util.List;
import DAO.ClienteDAO;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/view/v_cliente.jsp");
    _jspx_dependants.add("/footer.jsp");
    _jspx_dependants.add("/script.jsp");
  }

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
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
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"nav-md\">\r\n");
      out.write("        <div class=\"container body\">\r\n");
      out.write("            <div class=\"main_container\">            \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String user = (String) session.getAttribute("usuario");
    ArrayList lista = null;
    String lstItem;
    String Item[];
    Integer indice= -1;
    try {
        if (user.equals("")) {
            response.sendRedirect("login.jsp");
        }
    } catch (NullPointerException e) {
        response.sendRedirect("login.jsp");
    }
    if (session.getAttribute("itens") != null){
        lista = new ArrayList();
        lista =(ArrayList) session.getAttribute("itens");       
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-3 left_col\">\r\n");
      out.write("    <div class=\"left_col scroll-view\">\r\n");
      out.write("        <div class=\"navbar nav_title\" style=\"border: 0;\">\r\n");
      out.write("            <a href=\"venda.jsp\" class=\"site_title\"><i class=\"fa fa-paw\"></i>\r\n");
      out.write("                <span>Sistema Gestão/Venda</span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("        <!-- menu profile quick info -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"profile clearfix\">\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"profile_info\">\r\n");
      out.write("                <span>Bem Vindo,\r\n");
      out.write("                <h2>");
 out.print(session.getAttribute("usuario"));
      out.write("</h2>\r\n");
      out.write("                             \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /menu profile quick info -->\r\n");
      out.write("\r\n");
      out.write("        <br />\r\n");
      out.write("\r\n");
      out.write("        <!-- sidebar menu -->\r\n");
      out.write("        <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("            <div class=\"menu_section\">\r\n");
      out.write("                <h3>Geral</h3>\r\n");
      out.write("                <ul class=\"nav side-menu\">\r\n");
      out.write("                    <li><a><i class=\"fa fa-home\"></i> Venda <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                        <ul class=\"nav child_menu\">\r\n");
      out.write("                            <li><a href=\"venda.jsp\">Venda</a></li>\r\n");
      out.write("                            <li><a href=\"relatorioPedidos.jsp\">Relatório de pedidos</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a><i class=\"fa fa-edit\"></i> Cadastro <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                        <ul class=\"nav child_menu\">\r\n");
      out.write("                            <li><a href=\"cliente.jsp\">Cliente</a></li>\r\n");
      out.write("                            <li><a href=\"produto.jsp\">Produto</a></li>\r\n");
      out.write("                            <li><a href=\"fornecedor.jsp\">Fornecedor</a></li>\r\n");
      out.write("                            <li><a href=\"usuario.jsp\">Usuário</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li><a href=\"login.jsp\"><i class=\"fa fa-edit\"></i> SAIR </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- top navigation -->\r\n");
      out.write("<div class=\"top_nav\">\r\n");
      out.write("    <div class=\"nav_menu\">\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"nav toggle\">\r\n");
      out.write("                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">                \r\n");
      out.write("                <li class=\"\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                       ");
 out.print(session.getAttribute("usuario"));
      out.write("\r\n");
      out.write("                        <span class=\" fa fa-angle-down\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                </li>\r\n");
      out.write("                <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("                  <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                      <img src=\"images/carrinho.png\" width=\"30px\" height=\"30px\"> \r\n");
      out.write("                    <span class=\"badge bg-green\">");
if (lista != null)out.print(lista.size());
      out.write("</span>\r\n");
      out.write("                  </a                 \r\n");
      out.write("                </li>              \r\n");
      out.write("                  <ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\">\r\n");
      out.write("                    ");
                         
                        if (lista != null){
                         Iterator i = lista.iterator();

                             while ( i.hasNext()){
                                 lstItem = i.next().toString();
                                 Item = lstItem.split(";"); 
                                 NumberFormat formato = NumberFormat.getCurrencyInstance();
                               indice += 1 ;  
                     
      out.write("\r\n");
      out.write("                    <li>                     \r\n");
      out.write("                        <span>Descrição: ");
      out.print(Item[0]);
      out.write("</span>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <span>Vlr unit: ");
      out.print(formato.format(Double.parseDouble(Item[2])));
      out.write(" </span>\r\n");
      out.write("                            <span>Qtde: ");
      out.print(Item[3]);
      out.write(" </span>\r\n");
      out.write("                            <span class=\"\">Total: ");
      out.print(formato.format(Double.parseDouble(Item[4])));
      out.write(" </span>\r\n");
      out.write("                            <a href=\"excluirPedido.jsp?indice=");
      out.print(indice);
      out.write("\">\r\n");
      out.write("                                <span class=\"time red bold\">X</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </p>  \r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
                          
                            }
                        }
                    
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <div class=\"text-center\">\r\n");
      out.write("                          ");
                         
                           if (lista != null){
                               
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                        <a data-toggle=\"modal\" data-target=\"#modal-mensagem\">\r\n");
      out.write("                          <strong>Finalizar pedido</strong>                        \r\n");
      out.write("                          <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                               ");
}
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"modal-mensagem\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("         <div class=\"modal-content\">\r\n");
      out.write("             <div class=\"modal-header\">\r\n");
      out.write("                 <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span>x</span></button>\r\n");
      out.write("                 <h4 class=\"modal-title\">Selecione o cliente</h4>                 \r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"modal-body\">\r\n");
      out.write("                  ");

                        ClienteDAO cl = new ClienteDAO();
                        List<Cliente> lstcl = cl.selecionar();
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <table id=\"datatable-responsive\" class=\"table table-striped dt-responsive nowrap\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>                           \r\n");
      out.write("                                <th></th>                              \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                                for (int i = 0; i < lstcl.size(); i++) {
                            
      out.write("                           \r\n");
      out.write("                              \r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <a href=\"finalizar.jsp?id=");
      out.print( lstcl.get(i).getId());
      out.write("&nome= ");
  out.print(lstcl.get(i).getNome());
      out.write("\">\r\n");
      out.write("                                        \r\n");
      out.write("                                     ");
  out.print(lstcl.get(i).getNome());
      out.write("\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
 }
                            
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>             \r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"modal-footer\">\r\n");
      out.write("                 <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Fechar</button>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<!-- /top navigation -->");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- page content -->\r\n");
      out.write("<div class=\"right_col\" role=\"main\">\r\n");
      out.write("    <div class=\"\">\r\n");
      out.write("        <div class=\"page-title\">\r\n");
      out.write("            <div class=\"title_left\">\r\n");
      out.write("                <h3>Cadastro de cliente</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"title_right\">\r\n");
      out.write("                <div class=\"pull-right\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <a href=\"clienteCadastrar.jsp?action=insert\"> <button type=\"button\" class=\"btn btn-round btn-success\">Cadastrar cliente</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("            <div class=\"x_panel\">\r\n");
      out.write("                <div class=\"x_title\">\r\n");
      out.write("                    <h2>Clientes cadastrados</h2>\r\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\r\n");
      out.write("                        <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                <li><a href=\"#\">Settings 1</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"#\">Settings 2</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"x_content\">\r\n");
      out.write("                    ");

                        ClienteDAO cli = new ClienteDAO();
                        List<Cliente> lstcli = cli.selecionar();
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                     <table id=\"example\" class=\"display\" style=\"width:100%\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>ID</th>\r\n");
      out.write("                                <th>Nome</th>\r\n");
      out.write("                                <th>Sobrenome</th>\r\n");
      out.write("                                <th>Aniversario</th>\r\n");
      out.write("                                <th>Cep</th>\r\n");
      out.write("                                <th>Logradouro</th>\r\n");
      out.write("                                <th>Ativo</th>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                                for (int i = 0; i < lstcli.size(); i++) {
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getId());
      out.write("</td>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getNome());
      out.write("</td>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getSobreNome());
      out.write("</td>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getAniversario());
      out.write("</td>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getCep());
      out.write("</td>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getLogradouro());
      out.write("</td>\r\n");
      out.write("                                <td>");
  out.print(lstcli.get(i).getAtivo());
      out.write("</td>\r\n");
      out.write("                                <td><a href=\"clienteCadastrar.jsp?action=update&id=");
      out.print( lstcli.get(i).getId());
      out.write("\">\r\n");
      out.write("                                        <i class=\"fa fa-edit\"></i> Editar\r\n");
      out.write("                                    </a></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
                                }
                            
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>                       \r\n");
      out.write("    <!-- /page content -->\r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('#example').dataTable({\r\n");
      out.write("            \"language\": {\r\n");
      out.write("                \"url\": \"https://cdn.datatables.net/plug-ins/1.10.16/i18n/Portuguese-Brasil.json\"\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("                ");
      out.write("        <!-- footer content -->\r\n");
      out.write("\r\n");
      out.write("        <footer>\r\n");
      out.write("          <div class=\"pull-right\">\r\n");
      out.write("            Gentelella - Bootstrap Admin Template by <a href=\"https://colorlib.com\">Colorlib</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"clearfix\"></div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- /footer content -->   \r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("                ");
      out.write(" <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- FastClick -->\r\n");
      out.write("    <script src=\"js/fastclick.js\"></script>\r\n");
      out.write("    <!-- NProgress -->\r\n");
      out.write("    <script src=\"js/nprogress.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom Theme Scripts -->\r\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Datatables -->\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
