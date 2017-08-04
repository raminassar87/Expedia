/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

public class OfferDateRange implements java.io.Serializable {

    private String[] travelEndDate;

    private String lengthOfStay;

    private String[] travelStartDate;

    public String[] getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(String[] travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public String[] getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(String[] travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    @Override
    public String toString() {
        return "ClassPojo [travelEndDate = " + travelEndDate + ", lengthOfStay = " + lengthOfStay + ", travelStartDate = " + travelStartDate + "]";
    }
}
