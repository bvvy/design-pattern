package proxy.first.remote_test;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by bvvy on 2017/7/26.
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyRemote server = new MyRemoteImpl();
            Naming.bind("remoteHello", server);
        } catch (RemoteException | AlreadyBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
