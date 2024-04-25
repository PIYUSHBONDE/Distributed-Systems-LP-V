/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author patil
 */
@WebService(serviceName = "MiletoKmService")
public class MiletoKmService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MtoK")
    public double MtoK(@WebParam(name = "miles") double miles) {
        //TODO write your implementation code here:
        return miles*1.60934;
    }

    /**
     * This is a sample web service operation
     */
    
}
