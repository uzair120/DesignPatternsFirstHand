package K_Proxy.Detour;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        MyRemoteImpl service = new MyRemoteImpl();
        Naming.rebind("RemoteHello", service);
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server Says, Hey!";
    }
}