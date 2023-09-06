package com.controlhub.fibonacci.services.impl;

import com.controlhub.fibonacci.services.FibonacciService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService {
    @Override
    public ResponseEntity<String> getFibonacci(int n) {
        try {
            if (n < 0){
                throw new IllegalArgumentException("The index must be a positive number.");
            }
            String result;
            result = String.valueOf(evaluateFibonacci(n));
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private long evaluateFibonacci(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;

                if (result < 0) {
                    throw new ArithmeticException("The fibonacci number is too long.");
                }
                a = b;
                b = result;
            }
            return result;
        }
    }
}
