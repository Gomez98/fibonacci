package com.controlhub.fibonacci.controller;

import com.controlhub.fibonacci.services.FibonacciService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/fibonacci")
public class FibonacciController {

    private final FibonacciService fibonacciService;

    /**
     * This method evaluate a number to generate its fibonacci value
     * @param n
     * @return ResponseEntity type with the result
     */
    @GetMapping("/{n}")
    public ResponseEntity<String> resolveFibonacci(@PathVariable int n) {
        return fibonacciService.getFibonacci(n);
    }

}
