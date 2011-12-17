package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myhomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/myhomepage.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<table style=\"width:100%;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"50%\" valign=\"top\">\r\n");
      out.write("\t\t<table class=\" tb_list\" fit=\"true\" style=\"border:1px solid #AED0EA;border-collapse: collapse;\" >\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-header\" style=\"border:none;\" ><div class=\"panel-title\">概况</div></div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"lefttd\">销售总额</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grossSales}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("元</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"lefttd\">今年销售总额</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yearGrossSales}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("元</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"lefttd\">客户</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countOfCustomer}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"lefttd\">产品</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countOfProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"lefttd\">咨询</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"righttd\" >总共：<a class=\"a\" href=\"javascript:tab('咨询管理','admin/refer/index');\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countOfRefer}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a>个&nbsp;&nbsp;未处理：<a class=\"a\" href=\"javascript:tab('咨询管理','admin/refer/index');\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countOfNotDealRefer}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"lefttd\">评论</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"righttd\" >总共：<a class=\"a\" href=\"javascript:tab('评价管理','admin/comment/index');\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countOfCommentAll}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a>个&nbsp;&nbsp;未处理：<a class=\"a\" href=\"javascript:tab('评价管理','admin/comment/index');\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countOfNotDealComment}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td width=\"50%\" valign=\"top\">\r\n");
      out.write("\t\t<table class=\" tb_list\" style=\"border:1px solid #AED0EA;border-collapse: collapse;\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-header\" style=\"border:none;\" ><div class=\"panel-title\">订单信息</div></div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t<tr><td class=\"lefttd\">总订单</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderAll}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lefttd\">新订单</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lefttd\">未付款订单</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderNotPay}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lefttd\">未发货订单</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderHasDistr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lefttd\">七天未确认订单</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderHasConfirm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lefttd\">完成订单</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"righttd\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderHasFinish}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("个</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\t\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<table id=\"orderlist\" title=\"最新10条订单\" fit=\"true\"></table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>");
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
