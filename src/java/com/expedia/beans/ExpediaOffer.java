/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

import java.io.Serializable;

/**
 * Expedia Offer
 * 
 * @author Rami Nassar
 */
public class ExpediaOffer implements Serializable {
    
    /*
     * Fields
     */
    
    /** offers */
    private Offers offers;

    /** offer info */
    private OfferInfo offerInfo;

    /** User Info */
    private UserInfo userInfo;

    /*
     * Methods
     */
    
    /**
     * Getter for Offers
     * 
     * Offers Bean
     */
    public Offers getOffers() {
        return offers;
    }

    /**
     * Setter for Offers
     * 
     * @param offers : offer bean
     */
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    /**
     * Getter for Offer Info
     * 
     * @return Offer Info 
     */
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    /**
     * Setter for Offer Info
     * 
     * @param offerInfo : Offer Info 
     */
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    /**
     * Getter for Offer Info
     * 
     * @return Offer Info 
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * Setter for Offer Info
     * 
     * @param userInfo : Offer Info 
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "ClassPojo [offers = " + offers + ", offerInfo = " + offerInfo + ", userInfo = " + userInfo + "]";
    }
}