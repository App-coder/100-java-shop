package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"resource/admin/js/goods.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div class=\"hidden\" >\r\n");
      out.write("\t<div id=\"goods_add\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write(" style=\"width:600px;\" title=\"添加商品\">  \r\n");
      out.write("\t\t<div region=\"center\"  border=\"false\" >\r\n");
      out.write("\t\t\t<form id=\"form_goods_add\" method=\"post\" >\r\n");
      out.write("\t\t\t\t<div class=\"easyui-tabs\"  border=\"false\" style=\"height:350px;\"  >\r\n");
      out.write("\t\t\t\t\t<div title=\"商品信息\" class=\"p10\" >\r\n");
      out.write("\t\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">商店名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" />* <a href=\"#\" class=\"easyui-linkbutton\" >添加关键词</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">商店货号：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" />*</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">所属分类：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" />*</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">商店模型：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" />*</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">商店标签：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\"/>最新商品&nbsp;&nbsp;<input type=\"checkbox\"/>特价商品&nbsp;&nbsp;<input type=\"checkbox\"/>推荐商品&nbsp;&nbsp;<input type=\"checkbox\"/>热卖排行</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">商品品牌：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">是否上架：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"radio\" />是&nbsp;&nbsp;<input type=\"radio\" />否</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">销售价格：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">市场价格：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">库存：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">重量：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">积分：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">排序：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">计量单位：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">经验值：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">产品相册：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">规格：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">扩展属性：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"描述\" class=\"p10\" >\r\n");
      out.write("\t\t\t\t\t<iframe src=\"admin/goods/content\" frameborder=\"0\"  width=\"99%\" height=\"250\"  ></iframe>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"营销选项\" class=\"p10\" >\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">SEO关键词：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" name=\"name\" required=\"true\" validType=\"length[1,50]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">SEO描述：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea validtype=\"length[1,250]\" required=\"true\" cols=\"50\" class=\"textborder\" name=\"description\" rows=\"3\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_goods_add')\">保存商品</a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('goods_add')\">取消</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write(" \t</div>  \r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"goods_list\" ></table>\r\n");
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
