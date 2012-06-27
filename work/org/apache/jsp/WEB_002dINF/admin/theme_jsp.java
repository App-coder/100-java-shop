package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class theme_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin/common/config.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

String win_topbar = "closed=\"true\" modal=\"true\" collapsible=\"false\"  draggable=\"false\" minimizable=\"false\" maximizable=\"false\" inline=\"false\" resizable=\"false\"";

      out.write("    ");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var current_theme = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${system_config['theme']}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/theme.js\"></script>\r\n");
      out.write("<table id=\"theme_list\"></table>\r\n");
      out.write("<div class=\"hidden\">\r\n");
      out.write("<div id=\"wind_theme_edit\"  ");
      out.print(win_topbar );
      out.write("   >  \r\n");
      out.write("<div region=\"center\"  border=\"false\" class=\"bdcenter\">\r\n");
      out.write("<form method=\"post\" id=\"form_theme_edit\" >\r\n");
      out.write("<input type=\"hidden\" name=\"id\" />\r\n");
      out.write("<table class=\"tab_form\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">名称：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\"\r\n");
      out.write("\t\t\tname=\"name\"  required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">目录：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\"\r\n");
      out.write("\t\t\tname=\"catalog\"  required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" valign=\"top\">描述：</td>\r\n");
      out.write("\t\t<td><textarea rows=\"3\" name=\"description\" class=\"textborder\" cols=\"43\" required=\"true\" validType=\"length[1,250]\"  ></textarea></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_theme_edit')\">编辑</a> <a\r\n");
      out.write("\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\thref=\"javascript:void(0)\" onclick=\"closeWin('wind_theme_edit')\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
