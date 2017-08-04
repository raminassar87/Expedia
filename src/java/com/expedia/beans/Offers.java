/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Offers implements java.io.Serializable {

    @JsonProperty("Hotel")
    private Hotel[] hotel;

    public Hotel[] getHotel() {
        return hotel;
    }

    public void setHotel(Hotel[] hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "ClassPojo [Hotel = " + hotel + "]";
    }
}
