package com.cango.thirty.party.metric;


        import com.codahale.metrics.ConsoleReporter;
        import com.codahale.metrics.Histogram;
        import com.codahale.metrics.MetricRegistry;

        import java.util.Random;
        import java.util.concurrent.TimeUnit;

        import static com.codahale.metrics.MetricRegistry.name;

/**
 * User: hzwangxx
 * Date: 14-2-17
 * Time: 18:34
 * 测试Histograms
 */
public class TestHistograms {
    /**
     * 实例化一个registry，最核心的一个模块，相当于一个应用程序的metrics系统的容器，维护一个Map
     */
    private static final MetricRegistry metrics = new MetricRegistry();

    /**
     * 在控制台上打印输出
     */
    private static ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).build();

    /**
     * 实例化一个Histograms
     */
    private static final Histogram randomNums = metrics.histogram(name(TestHistograms.class, "random"));

    public static void handleRequest(double random) {
        randomNums.update((int) (random*100));
    }

    public static void main(String[] args) throws InterruptedException {
        reporter.start(3, TimeUnit.SECONDS);
        Random rand = new Random();
        while(true){
            handleRequest(rand.nextDouble());
            Thread.sleep(100);
        }
    }

}

/*
14-2-17 19:39:11 ===============================================================

-- Histograms ------------------------------------------------------------------
com.netease.test.metrics.TestHistograms.random
             count = 30
               min = 1
               max = 97
              mean = 45.93
            stddev = 29.12
            median = 39.50
              75% <= 71.00
              95% <= 95.90
              98% <= 97.00
              99% <= 97.00
            99.9% <= 97.00


14-2-17 19:39:14 ===============================================================

-- Histograms ------------------------------------------------------------------
com.netease.test.metrics.TestHistograms.random
             count = 60
               min = 0
               max = 97
              mean = 41.17
            stddev = 28.60
            median = 34.50
              75% <= 69.75
              95% <= 92.90
              98% <= 96.56
              99% <= 97.00
            99.9% <= 97.00


14-2-17 19:39:17 ===============================================================

-- Histograms ------------------------------------------------------------------
com.netease.test.metrics.TestHistograms.random
             count = 90
               min = 0
               max = 97
              mean = 44.67
            stddev = 28.47
            median = 43.00
              75% <= 71.00
              95% <= 91.90
              98% <= 96.18
              99% <= 97.00
            99.9% <= 97.00
*/