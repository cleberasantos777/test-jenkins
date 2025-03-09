package com.gunnerdev.integrate_jenkins;

import com.gunnerdev.integrate_jenkins.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@RequiredArgsConstructor
public class StartApplication {

    private final AppService appService;
    private static final Logger logger = Logger.getLogger(StartApplication.class.getName());

    public void startApp(){
        logger.info("StartApplication Class");
        appService.serviceMethod();
    }

}
