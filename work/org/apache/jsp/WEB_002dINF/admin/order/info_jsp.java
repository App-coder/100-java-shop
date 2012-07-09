package org.apache.jsp.WEB_002dINF.admin.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin/order/../common/config.jsp");
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
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/order/info.js\"></script>\r\n");
      out.write("<div id=\"layout_order_info\" class=\"easyui-layout\" fit=\"true\" >  \r\n");
      out.write("<div region=\"center\"  border=\"false\" class=\"pt_10\">\r\n");
      out.write("<div class=\"easyui-tabs\" fit=\"true\">\r\n");
      out.write("\t<div title=\"基本信息\" class=\"p10\">\r\n");
      out.write("\t\t<table id=\"order_info_goods\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"商品\" class=\"p10\">\r\n");
      out.write("\t\t<table id=\"order_info_goods_1\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"收退款记录\" class=\"p10\">dsds</div>\r\n");
      out.write("\t<div title=\"收发货记录\" class=\"p10\"></div>\r\n");
      out.write("\t<div title=\"优惠方案\" class=\"p10\"></div>\r\n");
      out.write("\t<div title=\"订单备注\" class=\"p10\"></div>\r\n");
      out.write("\t<div title=\"订单附言\" class=\"p10\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\thref=\"javascript:void(0)\" onclick=\"config_guide()\">编辑</a> <a\r\n");
      out.write("\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\thref=\"javascript:void(0)\" onclick=\"closeWin('config_guide')\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>  \r\n");
      out.write("\r\n");
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
