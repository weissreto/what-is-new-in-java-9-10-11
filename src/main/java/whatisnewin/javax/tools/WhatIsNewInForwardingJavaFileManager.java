package whatisnewin.javax.tools;

import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager.Location;
import java.io.IOException;
import java.util.ServiceLoader;
import java.util.Set;
import javax.tools.JavaFileObject;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ForwardingJavaFileManager}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ForwardingJavaFileManager} is an old class but has new fields, constructors or methods.
 * @since 1.6
 * @see ForwardingJavaFileManager
 */
public final class WhatIsNewInForwardingJavaFileManager<M extends javax.tools.JavaFileManager>
{
  /**
   * Example call to new method {@link ForwardingJavaFileManager#inferModuleName(Location)}.
   * @since 9
   * @see ForwardingJavaFileManager#inferModuleName(Location)
   */
  public String inferModuleName(Location location) throws IOException
  {
    ForwardingJavaFileManager<M> testee = $$$();

    String result = testee.inferModuleName(location);
    return result;
  }

  /**
   * Example call to new method {@link ForwardingJavaFileManager#getServiceLoader(Location, Class)}.
   * @since 9
   * @see ForwardingJavaFileManager#getServiceLoader(Location, Class)
   */
  public <S> ServiceLoader<S> getServiceLoader(Location location, Class<S> service) throws IOException
  {
    ForwardingJavaFileManager<M> testee = $$$();

    ServiceLoader<S> result = testee.getServiceLoader(location, service);
    return result;
  }

  /**
   * Example call to new method {@link ForwardingJavaFileManager#listLocationsForModules(Location)}.
   * @since 9
   * @see ForwardingJavaFileManager#listLocationsForModules(Location)
   */
  public Iterable<Set<Location>> listLocationsForModules(Location location) throws IOException
  {
    ForwardingJavaFileManager<M> testee = $$$();

    Iterable<Set<Location>> result = testee.listLocationsForModules(location);
    return result;
  }

  /**
   * Example call to new method {@link ForwardingJavaFileManager#getLocationForModule(Location, String)}.
   * @since 9
   * @see ForwardingJavaFileManager#getLocationForModule(Location, String)
   */
  public Location getLocationForModule(Location location, String moduleName) throws IOException
  {
    ForwardingJavaFileManager<M> testee = $$$();

    Location result = testee.getLocationForModule(location, moduleName);
    return result;
  }

  /**
   * Example call to new method {@link ForwardingJavaFileManager#getLocationForModule(Location, JavaFileObject)}.
   * @since 9
   * @see ForwardingJavaFileManager#getLocationForModule(Location, JavaFileObject)
   */
  public Location getLocationForModule(Location location, JavaFileObject fo) throws IOException
  {
    ForwardingJavaFileManager<M> testee = $$$();

    Location result = testee.getLocationForModule(location, fo);
    return result;
  }

  private ForwardingJavaFileManager $$$()
  {
    return null;
  }
}
