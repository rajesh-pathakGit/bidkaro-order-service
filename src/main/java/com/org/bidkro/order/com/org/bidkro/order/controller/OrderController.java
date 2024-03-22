package com.org.bidkro.order.com.org.bidkro.order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    @GetMapping("/message")
    public ResponseEntity<String> register(){

        return ResponseEntity.ok("ok");
    }

}
