package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/category.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div class=\"hidden\" >\r\n");
      out.write("<div id=\"category_add\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write(" style=\"width:500px;\" title=\"添加分类\">\r\n");
      out.write("<div region=\"center\"  border=\"false\"  class=\"p10\"  >\r\n");
      out.write("<form id=\"form_category_add\" method=\"post\">\r\n");
      out.write("<table class=\"tab_form\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">分类名称：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">上级分类：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">商品模型：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">是否首页显示：</td>\r\n");
      out.write("\t\t<td><input type=\"radio\" >是&nbsp;&nbsp;<input type=\"radio\" >否</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">排序：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">SEO标题：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">SEO关键词：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">SEO描述：</td>\r\n");
      out.write("\t\t<td><textarea class=\"textborder\"></textarea></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_goods_add')\">保存分类</a> <a\r\n");
      out.write("\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('goods_add')\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"category_list\" ></table>\r\n");
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
