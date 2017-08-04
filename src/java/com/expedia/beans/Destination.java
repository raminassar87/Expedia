/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;
/**
 * Destination Bean
 * 
 * @author Rami Nassar
 */
public class Destination implements java.io.Serializable {
    
    /*
     * Fields
     */
    
    /** Province */
    private String province;

    /** Long Name */
    private String longName;

    /** Region ID */
    private String regionID;

    /** City */
    private String city;

    /** Country */
    private String country;

    /*
     * Methods
     */
    
    /**
     * Getter for Destination province
     * 
     * @return Destination province
     */
    public String getProvince() {
        return province;
    }
    
    /**
     * Setter for Destination province
     * 
     * @param province : Destination province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Getter for Destination Long Name
     * 
     * @longName : Destination Long Name
     */
    public String getLongName() {
        return longName;
    }
    
    /**
     * Setter for Destination Long Name
     * 
     * @param longName : Destination Long Name
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }

    /**
     * Getter for Destination Region ID
     * 
     * @return Destination Region ID
     */
    public String getRegionID() {
        return regionID;
    }
    
    /**
     * Setter for Destination Region ID
     * 
     * @param regionID : Destination Region ID
     */
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    /**
     * Getter for Destination City
     * 
     * @return Destination City
     */
    public String getCity() {
        return city;
    }
    
    /**
     * Setter for Destination City
     * 
     * @param city : Destination City
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Destination Country
     * 
     * @return Destination Country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Destination Country
     * 
     * @param country : Destination Country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * TO String
     * 
     * @return TO String representation of object
     */
    @Override
    public String toString() {
        return "ClassPojo [province = " + province + ", longName = " + longName + ", regionID = " + regionID + ", city = " + city + ", country = " + country + "]";
    }
}
