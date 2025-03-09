package com.gunnerdev.integrate_jenkins.service;

import com.gunnerdev.integrate_jenkins.repository.AppRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class AppService {

    private final AppRepository appRepository;
    private String aaa;
    private static final Logger logger = Logger.getLogger(AppService.class.getName());

    public void serviceMethod(){
        logger.info("Service Layer");
        aaa = appRepository.RepositoryMethod();
        testOne();
    }

    private void testOne(){
        if(aaa.equals("TestRepository")){
            System.out.println("Is equal test");
        }
    }

}
