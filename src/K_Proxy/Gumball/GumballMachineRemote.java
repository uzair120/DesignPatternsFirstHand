package K_Proxy.Gumball;

import K_Proxy.Gumball.core.State;

import java.rmi.RemoteException;

public interface GumballMachineRemote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
