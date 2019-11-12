package whatisnewin.java.sql;

import java.sql.ShardingKeyBuilder;
import java.sql.ShardingKey;
import java.sql.SQLException;
import java.sql.SQLType;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ShardingKeyBuilder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ShardingKeyBuilder} is a completely new class
 * @since 9
 * @see ShardingKeyBuilder
 */
public final class WhatIsNewInShardingKeyBuilder
{
  /**
   * Example call to new method {@link ShardingKeyBuilder#build}
   * @since 9
   * @see ShardingKeyBuilder#build
   */
  public ShardingKey build() throws SQLException
  {
    ShardingKeyBuilder testee = $$$();

    ShardingKey result = testee.build();
    return result;
  }

  /**
   * Example call to new method {@link ShardingKeyBuilder#subkey}
   * @since 9
   * @see ShardingKeyBuilder#subkey
   */
  public ShardingKeyBuilder subkey(Object subkey, SQLType subkeyType)
  {
    ShardingKeyBuilder testee = $$$();

    ShardingKeyBuilder result = testee.subkey(subkey, subkeyType);
    return result;
  }

  private ShardingKeyBuilder $$$()
  {
    return null;
  }
}