package whatisnewin.java.lang.module;

import java.lang.module.ModuleDescriptor.Builder;
import java.lang.module.ModuleDescriptor.Requires;
import java.util.Set;
import java.lang.module.ModuleDescriptor.Requires.Modifier;
import java.lang.module.ModuleDescriptor.Version;
import java.lang.module.ModuleDescriptor.Exports;
import java.lang.module.ModuleDescriptor.Opens;
import java.lang.module.ModuleDescriptor.Provides;
import java.util.List;
import java.lang.module.ModuleDescriptor;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Builder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Builder} is a completely new class.
 * @since 9
 * @see Builder
 */
public final class WhatIsNewInModuleDescriptor$Builder
{
  /**
   * Example call to new method {@link Builder#requires(Requires)}.
   * @since 9
   * @see Builder#requires(Requires)
   */
  public Builder requires(Requires req)
  {
    Builder testee = $$$();

    Builder result = testee.requires(req);
    return result;
  }

  /**
   * Example call to new method {@link Builder#requires(Set, String, Version)}.
   * @since 9
   * @see Builder#requires(Set, String, Version)
   */
  public Builder requires(Set<Modifier> ms, String mn, Version compiledVersion)
  {
    Builder testee = $$$();

    Builder result = testee.requires(ms, mn, compiledVersion);
    return result;
  }

  /**
   * Example call to new method {@link Builder#requires(Set, String)}.
   * @since 9
   * @see Builder#requires(Set, String)
   */
  public Builder requires(Set<Modifier> ms, String mn)
  {
    Builder testee = $$$();

    Builder result = testee.requires(ms, mn);
    return result;
  }

  /**
   * Example call to new method {@link Builder#requires(String)}.
   * @since 9
   * @see Builder#requires(String)
   */
  public Builder requires(String mn)
  {
    Builder testee = $$$();

    Builder result = testee.requires(mn);
    return result;
  }

  /**
   * Example call to new method {@link Builder#exports(Exports)}.
   * @since 9
   * @see Builder#exports(Exports)
   */
  public Builder exports(Exports e)
  {
    Builder testee = $$$();

    Builder result = testee.exports(e);
    return result;
  }

  /**
   * Example call to new method {@link Builder#exports(Set, String, Set)}.
   * @since 9
   * @see Builder#exports(Set, String, Set)
   */
  public Builder exports(Set<java.lang.module.ModuleDescriptor.Exports.Modifier> ms, String pn, Set<String> targets)
  {
    Builder testee = $$$();

    Builder result = testee.exports(ms, pn, targets);
    return result;
  }

  /**
   * Example call to new method {@link Builder#exports(Set, String)}.
   * @since 9
   * @see Builder#exports(Set, String)
   */
  public Builder exports(Set<java.lang.module.ModuleDescriptor.Exports.Modifier> ms, String pn)
  {
    Builder testee = $$$();

    Builder result = testee.exports(ms, pn);
    return result;
  }

  /**
   * Example call to new method {@link Builder#exports(String, Set)}.
   * @since 9
   * @see Builder#exports(String, Set)
   */
  public Builder exports(String pn, Set<String> targets)
  {
    Builder testee = $$$();

    Builder result = testee.exports(pn, targets);
    return result;
  }

  /**
   * Example call to new method {@link Builder#exports(String)}.
   * @since 9
   * @see Builder#exports(String)
   */
  public Builder exports(String pn)
  {
    Builder testee = $$$();

    Builder result = testee.exports(pn);
    return result;
  }

  /**
   * Example call to new method {@link Builder#opens(Opens)}.
   * @since 9
   * @see Builder#opens(Opens)
   */
  public Builder opens(Opens obj)
  {
    Builder testee = $$$();

    Builder result = testee.opens(obj);
    return result;
  }

  /**
   * Example call to new method {@link Builder#opens(Set, String, Set)}.
   * @since 9
   * @see Builder#opens(Set, String, Set)
   */
  public Builder opens(Set<java.lang.module.ModuleDescriptor.Opens.Modifier> ms, String pn, Set<String> targets)
  {
    Builder testee = $$$();

    Builder result = testee.opens(ms, pn, targets);
    return result;
  }

  /**
   * Example call to new method {@link Builder#opens(Set, String)}.
   * @since 9
   * @see Builder#opens(Set, String)
   */
  public Builder opens(Set<java.lang.module.ModuleDescriptor.Opens.Modifier> ms, String pn)
  {
    Builder testee = $$$();

    Builder result = testee.opens(ms, pn);
    return result;
  }

  /**
   * Example call to new method {@link Builder#opens(String, Set)}.
   * @since 9
   * @see Builder#opens(String, Set)
   */
  public Builder opens(String pn, Set<String> targets)
  {
    Builder testee = $$$();

    Builder result = testee.opens(pn, targets);
    return result;
  }

  /**
   * Example call to new method {@link Builder#opens(String)}.
   * @since 9
   * @see Builder#opens(String)
   */
  public Builder opens(String pn)
  {
    Builder testee = $$$();

    Builder result = testee.opens(pn);
    return result;
  }

  /**
   * Example call to new method {@link Builder#uses(String)}.
   * @since 9
   * @see Builder#uses(String)
   */
  public Builder uses(String service)
  {
    Builder testee = $$$();

    Builder result = testee.uses(service);
    return result;
  }

  /**
   * Example call to new method {@link Builder#provides(Provides)}.
   * @since 9
   * @see Builder#provides(Provides)
   */
  public Builder provides(Provides p)
  {
    Builder testee = $$$();

    Builder result = testee.provides(p);
    return result;
  }

  /**
   * Example call to new method {@link Builder#provides(String, List)}.
   * @since 9
   * @see Builder#provides(String, List)
   */
  public Builder provides(String service, List<String> providers)
  {
    Builder testee = $$$();

    Builder result = testee.provides(service, providers);
    return result;
  }

  /**
   * Example call to new method {@link Builder#packages(Set)}.
   * @since 9
   * @see Builder#packages(Set)
   */
  public Builder packages(Set<String> pns)
  {
    Builder testee = $$$();

    Builder result = testee.packages(pns);
    return result;
  }

  /**
   * Example call to new method {@link Builder#version(Version)}.
   * @since 9
   * @see Builder#version(Version)
   */
  public Builder version(Version v)
  {
    Builder testee = $$$();

    Builder result = testee.version(v);
    return result;
  }

  /**
   * Example call to new method {@link Builder#version(String)}.
   * @since 9
   * @see Builder#version(String)
   */
  public Builder version(String vs)
  {
    Builder testee = $$$();

    Builder result = testee.version(vs);
    return result;
  }

  /**
   * Example call to new method {@link Builder#mainClass(String)}.
   * @since 9
   * @see Builder#mainClass(String)
   */
  public Builder mainClass(String mc)
  {
    Builder testee = $$$();

    Builder result = testee.mainClass(mc);
    return result;
  }

  /**
   * Example call to new method {@link Builder#build()}.
   * @since 9
   * @see Builder#build()
   */
  public ModuleDescriptor build()
  {
    Builder testee = $$$();

    ModuleDescriptor result = testee.build();
    return result;
  }

  private Builder $$$()
  {
    return null;
  }
}
