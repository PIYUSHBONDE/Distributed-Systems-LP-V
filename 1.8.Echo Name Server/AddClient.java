import java.rmi.*;
public class AddClient {
public static void main(String args[]) { 
try {
// Get reference to the remote object
String addServerURL = "rmi://" + args[0] + "/AddServer"; 
AddServerIntf addServerIntf =
(AddServerIntf) Naming.lookup(addServerURL);
System.out.println("Your Name is : " + args[1]); 
String d1 =(args[1]);
System.out.println(":) " + addServerIntf.hel(d1));
} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}
