package com.gunnerdev.integrate_jenkins.repository;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class AppRepository {

    private static final Logger logger = Logger.getLogger(AppRepository.class.getName());

    public String RepositoryMethod(){
        logger.info("Repository Layer");
        return "TestRepository";
    }

}
