/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.model;

/**
 *
 * @author alumne
 */
public class Student {
    private int student_id;
    private String name;
    private String surname;
    private String card_id;

    /**
     * @return the student_id
     */
    public int getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the card_id
     */
    public String getCard_id() {
        return card_id;
    }

    /**
     * @param card_id the card_id to set
     */
    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }
    
}
