/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-10 11:55:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alteritem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/lenovo/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1496496165329L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <title>修改商品信息</title>\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write(" \t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t <div class=\"row\">\r\n");
      out.write("\t  <div class=\"clearfix\" style=\"margin-bottom: 20px;\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-4 col-ms-4 col-md-4 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<hr> \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\"col-xs-4 col-ms-4 col-md-4 col-lg-4\" style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t\t <span >原创/复古/文艺</span><span>哆禸文艺</span>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\"col-xs-4 col-ms-4 col-md-4 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t <hr> \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\" style=\"margin-bottom: 40px;\"></div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  \t <div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\"></div> \r\n");
      out.write("\t\t <div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\" style=\"border:1px solid #666\"> \r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t<form role=\"form\" method=\"post\" action=\"alterForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >商品名称</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"goodsid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.goodsid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >商品描述</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"dipect\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.dipect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >商品价格</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >商品库存</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.amount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >商品类别</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"typeid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.typeid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >商品图片</label>\r\n");
      out.write("\t\t    <input type=\"image\" style=\"width:100px;height:100px;\"  src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t     <label>更改图片</label>\r\n");
      out.write("\t\t    <input type=\"file\" name=\"file\" >\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    <label >图片名称</label>\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"image\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t      <button type=\"submit\" style=\"float:right\" class=\"btn btn-success\">确认更改</button>\r\n");
      out.write("\t\t      <a href=\"manage\" ><button style=\"float:left\" class=\"btn btn-danger\" type=\"button\" >取消更改</button></a>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\"></div>\t \r\n");
      out.write("\t\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t</div>    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
