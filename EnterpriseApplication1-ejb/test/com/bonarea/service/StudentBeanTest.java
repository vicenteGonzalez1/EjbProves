/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service;

import com.bonarea.model.Student;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class StudentBeanTest {
    
    public StudentBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class StudentBean.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Student model = new Student();
        model.setName("pepe");
        model.setSurname("Garces");
        model.setCard_id("345345636YY");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        IStudentBeanLocal instance = (IStudentBeanLocal)container.getContext().lookup("java:global/classes/StudentBean");
        int expResult = 0;
        int result = instance.add(model);
        assertEquals(expResult, result);
        container.close();
    }
    
}