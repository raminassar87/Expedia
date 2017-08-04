<%-- 
    Document   : offer-search-result
    Created on : Aug 1, 2017, 1:14:42 AM
    Author     : Rami Nassar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
            <c:choose>
              <c:when test="${empty requestScope.expediaOffers or empty requestScope.expediaOffers.offers.hotel}">
                <h1>No result found for your search criteria !!! </h1>
              </c:when>
              <c:when test="${not empty requestScope.expediaOffers and not empty requestScope.expediaOffers.offers.hotel}">
                <h1>Expedia Offers!</h1>
              </c:when>
            </c:choose>
           
        <table border="1">
            <th>Hotel Name</th>
            <th>Region ID </th>
            <th>Des long Name</th>
            <th>City</th>
            <th>Travel Start</th>
            <th>Total Base Rate</th>
            <th>Guest Review Rating</th>
            <th>Star Rating</th>
            <th>Length Of Stay</th>
            <th>Image</th>
            
            <c:forEach items="${requestScope.expediaOffers.offers.hotel}" var="hotel" >
                <tr>
                    <td><c:out value="${hotel.hotelInfo.hotelName}"/></td>
                    <td><c:out value="${hotel.destination.regionID}"/></td>
                    <td><c:out value="${hotel.destination.longName}"/></td>
                    <td><c:out value="${hotel.destination.city}"/></td>
                    <td><c:out value="${hotel.hotelInfo.travelStartDate}"/></td>
                    <td><c:out value="${hotel.hotelPricingInfo.hotelTotalBaseRate}"/></td>
                    <td><c:out value="${hotel.hotelInfo.hotelGuestReviewRating}"/></td>
                    <td><c:out value="${hotel.hotelInfo.hotelStarRating}"/></td>
                    <td><c:out value="${hotel.offerDateRange.lengthOfStay}"/></td>
                    <td><img src='<c:out value="${hotel.hotelInfo.hotelImageUrl}"/>' /></td>
                </tr>
            </c:forEach>
                
        </table>
    </body>
</html>
