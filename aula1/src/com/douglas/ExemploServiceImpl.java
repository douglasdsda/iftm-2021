package com.douglas;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.douglas.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }

    @Override
    public String getNome() {
        return "Douglas Souza dos Anjos";
    }
}