import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GenerateReportServlet")
public class GenerateReportServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String phoneNo = request.getParameter("phone-no");

        // Validate form data
        if (!isValidName(name) || !isValidPhoneNumber(phoneNo)) {
            // Respond with an error message if validation fails
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Error: Invalid input. Please check your data and try again.</h2>");
            out.println("</body></html>");
            return;
        }

        // Generate the report (you would implement your logic here)
        String report = "This is the generated report for " + name;

        // Send the report to WhatsApp (you would implement your logic here)
        sendReportToWhatsApp(phoneNo, report);

        // Respond to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Report sent to WhatsApp successfully!</h2>");
        out.println("</body></html>");
    }

    private boolean isValidName(String name) {
        // Use regex to validate the name (only allow alphabets and spaces)
        return name != null && name.matches("^[a-zA-Z ]+$");
    }

    private boolean isValidPhoneNumber(String phoneNo) {
        // Use regex to validate the phone number (only allow digits and optional hyphens)
        return phoneNo != null && phoneNo.matches("^[0-9-]+$");
    }

    private void sendReportToWhatsApp(String phoneNo, String report) {
        // Implement your logic to send the report to WhatsApp here
        // You may use a third-party API or library to send messages to WhatsApp
        // Example: Twilio, Nexmo, etc.
    }
}
