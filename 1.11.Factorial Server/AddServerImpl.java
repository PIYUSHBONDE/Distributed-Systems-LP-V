import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl() throws RemoteException {
}
//implement method declared in the interface
public int fct(int c) throws RemoteException {
 	int fact=1;
 	for(int i=1;i<=c;i++)
 	{
 	fact=fact*i;
 	}
	return fact;
 }
}
