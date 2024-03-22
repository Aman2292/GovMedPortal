package Booking;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SlotBookingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String phoneNo = request.getParameter("phoneNo");
        String email = request.getParameter("email");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String aadharCardNo = request.getParameter("aadharCardNo");
        String dob = request.getParameter("dob");
        String doctorCategory = request.getParameter("doctorCategory");
        String symptoms = request.getParameter("symptoms");

        RequestDispatcher dispatcher = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/govmedportal", "root", "Amanch1ur1siy1");
            PreparedStatement pst = con.prepareStatement("INSERT INTO slotbooking(fullName, phoneNo, email, age, address, aadharCardNo, dob, doctorCategory, symptoms) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, fullName);
            pst.setString(2, phoneNo);
            pst.setString(3, email);
            pst.setInt(4, age);
            pst.setString(5, address);
            pst.setString(6, aadharCardNo);
            pst.setString(7, dob);
            pst.setString(8, doctorCategory);
            pst.setString(9, symptoms);
            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                // Fetch user details from the database
                PreparedStatement fetchStmt = con.prepareStatement("SELECT fullName, aadharCardNo, doctorCategory FROM slotbooking WHERE fullName = ?");
                fetchStmt.setString(1, fullName);
                ResultSet resultSet = fetchStmt.executeQuery();

                if (resultSet.next()) {
                    // Set attributes to be forwarded to the receipt page
                    request.setAttribute("userFullName", resultSet.getString("fullName"));
                    request.setAttribute("userAadharCardNo", resultSet.getString("aadharCardNo"));
                    request.setAttribute("userDoctorCategory", resultSet.getString("doctorCategory"));

                    dispatcher = request.getRequestDispatcher("receipt.jsp"); 
                    // Change to your receipt page
                    dispatcher.forward(request, response);
                } else {
                    // Handle the case where user details are not found
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
            Logger.getLogger(SlotBookingServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SlotBookingServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
