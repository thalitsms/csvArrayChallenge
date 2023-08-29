package com.example.csvarraychallenge.service;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CsvArrayChallengeService {

    public Object[] reverseArray(Object[] arr) {
        Object[] reversedArray = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    public Object[] reverseArrayInPlace(Object[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            Object temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public List<Object> reverseList(List<Object> list) {
        Collections.reverse(list);
        return list;
    }

    public String[] convertCSVToArray(BufferedReader reader) {
        return reader.lines().toArray(String[]::new);
    }

    public List<String[]> convertCSVListToArray(BufferedReader reader) throws IOException {
        List<String[]> values = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            values.add(line.split(","));
        }
        return values;
    }
}
