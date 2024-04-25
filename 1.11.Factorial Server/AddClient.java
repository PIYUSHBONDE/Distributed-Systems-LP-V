import java.rmi.*;
public class AddClient {
public static void main(String args[]) { 
try {
// Get reference to the remote object
String addServerURL = "rmi://" + args[0] + "/AddServer"; 
AddServerIntf addServerIntf =
(AddServerIntf) Naming.lookup(addServerURL);
System.out.println("The number is: " + args[1]); 
int d1 =Integer.parseInt(args[1]);
System.out.println("The Factorial is: " + addServerIntf.fct(d1));
} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}
