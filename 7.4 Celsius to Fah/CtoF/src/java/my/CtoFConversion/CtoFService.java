/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CtoFConversion;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author patil
 */
@WebService(serviceName = "CtoFService")
public class CtoFService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CeltoFah")
    public double CeltoFah(@WebParam(name = "celsius") double celsius) {
        //TODO write your implementation code here:
        return (((celsius*9)/5)+32);
    }

    /**
     * This is a sample web service operation
     */
   
}
