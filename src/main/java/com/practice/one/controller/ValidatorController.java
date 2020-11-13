package com.practice.one.controller;

import com.practice.one.domain.ResponseWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValidatorController {

    @GetMapping("/check")
    public ResponseEntity<?> checkIfUp (){
        return new ResponseEntity<>(ResponseWrapper.builder()
                .message("up and running")
                .extra("check logs to confirm").build(), HttpStatus.OK);
    }

}
