import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl() throws RemoteException {
}
//implement method declared in the interface
public String scmp(String c,String m) throws RemoteException {
int comparisonResult = c.compareTo(m);
        if (comparisonResult > 0) {
              	return c;
        } else if (comparisonResult < 0) {
           return m;
        } 
 return c; }
}
