# Benchmark Results

See [README](../README.md#running-benchmarks-locally) for reference.

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [Machine Details](#machine-details)
- [JMH Results](#jmh-results)
  - [HTTP](#http)
  - [frees-rpc - Protobuf Serialization](#frees-rpc---protobuf-serialization)
  - [frees-rpc - Avro Serialization](#frees-rpc---avro-serialization)
- [Summary](#summary)
  - [HTTP](#http-1)
  - [frees-rpc - Protobuf Serialization](#frees-rpc---protobuf-serialization-1)
  - [frees-rpc - Avro Serialization](#frees-rpc---avro-serialization-1)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Machine Details

* Model Name: MacBook Pro
* Model Identifier: MacBookPro12,1
* Intel(R) Core(TM) i5-5257U CPU @ 2.70GHz
* Number of Processors: 1
* Total Number of Cores: 2
* L2 Cache (per Core): 256 KB
* L3 Cache: 3 MB
* Memory: 16 GB
* MacOS Sierra version 10.12

## JMH Results

### HTTP

```bash
# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 43.510 ops/s
# Warmup Iteration   2: 221.061 ops/s
# Warmup Iteration   3: 282.533 ops/s
# Warmup Iteration   4: 355.553 ops/s
# Warmup Iteration   5: 447.621 ops/s
# Warmup Iteration   6: 671.389 ops/s
# Warmup Iteration   7: 1008.352 ops/s
# Warmup Iteration   8: 1037.159 ops/s
# Warmup Iteration   9: 1185.099 ops/s
# Warmup Iteration  10: 1172.908 ops/s
# Warmup Iteration  11: 1301.674 ops/s
# Warmup Iteration  12: 1427.618 ops/s
# Warmup Iteration  13: 1578.590 ops/s
# Warmup Iteration  14: 1847.790 ops/s
# Warmup Iteration  15: 2019.680 ops/s
# Warmup Iteration  16: 2011.505 ops/s
# Warmup Iteration  17: 3040.319 ops/s
# Warmup Iteration  18: 3246.264 ops/s
# Warmup Iteration  19: 3366.176 ops/s
# Warmup Iteration  20: 3464.709 ops/s
Iteration   1: 3883.167 ops/s
Iteration   2: 4757.768 ops/s
Iteration   3: 4704.927 ops/s
Iteration   4: 4636.892 ops/s
Iteration   5: 4806.129 ops/s
Iteration   6: 4720.934 ops/s
Iteration   7: 4266.212 ops/s
Iteration   8: 4586.290 ops/s
Iteration   9: 4887.401 ops/s
Iteration  10: 4911.264 ops/s
Iteration  11: 4444.473 ops/s
Iteration  12: 4866.564 ops/s
Iteration  13: 4891.001 ops/s
Iteration  14: 4907.989 ops/s
Iteration  15: 4813.406 ops/s
Iteration  16: 4873.560 ops/s
Iteration  17: 4767.386 ops/s
Iteration  18: 4737.670 ops/s
Iteration  19: 4773.330 ops/s
Iteration  20: 4645.576 ops/s

# Run progress: 10.00% complete, ETA 00:07:58
# Fork: 2 of 2
# Warmup Iteration   1: 203.539 ops/s
# Warmup Iteration   2: 417.571 ops/s
# Warmup Iteration   3: 630.626 ops/s
# Warmup Iteration   4: 908.377 ops/s
# Warmup Iteration   5: 1487.350 ops/s
# Warmup Iteration   6: 2275.190 ops/s
# Warmup Iteration   7: 2349.210 ops/s
# Warmup Iteration   8: 2416.382 ops/s
# Warmup Iteration   9: 2349.110 ops/s
# Warmup Iteration  10: 2245.628 ops/s
# Warmup Iteration  11: 1995.283 ops/s
# Warmup Iteration  12: 2319.389 ops/s
# Warmup Iteration  13: 2469.575 ops/s
# Warmup Iteration  14: 2455.067 ops/s
# Warmup Iteration  15: 2598.714 ops/s
# Warmup Iteration  16: 2848.341 ops/s
# Warmup Iteration  17: 3089.351 ops/s
# Warmup Iteration  18: 3467.718 ops/s
# Warmup Iteration  19: 4486.663 ops/s
# Warmup Iteration  20: 4425.317 ops/s
Iteration   1: 4560.030 ops/s
Iteration   2: 4633.449 ops/s
Iteration   3: 4562.372 ops/s
Iteration   4: 4479.963 ops/s
Iteration   5: 4543.647 ops/s
Iteration   6: 4320.779 ops/s
Iteration   7: 4594.993 ops/s
Iteration   8: 4632.599 ops/s
Iteration   9: 4653.009 ops/s
Iteration  10: 4589.033 ops/s
Iteration  11: 4539.322 ops/s
Iteration  12: 4623.012 ops/s
Iteration  13: 4607.413 ops/s
Iteration  14: 4463.483 ops/s
Iteration  15: 4681.815 ops/s
Iteration  16: 4151.344 ops/s
Iteration  17: 4596.998 ops/s
Iteration  18: 4595.828 ops/s
Iteration  19: 4481.062 ops/s
Iteration  20: 4638.755 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  4620.771 ±(99.9%) 117.685 ops/s [Average]
  (min, avg, max) = (3883.167, 4620.771, 4911.264), stdev = 209.185
  CI (99.9%): [4503.086, 4738.456] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:07:01
# Fork: 1 of 2
# Warmup Iteration   1: 163.063 ops/s
# Warmup Iteration   2: 351.454 ops/s
# Warmup Iteration   3: 566.578 ops/s
# Warmup Iteration   4: 819.371 ops/s
# Warmup Iteration   5: 1130.959 ops/s
# Warmup Iteration   6: 2003.818 ops/s
# Warmup Iteration   7: 2775.638 ops/s
# Warmup Iteration   8: 2876.509 ops/s
# Warmup Iteration   9: 3106.245 ops/s
# Warmup Iteration  10: 3191.927 ops/s
# Warmup Iteration  11: 3304.354 ops/s
# Warmup Iteration  12: 3631.052 ops/s
# Warmup Iteration  13: 3500.010 ops/s
# Warmup Iteration  14: 3266.622 ops/s
# Warmup Iteration  15: 3564.205 ops/s
# Warmup Iteration  16: 3789.631 ops/s
# Warmup Iteration  17: 3859.481 ops/s
# Warmup Iteration  18: 3954.681 ops/s
# Warmup Iteration  19: 4006.781 ops/s
# Warmup Iteration  20: 4267.094 ops/s
Iteration   1: 5198.748 ops/s
Iteration   2: 5741.194 ops/s
Iteration   3: 6724.526 ops/s
Iteration   4: 6554.575 ops/s
Iteration   5: 6752.028 ops/s
Iteration   6: 6323.795 ops/s
Iteration   7: 6680.944 ops/s
Iteration   8: 6615.720 ops/s
Iteration   9: 6792.500 ops/s
Iteration  10: 6792.057 ops/s
Iteration  11: 6558.586 ops/s
Iteration  12: 6724.301 ops/s
Iteration  13: 6784.188 ops/s
Iteration  14: 6834.888 ops/s
Iteration  15: 6920.985 ops/s
Iteration  16: 6838.708 ops/s
Iteration  17: 6887.244 ops/s
Iteration  18: 6830.377 ops/s
Iteration  19: 6855.358 ops/s
Iteration  20: 7069.771 ops/s

# Run progress: 30.00% complete, ETA 00:06:07
# Fork: 2 of 2
# Warmup Iteration   1: 257.134 ops/s
# Warmup Iteration   2: 386.838 ops/s
# Warmup Iteration   3: 510.163 ops/s
# Warmup Iteration   4: 856.128 ops/s
# Warmup Iteration   5: 1264.543 ops/s
# Warmup Iteration   6: 2095.262 ops/s
# Warmup Iteration   7: 3105.732 ops/s
# Warmup Iteration   8: 3025.020 ops/s
# Warmup Iteration   9: 3100.937 ops/s
# Warmup Iteration  10: 3282.120 ops/s
# Warmup Iteration  11: 2825.402 ops/s
# Warmup Iteration  12: 3731.040 ops/s
# Warmup Iteration  13: 3446.720 ops/s
# Warmup Iteration  14: 3387.123 ops/s
# Warmup Iteration  15: 3096.350 ops/s
# Warmup Iteration  16: 3200.781 ops/s
# Warmup Iteration  17: 3336.513 ops/s
# Warmup Iteration  18: 3334.792 ops/s
# Warmup Iteration  19: 3027.195 ops/s
# Warmup Iteration  20: 2894.231 ops/s
Iteration   1: 2824.646 ops/s
Iteration   2: 3400.329 ops/s
Iteration   3: 3955.631 ops/s
Iteration   4: 3980.853 ops/s
Iteration   5: 4914.927 ops/s
Iteration   6: 5324.717 ops/s
Iteration   7: 5509.429 ops/s
Iteration   8: 5190.754 ops/s
Iteration   9: 5357.845 ops/s
Iteration  10: 5091.802 ops/s
Iteration  11: 5482.609 ops/s
Iteration  12: 4920.992 ops/s
Iteration  13: 4913.499 ops/s
Iteration  14: 5076.005 ops/s
Iteration  15: 5026.036 ops/s
Iteration  16: 5473.480 ops/s
Iteration  17: 5378.620 ops/s
Iteration  18: 4392.366 ops/s
Iteration  19: 5775.203 ops/s
Iteration  20: 5314.163 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  5744.610 ±(99.9%) 609.674 ops/s [Average]
  (min, avg, max) = (2824.646, 5744.610, 7069.771), stdev = 1083.695
  CI (99.9%): [5134.936, 6354.284] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:05:15
# Fork: 1 of 2
# Warmup Iteration   1: 141.620 ops/s
# Warmup Iteration   2: 250.533 ops/s
# Warmup Iteration   3: 390.273 ops/s
# Warmup Iteration   4: 544.410 ops/s
# Warmup Iteration   5: 743.903 ops/s
# Warmup Iteration   6: 1172.080 ops/s
# Warmup Iteration   7: 1779.578 ops/s
# Warmup Iteration   8: 1730.600 ops/s
# Warmup Iteration   9: 2006.945 ops/s
# Warmup Iteration  10: 2067.712 ops/s
# Warmup Iteration  11: 1716.376 ops/s
# Warmup Iteration  12: 2010.082 ops/s
# Warmup Iteration  13: 1997.685 ops/s
# Warmup Iteration  14: 2225.685 ops/s
# Warmup Iteration  15: 2273.175 ops/s
# Warmup Iteration  16: 2361.265 ops/s
# Warmup Iteration  17: 2327.914 ops/s
# Warmup Iteration  18: 2546.797 ops/s
# Warmup Iteration  19: 2583.281 ops/s
# Warmup Iteration  20: 2643.300 ops/s
Iteration   1: 2961.017 ops/s
Iteration   2: 2745.500 ops/s
Iteration   3: 2891.227 ops/s
Iteration   4: 2962.498 ops/s
Iteration   5: 2865.053 ops/s
Iteration   6: 3038.719 ops/s
Iteration   7: 2996.363 ops/s
Iteration   8: 3261.995 ops/s
Iteration   9: 2865.276 ops/s
Iteration  10: 2251.221 ops/s
Iteration  11: 2554.376 ops/s
Iteration  12: 2841.386 ops/s
Iteration  13: 2762.960 ops/s
Iteration  14: 2663.116 ops/s
Iteration  15: 2842.681 ops/s
Iteration  16: 3044.412 ops/s
Iteration  17: 3229.825 ops/s
Iteration  18: 3126.887 ops/s
Iteration  19: 2793.049 ops/s
Iteration  20: 3092.113 ops/s

# Run progress: 50.00% complete, ETA 00:04:23
# Fork: 2 of 2
# Warmup Iteration   1: 211.520 ops/s
# Warmup Iteration   2: 453.025 ops/s
# Warmup Iteration   3: 614.270 ops/s
# Warmup Iteration   4: 885.855 ops/s
# Warmup Iteration   5: 1330.872 ops/s
# Warmup Iteration   6: 2038.976 ops/s
# Warmup Iteration   7: 2009.015 ops/s
# Warmup Iteration   8: 1714.825 ops/s
# Warmup Iteration   9: 1843.501 ops/s
# Warmup Iteration  10: 1991.572 ops/s
# Warmup Iteration  11: 2058.947 ops/s
# Warmup Iteration  12: 2561.800 ops/s
# Warmup Iteration  13: 2527.656 ops/s
# Warmup Iteration  14: 2604.935 ops/s
# Warmup Iteration  15: 2814.943 ops/s
# Warmup Iteration  16: 2838.798 ops/s
# Warmup Iteration  17: 2936.013 ops/s
# Warmup Iteration  18: 2735.684 ops/s
# Warmup Iteration  19: 2972.722 ops/s
# Warmup Iteration  20: 2977.990 ops/s
Iteration   1: 3035.602 ops/s
Iteration   2: 3658.212 ops/s
Iteration   3: 4171.925 ops/s
Iteration   4: 4325.421 ops/s
Iteration   5: 4210.711 ops/s
Iteration   6: 3781.112 ops/s
Iteration   7: 4366.542 ops/s
Iteration   8: 4001.172 ops/s
Iteration   9: 4059.084 ops/s
Iteration  10: 4225.294 ops/s
Iteration  11: 4217.777 ops/s
Iteration  12: 4241.982 ops/s
Iteration  13: 4566.492 ops/s
Iteration  14: 4482.204 ops/s
Iteration  15: 4427.826 ops/s
Iteration  16: 4306.382 ops/s
Iteration  17: 4223.496 ops/s
Iteration  18: 4147.567 ops/s
Iteration  19: 4262.701 ops/s
Iteration  20: 4539.529 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  3526.018 ±(99.9%) 398.348 ops/s [Average]
  (min, avg, max) = (2251.221, 3526.018, 4566.492), stdev = 708.063
  CI (99.9%): [3127.670, 3924.365] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:03:30
# Fork: 1 of 2
# Warmup Iteration   1: 198.743 ops/s
# Warmup Iteration   2: 439.988 ops/s
# Warmup Iteration   3: 730.943 ops/s
# Warmup Iteration   4: 974.811 ops/s
# Warmup Iteration   5: 1004.119 ops/s
# Warmup Iteration   6: 1309.905 ops/s
# Warmup Iteration   7: 2035.155 ops/s
# Warmup Iteration   8: 2153.801 ops/s
# Warmup Iteration   9: 2544.428 ops/s
# Warmup Iteration  10: 2697.530 ops/s
# Warmup Iteration  11: 2355.972 ops/s
# Warmup Iteration  12: 2742.637 ops/s
# Warmup Iteration  13: 2877.070 ops/s
# Warmup Iteration  14: 2568.399 ops/s
# Warmup Iteration  15: 3001.969 ops/s
# Warmup Iteration  16: 2970.940 ops/s
# Warmup Iteration  17: 2843.443 ops/s
# Warmup Iteration  18: 2907.792 ops/s
# Warmup Iteration  19: 3035.474 ops/s
# Warmup Iteration  20: 3374.525 ops/s
Iteration   1: 3474.778 ops/s
Iteration   2: 3455.957 ops/s
Iteration   3: 4314.542 ops/s
Iteration   4: 4773.083 ops/s
Iteration   5: 4692.103 ops/s
Iteration   6: 4970.024 ops/s
Iteration   7: 5072.755 ops/s
Iteration   8: 5164.778 ops/s
Iteration   9: 5164.712 ops/s
Iteration  10: 5258.754 ops/s
Iteration  11: 5094.687 ops/s
Iteration  12: 5215.126 ops/s
Iteration  13: 5149.733 ops/s
Iteration  14: 4910.094 ops/s
Iteration  15: 4860.639 ops/s
Iteration  16: 4929.305 ops/s
Iteration  17: 4996.446 ops/s
Iteration  18: 4911.834 ops/s
Iteration  19: 5164.724 ops/s
Iteration  20: 4779.747 ops/s

# Run progress: 70.00% complete, ETA 00:02:37
# Fork: 2 of 2
# Warmup Iteration   1: 195.141 ops/s
# Warmup Iteration   2: 445.708 ops/s
# Warmup Iteration   3: 759.417 ops/s
# Warmup Iteration   4: 975.407 ops/s
# Warmup Iteration   5: 1474.582 ops/s
# Warmup Iteration   6: 1544.898 ops/s
# Warmup Iteration   7: 2326.835 ops/s
# Warmup Iteration   8: 2499.049 ops/s
# Warmup Iteration   9: 2261.776 ops/s
# Warmup Iteration  10: 2062.134 ops/s
# Warmup Iteration  11: 2053.726 ops/s
# Warmup Iteration  12: 2165.309 ops/s
# Warmup Iteration  13: 2210.555 ops/s
# Warmup Iteration  14: 2637.696 ops/s
# Warmup Iteration  15: 2740.356 ops/s
# Warmup Iteration  16: 3075.799 ops/s
# Warmup Iteration  17: 3148.320 ops/s
# Warmup Iteration  18: 2857.093 ops/s
# Warmup Iteration  19: 3060.997 ops/s
# Warmup Iteration  20: 3131.750 ops/s
Iteration   1: 3241.331 ops/s
Iteration   2: 4326.085 ops/s
Iteration   3: 4108.397 ops/s
Iteration   4: 3027.347 ops/s
Iteration   5: 4417.277 ops/s
Iteration   6: 3974.355 ops/s
Iteration   7: 3556.897 ops/s
Iteration   8: 4124.323 ops/s
Iteration   9: 3884.907 ops/s
Iteration  10: 3807.296 ops/s
Iteration  11: 3721.463 ops/s
Iteration  12: 3482.444 ops/s
Iteration  13: 3541.355 ops/s
Iteration  14: 4316.629 ops/s
Iteration  15: 4405.351 ops/s
Iteration  16: 3931.848 ops/s
Iteration  17: 3488.777 ops/s
Iteration  18: 4538.124 ops/s
Iteration  19: 4132.678 ops/s
Iteration  20: 4187.835 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  4364.214 ±(99.9%) 366.537 ops/s [Average]
  (min, avg, max) = (3027.347, 4364.214, 5258.754), stdev = 651.519
  CI (99.9%): [3997.677, 4730.751] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:45
# Fork: 1 of 2
# Warmup Iteration   1: 40.384 ops/s
# Warmup Iteration   2: 55.685 ops/s
# Warmup Iteration   3: 85.107 ops/s
# Warmup Iteration   4: 116.699 ops/s
# Warmup Iteration   5: 165.458 ops/s
# Warmup Iteration   6: 290.882 ops/s
# Warmup Iteration   7: 325.387 ops/s
# Warmup Iteration   8: 321.517 ops/s
# Warmup Iteration   9: 364.071 ops/s
# Warmup Iteration  10: 335.270 ops/s
# Warmup Iteration  11: 284.715 ops/s
# Warmup Iteration  12: 303.516 ops/s
# Warmup Iteration  13: 250.890 ops/s
# Warmup Iteration  14: 335.914 ops/s
# Warmup Iteration  15: 353.958 ops/s
# Warmup Iteration  16: 368.282 ops/s
# Warmup Iteration  17: 366.368 ops/s
# Warmup Iteration  18: 399.843 ops/s
# Warmup Iteration  19: 393.041 ops/s
# Warmup Iteration  20: 438.725 ops/s
Iteration   1: 461.229 ops/s
Iteration   2: 533.963 ops/s
Iteration   3: 594.663 ops/s
Iteration   4: 620.361 ops/s
Iteration   5: 555.793 ops/s
Iteration   6: 649.348 ops/s
Iteration   7: 599.008 ops/s
Iteration   8: 657.122 ops/s
Iteration   9: 661.612 ops/s
Iteration  10: 641.704 ops/s
Iteration  11: 544.500 ops/s
Iteration  12: 644.324 ops/s
Iteration  13: 632.762 ops/s
Iteration  14: 630.581 ops/s
Iteration  15: 615.662 ops/s
Iteration  16: 628.092 ops/s
Iteration  17: 679.282 ops/s
Iteration  18: 632.339 ops/s
Iteration  19: 618.698 ops/s
Iteration  20: 600.125 ops/s

# Run progress: 90.00% complete, ETA 00:00:52
# Fork: 2 of 2
# Warmup Iteration   1: 31.648 ops/s
# Warmup Iteration   2: 72.664 ops/s
# Warmup Iteration   3: 104.509 ops/s
# Warmup Iteration   4: 93.556 ops/s
# Warmup Iteration   5: 158.821 ops/s
# Warmup Iteration   6: 192.075 ops/s
# Warmup Iteration   7: 306.464 ops/s
# Warmup Iteration   8: 305.818 ops/s
# Warmup Iteration   9: 327.345 ops/s
# Warmup Iteration  10: 312.727 ops/s
# Warmup Iteration  11: 304.173 ops/s
# Warmup Iteration  12: 309.766 ops/s
# Warmup Iteration  13: 370.391 ops/s
# Warmup Iteration  14: 332.781 ops/s
# Warmup Iteration  15: 374.837 ops/s
# Warmup Iteration  16: 366.394 ops/s
# Warmup Iteration  17: 392.958 ops/s
# Warmup Iteration  18: 369.069 ops/s
# Warmup Iteration  19: 392.265 ops/s
# Warmup Iteration  20: 396.511 ops/s
Iteration   1: 417.035 ops/s
Iteration   2: 461.035 ops/s
Iteration   3: 555.833 ops/s
Iteration   4: 509.313 ops/s
Iteration   5: 570.455 ops/s
Iteration   6: 583.735 ops/s
Iteration   7: 633.303 ops/s
Iteration   8: 598.709 ops/s
Iteration   9: 644.335 ops/s
Iteration  10: 621.924 ops/s
Iteration  11: 563.461 ops/s
Iteration  12: 591.340 ops/s
Iteration  13: 584.518 ops/s
Iteration  14: 581.446 ops/s
Iteration  15: 594.661 ops/s
Iteration  16: 627.451 ops/s
Iteration  17: 600.818 ops/s
Iteration  18: 587.303 ops/s
Iteration  19: 635.333 ops/s
Iteration  20: 589.997 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  593.829 ±(99.9%) 31.651 ops/s [Average]
  (min, avg, max) = (417.035, 593.829, 679.282), stdev = 56.259
  CI (99.9%): [562.178, 625.480] (assumes normal distribution)


# Run complete. Total time: 00:08:46

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  4620.771 ± 117.685  ops/s
HttpBenchmark.getPerson           thrpt   40  5744.610 ± 609.674  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  3526.018 ± 398.348  ops/s
HttpBenchmark.listPersons         thrpt   40  4364.214 ± 366.537  ops/s
HttpBenchmark.programComposition  thrpt   40   593.829 ±  31.651  ops/s
```

### frees-rpc - Protobuf Serialization

```bash

```

### frees-rpc - Avro Serialization

```bash

```

## Summary

### HTTP

```bash
# Run complete. Total time: 00:08:46

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  4620.771 ± 117.685  ops/s
HttpBenchmark.getPerson           thrpt   40  5744.610 ± 609.674  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  3526.018 ± 398.348  ops/s
HttpBenchmark.listPersons         thrpt   40  4364.214 ± 366.537  ops/s
HttpBenchmark.programComposition  thrpt   40   593.829 ±  31.651  ops/s
```

### frees-rpc - Protobuf Serialization

```bash

```

### frees-rpc - Avro Serialization

```bash

```