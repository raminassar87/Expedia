/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.beans;

public class Persona implements java.io.Serializable {

    private String personaType;

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    @Override
    public String toString() {
        return "ClassPojo [personaType = " + personaType + "]";
    }
}
