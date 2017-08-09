package proxy.first.remote_test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by bvvy on 2017/7/26.
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
