package whatisnewin.java.lang.invoke;

import java.lang.invoke.VarHandle;
import java.lang.invoke.VarHandle.AccessMode;
import java.lang.invoke.MethodHandle;
import java.util.List;
import java.lang.invoke.MethodType;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link VarHandle}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link VarHandle} is a completely new class
 * @since 9
 * @see VarHandle
 */
public final class WhatIsNewInVarHandle
{
  /**
   * Example call to new method {@link VarHandle#set}
   * @since 9
   * @see VarHandle#set
   */
  public void set(Object[] args)
  {
    VarHandle testee = $$$();

    testee.set(args);
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSet}
   * @since 9
   * @see VarHandle#weakCompareAndSet
   */
  public boolean weakCompareAndSet(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSet(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSetRelease}
   * @since 9
   * @see VarHandle#weakCompareAndSetRelease
   */
  public boolean weakCompareAndSetRelease(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSetRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndAddRelease}
   * @since 9
   * @see VarHandle#getAndAddRelease
   */
  public Object getAndAddRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndAddRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#loadLoadFence}
   * @since 9
   * @see VarHandle#loadLoadFence
   */
  public static void loadLoadFence()
  {
    VarHandle.loadLoadFence();
  }

  /**
   * Example call to new method {@link VarHandle#setOpaque}
   * @since 9
   * @see VarHandle#setOpaque
   */
  public void setOpaque(Object[] args)
  {
    VarHandle testee = $$$();

    testee.setOpaque(args);
  }

  /**
   * Example call to new method {@link VarHandle#isAccessModeSupported}
   * @since 9
   * @see VarHandle#isAccessModeSupported
   */
  public boolean isAccessModeSupported(AccessMode accessMode)
  {
    VarHandle testee = $$$();

    boolean result = testee.isAccessModeSupported(accessMode);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndAddAcquire}
   * @since 9
   * @see VarHandle#getAndAddAcquire
   */
  public Object getAndAddAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndAddAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndExchangeRelease}
   * @since 9
   * @see VarHandle#compareAndExchangeRelease
   */
  public Object compareAndExchangeRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.compareAndExchangeRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndSet}
   * @since 9
   * @see VarHandle#compareAndSet
   */
  public boolean compareAndSet(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.compareAndSet(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndExchangeAcquire}
   * @since 9
   * @see VarHandle#compareAndExchangeAcquire
   */
  public Object compareAndExchangeAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.compareAndExchangeAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseXorRelease}
   * @since 9
   * @see VarHandle#getAndBitwiseXorRelease
   */
  public Object getAndBitwiseXorRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseXorRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#setRelease}
   * @since 9
   * @see VarHandle#setRelease
   */
  public void setRelease(Object[] args)
  {
    VarHandle testee = $$$();

    testee.setRelease(args);
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseAndAcquire}
   * @since 9
   * @see VarHandle#getAndBitwiseAndAcquire
   */
  public Object getAndBitwiseAndAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseAndAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#toMethodHandle}
   * @since 9
   * @see VarHandle#toMethodHandle
   */
  public MethodHandle toMethodHandle(AccessMode accessMode)
  {
    VarHandle testee = $$$();

    MethodHandle result = testee.toMethodHandle(accessMode);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getVolatile}
   * @since 9
   * @see VarHandle#getVolatile
   */
  public Object getVolatile(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getVolatile(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSetPlain}
   * @since 9
   * @see VarHandle#weakCompareAndSetPlain
   */
  public boolean weakCompareAndSetPlain(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#coordinateTypes}
   * @since 9
   * @see VarHandle#coordinateTypes
   */
  public List<Class<?>> coordinateTypes()
  {
    VarHandle testee = $$$();

    List<Class<?>> result = testee.coordinateTypes();
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#storeStoreFence}
   * @since 9
   * @see VarHandle#storeStoreFence
   */
  public static void storeStoreFence()
  {
    VarHandle.storeStoreFence();
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseXor}
   * @since 9
   * @see VarHandle#getAndBitwiseXor
   */
  public Object getAndBitwiseXor(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseXor(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndSetRelease}
   * @since 9
   * @see VarHandle#getAndSetRelease
   */
  public Object getAndSetRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndSetRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndExchange}
   * @since 9
   * @see VarHandle#compareAndExchange
   */
  public Object compareAndExchange(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.compareAndExchange(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#fullFence}
   * @since 9
   * @see VarHandle#fullFence
   */
  public static void fullFence()
  {
    VarHandle.fullFence();
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseAnd}
   * @since 9
   * @see VarHandle#getAndBitwiseAnd
   */
  public Object getAndBitwiseAnd(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseAnd(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#accessModeType}
   * @since 9
   * @see VarHandle#accessModeType
   */
  public MethodType accessModeType(AccessMode accessMode)
  {
    VarHandle testee = $$$();

    MethodType result = testee.accessModeType(accessMode);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAcquire}
   * @since 9
   * @see VarHandle#getAcquire
   */
  public Object getAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseOr}
   * @since 9
   * @see VarHandle#getAndBitwiseOr
   */
  public Object getAndBitwiseOr(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseOr(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#acquireFence}
   * @since 9
   * @see VarHandle#acquireFence
   */
  public static void acquireFence()
  {
    VarHandle.acquireFence();
  }

  /**
   * Example call to new method {@link VarHandle#getOpaque}
   * @since 9
   * @see VarHandle#getOpaque
   */
  public Object getOpaque(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getOpaque(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndSetAcquire}
   * @since 9
   * @see VarHandle#getAndSetAcquire
   */
  public Object getAndSetAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndSetAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseOrRelease}
   * @since 9
   * @see VarHandle#getAndBitwiseOrRelease
   */
  public Object getAndBitwiseOrRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseOrRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#varType}
   * @since 9
   * @see VarHandle#varType
   */
  public Class<?> varType()
  {
    VarHandle testee = $$$();

    Class<?> result = testee.varType();
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseXorAcquire}
   * @since 9
   * @see VarHandle#getAndBitwiseXorAcquire
   */
  public Object getAndBitwiseXorAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseXorAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#get}
   * @since 9
   * @see VarHandle#get
   */
  public Object get(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.get(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#setVolatile}
   * @since 9
   * @see VarHandle#setVolatile
   */
  public void setVolatile(Object[] args)
  {
    VarHandle testee = $$$();

    testee.setVolatile(args);
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseOrAcquire}
   * @since 9
   * @see VarHandle#getAndBitwiseOrAcquire
   */
  public Object getAndBitwiseOrAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseOrAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseAndRelease}
   * @since 9
   * @see VarHandle#getAndBitwiseAndRelease
   */
  public Object getAndBitwiseAndRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseAndRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndAdd}
   * @since 9
   * @see VarHandle#getAndAdd
   */
  public Object getAndAdd(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndAdd(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#releaseFence}
   * @since 9
   * @see VarHandle#releaseFence
   */
  public static void releaseFence()
  {
    VarHandle.releaseFence();
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSetAcquire}
   * @since 9
   * @see VarHandle#weakCompareAndSetAcquire
   */
  public boolean weakCompareAndSetAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndSet}
   * @since 9
   * @see VarHandle#getAndSet
   */
  public Object getAndSet(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndSet(args);
    return result;
  }

  private VarHandle $$$()
  {
    return null;
  }
}
