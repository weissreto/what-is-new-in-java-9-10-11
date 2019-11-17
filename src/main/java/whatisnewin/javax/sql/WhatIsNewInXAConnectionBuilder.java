package whatisnewin.javax.sql;

import javax.sql.XAConnectionBuilder;
import java.sql.ShardingKey;
import javax.sql.XAConnection;
import java.sql.SQLException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link XAConnectionBuilder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link XAConnectionBuilder} is a completely new class.
 * @since 9
 * @see XAConnectionBuilder
 */
public final class WhatIsNewInXAConnectionBuilder
{
  /**
   * Example call to new method {@link XAConnectionBuilder#user(String)}.
   * @since 9
   * @see XAConnectionBuilder#user(String)
   */
  public XAConnectionBuilder user(String username)
  {
    XAConnectionBuilder testee = $$$();

    XAConnectionBuilder result = testee.user(username);
    return result;
  }

  /**
   * Example call to new method {@link XAConnectionBuilder#password(String)}.
   * @since 9
   * @see XAConnectionBuilder#password(String)
   */
  public XAConnectionBuilder password(String password)
  {
    XAConnectionBuilder testee = $$$();

    XAConnectionBuilder result = testee.password(password);
    return result;
  }

  /**
   * Example call to new method {@link XAConnectionBuilder#shardingKey(ShardingKey)}.
   * @since 9
   * @see XAConnectionBuilder#shardingKey(ShardingKey)
   */
  public XAConnectionBuilder shardingKey(ShardingKey shardingKey)
  {
    XAConnectionBuilder testee = $$$();

    XAConnectionBuilder result = testee.shardingKey(shardingKey);
    return result;
  }

  /**
   * Example call to new method {@link XAConnectionBuilder#superShardingKey(ShardingKey)}.
   * @since 9
   * @see XAConnectionBuilder#superShardingKey(ShardingKey)
   */
  public XAConnectionBuilder superShardingKey(ShardingKey superShardingKey)
  {
    XAConnectionBuilder testee = $$$();

    XAConnectionBuilder result = testee.superShardingKey(superShardingKey);
    return result;
  }

  /**
   * Example call to new method {@link XAConnectionBuilder#build()}.
   * @since 9
   * @see XAConnectionBuilder#build()
   */
  public XAConnection build() throws SQLException
  {
    XAConnectionBuilder testee = $$$();

    XAConnection result = testee.build();
    return result;
  }

  private XAConnectionBuilder $$$()
  {
    return null;
  }
}
