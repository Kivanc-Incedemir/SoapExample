package com.kivanc.springbootsoapexample.endpoint;

import com.kivanc.spring_boot_soap_example.GetUserRequest;
import com.kivanc.spring_boot_soap_example.GetUserResponse;
import com.kivanc.springbootsoapexample.service.UserService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndPoint {


    @PayloadRoot(namespace = "http://kivanc.com/spring-boot-soap-example",localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {

        GetUserResponse response = new GetUserResponse();
        response.setUser(UserService.getUsers(request.getName()));
        return response;
    }

}
