package org.apache.jsp.WEB_002dINF.admin.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class system_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write("\r\n");
      out.write("<ul class=\"easyui-tree\" animate=\"true\" lines=\"true\">\r\n");
      out.write("\t<li><span>后台首页</span>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('我的主页','admin/webmaster/myhomepage');\">后台首页</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>网站管理</span>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('网站设置','admin/config/index')\">网站设置</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('主题设置','admin/theme/index')\">主题设置</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>支付管理</span>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('支付方式','admin/payment/index')\">支付方式</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>多平台登入</span>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('平台列表','admin/oauth/index')\">平台列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>配送管理</span>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('配送方式','admin/delivery/index')\">配送方式</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('地区管理','admin/areas/index')\">地区管理</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('物流公司','admin/freightcompany/index')\">物流公司</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('快递跟踪','admin/config/express')\">快递跟踪</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>权限管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"javascript:tab('管理员','admin/admin/index')\">管理员</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('角色','admin/adminrole/index')\">角色</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('权限资源','admin/right/index')\">权限资源</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>系统升级</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"http://www.100-china.com/index.php/javashop/upgrade\">系统升级</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("</ul>");
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
