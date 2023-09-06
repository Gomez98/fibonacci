package com.controlhub.fibonacci.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface FibonacciService {

    ResponseEntity<String> getFibonacci(int n);
}
