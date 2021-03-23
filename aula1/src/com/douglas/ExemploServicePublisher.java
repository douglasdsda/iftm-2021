package com.douglas;



import javax.xml.ws.Endpoint;

public class ExemploServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/exemplo",
                new ExemploServiceImpl());
    }
}