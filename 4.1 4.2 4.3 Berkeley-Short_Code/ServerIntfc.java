import java.rmi.*;
import java.time.*;

public interface ServerIntfc extends Remote
{
	
		LocalTime getTime() throws RemoteException;
		void adjustTime(LocalTime ServerTime,long diff) throws RemoteException;		
}
