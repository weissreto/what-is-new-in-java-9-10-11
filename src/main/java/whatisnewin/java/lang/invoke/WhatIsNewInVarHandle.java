package whatisnewin.java.lang.invoke;

import java.lang.invoke.VarHandle;
import java.lang.invoke.VarHandle.AccessMode;
import java.lang.invoke.MethodHandle;
import java.util.List;
import java.lang.invoke.MethodType;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link VarHandle}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link VarHandle} is a completely new class.
 * @since 9
 * @see VarHandle
 */
public final class WhatIsNewInVarHandle
{
  /**
   * Example call to new method {@link VarHandle#set(Object[])}.
   * @since 9
   * @see VarHandle#set(Object[])
   */
  public void set(Object[] args)
  {
    VarHandle testee = $$$();

    testee.set(args);
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSet(Object[])}.
   * @since 9
   * @see VarHandle#weakCompareAndSet(Object[])
   */
  public boolean weakCompareAndSet(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSet(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSetRelease(Object[])}.
   * @since 9
   * @see VarHandle#weakCompareAndSetRelease(Object[])
   */
  public boolean weakCompareAndSetRelease(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSetRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndAddRelease(Object[])}.
   * @since 9
   * @see VarHandle#getAndAddRelease(Object[])
   */
  public Object getAndAddRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndAddRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#loadLoadFence()}.
   * @since 9
   * @see VarHandle#loadLoadFence()
   */
  public static void loadLoadFence()
  {
    VarHandle.loadLoadFence();
  }

  /**
   * Example call to new method {@link VarHandle#setOpaque(Object[])}.
   * @since 9
   * @see VarHandle#setOpaque(Object[])
   */
  public void setOpaque(Object[] args)
  {
    VarHandle testee = $$$();

    testee.setOpaque(args);
  }

  /**
   * Example call to new method {@link VarHandle#isAccessModeSupported(AccessMode)}.
   * @since 9
   * @see VarHandle#isAccessModeSupported(AccessMode)
   */
  public boolean isAccessModeSupported(AccessMode accessMode)
  {
    VarHandle testee = $$$();

    boolean result = testee.isAccessModeSupported(accessMode);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndAddAcquire(Object[])}.
   * @since 9
   * @see VarHandle#getAndAddAcquire(Object[])
   */
  public Object getAndAddAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndAddAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndExchangeRelease(Object[])}.
   * @since 9
   * @see VarHandle#compareAndExchangeRelease(Object[])
   */
  public Object compareAndExchangeRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.compareAndExchangeRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndSet(Object[])}.
   * @since 9
   * @see VarHandle#compareAndSet(Object[])
   */
  public boolean compareAndSet(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.compareAndSet(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndExchangeAcquire(Object[])}.
   * @since 9
   * @see VarHandle#compareAndExchangeAcquire(Object[])
   */
  public Object compareAndExchangeAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.compareAndExchangeAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseXorRelease(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseXorRelease(Object[])
   */
  public Object getAndBitwiseXorRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseXorRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#setRelease(Object[])}.
   * @since 9
   * @see VarHandle#setRelease(Object[])
   */
  public void setRelease(Object[] args)
  {
    VarHandle testee = $$$();

    testee.setRelease(args);
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseAndAcquire(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseAndAcquire(Object[])
   */
  public Object getAndBitwiseAndAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseAndAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#toMethodHandle(AccessMode)}.
   * @since 9
   * @see VarHandle#toMethodHandle(AccessMode)
   */
  public MethodHandle toMethodHandle(AccessMode accessMode)
  {
    VarHandle testee = $$$();

    MethodHandle result = testee.toMethodHandle(accessMode);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getVolatile(Object[])}.
   * @since 9
   * @see VarHandle#getVolatile(Object[])
   */
  public Object getVolatile(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getVolatile(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSetPlain(Object[])}.
   * @since 9
   * @see VarHandle#weakCompareAndSetPlain(Object[])
   */
  public boolean weakCompareAndSetPlain(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#coordinateTypes()}.
   * @since 9
   * @see VarHandle#coordinateTypes()
   */
  public List<Class<?>> coordinateTypes()
  {
    VarHandle testee = $$$();

    List<Class<?>> result = testee.coordinateTypes();
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#storeStoreFence()}.
   * @since 9
   * @see VarHandle#storeStoreFence()
   */
  public static void storeStoreFence()
  {
    VarHandle.storeStoreFence();
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseXor(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseXor(Object[])
   */
  public Object getAndBitwiseXor(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseXor(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndSetRelease(Object[])}.
   * @since 9
   * @see VarHandle#getAndSetRelease(Object[])
   */
  public Object getAndSetRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndSetRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#compareAndExchange(Object[])}.
   * @since 9
   * @see VarHandle#compareAndExchange(Object[])
   */
  public Object compareAndExchange(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.compareAndExchange(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#fullFence()}.
   * @since 9
   * @see VarHandle#fullFence()
   */
  public static void fullFence()
  {
    VarHandle.fullFence();
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseAnd(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseAnd(Object[])
   */
  public Object getAndBitwiseAnd(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseAnd(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#accessModeType(AccessMode)}.
   * @since 9
   * @see VarHandle#accessModeType(AccessMode)
   */
  public MethodType accessModeType(AccessMode accessMode)
  {
    VarHandle testee = $$$();

    MethodType result = testee.accessModeType(accessMode);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAcquire(Object[])}.
   * @since 9
   * @see VarHandle#getAcquire(Object[])
   */
  public Object getAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseOr(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseOr(Object[])
   */
  public Object getAndBitwiseOr(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseOr(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#acquireFence()}.
   * @since 9
   * @see VarHandle#acquireFence()
   */
  public static void acquireFence()
  {
    VarHandle.acquireFence();
  }

  /**
   * Example call to new method {@link VarHandle#getOpaque(Object[])}.
   * @since 9
   * @see VarHandle#getOpaque(Object[])
   */
  public Object getOpaque(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getOpaque(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndSetAcquire(Object[])}.
   * @since 9
   * @see VarHandle#getAndSetAcquire(Object[])
   */
  public Object getAndSetAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndSetAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseOrRelease(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseOrRelease(Object[])
   */
  public Object getAndBitwiseOrRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseOrRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#varType()}.
   * @since 9
   * @see VarHandle#varType()
   */
  public Class<?> varType()
  {
    VarHandle testee = $$$();

    Class<?> result = testee.varType();
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseXorAcquire(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseXorAcquire(Object[])
   */
  public Object getAndBitwiseXorAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseXorAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#get(Object[])}.
   * @since 9
   * @see VarHandle#get(Object[])
   */
  public Object get(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.get(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#setVolatile(Object[])}.
   * @since 9
   * @see VarHandle#setVolatile(Object[])
   */
  public void setVolatile(Object[] args)
  {
    VarHandle testee = $$$();

    testee.setVolatile(args);
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseOrAcquire(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseOrAcquire(Object[])
   */
  public Object getAndBitwiseOrAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseOrAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndBitwiseAndRelease(Object[])}.
   * @since 9
   * @see VarHandle#getAndBitwiseAndRelease(Object[])
   */
  public Object getAndBitwiseAndRelease(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndBitwiseAndRelease(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndAdd(Object[])}.
   * @since 9
   * @see VarHandle#getAndAdd(Object[])
   */
  public Object getAndAdd(Object[] args)
  {
    VarHandle testee = $$$();

    Object result = testee.getAndAdd(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#releaseFence()}.
   * @since 9
   * @see VarHandle#releaseFence()
   */
  public static void releaseFence()
  {
    VarHandle.releaseFence();
  }

  /**
   * Example call to new method {@link VarHandle#weakCompareAndSetAcquire(Object[])}.
   * @since 9
   * @see VarHandle#weakCompareAndSetAcquire(Object[])
   */
  public boolean weakCompareAndSetAcquire(Object[] args)
  {
    VarHandle testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(args);
    return result;
  }

  /**
   * Example call to new method {@link VarHandle#getAndSet(Object[])}.
   * @since 9
   * @see VarHandle#getAndSet(Object[])
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
