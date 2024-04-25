import java.rmi.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntfc {
    private LocalTime localTime;
    
    ServerImpl(LocalTime localTime) throws RemoteException {
        this.localTime = localTime;
    }

    public LocalTime getTime() throws RemoteException {
        return this.localTime;
    }

    public void adjustTime(LocalTime serverTime, long diff) throws RemoteException {
        long serverSeconds = serverTime.toSecondOfDay();
        long adjustedSeconds = serverSeconds + diff;
        LocalTime adjustedTime = LocalTime.ofSecondOfDay(adjustedSeconds);
        System.out.println("Adjusted time is: " + adjustedTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}

