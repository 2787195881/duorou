/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-12 03:59:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.7.RELEASE.jar", Long.valueOf(1496496133691L));
    _jspx_dependants.put("jar:file:/C:/Users/lenovo/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/C:/Users/lenovo/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1496496165329L));
    _jspx_dependants.put("jar:file:/C:/Users/lenovo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/4.1.7.RELEASE/b6b9f604cb2223251cae67fff7ca2b1d9ff1c2d8/spring-webmvc-4.1.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1435628828000L));
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>哆禸文艺</title>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write(" \t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js\"></script> \t\r\n");
      out.write("<link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"http://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"bootstrap/bootstrap-spinner.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap/jquery.spinner.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<script>\r\n");
      out.write("function validateForm(){\r\n");
      out.write("var x=document.forms[\"buyForm\"][\"username\"].value;\r\n");
      out.write("var p=document.forms[\"buyForm\"][\"number\"].value;\r\n");
      out.write("var y=document.forms[\"buyForm\"][\"address\"].value;\r\n");
      out.write("var z=document.forms[\"buyForm\"][\"phone\"].value;\r\n");
      out.write("if (x==null || x==\"\"){\r\n");
      out.write("  alert(\"请先登陆！\");\r\n");
      out.write("  return false;\r\n");
      out.write("  }\r\n");
      out.write("else if(p<1 || p>5){\r\n");
      out.write("\t  alert(\"至少购买1件，最多购买5件\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("  else if(y==null || y==\"\"){\r\n");
      out.write("\t  alert(\"请输入地址！\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("  else if(z==null || z==\"\"){\r\n");
      out.write("\t  alert(\"请输入电话！\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t  <li role=\"presentation\"><a href=\"login\">亲，请先登录</a></li>\r\n");
      out.write("\t\t\t\t\t  <li role=\"presentation\"><a href=\"register\">免费注册</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t  <div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12\">\r\n");
      out.write("\t\t\t<span>欢迎您");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t<div style=\"text-align:center\"><span >原创/复古/文艺</span><span>哆禸文艺</span></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-xs-2 col-ms-3 col-md-3 col-lg-3\"></div>\r\n");
      out.write("<div class=\"col-xs-8 col-ms-6 col-md-6 col-lg-6\">\r\n");
      out.write("\t\t<div style=\"text-align:center; margin-top:30%\">\r\n");
      out.write("\t\t<img alt=\"\" src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    \t\t\t<form id=\"buyForm\" role=\"form\" action=\"buyForm\" onsubmit=\"return validateForm()\"  method=\"post\">\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\t\t\t\r\n");
      out.write("        \t\t\t\t<label>\r\n");
      out.write("        \t\t\t\t<input type=\"text\" name=\"image\" id=\"image\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></label>\r\n");
      out.write("        \t\t\t\t<label>商品名：\r\n");
      out.write("    \t\t\t\t\t<input type=\"text\" name=\"goodsid\" id=\"goodsid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/></label><br>\r\n");
      out.write("        \t\t\t\t<label>商品描述：\r\n");
      out.write("        \t\t\t\t<input type=\"text\" name=\"dipect\" id=\"dipect\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.dipect }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/></label>\r\n");
      out.write("        \t\t\t\t<label>商品库存：<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.amount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/></label><br>\r\n");
      out.write("        \t\t\t\t\r\n");
      out.write("        \t\t<div ng-app=\"\"ng-init=\"price=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" > \r\n");
      out.write("\t\t\t\t \t<label>商品价格 :<input type=\"text\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"price\" id=\"price\" class=\"form-control\"/></label>\r\n");
      out.write("\t\t\t\t \t<label>购买数量：<input type=\"number\"   ng-model=\"number\" name=\"number\" id=\"number\" class=\"form-control\"/></label><br>\r\n");
      out.write("\t\t\t\t \t<label>总价：<input type=\"text\" name=\"totalprice\" id=\"totalprice\" value= \"{{number*price}}\" class=\"form-control\"/></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("  \t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\"  id=\"username\">\r\n");
      out.write("  \t\t\t<br>\r\n");
      out.write("  \t\t\t<label>\r\n");
      out.write("  \t\t\t收货人地址\r\n");
      out.write("  \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"address\" id=\"address\">\r\n");
      out.write("  \t\t\t</label>  \t\t\r\n");
      out.write("  \t\t\t<label>\r\n");
      out.write("  \t\t\t收货人电话\r\n");
      out.write("  \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\">\r\n");
      out.write("  \t\t\t</label>\t\r\n");
      out.write("  \t\t\t<br>\r\n");
      out.write("  \t\t\t\r\n");
      out.write("\t\t<input class=\"btn btn-warning\" type=\"submit\" value=\"提交订单\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<a href=\"duorou\"><button class=\"btn btn-warning\" >取消订单</button></a>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("  \t\r\n");
      out.write("\t\t<div class=\"col-xs-2 col-ms-3 col-md-3 col-lg-3\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
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