package org.apache.jsp.WEB_002dINF.admin.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tool_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<li><span>数据库管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('数据库备份','admin/tools/db_bak')\">数据库备份</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('数据库还原','admin/tools/db_res')\">数据库还原</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>文章管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('文章分类','admin/articlecategory/index')\">文章分类</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('文章列表','admin/article/index')\">文章列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>帮助管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('帮助分类','admin/helpcategory/index')\">帮助分类</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('帮助列表','admin/help/index')\">帮助列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>广告管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('广告位列表','admin/adposition/index')\">广告位列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('广告列表','admin/admanage/index')\">广告列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>公告管理</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('公告列表','admin/announcement/list')\">公告列表</a></li>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('公告发布','admin/announcement/add')\">公告发布</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li><span>网站地图</span>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a\r\n");
      out.write("\t\t\t\thref=\"javascript:tab('网站搜索地图','admin/tools/seositemaps')\">网站搜索地图</a></li>\r\n");
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
