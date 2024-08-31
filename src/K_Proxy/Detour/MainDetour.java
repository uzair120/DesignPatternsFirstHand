package K_Proxy.Detour;

import java.rmi.Naming;

public class MainDetour {
    public static void main(String[] args) {

        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
