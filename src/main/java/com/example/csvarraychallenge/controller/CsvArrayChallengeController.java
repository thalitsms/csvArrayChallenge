package com.example.csvarraychallenge.controller;

import com.example.csvarraychallenge.service.CsvArrayChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CsvArrayChallengeController {

    @Autowired
    private CsvArrayChallengeService service;

    @PostMapping("/reverse")
    public Object[] reverseArray(@RequestBody Object[] arr) {
        return service.reverseArray(arr);
    }

    @PutMapping("/reverse-inplace")
    public Object[] reverseArrayInPlace(@RequestBody Object[] arr) {
        return service.reverseArrayInPlace(arr);
    }

    @PutMapping("/reverse-list")
    public List<Object> reverseList(@RequestBody List<Object> list) {
        return service.reverseList(list);
    }

    @PostMapping(value = "/csv-to-array", consumes = "text/plain", produces = "application/json")
    public String[] convertCSVToArray(@RequestBody BufferedReader reader) {
        return service.convertCSVToArray(reader);
    }

    @PostMapping(value = "/csv-list-to-array", consumes = "text/plain", produces = "application/json")
    public List<String[]> convertCSVListToArray(@RequestBody BufferedReader reader) throws IOException {
        return service.convertCSVListToArray(reader);
    }
}
