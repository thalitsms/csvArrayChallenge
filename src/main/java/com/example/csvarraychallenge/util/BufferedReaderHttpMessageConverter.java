package com.example.csvarraychallenge.util;

import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BufferedReaderHttpMessageConverter extends AbstractHttpMessageConverter<BufferedReader> {

    public BufferedReaderHttpMessageConverter() {
        super(MediaType.TEXT_PLAIN);
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return BufferedReader.class.isAssignableFrom(clazz);
    }

    @Override
    protected BufferedReader readInternal(Class<? extends BufferedReader> clazz,
                                          org.springframework.http.HttpInputMessage inputMessage)
            throws IOException, HttpMessageNotReadableException {
        return new BufferedReader(new InputStreamReader(inputMessage.getBody(), StandardCharsets.UTF_8));
    }

    @Override
    protected void writeInternal(BufferedReader reader,
                                 org.springframework.http.HttpOutputMessage outputMessage)
            throws IOException {
        throw new UnsupportedOperationException("This converter is only for reading BufferedReader");
    }
}