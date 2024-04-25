import java.rmi.*;
public class AddClient {
public static void main(String args[]) { 
try {
// Get reference to the remote object
String addServerURL = "rmi://" + args[0] + "/AddServer"; 
AddServerIntf addServerIntf =
(AddServerIntf) Naming.lookup(addServerURL);
System.out.println("The String: " + args[1]); 
String d1 =(args[1]);
System.out.println("Count of Vowels : " + addServerIntf.cvwl(d1));
} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}
