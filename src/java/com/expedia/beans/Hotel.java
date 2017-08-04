/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

public class Hotel implements java.io.Serializable {

    private OfferDateRange offerDateRange;

    private HotelUrls hotelUrls;

    private HotelInfo hotelInfo;

    private HotelPricingInfo hotelPricingInfo;

    private HotelUrgencyInfo hotelUrgencyInfo;

    private HotelScores hotelScores;

    private Destination destination;

    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    public HotelScores getHotelScores() {
        return hotelScores;
    }

    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "ClassPojo [offerDateRange = " + offerDateRange + ", hotelUrls = " + hotelUrls + ", hotelInfo = " + hotelInfo + ", hotelPricingInfo = " + hotelPricingInfo + ", hotelUrgencyInfo = " + hotelUrgencyInfo + ", hotelScores = " + hotelScores + ", destination = " + destination + "]";
    }
}
