import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl() throws RemoteException {
}
//implement method declared in the interface
public double ctof(double c) throws RemoteException {
double celtofah = (c*(9/5)+32);
 return celtofah; }
}
