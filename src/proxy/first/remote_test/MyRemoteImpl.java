package proxy.first.remote_test;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by bvvy on 2017/7/26.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {

    }


    @Override
    public String sayHello() throws RemoteException {
        return "server says : hello";
    }


}
