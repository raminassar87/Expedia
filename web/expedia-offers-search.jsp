<%-- 
    Document   : expedia-offers-search
    Created on : Aug 1, 2017, 1:14:13 AM
    Author     : Rami Nassar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function validateDate(dateObj) {
                var dateValue = dateObj.value;
                if(dateValue == null || dateValue == "") {
                    return;
                }
                var pattern = /^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
                if (!pattern.test(dateValue)) {
                    alert("Invalid date");
                    dateObj.value = '';
                    dateObj.focus();
                    return;
                }
                
                var minTripStartDate = document.getElementById("minTripStartDate").value;
                var maxTripStartDate = document.getElementById("maxTripStartDate").value;
                
                if(parsDate(minTripStartDate).getTime() > parsDate(maxTripStartDate).getTime()) {
                    alert("Invalid date range.. minTripStartDate greater than maxTripStartDate");
                    
                    document.getElementById("maxTripStartDate").value = '';
                }
            }
            
            function validateNumberValue(obj) {
                if(isNaN(obj.value)) {
                    alert("Invalid Value");
                    obj.value = '';
                    obj.focus();
                }
            }
            function parsDate(dateDate){
                var parts = dateDate.split("-");
                return new Date(parts[0], parts[1] - 1,parts[2]);
             }
             
        </script>
    </head>
    <body>
        <h1>Expedia Offers Search</h1>

        <form name="expediaSearchForm" action="expedia_offers_search" method="post">
            <p>Destination Name : <input type ="text" name="destinationName" /></p>
            <p>Destination City : <input type ="text" name="destinationCity" /></p>
            <p>Region Ids : <input type ="text" name="regionIds" onchange="validateNumberValue(this)" /></p>
            <p>Min Trip Start Date : <input type ="text" name="minTripStartDate" id="minTripStartDate" onchange="validateDate(this)" /> (format :: 2017-05-03)</p>
            <p>Max Trip Start Date : <input type ="text" name="maxTripStartDate" id="maxTripStartDate" onchange="validateDate(this)" /> (format :: 2017-05-03)</p>
            <p>Length Of Stay : <input type ="text" name="lengthOfStay" /></p>
            <p>Min Star Rating : <input type ="text" name="minStarRating" /></p>
            <p>Max Star Rating : <input type ="text" name="maxStarRating" /></p>
            <p>Min Total Rate : <input type ="text" name="minTotalRate" /></p>
            <p>Max Total Rate : <input type ="text" name="maxTotalRate" /></p>
            <p>Max Guest Rating : <input type ="text" name="maxGuestRating" /></p>
            <p>Min Guest Rating : <input type ="text" name="minGuestRating" /></p>
            <p><input type ="submit" name="searchButton" value="Search" /></p>
        </form>
    </body>
</html>