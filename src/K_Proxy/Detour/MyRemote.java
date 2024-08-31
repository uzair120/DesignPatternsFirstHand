package K_Proxy.Detour;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;

}
