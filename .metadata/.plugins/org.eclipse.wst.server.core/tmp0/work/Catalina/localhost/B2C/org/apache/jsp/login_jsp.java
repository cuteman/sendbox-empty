/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-01-09 14:30:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=BIG5");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=BIG5\">\r\n");
      out.write("<title>Center</title>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("   \r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  // This is called with the results from from FB.getLoginStatus().\r\n");
      out.write("  function statusChangeCallback(response) {\r\n");
      out.write("    console.log('statusChangeCallback');\r\n");
      out.write("    console.log(response);\r\n");
      out.write("    // The response object is returned with a status field that lets the\r\n");
      out.write("    // app know the current login status of the person.\r\n");
      out.write("    // Full docs on the response object can be found in the documentation\r\n");
      out.write("    // for FB.getLoginStatus().\r\n");
      out.write("    if (response.status === 'connected') {\r\n");
      out.write("      // Logged into your app and Facebook.\r\n");
      out.write("  //    testAPI();\r\n");
      out.write("    } else if (response.status === 'not_authorized') {\r\n");
      out.write("    \t // The person is logged into Facebook, but not your app.\r\n");
      out.write("        document.getElementById('status').innerHTML = 'Please log ' +\r\n");
      out.write("          'into this app.';\r\n");
      out.write("      } else {\r\n");
      out.write("        // The person is not logged into Facebook, so we're not sure if\r\n");
      out.write("        // they are logged into this app or not.\r\n");
      out.write("        document.getElementById('status').innerHTML = 'Please log ' +\r\n");
      out.write("          'into Facebook.';\r\n");
      out.write("      }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // This function is called when someone finishes with the Login\r\n");
      out.write("  // Button.  See the onlogin handler attached to it in the sample\r\n");
      out.write("  // code below.\r\n");
      out.write("  function checkLoginState() {\r\n");
      out.write("    FB.getLoginStatus(function(response) {\r\n");
      out.write("      statusChangeCallback(response);\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  window.fbAsyncInit = function() {\r\n");
      out.write("  FB.init({\r\n");
      out.write("    appId      : '1509906789309326',\r\n");
      out.write("    cookie     : true,  // enable cookies to allow the server to access \r\n");
      out.write("                        // the session\r\n");
      out.write("    xfbml      : true,  // parse social plugins on this page\r\n");
      out.write("    version    : 'v2.2' // use version 2.2\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  // Now that we've initialized the JavaScript SDK, we call \r\n");
      out.write("  // FB.getLoginStatus().  This function gets the state of the\r\n");
      out.write("  // person visiting this page and can return one of three states to\r\n");
      out.write("  // the callback you provide.  They can be:\r\n");
      out.write("  //\r\n");
      out.write("  // 1. Logged into your app ('connected')\r\n");
      out.write("  // 2. Logged into Facebook, but not your app ('not_authorized')\r\n");
      out.write("  // 3. Not logged into Facebook and can't tell if they are logged into\r\n");
      out.write("  //    your app or not.\r\n");
      out.write("  //\r\n");
      out.write("  // These three cases are handled in the callback function.\r\n");
      out.write("\r\n");
      out.write("  FB.getLoginStatus(function(response) {\r\n");
      out.write("    statusChangeCallback(response);\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  };\r\n");
      out.write("\r\n");
      out.write("  // Load the SDK asynchronously\r\n");
      out.write("  (function(d, s, id) {\r\n");
      out.write("    var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("    if (d.getElementById(id)) return;\r\n");
      out.write("    js = d.createElement(s); js.id = id;\r\n");
      out.write("    js.src = \"//connect.facebook.net/en_US/sdk.js\";\r\n");
      out.write("    fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("  }(document, 'script', 'facebook-jssdk'));\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  // Here we run a very simple test of the Graph API after login is\r\n");
      out.write("  // successful.  See statusChangeCallback() for when this call is made.\r\n");
      out.write("  function testAPI() {\r\n");
      out.write("    console.log('Welcome!  Fetching your information.... ');\r\n");
      out.write("    FB.api('/me', function(response) {\r\n");
      out.write("     // console.log('Successful login for: ' + response.name);\r\n");
      out.write("    //  document.getElementById('status').innerHTML =\r\n");
      out.write("     //   'Thanks for logging in, ' + response.name + '!';\r\n");
      out.write("     \r\n");
      out.write("      fblogin(response.id,response.name);\r\n");
      out.write("   \r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  function fblogin(uid, cname) {\r\n");
      out.write("\t \r\n");
      out.write("\r\n");
      out.write("\t\talert(\"uid:\" + uid+\"cname:\"+cname);\r\n");
      out.write("\t\t document.getElementById('account').value = uid;\r\n");
      out.write("\t\t document.getElementById('password').value = cname;\r\n");
      out.write("\t\t document.getElementById('form1').submit();\r\n");
      out.write("      \r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<style type = \"text/css\">\r\n");
      out.write("\r\n");
      out.write(".white{\r\n");
      out.write("    color:#000;\r\n");
      out.write("    background-color:#fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-facebook {\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    -webkit-text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    background-color: #2b4b90;\r\n");
      out.write("    *background-color: #133783;\r\n");
      out.write("    background-image: -moz-linear-gradient(top, #3b5998, #133783);\r\n");
      out.write("    background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#3b5998), to(#133783));\r\n");
      out.write("    background-image: -webkit-linear-gradient(top, #3b5998, #133783);\r\n");
      out.write("    background-image: -o-linear-gradient(top, #3b5998, #133783);\r\n");
      out.write("    background-image: linear-gradient(to bottom, #3b5998, #133783);\r\n");
      out.write("    background-repeat: repeat-x;\r\n");
      out.write("    border-color: #133783 #133783 #091b40;\r\n");
      out.write("    border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);\r\n");
      out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff3b5998', endColorstr='#ff133783', GradientType=0);\r\n");
      out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    .btn-facebook:hover,\r\n");
      out.write("    .btn-facebook:focus,\r\n");
      out.write("    .btn-facebook:active,\r\n");
      out.write("    .btn-facebook.active,\r\n");
      out.write("    .btn-facebook.disabled,\r\n");
      out.write("    .btn-facebook[disabled] {\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        background-color: #133783 !important;\r\n");
      out.write("        *background-color: #102e6d !important;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-facebook:active,\r\n");
      out.write("    .btn-facebook.active {\r\n");
      out.write("        background-color: #0d2456 \\9 !important;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("<div class=\"status\" id = \"status\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    \t<div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("    \t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t  \t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t    \t<h3 class=\"panel-title\">TEST WebSide</h3>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t    \t<form id = \"form1\" accept-charset=\"UTF-8\" role=\"form\"  method=\"POST\" action=\"user/login\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("\t\t\t    \t  \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t    <input id = acc class=\"form-control\" placeholder=\"acc\" name=\"acc\" type=\"text\">\r\n");
      out.write("\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t    \t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t<input id =pwd class=\"form-control\" placeholder=\"pwd\" name=\"pwd\" type=\"password\" value=\"\">\r\n");
      out.write("\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t    \t    \t<label>\r\n");
      out.write("\t\t\t    \t    \t\t<input name=\"remember\" type=\"checkbox\" value=\"Remember Me\"> Remember Me\r\n");
      out.write("\t\t\t    \t    \t</label>\r\n");
      out.write("\t\t\t    \t    </div>\r\n");
      out.write("\t\t\t    \t\t<input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Login\">\r\n");
      out.write("\t\t\t    \t</fieldset>\r\n");
      out.write("\t\t\t      \t</form>\r\n");
      out.write("                      <hr/>\r\n");
      out.write("                 \r\n");
      out.write("\t\t\t\t<!-- <input class=\"btn btn-lg btn-facebook btn-block\" type=\"submit\" value=\"Login via facebook\" onClick =\"checkLoginState()\" >  -->\t \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("<fb:login-button scope=\"public_profile,email\" onlogin=\"checkLoginState();\">\r\n");
      out.write("</fb:login-button>\r\n");
      out.write("\r\n");
      out.write("<div id=\"status\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  <input class=\"btn btn-lg btn-facebook btn-block\" type=\"submit\" value=\"Login via facebook\"  >\r\n");
      out.write(" -->\r\n");
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
