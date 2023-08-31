package org.example.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUTIL {
    private static final String PERSISTENCE_UNIT_NAME = "JPAPU";
    private static EntityManagerFactory emf;

    public static  EntityManagerFactory getEntityManagerFactory(){
        if (emf==null){
            emf= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }
}
