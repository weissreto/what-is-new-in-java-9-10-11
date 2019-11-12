package whatisnewin.java.rmi.server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;
import java.io.ObjectInputFilter;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link UnicastRemoteObject}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link UnicastRemoteObject} is an old class but has new fields, constructors or methods
 * @since 1.1
 * @see UnicastRemoteObject
 */
public final class WhatIsNewInUnicastRemoteObject
{
  /**
   * Example call to new method {@link UnicastRemoteObject#exportObject}
   * @since 9
   * @see UnicastRemoteObject#exportObject
   */
  public static Remote exportObject(Remote obj, int port, ObjectInputFilter filter) throws RemoteException
  {
    Remote result = UnicastRemoteObject.exportObject(obj, port, filter);
    return result;
  }

  /**
   * Example call to new method {@link UnicastRemoteObject#exportObject}
   * @since 9
   * @see UnicastRemoteObject#exportObject
   */
  public static Remote exportObject(Remote obj, int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf, ObjectInputFilter filter) throws RemoteException
  {
    Remote result = UnicastRemoteObject.exportObject(obj, port, csf, ssf, filter);
    return result;
  }

}
