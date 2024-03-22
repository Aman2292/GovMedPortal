package AmbulaceBooking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
public class AmbulServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String phoneNo = request.getParameter("phoneNo");
        String address = request.getParameter("address");
        String time = request.getParameter("time");
        boolean urgent = request.getParameter("urgent") != null;
        RequestDispatcher dispatcher = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/govmedportal", "root", "Amanch1ur1siy1"); 
            PreparedStatement pst = con.prepareStatement("INSERT INTO ambulance_booking(fullname, phoneno, address, time, urgent) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, fullName);
            pst.setString(2, phoneNo);
            pst.setString(3, address);
            pst.setString(4, time);
            pst.setBoolean(5, urgent);
            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                PreparedStatement fetchStmt = con.prepareStatement("SELECT fullname, address, time FROM ambulance_booking WHERE fullname = ?");
                fetchStmt.setString(1, fullName);
                ResultSet resultSet = fetchStmt.executeQuery();

                if (resultSet.next()) {
                    request.setAttribute("userFullName", resultSet.getString("fullname"));
                    request.setAttribute("userAddress", resultSet.getString("address"));
                    request.setAttribute("userTime", resultSet.getString("time"));

                    dispatcher = request.getRequestDispatcher("ambulancereceipt.jsp");
                    dispatcher.forward(request, response);
                } else {
                    request.setAttribute("status", "failed");
                    dispatcher = request.getRequestDispatcher("index.html");
                    dispatcher.forward(request, response);
                }
            } else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("index.html");
                dispatcher.forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AmbulServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AmbulServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
