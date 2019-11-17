package whatisnewin.java.lang.module;

import java.lang.module.ModuleDescriptor;
import java.util.Set;
import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.module.ModuleDescriptor.Requires;
import java.lang.module.ModuleDescriptor.Exports;
import java.lang.module.ModuleDescriptor.Opens;
import java.lang.module.ModuleDescriptor.Provides;
import java.util.Optional;
import java.lang.module.ModuleDescriptor.Version;
import java.lang.module.ModuleDescriptor.Builder;
import java.io.InputStream;
import java.util.function.Supplier;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ModuleDescriptor}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ModuleDescriptor} is a completely new class.
 * @since 9
 * @see ModuleDescriptor
 */
public final class WhatIsNewInModuleDescriptor
{
  /**
   * Example call to new method {@link ModuleDescriptor#name()}.
   * @since 9
   * @see ModuleDescriptor#name()
   */
  public String name()
  {
    ModuleDescriptor testee = $$$();

    String result = testee.name();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#modifiers()}.
   * @since 9
   * @see ModuleDescriptor#modifiers()
   */
  public Set<Modifier> modifiers()
  {
    ModuleDescriptor testee = $$$();

    Set<Modifier> result = testee.modifiers();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#isOpen()}.
   * @since 9
   * @see ModuleDescriptor#isOpen()
   */
  public boolean isOpen()
  {
    ModuleDescriptor testee = $$$();

    boolean result = testee.isOpen();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#isAutomatic()}.
   * @since 9
   * @see ModuleDescriptor#isAutomatic()
   */
  public boolean isAutomatic()
  {
    ModuleDescriptor testee = $$$();

    boolean result = testee.isAutomatic();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#requires()}.
   * @since 9
   * @see ModuleDescriptor#requires()
   */
  public Set<Requires> requires()
  {
    ModuleDescriptor testee = $$$();

    Set<Requires> result = testee.requires();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#exports()}.
   * @since 9
   * @see ModuleDescriptor#exports()
   */
  public Set<Exports> exports()
  {
    ModuleDescriptor testee = $$$();

    Set<Exports> result = testee.exports();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#opens()}.
   * @since 9
   * @see ModuleDescriptor#opens()
   */
  public Set<Opens> opens()
  {
    ModuleDescriptor testee = $$$();

    Set<Opens> result = testee.opens();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#uses()}.
   * @since 9
   * @see ModuleDescriptor#uses()
   */
  public Set<String> uses()
  {
    ModuleDescriptor testee = $$$();

    Set<String> result = testee.uses();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#provides()}.
   * @since 9
   * @see ModuleDescriptor#provides()
   */
  public Set<Provides> provides()
  {
    ModuleDescriptor testee = $$$();

    Set<Provides> result = testee.provides();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#version()}.
   * @since 9
   * @see ModuleDescriptor#version()
   */
  public Optional<Version> version()
  {
    ModuleDescriptor testee = $$$();

    Optional<Version> result = testee.version();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#rawVersion()}.
   * @since 9
   * @see ModuleDescriptor#rawVersion()
   */
  public Optional<String> rawVersion()
  {
    ModuleDescriptor testee = $$$();

    Optional<String> result = testee.rawVersion();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#toNameAndVersion()}.
   * @since 9
   * @see ModuleDescriptor#toNameAndVersion()
   */
  public String toNameAndVersion()
  {
    ModuleDescriptor testee = $$$();

    String result = testee.toNameAndVersion();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#mainClass()}.
   * @since 9
   * @see ModuleDescriptor#mainClass()
   */
  public Optional<String> mainClass()
  {
    ModuleDescriptor testee = $$$();

    Optional<String> result = testee.mainClass();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#packages()}.
   * @since 9
   * @see ModuleDescriptor#packages()
   */
  public Set<String> packages()
  {
    ModuleDescriptor testee = $$$();

    Set<String> result = testee.packages();
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#compareTo(ModuleDescriptor)}.
   * @since 9
   * @see ModuleDescriptor#compareTo(ModuleDescriptor)
   */
  public int compareTo(ModuleDescriptor that)
  {
    ModuleDescriptor testee = $$$();

    int result = testee.compareTo(that);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#newModule(String, Set)}.
   * @since 9
   * @see ModuleDescriptor#newModule(String, Set)
   */
  public static Builder newModule(String name, Set<Modifier> ms)
  {
    Builder result = ModuleDescriptor.newModule(name, ms);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#newModule(String)}.
   * @since 9
   * @see ModuleDescriptor#newModule(String)
   */
  public static Builder newModule(String name)
  {
    Builder result = ModuleDescriptor.newModule(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#newOpenModule(String)}.
   * @since 9
   * @see ModuleDescriptor#newOpenModule(String)
   */
  public static Builder newOpenModule(String name)
  {
    Builder result = ModuleDescriptor.newOpenModule(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#newAutomaticModule(String)}.
   * @since 9
   * @see ModuleDescriptor#newAutomaticModule(String)
   */
  public static Builder newAutomaticModule(String name)
  {
    Builder result = ModuleDescriptor.newAutomaticModule(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#read(InputStream, Supplier)}.
   * @since 9
   * @see ModuleDescriptor#read(InputStream, Supplier)
   */
  public static ModuleDescriptor read(InputStream in, Supplier<Set<String>> packageFinder) throws IOException
  {
    ModuleDescriptor result = ModuleDescriptor.read(in, packageFinder);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#read(InputStream)}.
   * @since 9
   * @see ModuleDescriptor#read(InputStream)
   */
  public static ModuleDescriptor read(InputStream in) throws IOException
  {
    ModuleDescriptor result = ModuleDescriptor.read(in);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#read(ByteBuffer, Supplier)}.
   * @since 9
   * @see ModuleDescriptor#read(ByteBuffer, Supplier)
   */
  public static ModuleDescriptor read(ByteBuffer bb, Supplier<Set<String>> packageFinder)
  {
    ModuleDescriptor result = ModuleDescriptor.read(bb, packageFinder);
    return result;
  }

  /**
   * Example call to new method {@link ModuleDescriptor#read(ByteBuffer)}.
   * @since 9
   * @see ModuleDescriptor#read(ByteBuffer)
   */
  public static ModuleDescriptor read(ByteBuffer bb)
  {
    ModuleDescriptor result = ModuleDescriptor.read(bb);
    return result;
  }

  private ModuleDescriptor $$$()
  {
    return null;
  }
}
