/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.ws;

import com.expedia.beans.ExpediaOffer;
import com.expedia.beans.ExpediaOfferSearchBean;
import com.expedia.utils.ExpediaWebserviceException;
import com.expedia.utils.Utils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
/**
 * Expedia Client
 *
 * @author Rami Nassar
 */
public class ExpediaClient {

    /**
     * Fetch Expedia Hotels Offers
     *
     * @return Expedia Offer Bean
     */
    public static ExpediaOffer fetchOffers(ExpediaOfferSearchBean expediaOfferSearchBean) {
        
        try {
            Client client = ClientBuilder.newClient();
            WebTarget myResource
                    = client.target("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel");

            if (expediaOfferSearchBean != null) {
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getDestinationName())) {
                    myResource = myResource.queryParam("destinationName", expediaOfferSearchBean.getDestinationName());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getDestinationCity())) {
                    myResource = myResource.queryParam("destinationCity", expediaOfferSearchBean.getDestinationCity());
                }
                if (expediaOfferSearchBean.getRegionIds() != null) {
                    myResource = myResource.queryParam("regionIds", expediaOfferSearchBean.getRegionIds());
                }
                if (expediaOfferSearchBean.getMinTripStartDate() != null) {
                    myResource = myResource.queryParam("minTripStartDate", expediaOfferSearchBean.getMinTripStartDate());
                }
                if (expediaOfferSearchBean.getMaxTripStartDate() != null) {
                    myResource = myResource.queryParam("maxTripStartDate", expediaOfferSearchBean.getMaxTripStartDate());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getLengthOfStay())) {
                    myResource = myResource.queryParam("lengthOfStay", expediaOfferSearchBean.getLengthOfStay());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getMinStarRating())) {
                    myResource = myResource.queryParam("minStarRating", expediaOfferSearchBean.getMinStarRating());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getMaxStarRating())) {
                    myResource = myResource.queryParam("maxStarRating", expediaOfferSearchBean.getMaxStarRating());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getMaxTotalRate())) {
                    myResource = myResource.queryParam("maxTotalRate", expediaOfferSearchBean.getMaxTotalRate());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getMinTotalRate())) {
                    myResource = myResource.queryParam("minTotalRate", expediaOfferSearchBean.getMinTotalRate());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getMaxGuestRating())) {
                    myResource = myResource.queryParam("maxGuestRating", expediaOfferSearchBean.getMaxGuestRating());
                }
                if (!Utils.isBlankOrNull(expediaOfferSearchBean.getMinGuestRating())) {
                    myResource = myResource.queryParam("minGuestRating", expediaOfferSearchBean.getMinGuestRating());
                }
            }
            
            // Create Request for back End..
            Invocation.Builder builder = myResource.request(MediaType.APPLICATION_JSON);
            String response = builder.get(String.class);
            
            // Wrap Response to ExpediaOffer POJO Bean..
            com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
            ExpediaOffer expediaOffer = mapper.readValue(response, ExpediaOffer.class);

            // Client Call Connection Close..
            client.close();

            return expediaOffer;
        } catch (Exception ex) {
            Logger.getLogger(ExpediaClient.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExpediaWebserviceException(ex);
        }
    }
}
