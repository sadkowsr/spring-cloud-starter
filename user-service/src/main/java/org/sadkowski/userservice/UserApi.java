package org.sadkowski.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @Value("${app.globalname}")
    private String appGlobalname;

    @GetMapping
    public String getHeatlh(){
        return "OK user-service "+appGlobalname;
    }

}
