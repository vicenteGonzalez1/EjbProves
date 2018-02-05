/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service;

import com.bonarea.model.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    static EJBContainer container = null;
    public StudentBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("org.glassfish.ejb.embedded.glassfish.configuration.file",
                "domain-universe.xml");
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer(properties);        
    }

    @AfterClass
    public static void tearDownClass() {
        container.close();
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
        model.setStudent_id(222);
        model.setName("pepe");
        model.setSurname("Garces");
        model.setCard_id("345345636YY");

        IStudentBeanLocal instance = (IStudentBeanLocal) container.getContext().lookup("java:global/classes/StudentBean");
        int expResult = 1;
        int result = instance.add(model);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAll() throws Exception {
        try {
            Student model = new Student();
            model.setName("pepe");
            model.setSurname("Garces");
            model.setCard_id("345345636YY");

            IStudentBeanLocal instance = (IStudentBeanLocal) container.getContext().lookup("java:global/classes/StudentBean");
            int expResult = 1;
            int result = instance.add(model);

            assertTrue(instance.getAll().size() > 0);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Test
    public void testGetRenge() throws Exception {
        try {
            int from = 0;
            int to = 9;

            IStudentBeanLocal instance = (IStudentBeanLocal) container.getContext().lookup("java:global/classes/StudentBean");
            int expResult = 1;
            List<Student> result = instance.getRange(from, to);

            assertTrue(result.size() > 0);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    @Test
    public void testUpdate() throws Exception {
        try {
            Student model = new Student();
            model.setStudent_id(1);
            model.setName("pepe");
            model.setSurname("Cortazar");
            model.setCard_id("345345636YY");

            IStudentBeanLocal instance = (IStudentBeanLocal) container.getContext().lookup("java:global/classes/StudentBean");
            int expResult = 1;
            int result = instance.update(model);

            assertTrue(result == 1);            
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    @Test
    public void testDelete() throws Exception {
        try {
            Student model = new Student();
            model.setStudent_id(1);
            model.setName("pepe");
            model.setSurname("Cortazar");
            model.setCard_id("345345636YY");
            IStudentBeanLocal instance = (IStudentBeanLocal) container.getContext().lookup("java:global/classes/StudentBean");
            int expResult = 1;
            int result = instance.delete(model);

            assertTrue(result == 1);                        
        } catch (Exception ex) {
            throw ex;
        }
    }
}
