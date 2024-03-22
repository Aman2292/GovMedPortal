<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Receipt</title>
    <link rel="stylesheet" href="./ambulancereceipt.css">
    <link href="css/ambulancereceipt.css" rel="stylesheet" type="text/css"/>
    <script src="https://rawgit.com/eKoopmans/html2pdf/master/dist/html2pdf.bundle.js"></script>
</head>
<body>
    <div id="receiptContent">
        <a href="./" class="homebutton" id="homeButton">Home</a>
       <h1 class="Userstitle" id="userFullNameReceipt"><%= request.getAttribute("userFullName") %> 's Ambulance Receipt</h1>
        <img src="./Svg/26.jpg" alt=""  class="main">

        <h2 class="name">Name :</h2>
        <h2 class="user-name" id="userFullName"><%= request.getAttribute("userFullName") %></h2>
        <h2 class="Address">Address :</h2>
        <h2 class="user-Address" id="userAddress"><%= request.getAttribute("userAddress") %></h2>
        <h2 class="Time">Time: </h2>
        <h2 class="user-Time" id="userTime"><%= request.getAttribute("userTime") %></h2>
        
    </div>

    <button id="downloadButton" onclick="generatePDF()">Download as PDF</button>

    <script>
        function generatePDF() {
            document.getElementById('homeButton').style.display = 'none';
            const element = document.getElementById('receiptContent');
            const pdfOptions = {
                margin: 10,
                filename: 'AmbulanceReceipt.pdf',
                image: { type: 'jpeg', quality: 0.98 },
                html2canvas: { scale: 2 },
                jsPDF: { unit: 'mm', format: 'a4', orientation: 'landscape' }
            };
            html2pdf(element, pdfOptions).then(() => {
                document.getElementById('homeButton').style.display = 'inline-block';
            });
        }
    </script>

</body>

</html>