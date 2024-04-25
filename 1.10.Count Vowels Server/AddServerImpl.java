import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl() throws RemoteException {
}
//implement method declared in the interface
public int cvwl(String c) throws RemoteException {
 int vc = 0;
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vc++;
            }
        }
        
 return vc; }
}
