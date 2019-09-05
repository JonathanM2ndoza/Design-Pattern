package com.jmendoza.springboot.commandpattern.controller;

import com.jmendoza.springboot.commandpattern.impl.BuyStock;
import com.jmendoza.springboot.commandpattern.impl.SellStock;
import com.jmendoza.springboot.commandpattern.interfaz.Order;
import com.jmendoza.springboot.commandpattern.invoker.Broker;
import com.jmendoza.springboot.commandpattern.request.Stock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Encapsulate a request as an object, thereby allowing for the parameterization of clients with different requests, and the queuing or logging of requests.
 * It also allows for the support of undoable operations.
 */

@RestController
@RequestMapping("/command")
public class CommandController {

    @GetMapping
    public ResponseEntity getShape(HttpServletRequest request) {

        Stock abcStock = new Stock();

        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
