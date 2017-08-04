/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

public class HotelScores implements java.io.Serializable {

    private String movingAverageScore;

    private String rawAppealScore;

    public String getMovingAverageScore() {
        return movingAverageScore;
    }

    public void setMovingAverageScore(String movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    public String getRawAppealScore() {
        return rawAppealScore;
    }

    public void setRawAppealScore(String rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    @Override
    public String toString() {
        return "ClassPojo [movingAverageScore = " + movingAverageScore + ", rawAppealScore = " + rawAppealScore + "]";
    }
}
