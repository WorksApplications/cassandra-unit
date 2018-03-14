package org.cassandraunit.spring;

import org.cassandraunit.utils.EmbeddedCassandraServerHelper;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to start an embedded Cassandra
 *
 * @author Olivier Bazoud
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface EmbeddedCassandra {
  // cassandra configuration file
  String configuration() default EmbeddedCassandraServerHelper.DEFAULT_CASSANDRA_YML_FILE;
  long timeout() default EmbeddedCassandraServerHelper.DEFAULT_STARTUP_TIMEOUT;
  
  int port() default 9144;
  
  String host() default "127.0.0.1";
  
  String clusterName() default "Test Cluster";
}
