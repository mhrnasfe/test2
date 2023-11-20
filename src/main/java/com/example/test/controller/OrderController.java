package com.example.test.controller;

import com.example.test.entity.Order;
import com.example.test.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
//        Order order1 = orderService.createOrder(order);
        return ResponseEntity.ok(orderService.createOrder(order));
   /*     return new ResponseEntity<>("order is create successfully", HttpStatus.ACCEPTED);*/
    }

}
