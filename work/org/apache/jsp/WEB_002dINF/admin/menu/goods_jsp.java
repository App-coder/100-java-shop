package org.apache.jsp.WEB_002dINF.admin.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<ul class=\"easyui-tree\" animate=\"true\" lines=\"true\" >\r\n");
      out.write("\r\n");
      out.write("\t<li><span>商品管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/goods/index\">商品列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/goods/add\">商品添加</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<li><span>商品分类</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/category/index\">分类列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/category/add\">添加分类</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>品牌</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/brandcategory/index\">品牌分类</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/brand/index\">品牌列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>模型</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/model/index\">模型列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/spec/index\">规格列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/specphoto/index\">规格图库</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>热门搜索</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/keyword/index\">关键词列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"admin/search/index\">搜索统计</a></li>\r\n");
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
