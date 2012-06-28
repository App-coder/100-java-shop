package org.apache.jsp.WEB_002dINF.admin.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class express_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin/config/../common/config.jsp");
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
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/config/express.js\"></script>\r\n");
      out.write("<form method=\"get\" id=\"form_config_express\" url=\"admin/config/config_express_do\" >\r\n");
      out.write("<table class=\"tab_form\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">快递跟踪ID：</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"express_key\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${express_key }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\">开启：</td>\r\n");
      out.write("\t\t<td><input type=\"radio\" name=\"express_open\" value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${express_open eq 0?\"checked='checked'\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("  />开启&nbsp;&nbsp;<input type=\"radio\" name=\"express_open\"  value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${express_open eq 1?\"checked='checked'\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" />关闭</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>查询数据由：KuaiDi100.Com （快递100） 网站提供，请到快递100前去申请ID！</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"javascript:formsubmit('form_config_express')\" class=\"easyui-linkbutton\" >保存</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\t\r\n");
      out.write("\t");
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
