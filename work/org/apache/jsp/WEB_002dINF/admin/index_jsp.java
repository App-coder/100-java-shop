package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/c.tld");
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

      out.write('\n');
      out.write('\n');

String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 

      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${system_config['url']}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webtitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</title>\n");
      out.write("<script type=\"text/javascript\" src=\"resource/easyui/jquery-1.7.2.min.js\"></script>\n");
      out.write("<link href=\"resource/admin/login/css/login.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("function fleshVerify(){ \n");
      out.write("\t$('#verifyImg').attr('src', '/kaptcha.jpg?' + Math.floor(Math.random()*100) ); \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"login\">\n");
      out.write("    <div id=\"login_content\">\n");
      out.write("    <div class=\"loginForm\">\n");
      out.write("            \t<form method=\"post\" action=\"admin/webmaster/login\" >\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"user_name\" autocomplete=\"false\" size=\"20\" class=\"login_input\" />\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" autocomplete=\"false\" size=\"20\" class=\"login_input\" />\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"verify\"  autocomplete=\"false\" size=\"20\" class=\"login_input\" />\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<div class=\"login_bar\" >\n");
      out.write("\t\t\t\t\t<img src=\"kaptcha.jpg\" id=\"verifyImg\" onclick=\"fleshVerify()\" title=\"看不清楚，换一张！\" width=\"70\" style=\"margin-top:-10px;float:left;cursor: pointer; \"/>\n");
      out.write("\t\t\t\t\t<input class=\"login_btn sub\" type=\"submit\" name=\"form_submit\" style=\"margin-top:-10px;\"  value=\" \" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
