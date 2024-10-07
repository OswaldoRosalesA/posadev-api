package com.posadev.demo.controller;

import com.posadev.demo.gen.api.SampleApi;
import com.posadev.demo.gen.models.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController implements SampleApi {

    @Override
    public ResponseEntity<HelloResponse> getHello() {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello, World!");
        return ResponseEntity.ok(response);
    }
}
