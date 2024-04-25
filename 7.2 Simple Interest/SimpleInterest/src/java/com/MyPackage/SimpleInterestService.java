/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author patil
 */
@WebService(serviceName = "SimpleInterestService")
public class SimpleInterestService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calculateSI")
    public double calculateSI(@WebParam(name = "prin") double prin, @WebParam(name = "numb") double numb, @WebParam(name = "rat") double rat) {
        //TODO write your implementation code here:
        return (prin*numb*rat)/100;
    }

    /**
     * This is a sample web service operation
     */
   
}
