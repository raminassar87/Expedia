/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

/**
 *
 * @author Rami Nassar
 */
public class ExpediaOfferSearchBean {

    /*
     * Fields
     */
    
    /** Destination Name */
    private String destinationName;

    /** Destination City */
    private String destinationCity;

    /** Region Ids */
    private Long regionIds;

    /** Min Trip Start Date */
    private String minTripStartDate;

    /** Max Trip Start Date */
    private String maxTripStartDate;

    /** Length Of Stay */
    private String lengthOfStay;

    /** Min Star Rating */
    private String minStarRating;

    /** Max Star Rating */
    private String maxStarRating;

    /** Min Total Rate */
    private String minTotalRate;

    /** Max Total Rate */
    private String maxTotalRate;

    /** Min Guest Rate */
    private String minGuestRating;

    /** Max Guest Rate */
    private String maxGuestRating;

    /**
     * Methods
     */
    
    /**
     * Getter for Destination Name
     * 
     * @return the Destination Name
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Setter for Destination Name
     *
     * @param destinationName : the destinationName to set
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * Getter for Min Trip Start Date
     * 
     * @return the minTripStartDate
     */
    public String getMinTripStartDate() {
        return minTripStartDate;
    }

    /**
     * Setter for Min Trip Start Date
     * 
     * @param minTripStartDate : the Trip Start Date to set
     */
    public void setMinTripStartDate(String minTripStartDate) {
        this.minTripStartDate = minTripStartDate;
    }

    /**
     * Getter for Min Trip Start Date
     * 
     * @return the maxTripStartDate : Max Trip Start Date
     */
    public String getMaxTripStartDate() {
        return maxTripStartDate;
    }

    /**
     * Setter for Min Trip Start Date
     * 
     * @param maxTripStartDate : the maxTripStartDate : Max Trip Start Date
     */
    public void setMaxTripStartDate(String maxTripStartDate) {
        this.maxTripStartDate = maxTripStartDate;
    }
    
    /**
     * Getter for Min Trip Start Date
     * 
     * @return Length Of Stay
     */
    public String getLengthOfStay() {
        return lengthOfStay;
    }

    /**
     * Setter for Min Trip Start Date
     * 
     * @param lengthOfStay : Length Of Stay
     */
    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    /**
     * Setter for Min Star Rating
     * 
     * @return Min Star Rating
     */
    public String getMinStarRating() {
        return minStarRating;
    }

    /**
     * Getter for Min Star Rating
     * 
     * @param minStarRating: Min Star Rating
     */
    public void setMinStarRating(String minStarRating) {
        this.minStarRating = minStarRating;
    }

    /**
     * @return the maxStarRating
     */
    public String getMaxStarRating() {
        return maxStarRating;
    }

    /**
     * @param maxStarRating the maxStarRating to set
     */
    public void setMaxStarRating(String maxStarRating) {
        this.maxStarRating = maxStarRating;
    }

    /**
     * @return the minTotalRate
     */
    public String getMinTotalRate() {
        return minTotalRate;
    }

    /**
     * @param minTotalRate the minTotalRate to set
     */
    public void setMinTotalRate(String minTotalRate) {
        this.minTotalRate = minTotalRate;
    }

    /**
     * @return the maxTotalRate
     */
    public String getMaxTotalRate() {
        return maxTotalRate;
    }

    /**
     * @param maxTotalRate the maxTotalRate to set
     */
    public void setMaxTotalRate(String maxTotalRate) {
        this.maxTotalRate = maxTotalRate;
    }

    /**
     * @return the minGuestRating
     */
    public String getMinGuestRating() {
        return minGuestRating;
    }

    /**
     * @param minGuestRating the minGuestRating to set
     */
    public void setMinGuestRating(String minGuestRating) {
        this.minGuestRating = minGuestRating;
    }

    /**
     * @return the maxGuestRating
     */
    public String getMaxGuestRating() {
        return maxGuestRating;
    }

    /**
     * @param maxGuestRating the maxGuestRating to set
     */
    public void setMaxGuestRating(String maxGuestRating) {
        this.maxGuestRating = maxGuestRating;
    }

    /**
     * @return the regionIds
     */
    public Long getRegionIds() {
        return regionIds;
    }

    /**
     * @param regionIds the regionIds to set
     */
    public void setRegionIds(Long regionIds) {
        this.regionIds = regionIds;
    }

    /**
     * @return the destinationCity
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * @param destinationCity the destinationCity to set
     */
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
}
