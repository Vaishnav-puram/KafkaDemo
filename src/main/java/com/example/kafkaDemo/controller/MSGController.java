package com.example.kafkaDemo.controller;

import com.example.kafkaDemo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class MSGController {

    @Autowired
    ProducerService producerService;

    @GetMapping("/produceMSG")
    public ResponseEntity<String> createMSG(@RequestParam("message") String msg){
        producerService.sendMsgToTopic(msg);
        return ResponseEntity.status(HttpStatus.CREATED).body("message created.");

    }
}
