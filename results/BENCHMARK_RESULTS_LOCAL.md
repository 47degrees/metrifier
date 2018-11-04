# Benchmark Results

See [README](../README.md#running-benchmarks-locally) for reference.

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [Machine Details](#machine-details)
- [JMH Results](#jmh-results)
  - [HTTP](#http)
  - [mu-rpc - Protobuf Serialization](#mu-rpc---protobuf-serialization)
  - [mu-rpc - Avro Serialization](#mu-rpc---avro-serialization)
- [Summary](#summary)
  - [HTTP](#http-1)
  - [mu-rpc - Protobuf Serialization](#mu-rpc---protobuf-serialization-1)
  - [mu-rpc - Avro Serialization](#mu-rpc---avro-serialization-1)

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
# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
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
# Warmup Iteration   1: 121.605 ops/s
# Warmup Iteration   2: 167.059 ops/s
# Warmup Iteration   3: 196.145 ops/s
# Warmup Iteration   4: 264.253 ops/s
# Warmup Iteration   5: 289.635 ops/s
# Warmup Iteration   6: 355.722 ops/s
# Warmup Iteration   7: 352.896 ops/s
# Warmup Iteration   8: 495.023 ops/s
# Warmup Iteration   9: 738.624 ops/s
# Warmup Iteration  10: 776.063 ops/s
# Warmup Iteration  11: 887.372 ops/s
# Warmup Iteration  12: 892.134 ops/s
# Warmup Iteration  13: 1023.726 ops/s
# Warmup Iteration  14: 1173.870 ops/s
# Warmup Iteration  15: 1242.918 ops/s
# Warmup Iteration  16: 1199.358 ops/s
# Warmup Iteration  17: 1264.961 ops/s
# Warmup Iteration  18: 1462.035 ops/s
# Warmup Iteration  19: 1301.111 ops/s
# Warmup Iteration  20: 1792.807 ops/s
Iteration   1: 1879.927 ops/s
Iteration   2: 1747.507 ops/s
Iteration   3: 1871.677 ops/s
Iteration   4: 2002.882 ops/s
Iteration   5: 2073.829 ops/s
Iteration   6: 2382.696 ops/s
Iteration   7: 2960.964 ops/s
Iteration   8: 3055.524 ops/s
Iteration   9: 2939.182 ops/s
Iteration  10: 3211.840 ops/s
Iteration  11: 3120.929 ops/s
Iteration  12: 3252.432 ops/s
Iteration  13: 2922.383 ops/s
Iteration  14: 2381.951 ops/s
Iteration  15: 2196.044 ops/s
Iteration  16: 509.059 ops/s
Iteration  17: 579.380 ops/s
Iteration  18: 549.378 ops/s
Iteration  19: 465.129 ops/s
Iteration  20: 2840.868 ops/s

# Run progress: 10.00% complete, ETA 00:06:37
# Fork: 2 of 2
# Warmup Iteration   1: 158.198 ops/s
# Warmup Iteration   2: 413.499 ops/s
# Warmup Iteration   3: 571.071 ops/s
# Warmup Iteration   4: 729.629 ops/s
# Warmup Iteration   5: 888.906 ops/s
# Warmup Iteration   6: 1221.605 ops/s
# Warmup Iteration   7: 1451.848 ops/s
# Warmup Iteration   8: 1420.778 ops/s
# Warmup Iteration   9: 1457.982 ops/s
# Warmup Iteration  10: 1608.631 ops/s
# Warmup Iteration  11: 1788.479 ops/s
# Warmup Iteration  12: 1752.825 ops/s
# Warmup Iteration  13: 1852.125 ops/s
# Warmup Iteration  14: 1831.892 ops/s
# Warmup Iteration  15: 2272.712 ops/s
# Warmup Iteration  16: 2269.325 ops/s
# Warmup Iteration  17: 2846.723 ops/s
# Warmup Iteration  18: 3075.990 ops/s
# Warmup Iteration  19: 3087.129 ops/s
# Warmup Iteration  20: 3374.888 ops/s
Iteration   1: 3247.417 ops/s
Iteration   2: 3333.560 ops/s
Iteration   3: 3321.083 ops/s
Iteration   4: 3282.334 ops/s
Iteration   5: 3206.862 ops/s
Iteration   6: 3024.628 ops/s
Iteration   7: 3176.161 ops/s
Iteration   8: 3140.549 ops/s
Iteration   9: 3017.826 ops/s
Iteration  10: 3184.017 ops/s
Iteration  11: 2995.627 ops/s
Iteration  12: 3151.555 ops/s
Iteration  13: 3155.259 ops/s
Iteration  14: 3200.644 ops/s
Iteration  15: 3385.582 ops/s
Iteration  16: 3298.442 ops/s
Iteration  17: 1994.747 ops/s
Iteration  18: 1237.177 ops/s
Iteration  19: 2587.474 ops/s
Iteration  20: 2802.758 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  2567.182 ±(99.9%) 490.607 ops/s [Average]
  (min, avg, max) = (465.129, 2567.182, 3385.582), stdev = 872.054
  CI (99.9%): [2076.575, 3057.790] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:47
# Fork: 1 of 2
# Warmup Iteration   1: 167.160 ops/s
# Warmup Iteration   2: 425.083 ops/s
# Warmup Iteration   3: 523.155 ops/s
# Warmup Iteration   4: 683.383 ops/s
# Warmup Iteration   5: 988.803 ops/s
# Warmup Iteration   6: 1391.099 ops/s
# Warmup Iteration   7: 1595.624 ops/s
# Warmup Iteration   8: 1670.463 ops/s
# Warmup Iteration   9: 1873.237 ops/s
# Warmup Iteration  10: 2140.628 ops/s
# Warmup Iteration  11: 2337.053 ops/s
# Warmup Iteration  12: 2644.179 ops/s
# Warmup Iteration  13: 3135.361 ops/s
# Warmup Iteration  14: 3307.678 ops/s
# Warmup Iteration  15: 3532.319 ops/s
# Warmup Iteration  16: 4191.487 ops/s
# Warmup Iteration  17: 4371.452 ops/s
# Warmup Iteration  18: 4184.210 ops/s
# Warmup Iteration  19: 4469.759 ops/s
# Warmup Iteration  20: 4496.863 ops/s
Iteration   1: 4495.763 ops/s
Iteration   2: 4423.055 ops/s
Iteration   3: 4415.216 ops/s
Iteration   4: 4151.415 ops/s
Iteration   5: 4317.201 ops/s
Iteration   6: 3658.879 ops/s
Iteration   7: 4235.280 ops/s
Iteration   8: 4275.807 ops/s
Iteration   9: 4403.707 ops/s
Iteration  10: 4527.733 ops/s
Iteration  11: 4422.380 ops/s
Iteration  12: 4207.180 ops/s
Iteration  13: 4485.513 ops/s
Iteration  14: 4451.649 ops/s
Iteration  15: 4403.936 ops/s
Iteration  16: 4456.575 ops/s
Iteration  17: 4404.952 ops/s
Iteration  18: 4310.262 ops/s
Iteration  19: 3689.059 ops/s
Iteration  20: 4336.377 ops/s

# Run progress: 30.00% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 310.967 ops/s
# Warmup Iteration   2: 570.953 ops/s
# Warmup Iteration   3: 849.765 ops/s
# Warmup Iteration   4: 1110.695 ops/s
# Warmup Iteration   5: 1591.069 ops/s
# Warmup Iteration   6: 1772.681 ops/s
# Warmup Iteration   7: 2000.305 ops/s
# Warmup Iteration   8: 2313.100 ops/s
# Warmup Iteration   9: 2421.665 ops/s
# Warmup Iteration  10: 2436.194 ops/s
# Warmup Iteration  11: 2643.403 ops/s
# Warmup Iteration  12: 3073.250 ops/s
# Warmup Iteration  13: 4119.858 ops/s
# Warmup Iteration  14: 3860.386 ops/s
# Warmup Iteration  15: 4356.927 ops/s
# Warmup Iteration  16: 4089.044 ops/s
# Warmup Iteration  17: 4314.209 ops/s
# Warmup Iteration  18: 4389.632 ops/s
# Warmup Iteration  19: 4390.115 ops/s
# Warmup Iteration  20: 4174.472 ops/s
Iteration   1: 4350.400 ops/s
Iteration   2: 4367.029 ops/s
Iteration   3: 4373.041 ops/s
Iteration   4: 4276.381 ops/s
Iteration   5: 4446.249 ops/s
Iteration   6: 4259.446 ops/s
Iteration   7: 4446.245 ops/s
Iteration   8: 4396.307 ops/s
Iteration   9: 4481.230 ops/s
Iteration  10: 4460.254 ops/s
Iteration  11: 4430.684 ops/s
Iteration  12: 4247.131 ops/s
Iteration  13: 4456.571 ops/s
Iteration  14: 4375.736 ops/s
Iteration  15: 4423.501 ops/s
Iteration  16: 4327.636 ops/s
Iteration  17: 4488.166 ops/s
Iteration  18: 4460.308 ops/s
Iteration  19: 4470.126 ops/s
Iteration  20: 4493.042 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  4352.536 ±(99.9%) 101.832 ops/s [Average]
  (min, avg, max) = (3658.879, 4352.536, 4527.733), stdev = 181.006
  CI (99.9%): [4250.704, 4454.367] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:17
# Fork: 1 of 2
# Warmup Iteration   1: 198.754 ops/s
# Warmup Iteration   2: 462.542 ops/s
# Warmup Iteration   3: 662.127 ops/s
# Warmup Iteration   4: 838.657 ops/s
# Warmup Iteration   5: 1230.710 ops/s
# Warmup Iteration   6: 1503.786 ops/s
# Warmup Iteration   7: 1397.321 ops/s
# Warmup Iteration   8: 1407.083 ops/s
# Warmup Iteration   9: 1730.274 ops/s
# Warmup Iteration  10: 2003.234 ops/s
# Warmup Iteration  11: 2100.643 ops/s
# Warmup Iteration  12: 2326.686 ops/s
# Warmup Iteration  13: 2457.394 ops/s
# Warmup Iteration  14: 2477.197 ops/s
# Warmup Iteration  15: 3403.114 ops/s
# Warmup Iteration  16: 3489.766 ops/s
# Warmup Iteration  17: 3437.953 ops/s
# Warmup Iteration  18: 3460.699 ops/s
# Warmup Iteration  19: 3505.822 ops/s
# Warmup Iteration  20: 3530.952 ops/s
Iteration   1: 3527.608 ops/s
Iteration   2: 3543.491 ops/s
Iteration   3: 3549.324 ops/s
Iteration   4: 3512.263 ops/s
Iteration   5: 3490.212 ops/s
Iteration   6: 3518.575 ops/s
Iteration   7: 3569.364 ops/s
Iteration   8: 3602.674 ops/s
Iteration   9: 3113.292 ops/s
Iteration  10: 3499.192 ops/s
Iteration  11: 3537.535 ops/s
Iteration  12: 3468.095 ops/s
Iteration  13: 3537.150 ops/s
Iteration  14: 3494.985 ops/s
Iteration  15: 3307.219 ops/s
Iteration  16: 3461.133 ops/s
Iteration  17: 3434.765 ops/s
Iteration  18: 3234.956 ops/s
Iteration  19: 3482.063 ops/s
Iteration  20: 3424.143 ops/s

# Run progress: 50.00% complete, ETA 00:03:34
# Fork: 2 of 2
# Warmup Iteration   1: 218.493 ops/s
# Warmup Iteration   2: 528.482 ops/s
# Warmup Iteration   3: 775.801 ops/s
# Warmup Iteration   4: 965.345 ops/s
# Warmup Iteration   5: 1422.710 ops/s
# Warmup Iteration   6: 1652.513 ops/s
# Warmup Iteration   7: 1803.042 ops/s
# Warmup Iteration   8: 1920.749 ops/s
# Warmup Iteration   9: 2200.298 ops/s
# Warmup Iteration  10: 2393.656 ops/s
# Warmup Iteration  11: 2606.806 ops/s
# Warmup Iteration  12: 2959.994 ops/s
# Warmup Iteration  13: 3106.377 ops/s
# Warmup Iteration  14: 3591.238 ops/s
# Warmup Iteration  15: 3602.957 ops/s
# Warmup Iteration  16: 3557.244 ops/s
# Warmup Iteration  17: 3620.835 ops/s
# Warmup Iteration  18: 3605.034 ops/s
# Warmup Iteration  19: 3549.476 ops/s
# Warmup Iteration  20: 3556.444 ops/s
Iteration   1: 3602.969 ops/s
Iteration   2: 3626.953 ops/s
Iteration   3: 3506.720 ops/s
Iteration   4: 3636.459 ops/s
Iteration   5: 3542.595 ops/s
Iteration   6: 3342.760 ops/s
Iteration   7: 3557.877 ops/s
Iteration   8: 3614.897 ops/s
Iteration   9: 3662.357 ops/s
Iteration  10: 3649.133 ops/s
Iteration  11: 3619.441 ops/s
Iteration  12: 3597.466 ops/s
Iteration  13: 3491.979 ops/s
Iteration  14: 3628.915 ops/s
Iteration  15: 3662.806 ops/s
Iteration  16: 3659.821 ops/s
Iteration  17: 3702.237 ops/s
Iteration  18: 3657.735 ops/s
Iteration  19: 3674.545 ops/s
Iteration  20: 3669.493 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  3535.380 ±(99.9%) 69.672 ops/s [Average]
  (min, avg, max) = (3113.292, 3535.380, 3702.237), stdev = 123.842
  CI (99.9%): [3465.708, 3605.052] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:51
# Fork: 1 of 2
# Warmup Iteration   1: 194.045 ops/s
# Warmup Iteration   2: 439.734 ops/s
# Warmup Iteration   3: 745.565 ops/s
# Warmup Iteration   4: 877.997 ops/s
# Warmup Iteration   5: 1359.597 ops/s
# Warmup Iteration   6: 1634.881 ops/s
# Warmup Iteration   7: 1468.094 ops/s
# Warmup Iteration   8: 1579.146 ops/s
# Warmup Iteration   9: 1664.992 ops/s
# Warmup Iteration  10: 1951.600 ops/s
# Warmup Iteration  11: 1988.927 ops/s
# Warmup Iteration  12: 2381.887 ops/s
# Warmup Iteration  13: 2505.650 ops/s
# Warmup Iteration  14: 2337.784 ops/s
# Warmup Iteration  15: 3289.038 ops/s
# Warmup Iteration  16: 3726.771 ops/s
# Warmup Iteration  17: 3773.669 ops/s
# Warmup Iteration  18: 3745.108 ops/s
# Warmup Iteration  19: 3779.986 ops/s
# Warmup Iteration  20: 3766.705 ops/s
Iteration   1: 3666.173 ops/s
Iteration   2: 3744.713 ops/s
Iteration   3: 3806.718 ops/s
Iteration   4: 3862.022 ops/s
Iteration   5: 3816.804 ops/s
Iteration   6: 3888.001 ops/s
Iteration   7: 3631.175 ops/s
Iteration   8: 3866.203 ops/s
Iteration   9: 3847.955 ops/s
Iteration  10: 3891.347 ops/s
Iteration  11: 3729.812 ops/s
Iteration  12: 3912.919 ops/s
Iteration  13: 3856.453 ops/s
Iteration  14: 3891.508 ops/s
Iteration  15: 3849.294 ops/s
Iteration  16: 3862.169 ops/s
Iteration  17: 3800.838 ops/s
Iteration  18: 3858.634 ops/s
Iteration  19: 3775.902 ops/s
Iteration  20: 3887.813 ops/s

# Run progress: 70.00% complete, ETA 00:02:08
# Fork: 2 of 2
# Warmup Iteration   1: 236.158 ops/s
# Warmup Iteration   2: 487.073 ops/s
# Warmup Iteration   3: 766.877 ops/s
# Warmup Iteration   4: 929.521 ops/s
# Warmup Iteration   5: 1305.151 ops/s
# Warmup Iteration   6: 1641.295 ops/s
# Warmup Iteration   7: 1683.913 ops/s
# Warmup Iteration   8: 1707.483 ops/s
# Warmup Iteration   9: 1601.720 ops/s
# Warmup Iteration  10: 1693.352 ops/s
# Warmup Iteration  11: 1788.835 ops/s
# Warmup Iteration  12: 1809.001 ops/s
# Warmup Iteration  13: 1997.314 ops/s
# Warmup Iteration  14: 2176.690 ops/s
# Warmup Iteration  15: 2321.527 ops/s
# Warmup Iteration  16: 2486.080 ops/s
# Warmup Iteration  17: 2785.528 ops/s
# Warmup Iteration  18: 3095.486 ops/s
# Warmup Iteration  19: 3613.102 ops/s
# Warmup Iteration  20: 3739.103 ops/s
Iteration   1: 3739.595 ops/s
Iteration   2: 3753.253 ops/s
Iteration   3: 3538.254 ops/s
Iteration   4: 3558.792 ops/s
Iteration   5: 3667.255 ops/s
Iteration   6: 3674.731 ops/s
Iteration   7: 3656.090 ops/s
Iteration   8: 3744.261 ops/s
Iteration   9: 3688.957 ops/s
Iteration  10: 3856.454 ops/s
Iteration  11: 3814.839 ops/s
Iteration  12: 3590.875 ops/s
Iteration  13: 3800.526 ops/s
Iteration  14: 3752.458 ops/s
Iteration  15: 3778.942 ops/s
Iteration  16: 3847.162 ops/s
Iteration  17: 3792.077 ops/s
Iteration  18: 3848.599 ops/s
Iteration  19: 3670.273 ops/s
Iteration  20: 3436.402 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  3766.406 ±(99.9%) 62.676 ops/s [Average]
  (min, avg, max) = (3436.402, 3766.406, 3912.919), stdev = 111.407
  CI (99.9%): [3703.730, 3829.082] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:25
# Fork: 1 of 2
# Warmup Iteration   1: 38.415 ops/s
# Warmup Iteration   2: 73.332 ops/s
# Warmup Iteration   3: 100.046 ops/s
# Warmup Iteration   4: 132.282 ops/s
# Warmup Iteration   5: 172.973 ops/s
# Warmup Iteration   6: 179.120 ops/s
# Warmup Iteration   7: 182.201 ops/s
# Warmup Iteration   8: 197.457 ops/s
# Warmup Iteration   9: 231.533 ops/s
# Warmup Iteration  10: 239.641 ops/s
# Warmup Iteration  11: 244.165 ops/s
# Warmup Iteration  12: 235.707 ops/s
# Warmup Iteration  13: 270.417 ops/s
# Warmup Iteration  14: 281.208 ops/s
# Warmup Iteration  15: 262.646 ops/s
# Warmup Iteration  16: 265.978 ops/s
# Warmup Iteration  17: 277.035 ops/s
# Warmup Iteration  18: 282.168 ops/s
# Warmup Iteration  19: 284.108 ops/s
# Warmup Iteration  20: 330.485 ops/s
Iteration   1: 352.235 ops/s
Iteration   2: 355.393 ops/s
Iteration   3: 362.828 ops/s
Iteration   4: 352.023 ops/s
Iteration   5: 338.652 ops/s
Iteration   6: 410.480 ops/s
Iteration   7: 358.248 ops/s
Iteration   8: 460.110 ops/s
Iteration   9: 440.947 ops/s
Iteration  10: 477.060 ops/s
Iteration  11: 481.040 ops/s
Iteration  12: 470.520 ops/s
Iteration  13: 476.449 ops/s
Iteration  14: 474.844 ops/s
Iteration  15: 477.438 ops/s
Iteration  16: 472.739 ops/s
Iteration  17: 401.613 ops/s
Iteration  18: 471.869 ops/s
Iteration  19: 450.272 ops/s
Iteration  20: 474.545 ops/s

# Run progress: 90.00% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 57.337 ops/s
# Warmup Iteration   2: 66.282 ops/s
# Warmup Iteration   3: 87.165 ops/s
# Warmup Iteration   4: 115.934 ops/s
# Warmup Iteration   5: 165.802 ops/s
# Warmup Iteration   6: 187.876 ops/s
# Warmup Iteration   7: 198.310 ops/s
# Warmup Iteration   8: 232.346 ops/s
# Warmup Iteration   9: 251.093 ops/s
# Warmup Iteration  10: 253.465 ops/s
# Warmup Iteration  11: 251.265 ops/s
# Warmup Iteration  12: 257.934 ops/s
# Warmup Iteration  13: 255.692 ops/s
# Warmup Iteration  14: 263.549 ops/s
# Warmup Iteration  15: 274.920 ops/s
# Warmup Iteration  16: 270.592 ops/s
# Warmup Iteration  17: 296.592 ops/s
# Warmup Iteration  18: 308.953 ops/s
# Warmup Iteration  19: 340.625 ops/s
# Warmup Iteration  20: 333.385 ops/s
Iteration   1: 347.510 ops/s
Iteration   2: 340.624 ops/s
Iteration   3: 353.031 ops/s
Iteration   4: 341.897 ops/s
Iteration   5: 357.630 ops/s
Iteration   6: 347.706 ops/s
Iteration   7: 366.663 ops/s
Iteration   8: 416.283 ops/s
Iteration   9: 419.692 ops/s
Iteration  10: 451.946 ops/s
Iteration  11: 458.849 ops/s
Iteration  12: 457.907 ops/s
Iteration  13: 471.748 ops/s
Iteration  14: 445.635 ops/s
Iteration  15: 474.092 ops/s
Iteration  16: 476.904 ops/s
Iteration  17: 407.213 ops/s
Iteration  18: 468.080 ops/s
Iteration  19: 469.920 ops/s
Iteration  20: 469.757 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  422.560 ±(99.9%) 30.245 ops/s [Average]
  (min, avg, max) = (338.652, 422.560, 481.040), stdev = 53.760
  CI (99.9%): [392.315, 452.805] (assumes normal distribution)


# Run complete. Total time: 00:07:08

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  2567.182 ± 490.607  ops/s
HttpBenchmark.getPerson           thrpt   40  4352.536 ± 101.832  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  3535.380 ±  69.672  ops/s
HttpBenchmark.listPersons         thrpt   40  3766.406 ±  62.676  ops/s
HttpBenchmark.programComposition  thrpt   40   422.560 ±  30.245  ops/s
```

### mu-rpc - Protobuf Serialization

```bash
# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 165.576 ops/s
# Warmup Iteration   2: 473.525 ops/s
# Warmup Iteration   3: 652.093 ops/s
# Warmup Iteration   4: 1188.153 ops/s
# Warmup Iteration   5: 1483.167 ops/s
# Warmup Iteration   6: 1600.639 ops/s
# Warmup Iteration   7: 1679.104 ops/s
# Warmup Iteration   8: 1920.446 ops/s
# Warmup Iteration   9: 2005.994 ops/s
# Warmup Iteration  10: 2217.127 ops/s
# Warmup Iteration  11: 2245.321 ops/s
# Warmup Iteration  12: 3105.597 ops/s
# Warmup Iteration  13: 3539.934 ops/s
# Warmup Iteration  14: 4718.297 ops/s
# Warmup Iteration  15: 5477.712 ops/s
# Warmup Iteration  16: 5561.094 ops/s
# Warmup Iteration  17: 5180.379 ops/s
# Warmup Iteration  18: 5674.805 ops/s
# Warmup Iteration  19: 5704.935 ops/s
# Warmup Iteration  20: 5942.491 ops/s
Iteration   1: 6110.861 ops/s
Iteration   2: 6258.457 ops/s
Iteration   3: 6412.254 ops/s
Iteration   4: 6408.214 ops/s
Iteration   5: 6099.635 ops/s
Iteration   6: 5880.586 ops/s
Iteration   7: 6374.003 ops/s
Iteration   8: 6417.748 ops/s
Iteration   9: 6509.878 ops/s
Iteration  10: 6670.456 ops/s
Iteration  11: 6630.180 ops/s
Iteration  12: 6382.454 ops/s
Iteration  13: 6763.643 ops/s
Iteration  14: 6768.117 ops/s
Iteration  15: 6763.374 ops/s
Iteration  16: 4669.773 ops/s
Iteration  17: 5202.871 ops/s
Iteration  18: 5059.084 ops/s
Iteration  19: 5158.713 ops/s
Iteration  20: 5279.207 ops/s

# Run progress: 10.00% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 543.730 ops/s
# Warmup Iteration   2: 1106.407 ops/s
# Warmup Iteration   3: 1871.439 ops/s
# Warmup Iteration   4: 2186.331 ops/s
# Warmup Iteration   5: 2233.894 ops/s
# Warmup Iteration   6: 2578.003 ops/s
# Warmup Iteration   7: 2799.319 ops/s
# Warmup Iteration   8: 2846.633 ops/s
# Warmup Iteration   9: 4429.429 ops/s
# Warmup Iteration  10: 6247.563 ops/s
# Warmup Iteration  11: 6306.269 ops/s
# Warmup Iteration  12: 6592.087 ops/s
# Warmup Iteration  13: 6545.940 ops/s
# Warmup Iteration  14: 6457.071 ops/s
# Warmup Iteration  15: 6197.320 ops/s
# Warmup Iteration  16: 6428.391 ops/s
# Warmup Iteration  17: 6954.733 ops/s
# Warmup Iteration  18: 6566.331 ops/s
# Warmup Iteration  19: 6338.811 ops/s
# Warmup Iteration  20: 6641.638 ops/s
Iteration   1: 6683.775 ops/s
Iteration   2: 6757.500 ops/s
Iteration   3: 6505.430 ops/s
Iteration   4: 6676.949 ops/s
Iteration   5: 6749.147 ops/s
Iteration   6: 6925.364 ops/s
Iteration   7: 6991.797 ops/s
Iteration   8: 6949.011 ops/s
Iteration   9: 6734.713 ops/s
Iteration  10: 7032.799 ops/s
Iteration  11: 6751.263 ops/s
Iteration  12: 6320.867 ops/s
Iteration  13: 7002.309 ops/s
Iteration  14: 6742.634 ops/s
Iteration  15: 6783.774 ops/s
Iteration  16: 6946.103 ops/s
Iteration  17: 6886.948 ops/s
Iteration  18: 6778.222 ops/s
Iteration  19: 6769.477 ops/s
Iteration  20: 5908.766 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.createPerson":
  6417.909 ±(99.9%) 333.242 ops/s [Average]
  (min, avg, max) = (4669.773, 6417.909, 7032.799), stdev = 592.337
  CI (99.9%): [6084.667, 6751.150] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:38
# Fork: 1 of 2
# Warmup Iteration   1: 655.594 ops/s
# Warmup Iteration   2: 1247.331 ops/s
# Warmup Iteration   3: 2167.176 ops/s
# Warmup Iteration   4: 2484.797 ops/s
# Warmup Iteration   5: 2735.163 ops/s
# Warmup Iteration   6: 3243.809 ops/s
# Warmup Iteration   7: 3826.754 ops/s
# Warmup Iteration   8: 4777.343 ops/s
# Warmup Iteration   9: 6681.936 ops/s
# Warmup Iteration  10: 6690.431 ops/s
# Warmup Iteration  11: 7203.434 ops/s
# Warmup Iteration  12: 6756.832 ops/s
# Warmup Iteration  13: 7376.334 ops/s
# Warmup Iteration  14: 7339.719 ops/s
# Warmup Iteration  15: 6796.986 ops/s
# Warmup Iteration  16: 7471.966 ops/s
# Warmup Iteration  17: 7496.356 ops/s
# Warmup Iteration  18: 7442.733 ops/s
# Warmup Iteration  19: 7487.007 ops/s
# Warmup Iteration  20: 7453.261 ops/s
Iteration   1: 7526.234 ops/s
Iteration   2: 7251.470 ops/s
Iteration   3: 7436.965 ops/s
Iteration   4: 7609.838 ops/s
Iteration   5: 7161.431 ops/s
Iteration   6: 7413.899 ops/s
Iteration   7: 7538.324 ops/s
Iteration   8: 7791.341 ops/s
Iteration   9: 7564.636 ops/s
Iteration  10: 7429.597 ops/s
Iteration  11: 7353.962 ops/s
Iteration  12: 7295.190 ops/s
Iteration  13: 7482.890 ops/s
Iteration  14: 7495.720 ops/s
Iteration  15: 7064.203 ops/s
Iteration  16: 7524.807 ops/s
Iteration  17: 7480.787 ops/s
Iteration  18: 7671.000 ops/s
Iteration  19: 7749.002 ops/s
Iteration  20: 7448.354 ops/s

# Run progress: 30.00% complete, ETA 00:04:55
# Fork: 2 of 2
# Warmup Iteration   1: 719.526 ops/s
# Warmup Iteration   2: 1318.838 ops/s
# Warmup Iteration   3: 2239.842 ops/s
# Warmup Iteration   4: 2533.303 ops/s
# Warmup Iteration   5: 2886.536 ops/s
# Warmup Iteration   6: 3454.469 ops/s
# Warmup Iteration   7: 3624.972 ops/s
# Warmup Iteration   8: 5206.579 ops/s
# Warmup Iteration   9: 5915.522 ops/s
# Warmup Iteration  10: 6729.088 ops/s
# Warmup Iteration  11: 6955.730 ops/s
# Warmup Iteration  12: 7107.403 ops/s
# Warmup Iteration  13: 7097.570 ops/s
# Warmup Iteration  14: 7188.666 ops/s
# Warmup Iteration  15: 6213.763 ops/s
# Warmup Iteration  16: 6910.729 ops/s
# Warmup Iteration  17: 7082.431 ops/s
# Warmup Iteration  18: 7411.326 ops/s
# Warmup Iteration  19: 7150.311 ops/s
# Warmup Iteration  20: 7126.771 ops/s
Iteration   1: 7037.558 ops/s
Iteration   2: 7428.719 ops/s
Iteration   3: 6712.706 ops/s
Iteration   4: 6468.666 ops/s
Iteration   5: 7083.154 ops/s
Iteration   6: 7120.878 ops/s
Iteration   7: 7163.547 ops/s
Iteration   8: 7148.285 ops/s
Iteration   9: 7505.584 ops/s
Iteration  10: 7543.420 ops/s
Iteration  11: 6999.662 ops/s
Iteration  12: 7376.647 ops/s
Iteration  13: 7257.015 ops/s
Iteration  14: 7365.656 ops/s
Iteration  15: 7299.968 ops/s
Iteration  16: 7164.393 ops/s
Iteration  17: 7501.159 ops/s
Iteration  18: 7669.109 ops/s
Iteration  19: 7428.140 ops/s
Iteration  20: 7271.506 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPerson":
  7345.886 ±(99.9%) 148.966 ops/s [Average]
  (min, avg, max) = (6468.666, 7345.886, 7791.341), stdev = 264.786
  CI (99.9%): [7196.920, 7494.851] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:13
# Fork: 1 of 2
# Warmup Iteration   1: 525.602 ops/s
# Warmup Iteration   2: 1131.812 ops/s
# Warmup Iteration   3: 1681.786 ops/s
# Warmup Iteration   4: 1970.428 ops/s
# Warmup Iteration   5: 1896.315 ops/s
# Warmup Iteration   6: 2039.847 ops/s
# Warmup Iteration   7: 2224.798 ops/s
# Warmup Iteration   8: 2662.733 ops/s
# Warmup Iteration   9: 2949.289 ops/s
# Warmup Iteration  10: 4304.576 ops/s
# Warmup Iteration  11: 5303.739 ops/s
# Warmup Iteration  12: 4723.075 ops/s
# Warmup Iteration  13: 4523.885 ops/s
# Warmup Iteration  14: 5335.252 ops/s
# Warmup Iteration  15: 5481.729 ops/s
# Warmup Iteration  16: 5563.306 ops/s
# Warmup Iteration  17: 5422.196 ops/s
# Warmup Iteration  18: 5477.333 ops/s
# Warmup Iteration  19: 5425.389 ops/s
# Warmup Iteration  20: 5525.723 ops/s
Iteration   1: 5610.842 ops/s
Iteration   2: 5615.347 ops/s
Iteration   3: 5637.450 ops/s
Iteration   4: 5527.638 ops/s
Iteration   5: 5500.762 ops/s
Iteration   6: 5580.120 ops/s
Iteration   7: 5658.393 ops/s
Iteration   8: 5124.731 ops/s
Iteration   9: 5537.329 ops/s
Iteration  10: 5661.227 ops/s
Iteration  11: 5613.155 ops/s
Iteration  12: 5698.541 ops/s
Iteration  13: 5518.125 ops/s
Iteration  14: 4926.344 ops/s
Iteration  15: 5041.131 ops/s
Iteration  16: 5648.048 ops/s
Iteration  17: 5597.612 ops/s
Iteration  18: 5628.894 ops/s
Iteration  19: 5470.660 ops/s
Iteration  20: 5671.116 ops/s

# Run progress: 50.00% complete, ETA 00:03:30
# Fork: 2 of 2
# Warmup Iteration   1: 522.579 ops/s
# Warmup Iteration   2: 1152.564 ops/s
# Warmup Iteration   3: 1954.134 ops/s
# Warmup Iteration   4: 2282.042 ops/s
# Warmup Iteration   5: 2353.083 ops/s
# Warmup Iteration   6: 2635.546 ops/s
# Warmup Iteration   7: 2641.111 ops/s
# Warmup Iteration   8: 3529.609 ops/s
# Warmup Iteration   9: 5165.322 ops/s
# Warmup Iteration  10: 5394.338 ops/s
# Warmup Iteration  11: 5431.119 ops/s
# Warmup Iteration  12: 5410.110 ops/s
# Warmup Iteration  13: 5510.182 ops/s
# Warmup Iteration  14: 5631.311 ops/s
# Warmup Iteration  15: 5615.546 ops/s
# Warmup Iteration  16: 5648.937 ops/s
# Warmup Iteration  17: 5330.781 ops/s
# Warmup Iteration  18: 5693.324 ops/s
# Warmup Iteration  19: 5672.867 ops/s
# Warmup Iteration  20: 5792.221 ops/s
Iteration   1: 5669.314 ops/s
Iteration   2: 5689.682 ops/s
Iteration   3: 5735.479 ops/s
Iteration   4: 5661.363 ops/s
Iteration   5: 5612.973 ops/s
Iteration   6: 5764.030 ops/s
Iteration   7: 5597.639 ops/s
Iteration   8: 5686.645 ops/s
Iteration   9: 5698.936 ops/s
Iteration  10: 5843.737 ops/s
Iteration  11: 5557.534 ops/s
Iteration  12: 5361.923 ops/s
Iteration  13: 5749.242 ops/s
Iteration  14: 5772.520 ops/s
Iteration  15: 5685.142 ops/s
Iteration  16: 5793.471 ops/s
Iteration  17: 5739.693 ops/s
Iteration  18: 5731.948 ops/s
Iteration  19: 5800.203 ops/s
Iteration  20: 5755.670 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPersonLinks":
  5604.365 ±(99.9%) 108.714 ops/s [Average]
  (min, avg, max) = (4926.344, 5604.365, 5843.737), stdev = 193.238
  CI (99.9%): [5495.652, 5713.079] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:48
# Fork: 1 of 2
# Warmup Iteration   1: 275.597 ops/s
# Warmup Iteration   2: 1129.409 ops/s
# Warmup Iteration   3: 1846.425 ops/s
# Warmup Iteration   4: 2085.393 ops/s
# Warmup Iteration   5: 2105.409 ops/s
# Warmup Iteration   6: 2265.136 ops/s
# Warmup Iteration   7: 2597.370 ops/s
# Warmup Iteration   8: 3077.440 ops/s
# Warmup Iteration   9: 4776.121 ops/s
# Warmup Iteration  10: 5759.765 ops/s
# Warmup Iteration  11: 5865.523 ops/s
# Warmup Iteration  12: 5927.679 ops/s
# Warmup Iteration  13: 5956.735 ops/s
# Warmup Iteration  14: 5780.672 ops/s
# Warmup Iteration  15: 6129.783 ops/s
# Warmup Iteration  16: 5754.051 ops/s
# Warmup Iteration  17: 6017.034 ops/s
# Warmup Iteration  18: 6098.199 ops/s
# Warmup Iteration  19: 6145.847 ops/s
# Warmup Iteration  20: 5558.395 ops/s
Iteration   1: 6113.940 ops/s
Iteration   2: 6157.358 ops/s
Iteration   3: 6307.767 ops/s
Iteration   4: 6217.503 ops/s
Iteration   5: 6114.770 ops/s
Iteration   6: 5889.498 ops/s
Iteration   7: 6306.217 ops/s
Iteration   8: 6179.980 ops/s
Iteration   9: 6107.305 ops/s
Iteration  10: 6269.324 ops/s
Iteration  11: 6097.177 ops/s
Iteration  12: 6227.237 ops/s
Iteration  13: 6150.862 ops/s
Iteration  14: 6263.338 ops/s
Iteration  15: 5295.868 ops/s
Iteration  16: 5808.703 ops/s
Iteration  17: 6037.268 ops/s
Iteration  18: 6177.689 ops/s
Iteration  19: 6209.061 ops/s
Iteration  20: 6198.441 ops/s

# Run progress: 70.00% complete, ETA 00:02:06
# Fork: 2 of 2
# Warmup Iteration   1: 687.798 ops/s
# Warmup Iteration   2: 1455.915 ops/s
# Warmup Iteration   3: 2266.972 ops/s
# Warmup Iteration   4: 2394.844 ops/s
# Warmup Iteration   5: 2849.079 ops/s
# Warmup Iteration   6: 2748.088 ops/s
# Warmup Iteration   7: 3174.276 ops/s
# Warmup Iteration   8: 4044.008 ops/s
# Warmup Iteration   9: 5617.916 ops/s
# Warmup Iteration  10: 5942.000 ops/s
# Warmup Iteration  11: 5917.716 ops/s
# Warmup Iteration  12: 5911.853 ops/s
# Warmup Iteration  13: 6066.393 ops/s
# Warmup Iteration  14: 5895.180 ops/s
# Warmup Iteration  15: 5959.891 ops/s
# Warmup Iteration  16: 5785.613 ops/s
# Warmup Iteration  17: 5485.248 ops/s
# Warmup Iteration  18: 5988.000 ops/s
# Warmup Iteration  19: 5994.526 ops/s
# Warmup Iteration  20: 6237.182 ops/s
Iteration   1: 6244.372 ops/s
Iteration   2: 6067.350 ops/s
Iteration   3: 6080.730 ops/s
Iteration   4: 5585.065 ops/s
Iteration   5: 5883.325 ops/s
Iteration   6: 6212.298 ops/s
Iteration   7: 6193.962 ops/s
Iteration   8: 6108.915 ops/s
Iteration   9: 6092.294 ops/s
Iteration  10: 6336.340 ops/s
Iteration  11: 6279.321 ops/s
Iteration  12: 6174.209 ops/s
Iteration  13: 6259.613 ops/s
Iteration  14: 6060.678 ops/s
Iteration  15: 6278.137 ops/s
Iteration  16: 6206.029 ops/s
Iteration  17: 6222.164 ops/s
Iteration  18: 6062.399 ops/s
Iteration  19: 5807.984 ops/s
Iteration  20: 5980.227 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.listPersons":
  6106.618 ±(99.9%) 114.832 ops/s [Average]
  (min, avg, max) = (5295.868, 6106.618, 6336.340), stdev = 204.113
  CI (99.9%): [5991.786, 6221.450] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:24
# Fork: 1 of 2
# Warmup Iteration   1: 85.953 ops/s
# Warmup Iteration   2: 158.272 ops/s
# Warmup Iteration   3: 223.784 ops/s
# Warmup Iteration   4: 276.474 ops/s
# Warmup Iteration   5: 281.978 ops/s
# Warmup Iteration   6: 329.186 ops/s
# Warmup Iteration   7: 388.442 ops/s
# Warmup Iteration   8: 481.858 ops/s
# Warmup Iteration   9: 647.473 ops/s
# Warmup Iteration  10: 672.534 ops/s
# Warmup Iteration  11: 727.541 ops/s
# Warmup Iteration  12: 723.708 ops/s
# Warmup Iteration  13: 625.727 ops/s
# Warmup Iteration  14: 640.607 ops/s
# Warmup Iteration  15: 715.188 ops/s
# Warmup Iteration  16: 791.914 ops/s
# Warmup Iteration  17: 823.771 ops/s
# Warmup Iteration  18: 829.666 ops/s
# Warmup Iteration  19: 825.330 ops/s
# Warmup Iteration  20: 785.266 ops/s
Iteration   1: 831.556 ops/s
Iteration   2: 813.683 ops/s
Iteration   3: 805.298 ops/s
Iteration   4: 849.375 ops/s
Iteration   5: 830.292 ops/s
Iteration   6: 762.380 ops/s
Iteration   7: 808.763 ops/s
Iteration   8: 804.157 ops/s
Iteration   9: 812.045 ops/s
Iteration  10: 873.746 ops/s
Iteration  11: 830.947 ops/s
Iteration  12: 821.703 ops/s
Iteration  13: 835.949 ops/s
Iteration  14: 835.245 ops/s
Iteration  15: 845.495 ops/s
Iteration  16: 854.478 ops/s
Iteration  17: 823.340 ops/s
Iteration  18: 834.813 ops/s
Iteration  19: 840.263 ops/s
Iteration  20: 833.503 ops/s

# Run progress: 90.00% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 63.527 ops/s
# Warmup Iteration   2: 149.594 ops/s
# Warmup Iteration   3: 203.814 ops/s
# Warmup Iteration   4: 258.565 ops/s
# Warmup Iteration   5: 280.308 ops/s
# Warmup Iteration   6: 361.779 ops/s
# Warmup Iteration   7: 400.368 ops/s
# Warmup Iteration   8: 537.056 ops/s
# Warmup Iteration   9: 649.937 ops/s
# Warmup Iteration  10: 712.883 ops/s
# Warmup Iteration  11: 694.229 ops/s
# Warmup Iteration  12: 735.762 ops/s
# Warmup Iteration  13: 629.351 ops/s
# Warmup Iteration  14: 626.502 ops/s
# Warmup Iteration  15: 686.338 ops/s
# Warmup Iteration  16: 803.153 ops/s
# Warmup Iteration  17: 807.134 ops/s
# Warmup Iteration  18: 784.002 ops/s
# Warmup Iteration  19: 817.575 ops/s
# Warmup Iteration  20: 821.391 ops/s
Iteration   1: 801.930 ops/s
Iteration   2: 828.982 ops/s
Iteration   3: 805.217 ops/s
Iteration   4: 825.119 ops/s
Iteration   5: 819.256 ops/s
Iteration   6: 837.174 ops/s
Iteration   7: 751.660 ops/s
Iteration   8: 718.070 ops/s
Iteration   9: 736.442 ops/s
Iteration  10: 809.435 ops/s
Iteration  11: 795.869 ops/s
Iteration  12: 835.066 ops/s
Iteration  13: 822.484 ops/s
Iteration  14: 844.496 ops/s
Iteration  15: 823.273 ops/s
Iteration  16: 829.769 ops/s
Iteration  17: 818.037 ops/s
Iteration  18: 818.490 ops/s
Iteration  19: 823.840 ops/s
Iteration  20: 832.315 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.programComposition":
  818.099 ±(99.9%) 17.076 ops/s [Average]
  (min, avg, max) = (718.070, 818.099, 873.746), stdev = 30.353
  CI (99.9%): [801.023, 835.175] (assumes normal distribution)


# Run complete. Total time: 00:07:02

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                              Mode  Cnt     Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40  6417.909 ± 333.242  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  7345.886 ± 148.966  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40  5604.365 ± 108.714  ops/s
RPCProtoBenchmark.listPersons         thrpt   40  6106.618 ± 114.832  ops/s
RPCProtoBenchmark.programComposition  thrpt   40   818.099 ±  17.076  ops/s
```

### mu-rpc - Avro Serialization

```bash
# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 104.763 ops/s
# Warmup Iteration   2: 242.567 ops/s
# Warmup Iteration   3: 314.256 ops/s
# Warmup Iteration   4: 403.551 ops/s
# Warmup Iteration   5: 602.057 ops/s
# Warmup Iteration   6: 757.207 ops/s
# Warmup Iteration   7: 801.467 ops/s
# Warmup Iteration   8: 846.576 ops/s
# Warmup Iteration   9: 919.006 ops/s
# Warmup Iteration  10: 959.955 ops/s
# Warmup Iteration  11: 1069.422 ops/s
# Warmup Iteration  12: 1101.121 ops/s
# Warmup Iteration  13: 1093.033 ops/s
# Warmup Iteration  14: 1089.128 ops/s
# Warmup Iteration  15: 1415.250 ops/s
# Warmup Iteration  16: 1761.337 ops/s
# Warmup Iteration  17: 2077.851 ops/s
# Warmup Iteration  18: 2300.919 ops/s
# Warmup Iteration  19: 2201.809 ops/s
# Warmup Iteration  20: 2588.154 ops/s
Iteration   1: 2775.201 ops/s
Iteration   2: 3402.798 ops/s
Iteration   3: 3244.691 ops/s
Iteration   4: 3098.451 ops/s
Iteration   5: 3252.142 ops/s
Iteration   6: 3399.173 ops/s
Iteration   7: 3345.005 ops/s
Iteration   8: 2940.075 ops/s
Iteration   9: 3774.265 ops/s
Iteration  10: 3158.645 ops/s
Iteration  11: 3613.325 ops/s
Iteration  12: 3389.027 ops/s
Iteration  13: 3761.347 ops/s
Iteration  14: 3471.621 ops/s
Iteration  15: 3802.104 ops/s
Iteration  16: 3640.116 ops/s
Iteration  17: 3920.201 ops/s
Iteration  18: 3840.215 ops/s
Iteration  19: 3837.898 ops/s
Iteration  20: 3849.016 ops/s

# Run progress: 10.00% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 145.688 ops/s
# Warmup Iteration   2: 464.963 ops/s
# Warmup Iteration   3: 598.962 ops/s
# Warmup Iteration   4: 1092.952 ops/s
# Warmup Iteration   5: 1316.129 ops/s
# Warmup Iteration   6: 1372.894 ops/s
# Warmup Iteration   7: 1340.913 ops/s
# Warmup Iteration   8: 1618.143 ops/s
# Warmup Iteration   9: 1636.984 ops/s
# Warmup Iteration  10: 1693.168 ops/s
# Warmup Iteration  11: 1867.354 ops/s
# Warmup Iteration  12: 2049.632 ops/s
# Warmup Iteration  13: 2350.100 ops/s
# Warmup Iteration  14: 2904.220 ops/s
# Warmup Iteration  15: 3387.637 ops/s
# Warmup Iteration  16: 3408.468 ops/s
# Warmup Iteration  17: 3811.957 ops/s
# Warmup Iteration  18: 3598.086 ops/s
# Warmup Iteration  19: 3619.312 ops/s
# Warmup Iteration  20: 3886.454 ops/s
Iteration   1: 3728.135 ops/s
Iteration   2: 3765.462 ops/s
Iteration   3: 4173.711 ops/s
Iteration   4: 3748.478 ops/s
Iteration   5: 4139.765 ops/s
Iteration   6: 3770.349 ops/s
Iteration   7: 4048.717 ops/s
Iteration   8: 3352.462 ops/s
Iteration   9: 4225.241 ops/s
Iteration  10: 4001.194 ops/s
Iteration  11: 4082.623 ops/s
Iteration  12: 4208.376 ops/s
Iteration  13: 3982.342 ops/s
Iteration  14: 4205.039 ops/s
Iteration  15: 3674.523 ops/s
Iteration  16: 3905.128 ops/s
Iteration  17: 3988.729 ops/s
Iteration  18: 3908.928 ops/s
Iteration  19: 4181.704 ops/s
Iteration  20: 4039.171 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.createPerson":
  3716.135 ±(99.9%) 208.849 ops/s [Average]
  (min, avg, max) = (2775.201, 3716.135, 4225.241), stdev = 371.229
  CI (99.9%): [3507.286, 3924.984] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:41
# Fork: 1 of 2
# Warmup Iteration   1: 260.701 ops/s
# Warmup Iteration   2: 567.320 ops/s
# Warmup Iteration   3: 959.060 ops/s
# Warmup Iteration   4: 1675.896 ops/s
# Warmup Iteration   5: 1839.986 ops/s
# Warmup Iteration   6: 1884.946 ops/s
# Warmup Iteration   7: 2079.517 ops/s
# Warmup Iteration   8: 2061.147 ops/s
# Warmup Iteration   9: 2120.150 ops/s
# Warmup Iteration  10: 2247.978 ops/s
# Warmup Iteration  11: 2448.471 ops/s
# Warmup Iteration  12: 2584.769 ops/s
# Warmup Iteration  13: 3163.025 ops/s
# Warmup Iteration  14: 4248.290 ops/s
# Warmup Iteration  15: 4775.215 ops/s
# Warmup Iteration  16: 4315.639 ops/s
# Warmup Iteration  17: 4465.256 ops/s
# Warmup Iteration  18: 4767.347 ops/s
# Warmup Iteration  19: 2916.129 ops/s
# Warmup Iteration  20: 4858.549 ops/s
Iteration   1: 4344.907 ops/s
Iteration   2: 4799.720 ops/s
Iteration   3: 4559.030 ops/s
Iteration   4: 4324.862 ops/s
Iteration   5: 4958.398 ops/s
Iteration   6: 4327.303 ops/s
Iteration   7: 5050.895 ops/s
Iteration   8: 4539.516 ops/s
Iteration   9: 5072.196 ops/s
Iteration  10: 5088.330 ops/s
Iteration  11: 4580.824 ops/s
Iteration  12: 4982.010 ops/s
Iteration  13: 4504.132 ops/s
Iteration  14: 4989.983 ops/s
Iteration  15: 4696.990 ops/s
Iteration  16: 4881.346 ops/s
Iteration  17: 4727.313 ops/s
Iteration  18: 4706.784 ops/s
Iteration  19: 4913.392 ops/s
Iteration  20: 4690.469 ops/s

# Run progress: 30.00% complete, ETA 00:04:58
# Fork: 2 of 2
# Warmup Iteration   1: 361.902 ops/s
# Warmup Iteration   2: 747.811 ops/s
# Warmup Iteration   3: 1182.058 ops/s
# Warmup Iteration   4: 1501.016 ops/s
# Warmup Iteration   5: 1781.587 ops/s
# Warmup Iteration   6: 2337.026 ops/s
# Warmup Iteration   7: 1899.540 ops/s
# Warmup Iteration   8: 2268.586 ops/s
# Warmup Iteration   9: 2036.706 ops/s
# Warmup Iteration  10: 2377.136 ops/s
# Warmup Iteration  11: 2396.661 ops/s
# Warmup Iteration  12: 3775.015 ops/s
# Warmup Iteration  13: 4450.639 ops/s
# Warmup Iteration  14: 4623.587 ops/s
# Warmup Iteration  15: 4660.848 ops/s
# Warmup Iteration  16: 4648.377 ops/s
# Warmup Iteration  17: 5196.768 ops/s
# Warmup Iteration  18: 4624.235 ops/s
# Warmup Iteration  19: 4537.556 ops/s
# Warmup Iteration  20: 5027.010 ops/s
Iteration   1: 4968.982 ops/s
Iteration   2: 4533.428 ops/s
Iteration   3: 5181.489 ops/s
Iteration   4: 4294.982 ops/s
Iteration   5: 5241.339 ops/s
Iteration   6: 4851.110 ops/s
Iteration   7: 5136.917 ops/s
Iteration   8: 4808.636 ops/s
Iteration   9: 5156.035 ops/s
Iteration  10: 4735.626 ops/s
Iteration  11: 5094.379 ops/s
Iteration  12: 2705.267 ops/s
Iteration  13: 5116.994 ops/s
Iteration  14: 4641.318 ops/s
Iteration  15: 5090.149 ops/s
Iteration  16: 4717.580 ops/s
Iteration  17: 5270.137 ops/s
Iteration  18: 4899.787 ops/s
Iteration  19: 5145.124 ops/s
Iteration  20: 4816.855 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPerson":
  4778.613 ±(99.9%) 242.627 ops/s [Average]
  (min, avg, max) = (2705.267, 4778.613, 5270.137), stdev = 431.269
  CI (99.9%): [4535.987, 5021.240] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:15
# Fork: 1 of 2
# Warmup Iteration   1: 170.937 ops/s
# Warmup Iteration   2: 417.116 ops/s
# Warmup Iteration   3: 607.849 ops/s
# Warmup Iteration   4: 975.561 ops/s
# Warmup Iteration   5: 1165.442 ops/s
# Warmup Iteration   6: 1219.677 ops/s
# Warmup Iteration   7: 1240.716 ops/s
# Warmup Iteration   8: 1324.437 ops/s
# Warmup Iteration   9: 1455.624 ops/s
# Warmup Iteration  10: 1485.277 ops/s
# Warmup Iteration  11: 1583.134 ops/s
# Warmup Iteration  12: 1763.798 ops/s
# Warmup Iteration  13: 1988.652 ops/s
# Warmup Iteration  14: 1948.915 ops/s
# Warmup Iteration  15: 2539.327 ops/s
# Warmup Iteration  16: 3039.223 ops/s
# Warmup Iteration  17: 3406.626 ops/s
# Warmup Iteration  18: 3349.268 ops/s
# Warmup Iteration  19: 3731.276 ops/s
# Warmup Iteration  20: 3492.660 ops/s
Iteration   1: 3376.507 ops/s
Iteration   2: 3804.340 ops/s
Iteration   3: 3357.554 ops/s
Iteration   4: 3893.171 ops/s
Iteration   5: 3636.237 ops/s
Iteration   6: 3974.650 ops/s
Iteration   7: 1866.455 ops/s
Iteration   8: 3970.826 ops/s
Iteration   9: 3368.515 ops/s
Iteration  10: 3818.360 ops/s
Iteration  11: 3830.928 ops/s
Iteration  12: 3939.209 ops/s
Iteration  13: 3840.638 ops/s
Iteration  14: 4112.022 ops/s
Iteration  15: 3787.551 ops/s
Iteration  16: 3905.903 ops/s
Iteration  17: 4076.063 ops/s
Iteration  18: 3798.286 ops/s
Iteration  19: 4053.653 ops/s
Iteration  20: 3772.443 ops/s

# Run progress: 50.00% complete, ETA 00:03:32
# Fork: 2 of 2
# Warmup Iteration   1: 309.554 ops/s
# Warmup Iteration   2: 615.432 ops/s
# Warmup Iteration   3: 916.120 ops/s
# Warmup Iteration   4: 1548.374 ops/s
# Warmup Iteration   5: 1682.815 ops/s
# Warmup Iteration   6: 1620.723 ops/s
# Warmup Iteration   7: 1569.219 ops/s
# Warmup Iteration   8: 1579.983 ops/s
# Warmup Iteration   9: 1609.480 ops/s
# Warmup Iteration  10: 1645.247 ops/s
# Warmup Iteration  11: 1645.682 ops/s
# Warmup Iteration  12: 1799.450 ops/s
# Warmup Iteration  13: 2019.848 ops/s
# Warmup Iteration  14: 2308.292 ops/s
# Warmup Iteration  15: 3286.299 ops/s
# Warmup Iteration  16: 3216.608 ops/s
# Warmup Iteration  17: 3341.853 ops/s
# Warmup Iteration  18: 3557.098 ops/s
# Warmup Iteration  19: 3556.968 ops/s
# Warmup Iteration  20: 3973.738 ops/s
Iteration   1: 3714.194 ops/s
Iteration   2: 4094.010 ops/s
Iteration   3: 2456.780 ops/s
Iteration   4: 4190.718 ops/s
Iteration   5: 3888.493 ops/s
Iteration   6: 4247.898 ops/s
Iteration   7: 3831.144 ops/s
Iteration   8: 4278.144 ops/s
Iteration   9: 3958.500 ops/s
Iteration  10: 3983.374 ops/s
Iteration  11: 3834.896 ops/s
Iteration  12: 4136.946 ops/s
Iteration  13: 3739.060 ops/s
Iteration  14: 4027.395 ops/s
Iteration  15: 3853.580 ops/s
Iteration  16: 4118.055 ops/s
Iteration  17: 3866.726 ops/s
Iteration  18: 4013.736 ops/s
Iteration  19: 3863.845 ops/s
Iteration  20: 4213.095 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPersonLinks":
  3812.347 ±(99.9%) 250.107 ops/s [Average]
  (min, avg, max) = (1866.455, 3812.347, 4278.144), stdev = 444.565
  CI (99.9%): [3562.240, 4062.455] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:50
# Fork: 1 of 2
# Warmup Iteration   1: 299.812 ops/s
# Warmup Iteration   2: 662.687 ops/s
# Warmup Iteration   3: 1023.366 ops/s
# Warmup Iteration   4: 1522.612 ops/s
# Warmup Iteration   5: 1536.765 ops/s
# Warmup Iteration   6: 1495.013 ops/s
# Warmup Iteration   7: 1589.919 ops/s
# Warmup Iteration   8: 1753.217 ops/s
# Warmup Iteration   9: 1815.015 ops/s
# Warmup Iteration  10: 1964.303 ops/s
# Warmup Iteration  11: 1962.586 ops/s
# Warmup Iteration  12: 2093.145 ops/s
# Warmup Iteration  13: 2604.601 ops/s
# Warmup Iteration  14: 2699.975 ops/s
# Warmup Iteration  15: 3897.593 ops/s
# Warmup Iteration  16: 4169.536 ops/s
# Warmup Iteration  17: 4576.826 ops/s
# Warmup Iteration  18: 4092.577 ops/s
# Warmup Iteration  19: 2967.328 ops/s
# Warmup Iteration  20: 4660.103 ops/s
Iteration   1: 3955.541 ops/s
Iteration   2: 4541.171 ops/s
Iteration   3: 4204.836 ops/s
Iteration   4: 4590.814 ops/s
Iteration   5: 4329.379 ops/s
Iteration   6: 4626.119 ops/s
Iteration   7: 4366.662 ops/s
Iteration   8: 4593.522 ops/s
Iteration   9: 4463.111 ops/s
Iteration  10: 4415.896 ops/s
Iteration  11: 4710.453 ops/s
Iteration  12: 4275.129 ops/s
Iteration  13: 4712.537 ops/s
Iteration  14: 4432.201 ops/s
Iteration  15: 4087.255 ops/s
Iteration  16: 4385.240 ops/s
Iteration  17: 4422.341 ops/s
Iteration  18: 4467.525 ops/s
Iteration  19: 4340.039 ops/s
Iteration  20: 4507.919 ops/s

# Run progress: 70.00% complete, ETA 00:02:07
# Fork: 2 of 2
# Warmup Iteration   1: 306.404 ops/s
# Warmup Iteration   2: 659.623 ops/s
# Warmup Iteration   3: 1101.667 ops/s
# Warmup Iteration   4: 1764.004 ops/s
# Warmup Iteration   5: 1671.471 ops/s
# Warmup Iteration   6: 1636.014 ops/s
# Warmup Iteration   7: 1784.423 ops/s
# Warmup Iteration   8: 1806.466 ops/s
# Warmup Iteration   9: 1888.319 ops/s
# Warmup Iteration  10: 1928.150 ops/s
# Warmup Iteration  11: 2139.183 ops/s
# Warmup Iteration  12: 2589.441 ops/s
# Warmup Iteration  13: 3218.422 ops/s
# Warmup Iteration  14: 4384.741 ops/s
# Warmup Iteration  15: 4321.105 ops/s
# Warmup Iteration  16: 4537.167 ops/s
# Warmup Iteration  17: 4001.617 ops/s
# Warmup Iteration  18: 2757.689 ops/s
# Warmup Iteration  19: 4761.950 ops/s
# Warmup Iteration  20: 4111.195 ops/s
Iteration   1: 4768.420 ops/s
Iteration   2: 3540.357 ops/s
Iteration   3: 3682.313 ops/s
Iteration   4: 3992.975 ops/s
Iteration   5: 4082.277 ops/s
Iteration   6: 4258.426 ops/s
Iteration   7: 4414.162 ops/s
Iteration   8: 4722.903 ops/s
Iteration   9: 4352.689 ops/s
Iteration  10: 4707.703 ops/s
Iteration  11: 4525.257 ops/s
Iteration  12: 4911.691 ops/s
Iteration  13: 4423.472 ops/s
Iteration  14: 4706.759 ops/s
Iteration  15: 4514.220 ops/s
Iteration  16: 4752.705 ops/s
Iteration  17: 4512.450 ops/s
Iteration  18: 4468.454 ops/s
Iteration  19: 4778.101 ops/s
Iteration  20: 4450.384 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.listPersons":
  4424.835 ±(99.9%) 162.293 ops/s [Average]
  (min, avg, max) = (3540.357, 4424.835, 4911.691), stdev = 288.476
  CI (99.9%): [4262.542, 4587.128] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:25
# Fork: 1 of 2
# Warmup Iteration   1: 46.269 ops/s
# Warmup Iteration   2: 67.854 ops/s
# Warmup Iteration   3: 92.600 ops/s
# Warmup Iteration   4: 159.971 ops/s
# Warmup Iteration   5: 172.587 ops/s
# Warmup Iteration   6: 172.580 ops/s
# Warmup Iteration   7: 199.481 ops/s
# Warmup Iteration   8: 216.561 ops/s
# Warmup Iteration   9: 258.301 ops/s
# Warmup Iteration  10: 300.023 ops/s
# Warmup Iteration  11: 265.343 ops/s
# Warmup Iteration  12: 268.424 ops/s
# Warmup Iteration  13: 293.430 ops/s
# Warmup Iteration  14: 331.845 ops/s
# Warmup Iteration  15: 469.887 ops/s
# Warmup Iteration  16: 430.765 ops/s
# Warmup Iteration  17: 475.700 ops/s
# Warmup Iteration  18: 513.556 ops/s
# Warmup Iteration  19: 561.608 ops/s
# Warmup Iteration  20: 371.704 ops/s
Iteration   1: 357.089 ops/s
Iteration   2: 510.688 ops/s
Iteration   3: 374.238 ops/s
Iteration   4: 358.197 ops/s
Iteration   5: 476.967 ops/s
Iteration   6: 421.700 ops/s
Iteration   7: 482.937 ops/s
Iteration   8: 487.809 ops/s
Iteration   9: 468.399 ops/s
Iteration  10: 572.043 ops/s
Iteration  11: 521.494 ops/s
Iteration  12: 576.373 ops/s
Iteration  13: 499.737 ops/s
Iteration  14: 598.590 ops/s
Iteration  15: 482.984 ops/s
Iteration  16: 581.149 ops/s
Iteration  17: 557.595 ops/s
Iteration  18: 590.108 ops/s
Iteration  19: 540.389 ops/s
Iteration  20: 586.671 ops/s

# Run progress: 90.00% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 43.236 ops/s
# Warmup Iteration   2: 81.271 ops/s
# Warmup Iteration   3: 95.167 ops/s
# Warmup Iteration   4: 174.689 ops/s
# Warmup Iteration   5: 214.711 ops/s
# Warmup Iteration   6: 251.234 ops/s
# Warmup Iteration   7: 205.668 ops/s
# Warmup Iteration   8: 207.512 ops/s
# Warmup Iteration   9: 212.094 ops/s
# Warmup Iteration  10: 233.356 ops/s
# Warmup Iteration  11: 235.123 ops/s
# Warmup Iteration  12: 267.696 ops/s
# Warmup Iteration  13: 272.884 ops/s
# Warmup Iteration  14: 329.253 ops/s
# Warmup Iteration  15: 441.846 ops/s
# Warmup Iteration  16: 498.120 ops/s
# Warmup Iteration  17: 456.974 ops/s
# Warmup Iteration  18: 424.277 ops/s
# Warmup Iteration  19: 430.925 ops/s
# Warmup Iteration  20: 418.475 ops/s
Iteration   1: 348.606 ops/s
Iteration   2: 329.015 ops/s
Iteration   3: 443.491 ops/s
Iteration   4: 355.178 ops/s
Iteration   5: 464.647 ops/s
Iteration   6: 491.653 ops/s
Iteration   7: 487.890 ops/s
Iteration   8: 461.113 ops/s
Iteration   9: 523.817 ops/s
Iteration  10: 494.927 ops/s
Iteration  11: 555.609 ops/s
Iteration  12: 521.968 ops/s
Iteration  13: 597.459 ops/s
Iteration  14: 545.616 ops/s
Iteration  15: 583.332 ops/s
Iteration  16: 543.229 ops/s
Iteration  17: 588.107 ops/s
Iteration  18: 550.799 ops/s
Iteration  19: 585.535 ops/s
Iteration  20: 533.112 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.programComposition":
  501.256 ±(99.9%) 43.743 ops/s [Average]
  (min, avg, max) = (329.015, 501.256, 598.590), stdev = 77.753
  CI (99.9%): [457.514, 544.999] (assumes normal distribution)


# Run complete. Total time: 00:07:06

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                             Mode  Cnt     Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40  3716.135 ± 208.849  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  4778.613 ± 242.627  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40  3812.347 ± 250.107  ops/s
RPCAvroBenchmark.listPersons         thrpt   40  4424.835 ± 162.293  ops/s
RPCAvroBenchmark.programComposition  thrpt   40   501.256 ±  43.743  ops/s
```

## Summary

### HTTP

```bash
# Run complete. Total time: 00:07:08

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  2567.182 ± 490.607  ops/s
HttpBenchmark.getPerson           thrpt   40  4352.536 ± 101.832  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  3535.380 ±  69.672  ops/s
HttpBenchmark.listPersons         thrpt   40  3766.406 ±  62.676  ops/s
HttpBenchmark.programComposition  thrpt   40   422.560 ±  30.245  ops/s
```

### mu-rpc - Protobuf Serialization

```bash
# Run complete. Total time: 00:07:02

Benchmark                              Mode  Cnt     Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40  6417.909 ± 333.242  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  7345.886 ± 148.966  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40  5604.365 ± 108.714  ops/s
RPCProtoBenchmark.listPersons         thrpt   40  6106.618 ± 114.832  ops/s
RPCProtoBenchmark.programComposition  thrpt   40   818.099 ±  17.076  ops/s
```

### mu-rpc - Avro Serialization

```bash
# Run complete. Total time: 00:07:06

Benchmark                             Mode  Cnt     Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40  3716.135 ± 208.849  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  4778.613 ± 242.627  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40  3812.347 ± 250.107  ops/s
RPCAvroBenchmark.listPersons         thrpt   40  4424.835 ± 162.293  ops/s
RPCAvroBenchmark.programComposition  thrpt   40   501.256 ±  43.743  ops/s
```
