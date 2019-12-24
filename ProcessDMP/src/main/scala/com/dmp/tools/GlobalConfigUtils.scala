package com.dmp.tools

import com.typesafe.config.ConfigFactory

class GlobalConfigUtils {
  /**
    * spark.worker.timeout="500"
spark.rpc.askTimeout="600s"
spark.network.timeoout="600s"
spark.cores.max="10"
spark.task.maxFailures="5"
spark.speculation="true"
spark.driver.allowMutilpleContext="true"
spark.serializer="org.apache.spark.serializer.KryoSerializer"
spark.buffer.pageSize="8m"*/
def conf = ConfigFactory.load();
 def sparkWorkerTimeout = conf.getString("spark.worker.timeout")
 def sparkRpcAskTimeout = conf.getString("spark.rpc.askTimeout")
 }
object GlobalConfigUtils extends GlobalConfigUtils{

}
