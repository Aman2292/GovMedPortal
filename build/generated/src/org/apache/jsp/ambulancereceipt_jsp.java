package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ambulancereceipt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Receipt</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./ambulancereceipt.css\">\n");
      out.write("    <link href=\"css/ambulancereceipt.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"https://rawgit.com/eKoopmans/html2pdf/master/dist/html2pdf.bundle.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"receiptContent\">\n");
      out.write("        <a href=\"./\" class=\"homebutton\" id=\"homeButton\">Home</a>\n");
      out.write("        <h1 class=\"Userstitle\" id=\"userFullName\">");
      out.print( request.getAttribute("userFullName") );
      out.write(" 's Ambulance Receipt</h1>\n");
      out.write("        <img src=\"./Svg/26.jpg\" alt=\"\" class=\"main\">\n");
      out.write("\n");
      out.write("        <h2 class=\"name\">Name :</h2>\n");
      out.write("        <h2 class=\"user-name\" id=\"userFullName\">");
      out.print( request.getAttribute("userFullName") );
      out.write("</h2>\n");
      out.write("        <h2 class=\"Address\">Address :</h2>\n");
      out.write("        <h2 class=\"user-Address\" id=\"userAddress\">");
      out.print( request.getAttribute("userAddresss") );
      out.write("</h2>\n");
      out.write("        <h2 class=\"Time\">Time: </h2>\n");
      out.write("        <h2 class=\"user-Time\" id=\"userTime\">");
      out.print( request.getAttribute("userTime") );
      out.write("</h2>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <button id=\"downloadButton\" onclick=\"generatePDF()\">Download as PDF</button>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function generatePDF() {\n");
      out.write("            document.getElementById('homeButton').style.display = 'none';\n");
      out.write("            const element = document.getElementById('receiptContent');\n");
      out.write("            const pdfOptions = {\n");
      out.write("                margin: 10,\n");
      out.write("                filename: 'AmbulanceReceipt.pdf',\n");
      out.write("                image: { type: 'jpeg', quality: 0.98 },\n");
      out.write("                html2canvas: { scale: 2 },\n");
      out.write("                jsPDF: { unit: 'mm', format: 'a4', orientation: 'landscape' }\n");
      out.write("            };\n");
      out.write("            html2pdf(element, pdfOptions).then(() => {\n");
      out.write("                document.getElementById('homeButton').style.display = 'inline-block';\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
