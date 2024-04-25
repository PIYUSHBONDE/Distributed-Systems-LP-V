import java.rmi.*;
public class AddClient {
public static void main(String args[]) { 
try {
// Get reference to the remote object
String addServerURL = "rmi://" + args[0] + "/AddServer"; 
AddServerIntf addServerIntf =
(AddServerIntf) Naming.lookup(addServerURL);
System.out.println("First String is: " + args[1]); 
String d1 =(args[1]);
System.out.println("Second String is: " + args[2]); 
String d2 =(args[2]);
System.out.println("Greater String is : " + addServerIntf.scmp(d1,d2));
} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}
