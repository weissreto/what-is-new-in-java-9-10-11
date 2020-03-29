package whatisnewin.java.util.concurrent;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Subscriber}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Subscriber} is a completely new class.
 * @since 9
 * @see Subscriber
 */
public final class WhatIsNewInFlow$Subscriber<T>
{
  /**
   * Example call to new method {@link Subscriber#onSubscribe(Subscription)}.
   * @since 9
   * @see Subscriber#onSubscribe(Subscription)
   */
  public void onSubscribe(Subscription subscription)
  {
    Subscriber<T> testee = $$$();

    testee.onSubscribe(subscription);
  }

  /**
   * Example call to new method {@link Subscriber#onNext(Object)}.
   * @since 9
   * @see Subscriber#onNext(Object)
   */
  public void onNext(T item)
  {
    Subscriber<T> testee = $$$();

    testee.onNext(item);
  }

  /**
   * Example call to new method {@link Subscriber#onError(Throwable)}.
   * @since 9
   * @see Subscriber#onError(Throwable)
   */
  public void onError(Throwable throwable)
  {
    Subscriber<T> testee = $$$();

    testee.onError(throwable);
  }

  /**
   * Example call to new method {@link Subscriber#onComplete()}.
   * @since 9
   * @see Subscriber#onComplete()
   */
  public void onComplete()
  {
    Subscriber<T> testee = $$$();

    testee.onComplete();
  }

  private Subscriber<T> $$$()
  {
    return null;
  }
}