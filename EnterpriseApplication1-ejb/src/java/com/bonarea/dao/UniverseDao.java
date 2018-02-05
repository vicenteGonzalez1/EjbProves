/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.dao;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 *
 * @author alumne
 */
@Qualifier
@Retention(RUNTIME) //ambit on es carrega la anotacio (nomes en runtime en aquest cas)
@Target({TYPE, METHOD, FIELD, PARAMETER}) //ambit on es pot aplicar la anotacio
public @interface UniverseDao {
    
}
