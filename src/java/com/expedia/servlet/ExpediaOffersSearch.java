/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.servlet;

import com.expedia.beans.ExpediaOffer;
import com.expedia.beans.ExpediaOfferSearchBean;
import com.expedia.utils.Utils;
import com.expedia.ws.ExpediaClient;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Expedia Offers Search Servlet
 * 
 * @author Rami Nassar
 */
public class ExpediaOffersSearch extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ExpediaClient client = new ExpediaClient();
        ExpediaOfferSearchBean expediaOfferSearchBean = new ExpediaOfferSearchBean();
        
        String destinationName = request.getParameter("destinationName");
        String destinationCity = request.getParameter("destinationCity");
        String regionIds = request.getParameter("regionIds");
        String minTripStartDate = request.getParameter("minTripStartDate");
        String maxTripStartDate = request.getParameter("maxTripStartDate");
        String lengthOfStay = request.getParameter("lengthOfStay");
        String minStarRating = request.getParameter("minStarRating");
        String maxStarRating = request.getParameter("maxStarRating");
        String minTotalRate = request.getParameter("minTotalRate");
        String maxTotalRate = request.getParameter("maxTotalRate");
        String minGuestRating = request.getParameter("minGuestRating");
        String maxGuestRating = request.getParameter("maxGuestRating");
        
        if(!Utils.isBlankOrNull(destinationName)) {
            expediaOfferSearchBean.setDestinationName(destinationName);
        }
        if(!Utils.isBlankOrNull(destinationCity)) {
            expediaOfferSearchBean.setDestinationCity(destinationCity);
        }
        if(!Utils.isBlankOrNull(regionIds)) {
            expediaOfferSearchBean.setRegionIds(Long.parseLong(regionIds.trim()));
        }
        if(!Utils.isBlankOrNull(minTripStartDate)) {
            expediaOfferSearchBean.setMinTripStartDate(minTripStartDate);
        }
        if(!Utils.isBlankOrNull(maxTripStartDate)) {
            expediaOfferSearchBean.setMaxTripStartDate(maxTripStartDate);
        }
        if(!Utils.isBlankOrNull(lengthOfStay)) {
            expediaOfferSearchBean.setLengthOfStay(lengthOfStay);
        }
        if(!Utils.isBlankOrNull(minStarRating)) {
            expediaOfferSearchBean.setMinStarRating(minStarRating);
        }
        if(!Utils.isBlankOrNull(maxStarRating)) {
            expediaOfferSearchBean.setMaxStarRating(maxStarRating);
        }
        if(!Utils.isBlankOrNull(minTotalRate)) {
            expediaOfferSearchBean.setMinTotalRate(minTotalRate);
        }
        if(!Utils.isBlankOrNull(maxTotalRate)) {
            expediaOfferSearchBean.setMaxTotalRate(maxTotalRate);
        }
        if(!Utils.isBlankOrNull(minGuestRating)) {
            expediaOfferSearchBean.setMinGuestRating(minGuestRating);
        }
        if(!Utils.isBlankOrNull(maxGuestRating)) {
            expediaOfferSearchBean.setMaxGuestRating(maxGuestRating);
        }
        
        // Fetch Offers..
        ExpediaOffer expediaOffers = client.fetchOffers(expediaOfferSearchBean);
        
        request.setAttribute("expediaOffers", expediaOffers);
        
        // Dispatch Request to view results..
        String location = "/offer-search-result.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(location);
        dispatcher.forward(request,response);
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Expedia Offers Search Servlet used to call Client Expedia and fetch the offers based on search criteria";
    }// </editor-fold>
}