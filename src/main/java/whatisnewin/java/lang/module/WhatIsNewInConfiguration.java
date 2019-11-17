package whatisnewin.java.lang.module;

import java.lang.module.Configuration;
import java.lang.module.ModuleFinder;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.lang.module.ResolvedModule;
import java.util.Optional;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Configuration}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Configuration} is a completely new class.
 * @since 9
 * @see Configuration
 */
public final class WhatIsNewInConfiguration
{
  /**
   * Example call to new method {@link Configuration#resolve(ModuleFinder, ModuleFinder, Collection)}.
   * @since 9
   * @see Configuration#resolve(ModuleFinder, ModuleFinder, Collection)
   */
  public Configuration resolve(ModuleFinder before, ModuleFinder after, Collection<String> roots)
  {
    Configuration testee = $$$();

    Configuration result = testee.resolve(before, after, roots);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#resolveAndBind(ModuleFinder, ModuleFinder, Collection)}.
   * @since 9
   * @see Configuration#resolveAndBind(ModuleFinder, ModuleFinder, Collection)
   */
  public Configuration resolveAndBind(ModuleFinder before, ModuleFinder after, Collection<String> roots)
  {
    Configuration testee = $$$();

    Configuration result = testee.resolveAndBind(before, after, roots);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#resolve(ModuleFinder, List, ModuleFinder, Collection)}.
   * @since 9
   * @see Configuration#resolve(ModuleFinder, List, ModuleFinder, Collection)
   */
  public static Configuration resolve(ModuleFinder before, List<Configuration> parents, ModuleFinder after, Collection<String> roots)
  {
    Configuration result = Configuration.resolve(before, parents, after, roots);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#resolveAndBind(ModuleFinder, List, ModuleFinder, Collection)}.
   * @since 9
   * @see Configuration#resolveAndBind(ModuleFinder, List, ModuleFinder, Collection)
   */
  public static Configuration resolveAndBind(ModuleFinder before, List<Configuration> parents, ModuleFinder after, Collection<String> roots)
  {
    Configuration result = Configuration.resolveAndBind(before, parents, after, roots);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#empty()}.
   * @since 9
   * @see Configuration#empty()
   */
  public static Configuration empty()
  {
    Configuration result = Configuration.empty();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#parents()}.
   * @since 9
   * @see Configuration#parents()
   */
  public List<Configuration> parents()
  {
    Configuration testee = $$$();

    List<Configuration> result = testee.parents();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#modules()}.
   * @since 9
   * @see Configuration#modules()
   */
  public Set<ResolvedModule> modules()
  {
    Configuration testee = $$$();

    Set<ResolvedModule> result = testee.modules();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#findModule(String)}.
   * @since 9
   * @see Configuration#findModule(String)
   */
  public Optional<ResolvedModule> findModule(String name)
  {
    Configuration testee = $$$();

    Optional<ResolvedModule> result = testee.findModule(name);
    return result;
  }

  private Configuration $$$()
  {
    return null;
  }
}
