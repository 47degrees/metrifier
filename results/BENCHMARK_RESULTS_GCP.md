# Benchmark Results

In this document we are posting all the Benchmarks results when testing atop GCP. For both `HTTP` and `RPC` benchmarks, we are deploying two Google Compute Engine instances, one for the server (`n1-standard-2`), another one for the benchmarks (`n1-standard-1`). See [Google Docs - Machine Types](https://cloud.google.com/compute/docs/machine-types) for deeper information.

See [README](../README.md#running-benchmarks-on-google-cloud-platform) for reference.

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [GCE Instance Details](#gce-instance-details)
  - [Server](#server)
  - [Benchmarks](#benchmarks)
- [JMH Results](#jmh-results)
  - [HTTP](#http)
  - [frees-rpc - Protobuf Serialization](#frees-rpc---protobuf-serialization)
  - [frees-rpc - Avro Serialization](#frees-rpc---avro-serialization)
- [Summary](#summary)
  - [HTTP](#http-1)
  - [frees-rpc - Protobuf Serialization](#frees-rpc---protobuf-serialization-1)
  - [frees-rpc - Avro Serialization](#frees-rpc---avro-serialization-1)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## GCE Instance Details

### Server

* n1-standard-2.
* 2 virtual CPUs.
* 7.5 GB of memory.

### Benchmarks

* n1-standard-1.
* 1 virtual CPU.
* 3.75 GB of memory.

## JMH Results

### HTTP

```bash
# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 207.417 ops/s
# Warmup Iteration   2: 186.358 ops/s
# Warmup Iteration   3: 302.855 ops/s
# Warmup Iteration   4: 443.092 ops/s
# Warmup Iteration   5: 546.021 ops/s
# Warmup Iteration   6: 633.398 ops/s
# Warmup Iteration   7: 785.443 ops/s
# Warmup Iteration   8: 973.645 ops/s
# Warmup Iteration   9: 1141.057 ops/s
# Warmup Iteration  10: 1296.869 ops/s
# Warmup Iteration  11: 1375.834 ops/s
# Warmup Iteration  12: 1666.575 ops/s
# Warmup Iteration  13: 2175.982 ops/s
# Warmup Iteration  14: 2445.844 ops/s
# Warmup Iteration  15: 2505.623 ops/s
# Warmup Iteration  16: 2503.850 ops/s
# Warmup Iteration  17: 2681.764 ops/s
# Warmup Iteration  18: 2781.007 ops/s
# Warmup Iteration  19: 2818.946 ops/s
# Warmup Iteration  20: 2810.758 ops/s
Iteration   1: 2749.155 ops/s
Iteration   2: 2699.779 ops/s
Iteration   3: 2691.168 ops/s
Iteration   4: 2776.760 ops/s
Iteration   5: 2809.494 ops/s
Iteration   6: 2858.592 ops/s
Iteration   7: 2658.811 ops/s
Iteration   8: 2530.133 ops/s
Iteration   9: 2533.683 ops/s
Iteration  10: 2739.368 ops/s
Iteration  11: 2867.386 ops/s
Iteration  12: 2903.247 ops/s
Iteration  13: 3004.631 ops/s
Iteration  14: 3099.343 ops/s
Iteration  15: 3109.145 ops/s
Iteration  16: 3206.218 ops/s
Iteration  17: 3108.530 ops/s
Iteration  18: 3076.463 ops/s
Iteration  19: 3036.962 ops/s
Iteration  20: 3339.009 ops/s

# Run progress: 10.00% complete, ETA 00:06:26
# Fork: 2 of 2
# Warmup Iteration   1: 199.266 ops/s
# Warmup Iteration   2: 165.233 ops/s
# Warmup Iteration   3: 213.898 ops/s
# Warmup Iteration   4: 347.189 ops/s
# Warmup Iteration   5: 495.497 ops/s
# Warmup Iteration   6: 629.265 ops/s
# Warmup Iteration   7: 725.562 ops/s
# Warmup Iteration   8: 742.223 ops/s
# Warmup Iteration   9: 917.979 ops/s
# Warmup Iteration  10: 1125.339 ops/s
# Warmup Iteration  11: 1251.111 ops/s
# Warmup Iteration  12: 1506.570 ops/s
# Warmup Iteration  13: 1973.252 ops/s
# Warmup Iteration  14: 2381.861 ops/s
# Warmup Iteration  15: 2506.291 ops/s
# Warmup Iteration  16: 2532.515 ops/s
# Warmup Iteration  17: 2441.447 ops/s
# Warmup Iteration  18: 2555.201 ops/s
# Warmup Iteration  19: 2723.734 ops/s
# Warmup Iteration  20: 2670.033 ops/s
Iteration   1: 2606.315 ops/s
Iteration   2: 2619.805 ops/s
Iteration   3: 2760.983 ops/s
Iteration   4: 2822.594 ops/s
Iteration   5: 2699.151 ops/s
Iteration   6: 2784.638 ops/s
Iteration   7: 2850.590 ops/s
Iteration   8: 2889.452 ops/s
Iteration   9: 2840.812 ops/s
Iteration  10: 2576.401 ops/s
Iteration  11: 2495.202 ops/s
Iteration  12: 2394.729 ops/s
Iteration  13: 2314.788 ops/s
Iteration  14: 2616.963 ops/s
Iteration  15: 2655.768 ops/s
Iteration  16: 2535.461 ops/s
Iteration  17: 2651.889 ops/s
Iteration  18: 2817.344 ops/s
Iteration  19: 2926.698 ops/s
Iteration  20: 3026.725 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  2792.105 ±(99.9%) 126.448 ops/s [Average]
  (min, avg, max) = (2314.788, 2792.105, 3339.009), stdev = 224.761
  CI (99.9%): [2665.657, 2918.553] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: 251.491 ops/s
# Warmup Iteration   2: 242.862 ops/s
# Warmup Iteration   3: 370.711 ops/s
# Warmup Iteration   4: 512.589 ops/s
# Warmup Iteration   5: 691.188 ops/s
# Warmup Iteration   6: 865.032 ops/s
# Warmup Iteration   7: 967.559 ops/s
# Warmup Iteration   8: 1226.948 ops/s
# Warmup Iteration   9: 1350.093 ops/s
# Warmup Iteration  10: 1521.818 ops/s
# Warmup Iteration  11: 1852.572 ops/s
# Warmup Iteration  12: 2488.928 ops/s
# Warmup Iteration  13: 2748.382 ops/s
# Warmup Iteration  14: 2881.627 ops/s
# Warmup Iteration  15: 2922.065 ops/s
# Warmup Iteration  16: 2963.749 ops/s
# Warmup Iteration  17: 2863.804 ops/s
# Warmup Iteration  18: 2970.396 ops/s
# Warmup Iteration  19: 2980.108 ops/s
# Warmup Iteration  20: 2988.934 ops/s
Iteration   1: 2891.124 ops/s
Iteration   2: 2885.114 ops/s
Iteration   3: 2942.728 ops/s
Iteration   4: 3038.966 ops/s
Iteration   5: 3382.998 ops/s
Iteration   6: 3538.554 ops/s
Iteration   7: 3545.281 ops/s
Iteration   8: 2922.614 ops/s
Iteration   9: 2676.054 ops/s
Iteration  10: 2500.308 ops/s
Iteration  11: 2594.713 ops/s
Iteration  12: 2719.415 ops/s
Iteration  13: 2805.391 ops/s
Iteration  14: 2821.230 ops/s
Iteration  15: 2878.139 ops/s
Iteration  16: 3000.069 ops/s
Iteration  17: 3002.068 ops/s
Iteration  18: 2991.240 ops/s
Iteration  19: 3068.379 ops/s
Iteration  20: 3011.136 ops/s

# Run progress: 30.00% complete, ETA 00:05:00
# Fork: 2 of 2
# Warmup Iteration   1: 134.779 ops/s
# Warmup Iteration   2: 177.200 ops/s
# Warmup Iteration   3: 232.370 ops/s
# Warmup Iteration   4: 333.055 ops/s
# Warmup Iteration   5: 510.997 ops/s
# Warmup Iteration   6: 698.972 ops/s
# Warmup Iteration   7: 867.302 ops/s
# Warmup Iteration   8: 1014.209 ops/s
# Warmup Iteration   9: 1236.638 ops/s
# Warmup Iteration  10: 1385.037 ops/s
# Warmup Iteration  11: 1623.084 ops/s
# Warmup Iteration  12: 1933.535 ops/s
# Warmup Iteration  13: 2565.935 ops/s
# Warmup Iteration  14: 2856.292 ops/s
# Warmup Iteration  15: 2849.774 ops/s
# Warmup Iteration  16: 2710.445 ops/s
# Warmup Iteration  17: 2902.701 ops/s
# Warmup Iteration  18: 2913.802 ops/s
# Warmup Iteration  19: 2917.902 ops/s
# Warmup Iteration  20: 3000.307 ops/s
Iteration   1: 3179.349 ops/s
Iteration   2: 2897.079 ops/s
Iteration   3: 3075.246 ops/s
Iteration   4: 3142.929 ops/s
Iteration   5: 2648.396 ops/s
Iteration   6: 2535.791 ops/s
Iteration   7: 2536.739 ops/s
Iteration   8: 2562.958 ops/s
Iteration   9: 2799.156 ops/s
Iteration  10: 2854.953 ops/s
Iteration  11: 2929.159 ops/s
Iteration  12: 2950.526 ops/s
Iteration  13: 3022.615 ops/s
Iteration  14: 2998.762 ops/s
Iteration  15: 3163.491 ops/s
Iteration  16: 3035.430 ops/s
Iteration  17: 3162.001 ops/s
Iteration  18: 3162.041 ops/s
Iteration  19: 3147.395 ops/s
Iteration  20: 3191.959 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  2955.287 ±(99.9%) 139.535 ops/s [Average]
  (min, avg, max) = (2500.308, 2955.287, 3545.281), stdev = 248.023
  CI (99.9%): [2815.752, 3094.822] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:18
# Fork: 1 of 2
# Warmup Iteration   1: 72.257 ops/s
# Warmup Iteration   2: 187.787 ops/s
# Warmup Iteration   3: 306.683 ops/s
# Warmup Iteration   4: 373.088 ops/s
# Warmup Iteration   5: 449.815 ops/s
# Warmup Iteration   6: 530.422 ops/s
# Warmup Iteration   7: 643.349 ops/s
# Warmup Iteration   8: 780.170 ops/s
# Warmup Iteration   9: 857.579 ops/s
# Warmup Iteration  10: 981.189 ops/s
# Warmup Iteration  11: 1132.683 ops/s
# Warmup Iteration  12: 1287.771 ops/s
# Warmup Iteration  13: 1642.678 ops/s
# Warmup Iteration  14: 1823.253 ops/s
# Warmup Iteration  15: 1835.391 ops/s
# Warmup Iteration  16: 1783.120 ops/s
# Warmup Iteration  17: 1777.513 ops/s
# Warmup Iteration  18: 1762.985 ops/s
# Warmup Iteration  19: 1767.775 ops/s
# Warmup Iteration  20: 1818.050 ops/s
Iteration   1: 1846.207 ops/s
Iteration   2: 1911.200 ops/s
Iteration   3: 1865.668 ops/s
Iteration   4: 1846.852 ops/s
Iteration   5: 1866.649 ops/s
Iteration   6: 1945.068 ops/s
Iteration   7: 1925.984 ops/s
Iteration   8: 2029.254 ops/s
Iteration   9: 1970.475 ops/s
Iteration  10: 2050.704 ops/s
Iteration  11: 2085.215 ops/s
Iteration  12: 1984.012 ops/s
Iteration  13: 1952.381 ops/s
Iteration  14: 1667.926 ops/s
Iteration  15: 1476.175 ops/s
Iteration  16: 1849.435 ops/s
Iteration  17: 1940.450 ops/s
Iteration  18: 1977.672 ops/s
Iteration  19: 2015.465 ops/s
Iteration  20: 1989.809 ops/s

# Run progress: 50.00% complete, ETA 00:03:35
# Fork: 2 of 2
# Warmup Iteration   1: 63.795 ops/s
# Warmup Iteration   2: 193.120 ops/s
# Warmup Iteration   3: 273.333 ops/s
# Warmup Iteration   4: 343.967 ops/s
# Warmup Iteration   5: 462.359 ops/s
# Warmup Iteration   6: 550.436 ops/s
# Warmup Iteration   7: 686.816 ops/s
# Warmup Iteration   8: 769.969 ops/s
# Warmup Iteration   9: 810.574 ops/s
# Warmup Iteration  10: 956.948 ops/s
# Warmup Iteration  11: 1101.655 ops/s
# Warmup Iteration  12: 1298.221 ops/s
# Warmup Iteration  13: 1620.797 ops/s
# Warmup Iteration  14: 1808.480 ops/s
# Warmup Iteration  15: 1889.880 ops/s
# Warmup Iteration  16: 1822.300 ops/s
# Warmup Iteration  17: 1944.136 ops/s
# Warmup Iteration  18: 1999.727 ops/s
# Warmup Iteration  19: 2031.759 ops/s
# Warmup Iteration  20: 1813.886 ops/s
Iteration   1: 1694.740 ops/s
Iteration   2: 1996.393 ops/s
Iteration   3: 2103.072 ops/s
Iteration   4: 2158.161 ops/s
Iteration   5: 2345.351 ops/s
Iteration   6: 2385.057 ops/s
Iteration   7: 2352.652 ops/s
Iteration   8: 2510.802 ops/s
Iteration   9: 2620.736 ops/s
Iteration  10: 2031.601 ops/s
Iteration  11: 1958.162 ops/s
Iteration  12: 1802.850 ops/s
Iteration  13: 1902.572 ops/s
Iteration  14: 2143.527 ops/s
Iteration  15: 2140.263 ops/s
Iteration  16: 2190.858 ops/s
Iteration  17: 2265.859 ops/s
Iteration  18: 2167.498 ops/s
Iteration  19: 2091.492 ops/s
Iteration  20: 2102.990 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  2029.031 ±(99.9%) 124.303 ops/s [Average]
  (min, avg, max) = (1476.175, 2029.031, 2620.736), stdev = 220.948
  CI (99.9%): [1904.728, 2153.334] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:52
# Fork: 1 of 2
# Warmup Iteration   1: 67.010 ops/s
# Warmup Iteration   2: 174.704 ops/s
# Warmup Iteration   3: 276.320 ops/s
# Warmup Iteration   4: 248.926 ops/s
# Warmup Iteration   5: 260.908 ops/s
# Warmup Iteration   6: 358.674 ops/s
# Warmup Iteration   7: 560.062 ops/s
# Warmup Iteration   8: 831.663 ops/s
# Warmup Iteration   9: 981.983 ops/s
# Warmup Iteration  10: 1115.941 ops/s
# Warmup Iteration  11: 1275.455 ops/s
# Warmup Iteration  12: 1546.280 ops/s
# Warmup Iteration  13: 2118.285 ops/s
# Warmup Iteration  14: 2228.635 ops/s
# Warmup Iteration  15: 2095.981 ops/s
# Warmup Iteration  16: 2025.514 ops/s
# Warmup Iteration  17: 2066.409 ops/s
# Warmup Iteration  18: 2059.842 ops/s
# Warmup Iteration  19: 2263.949 ops/s
# Warmup Iteration  20: 2323.044 ops/s
Iteration   1: 2315.306 ops/s
Iteration   2: 2372.821 ops/s
Iteration   3: 2451.169 ops/s
Iteration   4: 2443.041 ops/s
Iteration   5: 2591.791 ops/s
Iteration   6: 2635.479 ops/s
Iteration   7: 2507.780 ops/s
Iteration   8: 2568.076 ops/s
Iteration   9: 2319.052 ops/s
Iteration  10: 2206.349 ops/s
Iteration  11: 2168.047 ops/s
Iteration  12: 2038.723 ops/s
Iteration  13: 2644.578 ops/s
Iteration  14: 2273.844 ops/s
Iteration  15: 2113.829 ops/s
Iteration  16: 2241.506 ops/s
Iteration  17: 2491.382 ops/s
Iteration  18: 2745.525 ops/s
Iteration  19: 2910.517 ops/s
Iteration  20: 3088.449 ops/s

# Run progress: 70.00% complete, ETA 00:02:09
# Fork: 2 of 2
# Warmup Iteration   1: 81.431 ops/s
# Warmup Iteration   2: 161.699 ops/s
# Warmup Iteration   3: 289.607 ops/s
# Warmup Iteration   4: 388.418 ops/s
# Warmup Iteration   5: 484.931 ops/s
# Warmup Iteration   6: 583.942 ops/s
# Warmup Iteration   7: 705.020 ops/s
# Warmup Iteration   8: 836.121 ops/s
# Warmup Iteration   9: 951.576 ops/s
# Warmup Iteration  10: 1131.283 ops/s
# Warmup Iteration  11: 1324.893 ops/s
# Warmup Iteration  12: 1547.504 ops/s
# Warmup Iteration  13: 2226.794 ops/s
# Warmup Iteration  14: 965.875 ops/s
# Warmup Iteration  15: 2169.253 ops/s
# Warmup Iteration  16: 2271.277 ops/s
# Warmup Iteration  17: 2249.274 ops/s
# Warmup Iteration  18: 2311.945 ops/s
# Warmup Iteration  19: 2498.126 ops/s
# Warmup Iteration  20: 2375.087 ops/s
Iteration   1: 2444.321 ops/s
Iteration   2: 2482.593 ops/s
Iteration   3: 2554.264 ops/s
Iteration   4: 2472.026 ops/s
Iteration   5: 2306.818 ops/s
Iteration   6: 2281.248 ops/s
Iteration   7: 2404.454 ops/s
Iteration   8: 2434.556 ops/s
Iteration   9: 2468.710 ops/s
Iteration  10: 2616.196 ops/s
Iteration  11: 2689.048 ops/s
Iteration  12: 2765.543 ops/s
Iteration  13: 2610.334 ops/s
Iteration  14: 2711.426 ops/s
Iteration  15: 3072.968 ops/s
Iteration  16: 3094.431 ops/s
Iteration  17: 3182.954 ops/s
Iteration  18: 3076.521 ops/s
Iteration  19: 2941.313 ops/s
Iteration  20: 3058.505 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  2569.887 ±(99.9%) 167.753 ops/s [Average]
  (min, avg, max) = (2038.723, 2569.887, 3182.954), stdev = 298.181
  CI (99.9%): [2402.134, 2737.640] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:26
# Fork: 1 of 2
# Warmup Iteration   1: 14.146 ops/s
# Warmup Iteration   2: 27.553 ops/s
# Warmup Iteration   3: 42.543 ops/s
# Warmup Iteration   4: 56.664 ops/s
# Warmup Iteration   5: 66.442 ops/s
# Warmup Iteration   6: 86.754 ops/s
# Warmup Iteration   7: 106.862 ops/s
# Warmup Iteration   8: 124.021 ops/s
# Warmup Iteration   9: 160.412 ops/s
# Warmup Iteration  10: 177.658 ops/s
# Warmup Iteration  11: 227.573 ops/s
# Warmup Iteration  12: 241.472 ops/s
# Warmup Iteration  13: 255.342 ops/s
# Warmup Iteration  14: 279.899 ops/s
# Warmup Iteration  15: 284.623 ops/s
# Warmup Iteration  16: 277.613 ops/s
# Warmup Iteration  17: 291.816 ops/s
# Warmup Iteration  18: 288.883 ops/s
# Warmup Iteration  19: 316.511 ops/s
# Warmup Iteration  20: 313.775 ops/s
Iteration   1: 318.192 ops/s
Iteration   2: 321.236 ops/s
Iteration   3: 328.797 ops/s
Iteration   4: 322.498 ops/s
Iteration   5: 293.920 ops/s
Iteration   6: 224.140 ops/s
Iteration   7: 267.718 ops/s
Iteration   8: 284.626 ops/s
Iteration   9: 300.192 ops/s
Iteration  10: 240.156 ops/s
Iteration  11: 358.810 ops/s
Iteration  12: 379.619 ops/s
Iteration  13: 370.529 ops/s
Iteration  14: 322.367 ops/s
Iteration  15: 305.703 ops/s
Iteration  16: 283.629 ops/s
Iteration  17: 317.722 ops/s
Iteration  18: 327.170 ops/s
Iteration  19: 334.122 ops/s
Iteration  20: 341.514 ops/s

# Run progress: 90.00% complete, ETA 00:00:43
# Fork: 2 of 2
# Warmup Iteration   1: 16.297 ops/s
# Warmup Iteration   2: 35.024 ops/s
# Warmup Iteration   3: 53.472 ops/s
# Warmup Iteration   4: 78.229 ops/s
# Warmup Iteration   5: 91.610 ops/s
# Warmup Iteration   6: 107.437 ops/s
# Warmup Iteration   7: 118.140 ops/s
# Warmup Iteration   8: 140.898 ops/s
# Warmup Iteration   9: 171.474 ops/s
# Warmup Iteration  10: 204.816 ops/s
# Warmup Iteration  11: 256.570 ops/s
# Warmup Iteration  12: 282.323 ops/s
# Warmup Iteration  13: 264.483 ops/s
# Warmup Iteration  14: 263.261 ops/s
# Warmup Iteration  15: 282.622 ops/s
# Warmup Iteration  16: 294.507 ops/s
# Warmup Iteration  17: 282.506 ops/s
# Warmup Iteration  18: 245.536 ops/s
# Warmup Iteration  19: 292.204 ops/s
# Warmup Iteration  20: 305.538 ops/s
Iteration   1: 310.959 ops/s
Iteration   2: 293.970 ops/s
Iteration   3: 273.896 ops/s
Iteration   4: 270.189 ops/s
Iteration   5: 302.226 ops/s
Iteration   6: 293.525 ops/s
Iteration   7: 302.581 ops/s
Iteration   8: 309.587 ops/s
Iteration   9: 309.355 ops/s
Iteration  10: 314.560 ops/s
Iteration  11: 331.926 ops/s
Iteration  12: 336.997 ops/s
Iteration  13: 343.393 ops/s
Iteration  14: 364.163 ops/s
Iteration  15: 355.510 ops/s
Iteration  16: 364.065 ops/s
Iteration  17: 359.526 ops/s
Iteration  18: 367.662 ops/s
Iteration  19: 384.648 ops/s
Iteration  20: 310.723 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  318.553 ±(99.9%) 20.476 ops/s [Average]
  (min, avg, max) = (224.140, 318.553, 384.648), stdev = 36.395
  CI (99.9%): [298.077, 339.029] (assumes normal distribution)


# Run complete. Total time: 00:07:13

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  2792.105 ± 126.448  ops/s
HttpBenchmark.getPerson           thrpt   40  2955.287 ± 139.535  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  2029.031 ± 124.303  ops/s
HttpBenchmark.listPersons         thrpt   40  2569.887 ± 167.753  ops/s
HttpBenchmark.programComposition  thrpt   40   318.553 ±  20.476  ops/s
```

### frees-rpc - Protobuf Serialization

```bash
# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 137.149 ops/s
# Warmup Iteration   2: 247.693 ops/s
# Warmup Iteration   3: 490.881 ops/s
# Warmup Iteration   4: 1222.113 ops/s
# Warmup Iteration   5: 2846.215 ops/s
# Warmup Iteration   6: 2771.989 ops/s
# Warmup Iteration   7: 3416.012 ops/s
# Warmup Iteration   8: 3780.752 ops/s
# Warmup Iteration   9: 4245.024 ops/s
# Warmup Iteration  10: 4426.166 ops/s
# Warmup Iteration  11: 5012.230 ops/s
# Warmup Iteration  12: 5030.845 ops/s
# Warmup Iteration  13: 5557.395 ops/s
# Warmup Iteration  14: 5843.873 ops/s
# Warmup Iteration  15: 6315.063 ops/s
# Warmup Iteration  16: 6011.364 ops/s
# Warmup Iteration  17: 5646.011 ops/s
# Warmup Iteration  18: 6507.237 ops/s
# Warmup Iteration  19: 7318.500 ops/s
# Warmup Iteration  20: 7838.989 ops/s
Iteration   1: 7408.525 ops/s
Iteration   2: 7624.102 ops/s
Iteration   3: 8334.726 ops/s
Iteration   4: 8468.323 ops/s
Iteration   5: 8906.167 ops/s
Iteration   6: 9081.838 ops/s
Iteration   7: 9072.168 ops/s
Iteration   8: 8818.293 ops/s
Iteration   9: 8652.173 ops/s
Iteration  10: 9614.234 ops/s
Iteration  11: 8842.297 ops/s
Iteration  12: 8611.271 ops/s
Iteration  13: 8209.229 ops/s
Iteration  14: 8792.662 ops/s
Iteration  15: 9297.671 ops/s
Iteration  16: 8834.462 ops/s
Iteration  17: 9091.288 ops/s
Iteration  18: 8764.267 ops/s
Iteration  19: 8581.421 ops/s
Iteration  20: 8484.798 ops/s

# Run progress: 10.00% complete, ETA 00:06:31
# Fork: 2 of 2
# Warmup Iteration   1: 249.705 ops/s
# Warmup Iteration   2: 403.297 ops/s
# Warmup Iteration   3: 891.817 ops/s
# Warmup Iteration   4: 2295.194 ops/s
# Warmup Iteration   5: 2874.273 ops/s
# Warmup Iteration   6: 2799.433 ops/s
# Warmup Iteration   7: 3362.003 ops/s
# Warmup Iteration   8: 3757.010 ops/s
# Warmup Iteration   9: 4177.177 ops/s
# Warmup Iteration  10: 4811.151 ops/s
# Warmup Iteration  11: 5078.833 ops/s
# Warmup Iteration  12: 5207.816 ops/s
# Warmup Iteration  13: 5763.160 ops/s
# Warmup Iteration  14: 5887.529 ops/s
# Warmup Iteration  15: 5454.772 ops/s
# Warmup Iteration  16: 5322.067 ops/s
# Warmup Iteration  17: 6032.582 ops/s
# Warmup Iteration  18: 6630.641 ops/s
# Warmup Iteration  19: 7501.594 ops/s
# Warmup Iteration  20: 8702.989 ops/s
Iteration   1: 8951.914 ops/s
Iteration   2: 8995.106 ops/s
Iteration   3: 8486.128 ops/s
Iteration   4: 8512.297 ops/s
Iteration   5: 10688.951 ops/s
Iteration   6: 10494.618 ops/s
Iteration   7: 10530.233 ops/s
Iteration   8: 11156.641 ops/s
Iteration   9: 9700.002 ops/s
Iteration  10: 9551.158 ops/s
Iteration  11: 10172.031 ops/s
Iteration  12: 10612.625 ops/s
Iteration  13: 9178.864 ops/s
Iteration  14: 8657.735 ops/s
Iteration  15: 9136.596 ops/s
Iteration  16: 9138.676 ops/s
Iteration  17: 9521.540 ops/s
Iteration  18: 9718.718 ops/s
Iteration  19: 9486.931 ops/s
Iteration  20: 9675.359 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.createPerson":
  9146.401 ±(99.9%) 453.402 ops/s [Average]
  (min, avg, max) = (7408.525, 9146.401, 11156.641), stdev = 805.921
  CI (99.9%): [8692.999, 9599.803] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:47
# Fork: 1 of 2
# Warmup Iteration   1: 275.559 ops/s
# Warmup Iteration   2: 437.540 ops/s
# Warmup Iteration   3: 764.578 ops/s
# Warmup Iteration   4: 2252.357 ops/s
# Warmup Iteration   5: 3011.339 ops/s
# Warmup Iteration   6: 3434.602 ops/s
# Warmup Iteration   7: 4027.219 ops/s
# Warmup Iteration   8: 4693.033 ops/s
# Warmup Iteration   9: 5530.159 ops/s
# Warmup Iteration  10: 4337.247 ops/s
# Warmup Iteration  11: 4558.966 ops/s
# Warmup Iteration  12: 5277.220 ops/s
# Warmup Iteration  13: 5627.777 ops/s
# Warmup Iteration  14: 6557.169 ops/s
# Warmup Iteration  15: 7663.071 ops/s
# Warmup Iteration  16: 6624.138 ops/s
# Warmup Iteration  17: 8960.325 ops/s
# Warmup Iteration  18: 9941.208 ops/s
# Warmup Iteration  19: 9838.957 ops/s
# Warmup Iteration  20: 10715.502 ops/s
Iteration   1: 10529.291 ops/s
Iteration   2: 8413.077 ops/s
Iteration   3: 9962.123 ops/s
Iteration   4: 9486.033 ops/s
Iteration   5: 9793.142 ops/s
Iteration   6: 8824.218 ops/s
Iteration   7: 8848.808 ops/s
Iteration   8: 9130.460 ops/s
Iteration   9: 9856.122 ops/s
Iteration  10: 9016.203 ops/s
Iteration  11: 9942.593 ops/s
Iteration  12: 10832.271 ops/s
Iteration  13: 10900.946 ops/s
Iteration  14: 11242.710 ops/s
Iteration  15: 11023.312 ops/s
Iteration  16: 9162.550 ops/s
Iteration  17: 10023.688 ops/s
Iteration  18: 11105.371 ops/s
Iteration  19: 12057.133 ops/s
Iteration  20: 12324.809 ops/s

# Run progress: 30.00% complete, ETA 00:05:03
# Fork: 2 of 2
# Warmup Iteration   1: 169.584 ops/s
# Warmup Iteration   2: 343.699 ops/s
# Warmup Iteration   3: 586.449 ops/s
# Warmup Iteration   4: 592.164 ops/s
# Warmup Iteration   5: 2069.705 ops/s
# Warmup Iteration   6: 2708.926 ops/s
# Warmup Iteration   7: 2318.975 ops/s
# Warmup Iteration   8: 3363.286 ops/s
# Warmup Iteration   9: 3939.108 ops/s
# Warmup Iteration  10: 4117.406 ops/s
# Warmup Iteration  11: 4575.466 ops/s
# Warmup Iteration  12: 4115.240 ops/s
# Warmup Iteration  13: 4752.864 ops/s
# Warmup Iteration  14: 5502.870 ops/s
# Warmup Iteration  15: 5262.539 ops/s
# Warmup Iteration  16: 5931.832 ops/s
# Warmup Iteration  17: 5812.351 ops/s
# Warmup Iteration  18: 6906.226 ops/s
# Warmup Iteration  19: 8474.735 ops/s
# Warmup Iteration  20: 10896.291 ops/s
Iteration   1: 10857.181 ops/s
Iteration   2: 11554.784 ops/s
Iteration   3: 8030.693 ops/s
Iteration   4: 11256.630 ops/s
Iteration   5: 10596.375 ops/s
Iteration   6: 10286.916 ops/s
Iteration   7: 10021.288 ops/s
Iteration   8: 11298.529 ops/s
Iteration   9: 10666.066 ops/s
Iteration  10: 9476.191 ops/s
Iteration  11: 10323.753 ops/s
Iteration  12: 9091.178 ops/s
Iteration  13: 10599.923 ops/s
Iteration  14: 10197.736 ops/s
Iteration  15: 10226.516 ops/s
Iteration  16: 10502.632 ops/s
Iteration  17: 11632.606 ops/s
Iteration  18: 11297.538 ops/s
Iteration  19: 11224.772 ops/s
Iteration  20: 10007.630 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPerson":
  10290.595 ±(99.9%) 560.968 ops/s [Average]
  (min, avg, max) = (8030.693, 10290.595, 12324.809), stdev = 997.121
  CI (99.9%): [9729.627, 10851.563] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 137.222 ops/s
# Warmup Iteration   2: 238.683 ops/s
# Warmup Iteration   3: 374.515 ops/s
# Warmup Iteration   4: 491.113 ops/s
# Warmup Iteration   5: 654.232 ops/s
# Warmup Iteration   6: 1834.961 ops/s
# Warmup Iteration   7: 1944.060 ops/s
# Warmup Iteration   8: 2246.560 ops/s
# Warmup Iteration   9: 2547.710 ops/s
# Warmup Iteration  10: 2718.846 ops/s
# Warmup Iteration  11: 2601.803 ops/s
# Warmup Iteration  12: 2168.670 ops/s
# Warmup Iteration  13: 2406.924 ops/s
# Warmup Iteration  14: 2689.616 ops/s
# Warmup Iteration  15: 3045.393 ops/s
# Warmup Iteration  16: 3133.101 ops/s
# Warmup Iteration  17: 3176.634 ops/s
# Warmup Iteration  18: 3126.807 ops/s
# Warmup Iteration  19: 3405.182 ops/s
# Warmup Iteration  20: 3771.383 ops/s
Iteration   1: 3808.527 ops/s
Iteration   2: 4306.092 ops/s
Iteration   3: 4521.404 ops/s
Iteration   4: 4685.058 ops/s
Iteration   5: 4280.364 ops/s
Iteration   6: 5205.591 ops/s
Iteration   7: 5564.469 ops/s
Iteration   8: 5739.399 ops/s
Iteration   9: 5398.295 ops/s
Iteration  10: 5162.740 ops/s
Iteration  11: 5843.031 ops/s
Iteration  12: 5755.120 ops/s
Iteration  13: 5812.795 ops/s
Iteration  14: 5308.561 ops/s
Iteration  15: 4621.066 ops/s
Iteration  16: 4802.114 ops/s
Iteration  17: 5115.287 ops/s
Iteration  18: 5247.855 ops/s
Iteration  19: 5301.308 ops/s
Iteration  20: 5453.505 ops/s

# Run progress: 50.00% complete, ETA 00:03:36
# Fork: 2 of 2
# Warmup Iteration   1: 129.231 ops/s
# Warmup Iteration   2: 280.224 ops/s
# Warmup Iteration   3: 372.358 ops/s
# Warmup Iteration   4: 554.597 ops/s
# Warmup Iteration   5: 689.138 ops/s
# Warmup Iteration   6: 1749.291 ops/s
# Warmup Iteration   7: 1788.015 ops/s
# Warmup Iteration   8: 2138.951 ops/s
# Warmup Iteration   9: 2311.377 ops/s
# Warmup Iteration  10: 2719.172 ops/s
# Warmup Iteration  11: 2846.757 ops/s
# Warmup Iteration  12: 2495.515 ops/s
# Warmup Iteration  13: 2600.492 ops/s
# Warmup Iteration  14: 3343.622 ops/s
# Warmup Iteration  15: 3045.074 ops/s
# Warmup Iteration  16: 2468.530 ops/s
# Warmup Iteration  17: 2962.033 ops/s
# Warmup Iteration  18: 3227.193 ops/s
# Warmup Iteration  19: 3408.043 ops/s
# Warmup Iteration  20: 3371.075 ops/s
Iteration   1: 2962.595 ops/s
Iteration   2: 3081.114 ops/s
Iteration   3: 3189.487 ops/s
Iteration   4: 3922.622 ops/s
Iteration   5: 4266.943 ops/s
Iteration   6: 4504.398 ops/s
Iteration   7: 4410.243 ops/s
Iteration   8: 3359.312 ops/s
Iteration   9: 5057.795 ops/s
Iteration  10: 5211.442 ops/s
Iteration  11: 5796.612 ops/s
Iteration  12: 5085.028 ops/s
Iteration  13: 5530.375 ops/s
Iteration  14: 5387.618 ops/s
Iteration  15: 5343.911 ops/s
Iteration  16: 5181.922 ops/s
Iteration  17: 5215.646 ops/s
Iteration  18: 5143.201 ops/s
Iteration  19: 5545.421 ops/s
Iteration  20: 5375.725 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPersonLinks":
  4887.600 ±(99.9%) 439.472 ops/s [Average]
  (min, avg, max) = (2962.595, 4887.600, 5843.031), stdev = 781.160
  CI (99.9%): [4448.128, 5327.071] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:53
# Fork: 1 of 2
# Warmup Iteration   1: 199.894 ops/s
# Warmup Iteration   2: 393.300 ops/s
# Warmup Iteration   3: 560.579 ops/s
# Warmup Iteration   4: 769.732 ops/s
# Warmup Iteration   5: 2218.784 ops/s
# Warmup Iteration   6: 2164.561 ops/s
# Warmup Iteration   7: 1960.334 ops/s
# Warmup Iteration   8: 2610.767 ops/s
# Warmup Iteration   9: 3202.062 ops/s
# Warmup Iteration  10: 3278.290 ops/s
# Warmup Iteration  11: 3104.002 ops/s
# Warmup Iteration  12: 2763.354 ops/s
# Warmup Iteration  13: 3132.272 ops/s
# Warmup Iteration  14: 3132.601 ops/s
# Warmup Iteration  15: 3058.115 ops/s
# Warmup Iteration  16: 3734.113 ops/s
# Warmup Iteration  17: 3730.810 ops/s
# Warmup Iteration  18: 3988.899 ops/s
# Warmup Iteration  19: 4206.555 ops/s
# Warmup Iteration  20: 4382.867 ops/s
Iteration   1: 4523.083 ops/s
Iteration   2: 3855.277 ops/s
Iteration   3: 4390.641 ops/s
Iteration   4: 5243.265 ops/s
Iteration   5: 5995.932 ops/s
Iteration   6: 5914.840 ops/s
Iteration   7: 6062.553 ops/s
Iteration   8: 6395.311 ops/s
Iteration   9: 6619.878 ops/s
Iteration  10: 6695.207 ops/s
Iteration  11: 6076.679 ops/s
Iteration  12: 6732.519 ops/s
Iteration  13: 6524.224 ops/s
Iteration  14: 5416.759 ops/s
Iteration  15: 6078.102 ops/s
Iteration  16: 5789.355 ops/s
Iteration  17: 7035.742 ops/s
Iteration  18: 7087.792 ops/s
Iteration  19: 7258.467 ops/s
Iteration  20: 6965.161 ops/s

# Run progress: 70.00% complete, ETA 00:02:09
# Fork: 2 of 2
# Warmup Iteration   1: 247.851 ops/s
# Warmup Iteration   2: 464.112 ops/s
# Warmup Iteration   3: 628.825 ops/s
# Warmup Iteration   4: 964.175 ops/s
# Warmup Iteration   5: 2421.122 ops/s
# Warmup Iteration   6: 2948.882 ops/s
# Warmup Iteration   7: 2937.856 ops/s
# Warmup Iteration   8: 1892.100 ops/s
# Warmup Iteration   9: 2333.668 ops/s
# Warmup Iteration  10: 3061.619 ops/s
# Warmup Iteration  11: 3491.530 ops/s
# Warmup Iteration  12: 3731.913 ops/s
# Warmup Iteration  13: 3878.597 ops/s
# Warmup Iteration  14: 4230.800 ops/s
# Warmup Iteration  15: 4501.919 ops/s
# Warmup Iteration  16: 4769.750 ops/s
# Warmup Iteration  17: 5185.256 ops/s
# Warmup Iteration  18: 4936.759 ops/s
# Warmup Iteration  19: 4555.068 ops/s
# Warmup Iteration  20: 4778.493 ops/s
Iteration   1: 4836.154 ops/s
Iteration   2: 5180.763 ops/s
Iteration   3: 6233.418 ops/s
Iteration   4: 6549.294 ops/s
Iteration   5: 6420.865 ops/s
Iteration   6: 6564.364 ops/s
Iteration   7: 5966.274 ops/s
Iteration   8: 5818.625 ops/s
Iteration   9: 5902.682 ops/s
Iteration  10: 6661.244 ops/s
Iteration  11: 6551.995 ops/s
Iteration  12: 6477.514 ops/s
Iteration  13: 6605.348 ops/s
Iteration  14: 6552.599 ops/s
Iteration  15: 6741.532 ops/s
Iteration  16: 6804.625 ops/s
Iteration  17: 6648.688 ops/s
Iteration  18: 6634.333 ops/s
Iteration  19: 6647.164 ops/s
Iteration  20: 6701.642 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.listPersons":
  6178.998 ±(99.9%) 433.640 ops/s [Average]
  (min, avg, max) = (3855.277, 6178.998, 7258.467), stdev = 770.795
  CI (99.9%): [5745.358, 6612.638] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:26
# Fork: 1 of 2
# Warmup Iteration   1: 38.839 ops/s
# Warmup Iteration   2: 50.801 ops/s
# Warmup Iteration   3: 75.046 ops/s
# Warmup Iteration   4: 108.354 ops/s
# Warmup Iteration   5: 238.320 ops/s
# Warmup Iteration   6: 265.653 ops/s
# Warmup Iteration   7: 347.437 ops/s
# Warmup Iteration   8: 405.516 ops/s
# Warmup Iteration   9: 423.296 ops/s
# Warmup Iteration  10: 370.758 ops/s
# Warmup Iteration  11: 468.064 ops/s
# Warmup Iteration  12: 526.511 ops/s
# Warmup Iteration  13: 506.360 ops/s
# Warmup Iteration  14: 424.620 ops/s
# Warmup Iteration  15: 367.047 ops/s
# Warmup Iteration  16: 381.979 ops/s
# Warmup Iteration  17: 595.771 ops/s
# Warmup Iteration  18: 557.800 ops/s
# Warmup Iteration  19: 677.751 ops/s
# Warmup Iteration  20: 866.650 ops/s
Iteration   1: 881.278 ops/s
Iteration   2: 925.318 ops/s
Iteration   3: 894.234 ops/s
Iteration   4: 898.891 ops/s
Iteration   5: 887.833 ops/s
Iteration   6: 906.790 ops/s
Iteration   7: 863.839 ops/s
Iteration   8: 936.473 ops/s
Iteration   9: 994.066 ops/s
Iteration  10: 943.404 ops/s
Iteration  11: 1021.586 ops/s
Iteration  12: 986.579 ops/s
Iteration  13: 966.488 ops/s
Iteration  14: 954.537 ops/s
Iteration  15: 981.454 ops/s
Iteration  16: 980.247 ops/s
Iteration  17: 944.173 ops/s
Iteration  18: 955.288 ops/s
Iteration  19: 963.150 ops/s
Iteration  20: 917.120 ops/s

# Run progress: 90.00% complete, ETA 00:00:43
# Fork: 2 of 2
# Warmup Iteration   1: 22.357 ops/s
# Warmup Iteration   2: 43.109 ops/s
# Warmup Iteration   3: 68.670 ops/s
# Warmup Iteration   4: 98.563 ops/s
# Warmup Iteration   5: 264.967 ops/s
# Warmup Iteration   6: 265.720 ops/s
# Warmup Iteration   7: 367.987 ops/s
# Warmup Iteration   8: 409.177 ops/s
# Warmup Iteration   9: 425.191 ops/s
# Warmup Iteration  10: 355.745 ops/s
# Warmup Iteration  11: 427.176 ops/s
# Warmup Iteration  12: 377.195 ops/s
# Warmup Iteration  13: 474.484 ops/s
# Warmup Iteration  14: 489.686 ops/s
# Warmup Iteration  15: 604.915 ops/s
# Warmup Iteration  16: 668.604 ops/s
# Warmup Iteration  17: 705.316 ops/s
# Warmup Iteration  18: 718.158 ops/s
# Warmup Iteration  19: 740.333 ops/s
# Warmup Iteration  20: 852.088 ops/s
Iteration   1: 906.539 ops/s
Iteration   2: 883.951 ops/s
Iteration   3: 963.601 ops/s
Iteration   4: 818.307 ops/s
Iteration   5: 965.746 ops/s
Iteration   6: 821.320 ops/s
Iteration   7: 775.191 ops/s
Iteration   8: 982.394 ops/s
Iteration   9: 949.082 ops/s
Iteration  10: 999.665 ops/s
Iteration  11: 1031.961 ops/s
Iteration  12: 961.072 ops/s
Iteration  13: 996.160 ops/s
Iteration  14: 871.691 ops/s
Iteration  15: 986.563 ops/s
Iteration  16: 1006.226 ops/s
Iteration  17: 1033.213 ops/s
Iteration  18: 989.044 ops/s
Iteration  19: 1049.419 ops/s
Iteration  20: 1075.799 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.programComposition":
  946.742 ±(99.9%) 36.521 ops/s [Average]
  (min, avg, max) = (775.191, 946.742, 1075.799), stdev = 64.916
  CI (99.9%): [910.221, 983.263] (assumes normal distribution)


# Run complete. Total time: 00:07:14

Benchmark                              Mode  Cnt      Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40   9146.401 ± 453.402  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  10290.595 ± 560.968  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40   4887.600 ± 439.472  ops/s
RPCProtoBenchmark.listPersons         thrpt   40   6178.998 ± 433.640  ops/s
RPCProtoBenchmark.programComposition  thrpt   40    946.742 ±  36.521  ops/s
```
### frees-rpc - Avro Serialization

```bash
# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 210.060 ops/s
# Warmup Iteration   2: 452.167 ops/s
# Warmup Iteration   3: 908.171 ops/s
# Warmup Iteration   4: 1768.029 ops/s
# Warmup Iteration   5: 2406.206 ops/s
# Warmup Iteration   6: 2987.165 ops/s
# Warmup Iteration   7: 3082.020 ops/s
# Warmup Iteration   8: 2955.864 ops/s
# Warmup Iteration   9: 3248.670 ops/s
# Warmup Iteration  10: 2411.618 ops/s
# Warmup Iteration  11: 3044.718 ops/s
# Warmup Iteration  12: 3677.115 ops/s
# Warmup Iteration  13: 3764.149 ops/s
# Warmup Iteration  14: 3742.551 ops/s
# Warmup Iteration  15: 4312.899 ops/s
# Warmup Iteration  16: 4266.728 ops/s
# Warmup Iteration  17: 4106.879 ops/s
# Warmup Iteration  18: 5449.807 ops/s
# Warmup Iteration  19: 5879.840 ops/s
# Warmup Iteration  20: 6296.202 ops/s
Iteration   1: 6754.024 ops/s
Iteration   2: 7506.014 ops/s
Iteration   3: 7275.231 ops/s
Iteration   4: 6759.311 ops/s
Iteration   5: 8601.175 ops/s
Iteration   6: 10111.982 ops/s
Iteration   7: 10393.426 ops/s
Iteration   8: 10232.576 ops/s
Iteration   9: 11301.042 ops/s
Iteration  10: 10757.572 ops/s
Iteration  11: 11168.052 ops/s
Iteration  12: 10793.964 ops/s
Iteration  13: 11383.124 ops/s
Iteration  14: 10435.546 ops/s
Iteration  15: 9907.304 ops/s
Iteration  16: 10860.752 ops/s
Iteration  17: 11210.613 ops/s
Iteration  18: 10639.920 ops/s
Iteration  19: 10599.139 ops/s
Iteration  20: 10680.335 ops/s

# Run progress: 10.00% complete, ETA 00:06:30
# Fork: 2 of 2
# Warmup Iteration   1: 258.819 ops/s
# Warmup Iteration   2: 638.257 ops/s
# Warmup Iteration   3: 1100.665 ops/s
# Warmup Iteration   4: 2752.375 ops/s
# Warmup Iteration   5: 3411.816 ops/s
# Warmup Iteration   6: 3611.538 ops/s
# Warmup Iteration   7: 3993.862 ops/s
# Warmup Iteration   8: 4284.154 ops/s
# Warmup Iteration   9: 4657.031 ops/s
# Warmup Iteration  10: 4887.009 ops/s
# Warmup Iteration  11: 5195.305 ops/s
# Warmup Iteration  12: 5496.595 ops/s
# Warmup Iteration  13: 5740.041 ops/s
# Warmup Iteration  14: 6163.862 ops/s
# Warmup Iteration  15: 5810.655 ops/s
# Warmup Iteration  16: 5561.389 ops/s
# Warmup Iteration  17: 5809.775 ops/s
# Warmup Iteration  18: 6436.578 ops/s
# Warmup Iteration  19: 8145.341 ops/s
# Warmup Iteration  20: 9631.536 ops/s
Iteration   1: 8037.270 ops/s
Iteration   2: 8432.941 ops/s
Iteration   3: 8840.671 ops/s
Iteration   4: 9447.799 ops/s
Iteration   5: 10240.369 ops/s
Iteration   6: 9861.089 ops/s
Iteration   7: 9882.532 ops/s
Iteration   8: 9652.762 ops/s
Iteration   9: 9954.025 ops/s
Iteration  10: 9588.345 ops/s
Iteration  11: 10570.456 ops/s
Iteration  12: 9993.107 ops/s
Iteration  13: 8128.699 ops/s
Iteration  14: 10144.328 ops/s
Iteration  15: 10893.301 ops/s
Iteration  16: 10849.195 ops/s
Iteration  17: 10195.063 ops/s
Iteration  18: 10802.462 ops/s
Iteration  19: 10556.814 ops/s
Iteration  20: 10299.929 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.createPerson":
  9843.557 ±(99.9%) 700.599 ops/s [Average]
  (min, avg, max) = (6754.024, 9843.557, 11383.124), stdev = 1245.315
  CI (99.9%): [9142.957, 10544.156] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 271.387 ops/s
# Warmup Iteration   2: 485.560 ops/s
# Warmup Iteration   3: 890.100 ops/s
# Warmup Iteration   4: 2209.197 ops/s
# Warmup Iteration   5: 3391.827 ops/s
# Warmup Iteration   6: 3521.835 ops/s
# Warmup Iteration   7: 3830.874 ops/s
# Warmup Iteration   8: 3216.937 ops/s
# Warmup Iteration   9: 2232.149 ops/s
# Warmup Iteration  10: 3464.073 ops/s
# Warmup Iteration  11: 4033.616 ops/s
# Warmup Iteration  12: 4389.565 ops/s
# Warmup Iteration  13: 4626.959 ops/s
# Warmup Iteration  14: 5162.059 ops/s
# Warmup Iteration  15: 5536.468 ops/s
# Warmup Iteration  16: 6065.740 ops/s
# Warmup Iteration  17: 6609.631 ops/s
# Warmup Iteration  18: 7003.926 ops/s
# Warmup Iteration  19: 7198.069 ops/s
# Warmup Iteration  20: 7144.949 ops/s
Iteration   1: 7889.748 ops/s
Iteration   2: 11094.577 ops/s
Iteration   3: 10800.453 ops/s
Iteration   4: 11276.347 ops/s
Iteration   5: 11093.099 ops/s
Iteration   6: 11349.946 ops/s
Iteration   7: 10003.096 ops/s
Iteration   8: 11638.293 ops/s
Iteration   9: 11574.653 ops/s
Iteration  10: 11818.762 ops/s
Iteration  11: 11134.902 ops/s
Iteration  12: 11808.690 ops/s
Iteration  13: 11531.167 ops/s
Iteration  14: 11594.480 ops/s
Iteration  15: 11618.753 ops/s
Iteration  16: 11400.071 ops/s
Iteration  17: 11794.371 ops/s
Iteration  18: 11242.484 ops/s
Iteration  19: 10523.345 ops/s
Iteration  20: 11571.069 ops/s

# Run progress: 30.00% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 189.284 ops/s
# Warmup Iteration   2: 333.136 ops/s
# Warmup Iteration   3: 738.097 ops/s
# Warmup Iteration   4: 998.884 ops/s
# Warmup Iteration   5: 3063.734 ops/s
# Warmup Iteration   6: 3830.675 ops/s
# Warmup Iteration   7: 3263.439 ops/s
# Warmup Iteration   8: 3687.491 ops/s
# Warmup Iteration   9: 2699.640 ops/s
# Warmup Iteration  10: 3512.643 ops/s
# Warmup Iteration  11: 4112.333 ops/s
# Warmup Iteration  12: 4295.387 ops/s
# Warmup Iteration  13: 4225.258 ops/s
# Warmup Iteration  14: 4745.643 ops/s
# Warmup Iteration  15: 4980.213 ops/s
# Warmup Iteration  16: 5580.256 ops/s
# Warmup Iteration  17: 5854.096 ops/s
# Warmup Iteration  18: 6858.227 ops/s
# Warmup Iteration  19: 7098.513 ops/s
# Warmup Iteration  20: 7242.526 ops/s
Iteration   1: 7958.911 ops/s
Iteration   2: 9597.157 ops/s
Iteration   3: 11541.035 ops/s
Iteration   4: 11322.203 ops/s
Iteration   5: 12070.568 ops/s
Iteration   6: 12251.229 ops/s
Iteration   7: 12330.571 ops/s
Iteration   8: 12032.822 ops/s
Iteration   9: 11615.560 ops/s
Iteration  10: 11372.439 ops/s
Iteration  11: 12064.998 ops/s
Iteration  12: 12135.393 ops/s
Iteration  13: 12115.474 ops/s
Iteration  14: 12123.564 ops/s
Iteration  15: 11829.721 ops/s
Iteration  16: 11790.390 ops/s
Iteration  17: 12313.876 ops/s
Iteration  18: 12365.246 ops/s
Iteration  19: 12193.466 ops/s
Iteration  20: 12445.515 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPerson":
  11405.711 ±(99.9%) 568.813 ops/s [Average]
  (min, avg, max) = (7889.748, 11405.711, 12445.515), stdev = 1011.065
  CI (99.9%): [10836.898, 11974.525] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 157.856 ops/s
# Warmup Iteration   2: 290.492 ops/s
# Warmup Iteration   3: 425.093 ops/s
# Warmup Iteration   4: 654.423 ops/s
# Warmup Iteration   5: 1523.014 ops/s
# Warmup Iteration   6: 2502.378 ops/s
# Warmup Iteration   7: 2727.625 ops/s
# Warmup Iteration   8: 2315.315 ops/s
# Warmup Iteration   9: 2750.263 ops/s
# Warmup Iteration  10: 2756.012 ops/s
# Warmup Iteration  11: 2905.118 ops/s
# Warmup Iteration  12: 3145.366 ops/s
# Warmup Iteration  13: 3419.465 ops/s
# Warmup Iteration  14: 3509.359 ops/s
# Warmup Iteration  15: 3692.762 ops/s
# Warmup Iteration  16: 3799.727 ops/s
# Warmup Iteration  17: 3834.847 ops/s
# Warmup Iteration  18: 3841.695 ops/s
# Warmup Iteration  19: 3855.806 ops/s
# Warmup Iteration  20: 3787.069 ops/s
Iteration   1: 3487.435 ops/s
Iteration   2: 3764.781 ops/s
Iteration   3: 4133.469 ops/s
Iteration   4: 2579.435 ops/s
Iteration   5: 3361.998 ops/s
Iteration   6: 3805.513 ops/s
Iteration   7: 3993.086 ops/s
Iteration   8: 4178.178 ops/s
Iteration   9: 4353.557 ops/s
Iteration  10: 4611.536 ops/s
Iteration  11: 4636.833 ops/s
Iteration  12: 4648.652 ops/s
Iteration  13: 4773.217 ops/s
Iteration  14: 4845.802 ops/s
Iteration  15: 4922.504 ops/s
Iteration  16: 4922.582 ops/s
Iteration  17: 5042.488 ops/s
Iteration  18: 5093.822 ops/s
Iteration  19: 5067.515 ops/s
Iteration  20: 5092.659 ops/s

# Run progress: 50.00% complete, ETA 00:03:35
# Fork: 2 of 2
# Warmup Iteration   1: 215.614 ops/s
# Warmup Iteration   2: 544.410 ops/s
# Warmup Iteration   3: 1051.789 ops/s
# Warmup Iteration   4: 2267.870 ops/s
# Warmup Iteration   5: 2481.256 ops/s
# Warmup Iteration   6: 2308.468 ops/s
# Warmup Iteration   7: 2783.964 ops/s
# Warmup Iteration   8: 2966.500 ops/s
# Warmup Iteration   9: 3060.636 ops/s
# Warmup Iteration  10: 3270.772 ops/s
# Warmup Iteration  11: 3490.329 ops/s
# Warmup Iteration  12: 3462.165 ops/s
# Warmup Iteration  13: 3722.580 ops/s
# Warmup Iteration  14: 3777.823 ops/s
# Warmup Iteration  15: 3915.620 ops/s
# Warmup Iteration  16: 4168.281 ops/s
# Warmup Iteration  17: 3612.183 ops/s
# Warmup Iteration  18: 3923.303 ops/s
# Warmup Iteration  19: 4019.437 ops/s
# Warmup Iteration  20: 4167.023 ops/s
Iteration   1: 4438.769 ops/s
Iteration   2: 4601.128 ops/s
Iteration   3: 4752.415 ops/s
Iteration   4: 5051.947 ops/s
Iteration   5: 5913.370 ops/s
Iteration   6: 6172.282 ops/s
Iteration   7: 6286.921 ops/s
Iteration   8: 6165.168 ops/s
Iteration   9: 6207.914 ops/s
Iteration  10: 6080.682 ops/s
Iteration  11: 6263.517 ops/s
Iteration  12: 6343.901 ops/s
Iteration  13: 6339.727 ops/s
Iteration  14: 6285.029 ops/s
Iteration  15: 6357.039 ops/s
Iteration  16: 6296.548 ops/s
Iteration  17: 6336.708 ops/s
Iteration  18: 6285.080 ops/s
Iteration  19: 6251.415 ops/s
Iteration  20: 6130.169 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPersonLinks":
  5146.870 ±(99.9%) 579.186 ops/s [Average]
  (min, avg, max) = (2579.435, 5146.870, 6357.039), stdev = 1029.502
  CI (99.9%): [4567.684, 5726.056] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:52
# Fork: 1 of 2
# Warmup Iteration   1: 199.843 ops/s
# Warmup Iteration   2: 593.136 ops/s
# Warmup Iteration   3: 952.681 ops/s
# Warmup Iteration   4: 1772.556 ops/s
# Warmup Iteration   5: 2666.243 ops/s
# Warmup Iteration   6: 2797.448 ops/s
# Warmup Iteration   7: 3134.727 ops/s
# Warmup Iteration   8: 3309.551 ops/s
# Warmup Iteration   9: 3402.684 ops/s
# Warmup Iteration  10: 3013.446 ops/s
# Warmup Iteration  11: 3529.357 ops/s
# Warmup Iteration  12: 3557.720 ops/s
# Warmup Iteration  13: 3587.697 ops/s
# Warmup Iteration  14: 3766.842 ops/s
# Warmup Iteration  15: 3843.055 ops/s
# Warmup Iteration  16: 3870.005 ops/s
# Warmup Iteration  17: 4084.008 ops/s
# Warmup Iteration  18: 4283.137 ops/s
# Warmup Iteration  19: 4391.625 ops/s
# Warmup Iteration  20: 4526.208 ops/s
Iteration   1: 4979.261 ops/s
Iteration   2: 5156.982 ops/s
Iteration   3: 5322.888 ops/s
Iteration   4: 5039.118 ops/s
Iteration   5: 5519.930 ops/s
Iteration   6: 6757.920 ops/s
Iteration   7: 7522.438 ops/s
Iteration   8: 6870.604 ops/s
Iteration   9: 6385.595 ops/s
Iteration  10: 7725.968 ops/s
Iteration  11: 7822.698 ops/s
Iteration  12: 7735.601 ops/s
Iteration  13: 7969.453 ops/s
Iteration  14: 7889.059 ops/s
Iteration  15: 7910.449 ops/s
Iteration  16: 7863.719 ops/s
Iteration  17: 7787.844 ops/s
Iteration  18: 7902.297 ops/s
Iteration  19: 7849.936 ops/s
Iteration  20: 7607.197 ops/s

# Run progress: 70.00% complete, ETA 00:02:09
# Fork: 2 of 2
# Warmup Iteration   1: 243.756 ops/s
# Warmup Iteration   2: 611.504 ops/s
# Warmup Iteration   3: 829.833 ops/s
# Warmup Iteration   4: 1811.880 ops/s
# Warmup Iteration   5: 2741.642 ops/s
# Warmup Iteration   6: 3017.693 ops/s
# Warmup Iteration   7: 3125.883 ops/s
# Warmup Iteration   8: 3402.057 ops/s
# Warmup Iteration   9: 3305.496 ops/s
# Warmup Iteration  10: 3440.504 ops/s
# Warmup Iteration  11: 3830.497 ops/s
# Warmup Iteration  12: 3910.157 ops/s
# Warmup Iteration  13: 4092.555 ops/s
# Warmup Iteration  14: 4086.947 ops/s
# Warmup Iteration  15: 3771.211 ops/s
# Warmup Iteration  16: 3122.789 ops/s
# Warmup Iteration  17: 4059.295 ops/s
# Warmup Iteration  18: 4347.018 ops/s
# Warmup Iteration  19: 4829.839 ops/s
# Warmup Iteration  20: 4962.275 ops/s
Iteration   1: 5236.720 ops/s
Iteration   2: 5568.403 ops/s
Iteration   3: 6809.876 ops/s
Iteration   4: 6359.925 ops/s
Iteration   5: 5407.850 ops/s
Iteration   6: 6676.129 ops/s
Iteration   7: 7424.649 ops/s
Iteration   8: 7133.743 ops/s
Iteration   9: 5397.550 ops/s
Iteration  10: 7875.855 ops/s
Iteration  11: 7968.375 ops/s
Iteration  12: 7764.115 ops/s
Iteration  13: 6921.197 ops/s
Iteration  14: 7174.040 ops/s
Iteration  15: 7872.060 ops/s
Iteration  16: 7009.434 ops/s
Iteration  17: 5879.374 ops/s
Iteration  18: 6018.385 ops/s
Iteration  19: 6308.638 ops/s
Iteration  20: 8030.583 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.listPersons":
  6861.396 ±(99.9%) 581.859 ops/s [Average]
  (min, avg, max) = (4979.261, 6861.396, 8030.583), stdev = 1034.253
  CI (99.9%): [6279.538, 7443.255] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:26
# Fork: 1 of 2
# Warmup Iteration   1: 27.768 ops/s
# Warmup Iteration   2: 62.620 ops/s
# Warmup Iteration   3: 91.440 ops/s
# Warmup Iteration   4: 253.610 ops/s
# Warmup Iteration   5: 351.167 ops/s
# Warmup Iteration   6: 364.037 ops/s
# Warmup Iteration   7: 424.769 ops/s
# Warmup Iteration   8: 361.019 ops/s
# Warmup Iteration   9: 442.815 ops/s
# Warmup Iteration  10: 496.865 ops/s
# Warmup Iteration  11: 510.013 ops/s
# Warmup Iteration  12: 509.065 ops/s
# Warmup Iteration  13: 524.546 ops/s
# Warmup Iteration  14: 484.638 ops/s
# Warmup Iteration  15: 432.600 ops/s
# Warmup Iteration  16: 490.394 ops/s
# Warmup Iteration  17: 516.405 ops/s
# Warmup Iteration  18: 531.377 ops/s
# Warmup Iteration  19: 568.476 ops/s
# Warmup Iteration  20: 573.292 ops/s
Iteration   1: 649.253 ops/s
Iteration   2: 691.633 ops/s
Iteration   3: 741.244 ops/s
Iteration   4: 774.162 ops/s
Iteration   5: 838.938 ops/s
Iteration   6: 791.580 ops/s
Iteration   7: 824.637 ops/s
Iteration   8: 827.066 ops/s
Iteration   9: 872.929 ops/s
Iteration  10: 857.116 ops/s
Iteration  11: 854.176 ops/s
Iteration  12: 855.819 ops/s
Iteration  13: 918.811 ops/s
Iteration  14: 1081.411 ops/s
Iteration  15: 1117.587 ops/s
Iteration  16: 1106.099 ops/s
Iteration  17: 1103.637 ops/s
Iteration  18: 932.662 ops/s
Iteration  19: 877.112 ops/s
Iteration  20: 970.219 ops/s

# Run progress: 90.00% complete, ETA 00:00:43
# Fork: 2 of 2
# Warmup Iteration   1: 30.362 ops/s
# Warmup Iteration   2: 69.855 ops/s
# Warmup Iteration   3: 163.811 ops/s
# Warmup Iteration   4: 379.591 ops/s
# Warmup Iteration   5: 434.340 ops/s
# Warmup Iteration   6: 423.950 ops/s
# Warmup Iteration   7: 423.097 ops/s
# Warmup Iteration   8: 478.086 ops/s
# Warmup Iteration   9: 535.295 ops/s
# Warmup Iteration  10: 551.850 ops/s
# Warmup Iteration  11: 551.027 ops/s
# Warmup Iteration  12: 538.863 ops/s
# Warmup Iteration  13: 507.076 ops/s
# Warmup Iteration  14: 530.909 ops/s
# Warmup Iteration  15: 550.011 ops/s
# Warmup Iteration  16: 565.416 ops/s
# Warmup Iteration  17: 625.446 ops/s
# Warmup Iteration  18: 593.541 ops/s
# Warmup Iteration  19: 699.786 ops/s
# Warmup Iteration  20: 789.710 ops/s
Iteration   1: 838.554 ops/s
Iteration   2: 844.550 ops/s
Iteration   3: 868.479 ops/s
Iteration   4: 841.583 ops/s
Iteration   5: 864.677 ops/s
Iteration   6: 885.448 ops/s
Iteration   7: 893.788 ops/s
Iteration   8: 1086.197 ops/s
Iteration   9: 1209.372 ops/s
Iteration  10: 1085.580 ops/s
Iteration  11: 1117.177 ops/s
Iteration  12: 1200.075 ops/s
Iteration  13: 1032.934 ops/s
Iteration  14: 1200.274 ops/s
Iteration  15: 944.356 ops/s
Iteration  16: 956.234 ops/s
Iteration  17: 1096.293 ops/s
Iteration  18: 1031.910 ops/s
Iteration  19: 1157.115 ops/s
Iteration  20: 1151.722 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.programComposition":
  949.810 ±(99.9%) 83.805 ops/s [Average]
  (min, avg, max) = (649.253, 949.810, 1209.372), stdev = 148.964
  CI (99.9%): [866.005, 1033.616] (assumes normal distribution)


# Run complete. Total time: 00:07:11

Benchmark                             Mode  Cnt      Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40   9843.557 ± 700.599  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  11405.711 ± 568.813  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40   5146.870 ± 579.186  ops/s
RPCAvroBenchmark.listPersons         thrpt   40   6861.396 ± 581.859  ops/s
RPCAvroBenchmark.programComposition  thrpt   40    949.810 ±  83.805  ops/s
```

## Summary

### HTTP

```bash
# Run complete. Total time: 00:07:13

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  2792.105 ± 126.448  ops/s
HttpBenchmark.getPerson           thrpt   40  2955.287 ± 139.535  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  2029.031 ± 124.303  ops/s
HttpBenchmark.listPersons         thrpt   40  2569.887 ± 167.753  ops/s
HttpBenchmark.programComposition  thrpt   40   318.553 ±  20.476  ops/s
```

### frees-rpc - Protobuf Serialization

```bash
# Run complete. Total time: 00:07:14

Benchmark                              Mode  Cnt      Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40   9146.401 ± 453.402  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  10290.595 ± 560.968  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40   4887.600 ± 439.472  ops/s
RPCProtoBenchmark.listPersons         thrpt   40   6178.998 ± 433.640  ops/s
RPCProtoBenchmark.programComposition  thrpt   40    946.742 ±  36.521  ops/s
```

### frees-rpc - Avro Serialization

```bash
# Run complete. Total time: 00:07:11

Benchmark                             Mode  Cnt      Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40   9843.557 ± 700.599  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  11405.711 ± 568.813  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40   5146.870 ± 579.186  ops/s
RPCAvroBenchmark.listPersons         thrpt   40   6861.396 ± 581.859  ops/s
RPCAvroBenchmark.programComposition  thrpt   40    949.810 ±  83.805  ops/s
```