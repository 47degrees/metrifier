# Benchmark Results

See [README](../README.md#running-benchmarks-locally) for reference.

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

## jmh - http

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

## jmh - frees-rpc

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
# Benchmark: metrifier.benchmark.RPCBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 157.066 ops/s
# Warmup Iteration   2: 242.756 ops/s
# Warmup Iteration   3: 373.319 ops/s
# Warmup Iteration   4: 548.012 ops/s
# Warmup Iteration   5: 893.154 ops/s
# Warmup Iteration   6: 1328.570 ops/s
# Warmup Iteration   7: 1330.560 ops/s
# Warmup Iteration   8: 1459.951 ops/s
# Warmup Iteration   9: 1492.534 ops/s
# Warmup Iteration  10: 1502.394 ops/s
# Warmup Iteration  11: 1655.905 ops/s
# Warmup Iteration  12: 1418.274 ops/s
# Warmup Iteration  13: 1891.718 ops/s
# Warmup Iteration  14: 1781.052 ops/s
# Warmup Iteration  15: 2148.786 ops/s
# Warmup Iteration  16: 2724.880 ops/s
# Warmup Iteration  17: 3399.112 ops/s
# Warmup Iteration  18: 2806.721 ops/s
# Warmup Iteration  19: 3727.940 ops/s
# Warmup Iteration  20: 3281.388 ops/s
Iteration   1: 3445.698 ops/s
Iteration   2: 3512.169 ops/s
Iteration   3: 3811.564 ops/s
Iteration   4: 3590.378 ops/s
Iteration   5: 3067.794 ops/s
Iteration   6: 3576.040 ops/s
Iteration   7: 3845.207 ops/s
Iteration   8: 3899.030 ops/s
Iteration   9: 4625.253 ops/s
Iteration  10: 4696.382 ops/s
Iteration  11: 5300.864 ops/s
Iteration  12: 4964.442 ops/s
Iteration  13: 5131.275 ops/s
Iteration  14: 5073.353 ops/s
Iteration  15: 4836.422 ops/s
Iteration  16: 5084.338 ops/s
Iteration  17: 5100.276 ops/s
Iteration  18: 5233.008 ops/s
Iteration  19: 5368.398 ops/s
Iteration  20: 5403.285 ops/s

# Run progress: 10.00% complete, ETA 00:08:42
# Fork: 2 of 2
# Warmup Iteration   1: 202.196 ops/s
# Warmup Iteration   2: 512.883 ops/s
# Warmup Iteration   3: 1015.288 ops/s
# Warmup Iteration   4: 1794.972 ops/s
# Warmup Iteration   5: 2012.998 ops/s
# Warmup Iteration   6: 1981.850 ops/s
# Warmup Iteration   7: 2165.815 ops/s
# Warmup Iteration   8: 2544.153 ops/s
# Warmup Iteration   9: 2601.386 ops/s
# Warmup Iteration  10: 3511.311 ops/s
# Warmup Iteration  11: 3865.192 ops/s
# Warmup Iteration  12: 4574.300 ops/s
# Warmup Iteration  13: 5270.566 ops/s
# Warmup Iteration  14: 5224.914 ops/s
# Warmup Iteration  15: 5182.588 ops/s
# Warmup Iteration  16: 5338.489 ops/s
# Warmup Iteration  17: 5190.619 ops/s
# Warmup Iteration  18: 5204.010 ops/s
# Warmup Iteration  19: 5588.836 ops/s
# Warmup Iteration  20: 4877.981 ops/s
Iteration   1: 5795.790 ops/s
Iteration   2: 5684.320 ops/s
Iteration   3: 5149.851 ops/s
Iteration   4: 4254.135 ops/s
Iteration   5: 3977.161 ops/s
Iteration   6: 4377.886 ops/s
Iteration   7: 4422.347 ops/s
Iteration   8: 4936.292 ops/s
Iteration   9: 3966.825 ops/s
Iteration  10: 5225.849 ops/s
Iteration  11: 5646.727 ops/s
Iteration  12: 4486.417 ops/s
Iteration  13: 5158.852 ops/s
Iteration  14: 4787.394 ops/s
Iteration  15: 5522.476 ops/s
Iteration  16: 5667.954 ops/s
Iteration  17: 4418.222 ops/s
Iteration  18: 3916.934 ops/s
Iteration  19: 4341.509 ops/s
Iteration  20: 4676.408 ops/s


Result "metrifier.benchmark.RPCBenchmark.createPerson":
  4649.463 ±(99.9%) 405.442 ops/s [Average]
  (min, avg, max) = (3067.794, 4649.463, 5795.790), stdev = 720.673
  CI (99.9%): [4244.021, 5054.905] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:07:40
# Fork: 1 of 2
# Warmup Iteration   1: 0.744 ops/s
# Warmup Iteration   2: 1037.059 ops/s
# Warmup Iteration   3: 2338.610 ops/s
# Warmup Iteration   4: 3186.179 ops/s
# Warmup Iteration   5: 2966.684 ops/s
# Warmup Iteration   6: 2293.153 ops/s
# Warmup Iteration   7: 2855.161 ops/s
# Warmup Iteration   8: 4804.723 ops/s
# Warmup Iteration   9: 5129.499 ops/s
# Warmup Iteration  10: 7618.872 ops/s
# Warmup Iteration  11: 7584.680 ops/s
# Warmup Iteration  12: 6625.455 ops/s
# Warmup Iteration  13: 7427.855 ops/s
# Warmup Iteration  14: 8113.231 ops/s
# Warmup Iteration  15: 8011.461 ops/s
# Warmup Iteration  16: 9299.240 ops/s
# Warmup Iteration  17: 6980.068 ops/s
# Warmup Iteration  18: 6012.936 ops/s
# Warmup Iteration  19: 6840.903 ops/s
# Warmup Iteration  20: 6931.441 ops/s
Iteration   1: 5894.531 ops/s
Iteration   2: 4827.653 ops/s
Iteration   3: 6833.657 ops/s
Iteration   4: 6738.814 ops/s
Iteration   5: 5998.624 ops/s
Iteration   6: 7722.289 ops/s
Iteration   7: 6473.800 ops/s
Iteration   8: 6765.808 ops/s
Iteration   9: 3512.221 ops/s
Iteration  10: 5212.421 ops/s
Iteration  11: 5430.737 ops/s
Iteration  12: 5306.438 ops/s
Iteration  13: 5703.413 ops/s
Iteration  14: 8176.595 ops/s
Iteration  15: 6065.518 ops/s
Iteration  16: 7609.240 ops/s
Iteration  17: 7696.202 ops/s
Iteration  18: 8355.612 ops/s
Iteration  19: 7585.753 ops/s
Iteration  20: 5905.436 ops/s

# Run progress: 30.00% complete, ETA 00:06:41
# Fork: 2 of 2
# Warmup Iteration   1: 0.742 ops/s
# Warmup Iteration   2: 595.728 ops/s
# Warmup Iteration   3: 1483.615 ops/s
# Warmup Iteration   4: 2304.060 ops/s
# Warmup Iteration   5: 3041.931 ops/s
# Warmup Iteration   6: 3032.440 ops/s
# Warmup Iteration   7: 3332.734 ops/s
# Warmup Iteration   8: 3747.930 ops/s
# Warmup Iteration   9: 4171.307 ops/s
# Warmup Iteration  10: 5026.343 ops/s
# Warmup Iteration  11: 7257.939 ops/s
# Warmup Iteration  12: 8515.342 ops/s
# Warmup Iteration  13: 8304.458 ops/s
# Warmup Iteration  14: 5569.853 ops/s
# Warmup Iteration  15: 7821.195 ops/s
# Warmup Iteration  16: 4660.351 ops/s
# Warmup Iteration  17: 7142.976 ops/s
# Warmup Iteration  18: 7794.529 ops/s
# Warmup Iteration  19: 7657.688 ops/s
# Warmup Iteration  20: 7533.951 ops/s
Iteration   1: 4937.529 ops/s
Iteration   2: 7304.748 ops/s
Iteration   3: 6028.069 ops/s
Iteration   4: 6807.012 ops/s
Iteration   5: 8263.639 ops/s
Iteration   6: 6450.050 ops/s
Iteration   7: 5518.217 ops/s
Iteration   8: 7839.042 ops/s
Iteration   9: 6478.652 ops/s
Iteration  10: 6684.317 ops/s
Iteration  11: 7140.346 ops/s
Iteration  12: 7602.709 ops/s
Iteration  13: 6862.209 ops/s
Iteration  14: 7706.167 ops/s
Iteration  15: 7841.799 ops/s
Iteration  16: 7491.260 ops/s
Iteration  17: 4604.550 ops/s
Iteration  18: 7046.868 ops/s
Iteration  19: 8113.594 ops/s
Iteration  20: 8659.517 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPerson":
  6679.876 ±(99.9%) 666.530 ops/s [Average]
  (min, avg, max) = (3512.221, 6679.876, 8659.517), stdev = 1184.757
  CI (99.9%): [6013.346, 7346.407] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: 0.735 ops/s
# Warmup Iteration   2: 781.683 ops/s
# Warmup Iteration   3: 1734.668 ops/s
# Warmup Iteration   4: 1790.601 ops/s
# Warmup Iteration   5: 2232.331 ops/s
# Warmup Iteration   6: 2311.347 ops/s
# Warmup Iteration   7: 2517.694 ops/s
# Warmup Iteration   8: 2716.934 ops/s
# Warmup Iteration   9: 3180.389 ops/s
# Warmup Iteration  10: 3551.217 ops/s
# Warmup Iteration  11: 3890.137 ops/s
# Warmup Iteration  12: 4348.189 ops/s
# Warmup Iteration  13: 3377.420 ops/s
# Warmup Iteration  14: 3052.139 ops/s
# Warmup Iteration  15: 3121.816 ops/s
# Warmup Iteration  16: 3652.275 ops/s
# Warmup Iteration  17: 3180.721 ops/s
# Warmup Iteration  18: 3537.619 ops/s
# Warmup Iteration  19: 4590.329 ops/s
# Warmup Iteration  20: 4865.576 ops/s
Iteration   1: 4325.985 ops/s
Iteration   2: 4704.208 ops/s
Iteration   3: 4737.322 ops/s
Iteration   4: 5720.017 ops/s
Iteration   5: 6060.263 ops/s
Iteration   6: 5641.901 ops/s
Iteration   7: 5620.830 ops/s
Iteration   8: 6127.312 ops/s
Iteration   9: 5460.776 ops/s
Iteration  10: 5461.705 ops/s
Iteration  11: 5934.379 ops/s
Iteration  12: 5758.028 ops/s
Iteration  13: 5137.556 ops/s
Iteration  14: 5576.338 ops/s
Iteration  15: 5807.119 ops/s
Iteration  16: 5549.264 ops/s
Iteration  17: 6230.859 ops/s
Iteration  18: 6188.339 ops/s
Iteration  19: 5770.742 ops/s
Iteration  20: 5370.193 ops/s

# Run progress: 50.00% complete, ETA 00:04:45
# Fork: 2 of 2
# Warmup Iteration   1: 0.738 ops/s
# Warmup Iteration   2: 771.137 ops/s
# Warmup Iteration   3: 1027.309 ops/s
# Warmup Iteration   4: 1650.985 ops/s
# Warmup Iteration   5: 2625.094 ops/s
# Warmup Iteration   6: 3163.762 ops/s
# Warmup Iteration   7: 3249.263 ops/s
# Warmup Iteration   8: 4136.407 ops/s
# Warmup Iteration   9: 4606.960 ops/s
# Warmup Iteration  10: 5606.004 ops/s
# Warmup Iteration  11: 5879.752 ops/s
# Warmup Iteration  12: 5733.598 ops/s
# Warmup Iteration  13: 5226.595 ops/s
# Warmup Iteration  14: 5359.031 ops/s
# Warmup Iteration  15: 3960.076 ops/s
# Warmup Iteration  16: 5145.275 ops/s
# Warmup Iteration  17: 5147.601 ops/s
# Warmup Iteration  18: 4236.682 ops/s
# Warmup Iteration  19: 4439.259 ops/s
# Warmup Iteration  20: 5409.966 ops/s
Iteration   1: 5565.134 ops/s
Iteration   2: 5005.861 ops/s
Iteration   3: 4350.143 ops/s
Iteration   4: 4348.571 ops/s
Iteration   5: 5934.361 ops/s
Iteration   6: 6244.914 ops/s
Iteration   7: 6157.885 ops/s
Iteration   8: 5985.960 ops/s
Iteration   9: 5811.025 ops/s
Iteration  10: 4863.568 ops/s
Iteration  11: 6312.004 ops/s
Iteration  12: 6142.135 ops/s
Iteration  13: 6093.130 ops/s
Iteration  14: 5608.308 ops/s
Iteration  15: 6125.469 ops/s
Iteration  16: 6230.784 ops/s
Iteration  17: 6338.456 ops/s
Iteration  18: 6265.988 ops/s
Iteration  19: 4923.445 ops/s
Iteration  20: 4585.227 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPersonLinks":
  5601.888 ±(99.9%) 339.340 ops/s [Average]
  (min, avg, max) = (4325.985, 5601.888, 6338.456), stdev = 603.177
  CI (99.9%): [5262.548, 5941.228] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:03:48
# Fork: 1 of 2
# Warmup Iteration   1: 309.306 ops/s
# Warmup Iteration   2: 965.695 ops/s
# Warmup Iteration   3: 1978.847 ops/s
# Warmup Iteration   4: 2755.621 ops/s
# Warmup Iteration   5: 2557.041 ops/s
# Warmup Iteration   6: 2645.518 ops/s
# Warmup Iteration   7: 2971.610 ops/s
# Warmup Iteration   8: 3582.824 ops/s
# Warmup Iteration   9: 4345.152 ops/s
# Warmup Iteration  10: 5573.142 ops/s
# Warmup Iteration  11: 6086.457 ops/s
# Warmup Iteration  12: 6160.204 ops/s
# Warmup Iteration  13: 6223.944 ops/s
# Warmup Iteration  14: 5450.820 ops/s
# Warmup Iteration  15: 5459.890 ops/s
# Warmup Iteration  16: 6045.589 ops/s
# Warmup Iteration  17: 5518.277 ops/s
# Warmup Iteration  18: 5850.975 ops/s
# Warmup Iteration  19: 5524.896 ops/s
# Warmup Iteration  20: 6270.449 ops/s
Iteration   1: 6295.349 ops/s
Iteration   2: 4110.985 ops/s
Iteration   3: 5092.334 ops/s
Iteration   4: 4756.947 ops/s
Iteration   5: 4418.934 ops/s
Iteration   6: 2981.461 ops/s
Iteration   7: 5975.441 ops/s
Iteration   8: 4545.660 ops/s
Iteration   9: 5492.892 ops/s
Iteration  10: 6170.010 ops/s
Iteration  11: 5489.728 ops/s
Iteration  12: 6018.454 ops/s
Iteration  13: 6442.334 ops/s
Iteration  14: 5683.518 ops/s
Iteration  15: 5191.085 ops/s
Iteration  16: 4599.236 ops/s
Iteration  17: 5955.455 ops/s
Iteration  18: 4569.663 ops/s
Iteration  19: 5407.093 ops/s
Iteration  20: 6029.619 ops/s

# Run progress: 70.00% complete, ETA 00:02:51
# Fork: 2 of 2
# Warmup Iteration   1: 0.739 ops/s
# Warmup Iteration   2: 1017.033 ops/s
# Warmup Iteration   3: 2087.615 ops/s
# Warmup Iteration   4: 2908.688 ops/s
# Warmup Iteration   5: 3114.922 ops/s
# Warmup Iteration   6: 3319.305 ops/s
# Warmup Iteration   7: 3979.624 ops/s
# Warmup Iteration   8: 4446.812 ops/s
# Warmup Iteration   9: 4164.370 ops/s
# Warmup Iteration  10: 5440.808 ops/s
# Warmup Iteration  11: 6239.877 ops/s
# Warmup Iteration  12: 6392.205 ops/s
# Warmup Iteration  13: 6457.819 ops/s
# Warmup Iteration  14: 6654.660 ops/s
# Warmup Iteration  15: 6342.917 ops/s
# Warmup Iteration  16: 6551.336 ops/s
# Warmup Iteration  17: 6404.337 ops/s
# Warmup Iteration  18: 6431.979 ops/s
# Warmup Iteration  19: 6576.284 ops/s
# Warmup Iteration  20: 5809.248 ops/s
Iteration   1: 6532.815 ops/s
Iteration   2: 6314.420 ops/s
Iteration   3: 5891.717 ops/s
Iteration   4: 6383.807 ops/s
Iteration   5: 5915.833 ops/s
Iteration   6: 6734.234 ops/s
Iteration   7: 6057.926 ops/s
Iteration   8: 6691.827 ops/s
Iteration   9: 6555.896 ops/s
Iteration  10: 6310.441 ops/s
Iteration  11: 6499.161 ops/s
Iteration  12: 6231.056 ops/s
Iteration  13: 5028.230 ops/s
Iteration  14: 5128.111 ops/s
Iteration  15: 6100.783 ops/s
Iteration  16: 5863.433 ops/s
Iteration  17: 6140.694 ops/s
Iteration  18: 6303.404 ops/s
Iteration  19: 6737.799 ops/s
Iteration  20: 6556.753 ops/s


Result "metrifier.benchmark.RPCBenchmark.listPersons":
  5730.113 ±(99.9%) 473.916 ops/s [Average]
  (min, avg, max) = (2981.461, 5730.113, 6737.799), stdev = 842.385
  CI (99.9%): [5256.198, 6204.029] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:54
# Fork: 1 of 2
# Warmup Iteration   1: 62.272 ops/s
# Warmup Iteration   2: 141.915 ops/s
# Warmup Iteration   3: 226.745 ops/s
# Warmup Iteration   4: 387.543 ops/s
# Warmup Iteration   5: 393.669 ops/s
# Warmup Iteration   6: 421.901 ops/s
# Warmup Iteration   7: 494.261 ops/s
# Warmup Iteration   8: 461.939 ops/s
# Warmup Iteration   9: 559.633 ops/s
# Warmup Iteration  10: 735.018 ops/s
# Warmup Iteration  11: 768.112 ops/s
# Warmup Iteration  12: 738.405 ops/s
# Warmup Iteration  13: 623.232 ops/s
# Warmup Iteration  14: 733.950 ops/s
# Warmup Iteration  15: 544.803 ops/s
# Warmup Iteration  16: 778.607 ops/s
# Warmup Iteration  17: 683.015 ops/s
# Warmup Iteration  18: 757.335 ops/s
# Warmup Iteration  19: 585.365 ops/s
# Warmup Iteration  20: 493.468 ops/s
Iteration   1: 651.361 ops/s
Iteration   2: 692.800 ops/s
Iteration   3: 677.598 ops/s
Iteration   4: 806.966 ops/s
Iteration   5: 854.282 ops/s
Iteration   6: 806.881 ops/s
Iteration   7: 749.940 ops/s
Iteration   8: 684.362 ops/s
Iteration   9: 671.530 ops/s
Iteration  10: 796.378 ops/s
Iteration  11: 388.758 ops/s
Iteration  12: 722.298 ops/s
Iteration  13: 841.860 ops/s
Iteration  14: 816.032 ops/s
Iteration  15: 753.413 ops/s
Iteration  16: 829.782 ops/s
Iteration  17: 738.661 ops/s
Iteration  18: 727.012 ops/s
Iteration  19: 867.021 ops/s
Iteration  20: 878.184 ops/s

# Run progress: 90.00% complete, ETA 00:00:57
# Fork: 2 of 2
# Warmup Iteration   1: 61.586 ops/s
# Warmup Iteration   2: 111.359 ops/s
# Warmup Iteration   3: 223.614 ops/s
# Warmup Iteration   4: 274.978 ops/s
# Warmup Iteration   5: 292.766 ops/s
# Warmup Iteration   6: 329.878 ops/s
# Warmup Iteration   7: 329.757 ops/s
# Warmup Iteration   8: 356.977 ops/s
# Warmup Iteration   9: 381.388 ops/s
# Warmup Iteration  10: 383.102 ops/s
# Warmup Iteration  11: 354.048 ops/s
# Warmup Iteration  12: 555.159 ops/s
# Warmup Iteration  13: 473.715 ops/s
# Warmup Iteration  14: 433.081 ops/s
# Warmup Iteration  15: 365.960 ops/s
# Warmup Iteration  16: 402.010 ops/s
# Warmup Iteration  17: 313.301 ops/s
# Warmup Iteration  18: 501.835 ops/s
# Warmup Iteration  19: 520.743 ops/s
# Warmup Iteration  20: 517.526 ops/s
Iteration   1: 556.712 ops/s
Iteration   2: 554.078 ops/s
Iteration   3: 546.968 ops/s
Iteration   4: 540.331 ops/s
Iteration   5: 610.320 ops/s
Iteration   6: 816.763 ops/s
Iteration   7: 895.258 ops/s
Iteration   8: 864.662 ops/s
Iteration   9: 822.553 ops/s
Iteration  10: 908.558 ops/s
Iteration  11: 795.973 ops/s
Iteration  12: 882.793 ops/s
Iteration  13: 961.580 ops/s
Iteration  14: 922.941 ops/s
Iteration  15: 922.164 ops/s
Iteration  16: 996.012 ops/s
Iteration  17: 931.374 ops/s
Iteration  18: 904.276 ops/s
Iteration  19: 951.750 ops/s
Iteration  20: 940.422 ops/s


Result "metrifier.benchmark.RPCBenchmark.programComposition":
  782.015 ±(99.9%) 78.340 ops/s [Average]
  (min, avg, max) = (388.758, 782.015, 996.012), stdev = 139.250
  CI (99.9%): [703.675, 860.356] (assumes normal distribution)


# Run complete. Total time: 00:09:31

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  4649.463 ± 405.442  ops/s
RPCBenchmark.getPerson           thrpt   40  6679.876 ± 666.530  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  5601.888 ± 339.340  ops/s
RPCBenchmark.listPersons         thrpt   40  5730.113 ± 473.916  ops/s
RPCBenchmark.programComposition  thrpt   40   782.015 ±  78.340  ops/s
```

## Summary

### http

```bash
# Run complete. Total time: 00:08:46

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  4620.771 ± 117.685  ops/s
HttpBenchmark.getPerson           thrpt   40  5744.610 ± 609.674  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  3526.018 ± 398.348  ops/s
HttpBenchmark.listPersons         thrpt   40  4364.214 ± 366.537  ops/s
HttpBenchmark.programComposition  thrpt   40   593.829 ±  31.651  ops/s
```


### frees-rpc

```bash
# Run complete. Total time: 00:09:31

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  4649.463 ± 405.442  ops/s
RPCBenchmark.getPerson           thrpt   40  6679.876 ± 666.530  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  5601.888 ± 339.340  ops/s
RPCBenchmark.listPersons         thrpt   40  5730.113 ± 473.916  ops/s
RPCBenchmark.programComposition  thrpt   40   782.015 ±  78.340  ops/s
```
