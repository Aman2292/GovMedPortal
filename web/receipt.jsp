<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Receipt</title>
        <link href="css/receipt.css" rel="stylesheet" type="text/css"/>
        <script src="https://rawgit.com/eKoopmans/html2pdf/master/dist/html2pdf.bundle.js"></script>
    </head>
    <body>
        <div id="receiptContent">
            <a href="index.html" class="homebutton" id="homeButton">Home</a>
            <h1 class="Userstitle"> <%= request.getAttribute("userFullName") %> Queue Receipt</h1>
            <img src="./Svg/27.jpg" alt="" class="main">

            <h2 class="name" >Name :</h2>
            <h2 class="user-name" id="userFullName"> <%= request.getAttribute("userFullName") %></h2>
            <h2 class="aadharcard">Aadhar card No :</h2>
            <h2 class="user-aadharcard" id="userAadharCardNo"> <%= request.getAttribute("userAadharCardNo") %></h2>
            <h2 class="doctor-name">Doctor's Name :</h2>
            <h2 class="user-doctor-name" id="userDoctorCategory"><%= request.getAttribute("userDoctorCategory") %></h2>
            <h2 class="ward-no">Ward-No :</h2>
            <h2 class="user-ward-no" id="userWardNo"></h2>
            <h2 class="your-queue">Your queue no is </h2>
            <h2 class="user-your-queue" id="yourQueue"></h2>
            <h2 class="floor">Floor </h2>
            <h2 class="user-floor" id="userFloor"></h2>
        </div>
        <button id="downloadButton" onclick="generatePDF()">Download as PDF</button>
        <script>
            // Function to generate a random number within a specified range
            function generateRandomNumber(min, max) {
                return Math.floor(Math.random() * (max - min + 1) + min);
            }
            document.getElementById('userWardNo').innerText = generateRandomNumber(101, 250);
            document.getElementById('userFloor').innerText = generateRandomNumber(1, 8);
            document.getElementById('yourQueue').innerText = generateRandomNumber(1, 100000);
            function generatePDF() {
                document.getElementById('homeButton').style.display = 'none';
                const element = document.getElementById('receiptContent');
                const pdfOptions = {
                    margin: 10,
                    filename: 'receipt.pdf',
                    image: {type: 'jpeg', quality: 0.98},
                    html2canvas: {scale: 2},
                    jsPDF: {unit: 'mm', format: 'a4', orientation: 'landscape'}
                };
                html2pdf(element, pdfOptions).then(() => {
                    document.getElementById('homeButton').style.display = 'inline-block';
                });
            }
        </script>
    </body>
</html>
