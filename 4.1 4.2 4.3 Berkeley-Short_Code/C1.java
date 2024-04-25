import java.rmi.*;
import java.rmi.registry.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C1 {
    public static void main(String[] args) {
        try {
            ServerImpl serverImpl = new ServerImpl(LocalTime.parse(args[1], DateTimeFormatter.ofPattern("HH:mm:ss")));
            Naming.rebind(args[0], serverImpl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

