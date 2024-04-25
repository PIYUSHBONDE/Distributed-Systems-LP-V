import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl() throws RemoteException {
}
//implement method declared in the interface
public double pwr(double d1) throws RemoteException {
double resultPow = Math.pow(2, d1);
 return resultPow; }
}
