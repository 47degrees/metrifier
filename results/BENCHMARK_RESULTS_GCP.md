# Benchmark Results

In this document we are posting all the Benchmarks results when testing atop GCP. For both `HTTP` and `RPC` benchmarks we are implementing two Google Compute Engine instances, one for the server (`n1-standard-2`), another one for the benchmarks (`n1-standard-1`). See [Google Docs - Machine Types](https://cloud.google.com/compute/docs/machine-types) for deeper information.

See [README](../README.md#running-benchmarks-on-google-cloud-platform) for reference.

## Server GCE instance Details

* n1-standard-2.
* 2 virtual CPUs.
* 7.5 GB of memory.

## Benchmarks GCE instance Details

* n1-standard-1.
* 1 virtual CPU.
* 3.75 GB of memory.

## jmh - http

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

## jmh - frees-rpc

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
# Benchmark: metrifier.benchmark.RPCBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 316.267 ops/s
# Warmup Iteration   2: 707.845 ops/s
# Warmup Iteration   3: 1066.569 ops/s
# Warmup Iteration   4: 2708.793 ops/s
# Warmup Iteration   5: 3586.490 ops/s
# Warmup Iteration   6: 3280.578 ops/s
# Warmup Iteration   7: 4055.175 ops/s
# Warmup Iteration   8: 4364.817 ops/s
# Warmup Iteration   9: 4847.896 ops/s
# Warmup Iteration  10: 5016.011 ops/s
# Warmup Iteration  11: 5642.445 ops/s
# Warmup Iteration  12: 5235.212 ops/s
# Warmup Iteration  13: 6075.992 ops/s
# Warmup Iteration  14: 7344.079 ops/s
# Warmup Iteration  15: 7310.041 ops/s
# Warmup Iteration  16: 7632.229 ops/s
# Warmup Iteration  17: 8844.580 ops/s
# Warmup Iteration  18: 9243.115 ops/s
# Warmup Iteration  19: 10927.067 ops/s
# Warmup Iteration  20: 7229.944 ops/s
Iteration   1: 10176.456 ops/s
Iteration   2: 10580.462 ops/s
Iteration   3: 10167.197 ops/s
Iteration   4: 8215.955 ops/s
Iteration   5: 9789.917 ops/s
Iteration   6: 10648.954 ops/s
Iteration   7: 10194.194 ops/s
Iteration   8: 9929.418 ops/s
Iteration   9: 10639.510 ops/s
Iteration  10: 11104.409 ops/s
Iteration  11: 10017.442 ops/s
Iteration  12: 10425.024 ops/s
Iteration  13: 9376.907 ops/s
Iteration  14: 9216.349 ops/s
Iteration  15: 9743.006 ops/s
Iteration  16: 10184.890 ops/s
Iteration  17: 9907.627 ops/s
Iteration  18: 10637.528 ops/s
Iteration  19: 9562.105 ops/s
Iteration  20: 10203.845 ops/s

# Run progress: 10.00% complete, ETA 00:06:25
# Fork: 2 of 2
# Warmup Iteration   1: 291.380 ops/s
# Warmup Iteration   2: 701.978 ops/s
# Warmup Iteration   3: 1079.226 ops/s
# Warmup Iteration   4: 2937.238 ops/s
# Warmup Iteration   5: 3765.212 ops/s
# Warmup Iteration   6: 4562.024 ops/s
# Warmup Iteration   7: 5251.147 ops/s
# Warmup Iteration   8: 5184.398 ops/s
# Warmup Iteration   9: 4139.979 ops/s
# Warmup Iteration  10: 5997.121 ops/s
# Warmup Iteration  11: 6708.965 ops/s
# Warmup Iteration  12: 6931.148 ops/s
# Warmup Iteration  13: 6182.989 ops/s
# Warmup Iteration  14: 8325.981 ops/s
# Warmup Iteration  15: 11449.653 ops/s
# Warmup Iteration  16: 12066.850 ops/s
# Warmup Iteration  17: 11671.011 ops/s
# Warmup Iteration  18: 12213.315 ops/s
# Warmup Iteration  19: 12264.959 ops/s
# Warmup Iteration  20: 11563.442 ops/s
Iteration   1: 11987.634 ops/s
Iteration   2: 12620.547 ops/s
Iteration   3: 12047.990 ops/s
Iteration   4: 12272.154 ops/s
Iteration   5: 12304.629 ops/s
Iteration   6: 8848.174 ops/s
Iteration   7: 10613.202 ops/s
Iteration   8: 11503.797 ops/s
Iteration   9: 11330.698 ops/s
Iteration  10: 8577.173 ops/s
Iteration  11: 11172.583 ops/s
Iteration  12: 11871.256 ops/s
Iteration  13: 12756.838 ops/s
Iteration  14: 11183.636 ops/s
Iteration  15: 11608.603 ops/s
Iteration  16: 11098.820 ops/s
Iteration  17: 12197.607 ops/s
Iteration  18: 8704.813 ops/s
Iteration  19: 11284.609 ops/s
Iteration  20: 10800.940 ops/s


Result "metrifier.benchmark.RPCBenchmark.createPerson":
  10637.672 ±(99.9%) 643.970 ops/s [Average]
  (min, avg, max) = (8215.955, 10637.672, 12756.838), stdev = 1144.656
  CI (99.9%): [9993.703, 11281.642] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:42
# Fork: 1 of 2
# Warmup Iteration   1: 364.693 ops/s
# Warmup Iteration   2: 869.480 ops/s
# Warmup Iteration   3: 1520.539 ops/s
# Warmup Iteration   4: 3760.924 ops/s
# Warmup Iteration   5: 4364.898 ops/s
# Warmup Iteration   6: 4530.152 ops/s
# Warmup Iteration   7: 4813.475 ops/s
# Warmup Iteration   8: 5492.720 ops/s
# Warmup Iteration   9: 5611.181 ops/s
# Warmup Iteration  10: 6421.114 ops/s
# Warmup Iteration  11: 7443.260 ops/s
# Warmup Iteration  12: 9369.463 ops/s
# Warmup Iteration  13: 10726.548 ops/s
# Warmup Iteration  14: 11060.475 ops/s
# Warmup Iteration  15: 12412.419 ops/s
# Warmup Iteration  16: 12705.857 ops/s
# Warmup Iteration  17: 12691.669 ops/s
# Warmup Iteration  18: 12921.484 ops/s
# Warmup Iteration  19: 13424.700 ops/s
# Warmup Iteration  20: 14105.943 ops/s
Iteration   1: 13319.632 ops/s
Iteration   2: 13602.496 ops/s
Iteration   3: 13189.547 ops/s
Iteration   4: 13159.999 ops/s
Iteration   5: 12009.480 ops/s
Iteration   6: 14728.310 ops/s
Iteration   7: 13589.989 ops/s
Iteration   8: 12923.319 ops/s
Iteration   9: 12902.201 ops/s
Iteration  10: 13602.309 ops/s
Iteration  11: 14687.507 ops/s
Iteration  12: 13972.061 ops/s
Iteration  13: 14090.610 ops/s
Iteration  14: 13408.315 ops/s
Iteration  15: 12528.103 ops/s
Iteration  16: 13793.138 ops/s
Iteration  17: 10788.639 ops/s
Iteration  18: 10797.279 ops/s
Iteration  19: 13810.363 ops/s
Iteration  20: 12610.460 ops/s

# Run progress: 30.00% complete, ETA 00:04:59
# Fork: 2 of 2
# Warmup Iteration   1: 382.627 ops/s
# Warmup Iteration   2: 828.114 ops/s
# Warmup Iteration   3: 1323.947 ops/s
# Warmup Iteration   4: 2963.150 ops/s
# Warmup Iteration   5: 4000.558 ops/s
# Warmup Iteration   6: 4409.404 ops/s
# Warmup Iteration   7: 4916.893 ops/s
# Warmup Iteration   8: 5813.581 ops/s
# Warmup Iteration   9: 6307.596 ops/s
# Warmup Iteration  10: 6508.735 ops/s
# Warmup Iteration  11: 7145.920 ops/s
# Warmup Iteration  12: 8626.569 ops/s
# Warmup Iteration  13: 9889.634 ops/s
# Warmup Iteration  14: 10251.562 ops/s
# Warmup Iteration  15: 11539.188 ops/s
# Warmup Iteration  16: 12846.134 ops/s
# Warmup Iteration  17: 12963.164 ops/s
# Warmup Iteration  18: 12772.475 ops/s
# Warmup Iteration  19: 13897.269 ops/s
# Warmup Iteration  20: 12205.197 ops/s
Iteration   1: 13471.839 ops/s
Iteration   2: 13164.617 ops/s
Iteration   3: 13926.040 ops/s
Iteration   4: 13784.740 ops/s
Iteration   5: 13713.468 ops/s
Iteration   6: 13141.173 ops/s
Iteration   7: 13516.471 ops/s
Iteration   8: 13381.265 ops/s
Iteration   9: 13292.449 ops/s
Iteration  10: 14553.288 ops/s
Iteration  11: 14810.263 ops/s
Iteration  12: 14739.413 ops/s
Iteration  13: 14079.264 ops/s
Iteration  14: 14031.597 ops/s
Iteration  15: 15151.985 ops/s
Iteration  16: 14997.509 ops/s
Iteration  17: 13627.607 ops/s
Iteration  18: 14279.853 ops/s
Iteration  19: 14117.225 ops/s
Iteration  20: 13903.345 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPerson":
  13579.929 ±(99.9%) 530.903 ops/s [Average]
  (min, avg, max) = (10788.639, 13579.929, 15151.985), stdev = 943.680
  CI (99.9%): [13049.026, 14110.832] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:16
# Fork: 1 of 2
# Warmup Iteration   1: 299.172 ops/s
# Warmup Iteration   2: 749.110 ops/s
# Warmup Iteration   3: 831.894 ops/s
# Warmup Iteration   4: 1607.190 ops/s
# Warmup Iteration   5: 2662.090 ops/s
# Warmup Iteration   6: 2817.520 ops/s
# Warmup Iteration   7: 3203.611 ops/s
# Warmup Iteration   8: 3414.660 ops/s
# Warmup Iteration   9: 3678.767 ops/s
# Warmup Iteration  10: 3499.467 ops/s
# Warmup Iteration  11: 3722.000 ops/s
# Warmup Iteration  12: 3854.748 ops/s
# Warmup Iteration  13: 4024.336 ops/s
# Warmup Iteration  14: 4369.229 ops/s
# Warmup Iteration  15: 4429.275 ops/s
# Warmup Iteration  16: 4405.839 ops/s
# Warmup Iteration  17: 4843.653 ops/s
# Warmup Iteration  18: 4438.496 ops/s
# Warmup Iteration  19: 4017.054 ops/s
# Warmup Iteration  20: 3917.394 ops/s
Iteration   1: 4271.215 ops/s
Iteration   2: 4835.040 ops/s
Iteration   3: 5501.124 ops/s
Iteration   4: 5829.104 ops/s
Iteration   5: 5670.235 ops/s
Iteration   6: 5310.635 ops/s
Iteration   7: 5064.047 ops/s
Iteration   8: 5530.431 ops/s
Iteration   9: 5182.496 ops/s
Iteration  10: 5365.478 ops/s
Iteration  11: 5369.666 ops/s
Iteration  12: 5589.760 ops/s
Iteration  13: 5987.990 ops/s
Iteration  14: 5672.871 ops/s
Iteration  15: 5624.459 ops/s
Iteration  16: 5739.820 ops/s
Iteration  17: 6156.031 ops/s
Iteration  18: 6121.846 ops/s
Iteration  19: 5939.040 ops/s
Iteration  20: 5800.578 ops/s

# Run progress: 50.00% complete, ETA 00:03:33
# Fork: 2 of 2
# Warmup Iteration   1: 309.971 ops/s
# Warmup Iteration   2: 662.297 ops/s
# Warmup Iteration   3: 880.574 ops/s
# Warmup Iteration   4: 1894.943 ops/s
# Warmup Iteration   5: 2651.741 ops/s
# Warmup Iteration   6: 2774.041 ops/s
# Warmup Iteration   7: 3180.594 ops/s
# Warmup Iteration   8: 2891.455 ops/s
# Warmup Iteration   9: 2858.367 ops/s
# Warmup Iteration  10: 3254.989 ops/s
# Warmup Iteration  11: 3441.565 ops/s
# Warmup Iteration  12: 3521.124 ops/s
# Warmup Iteration  13: 2828.499 ops/s
# Warmup Iteration  14: 3810.936 ops/s
# Warmup Iteration  15: 3934.375 ops/s
# Warmup Iteration  16: 4209.278 ops/s
# Warmup Iteration  17: 4292.916 ops/s
# Warmup Iteration  18: 4398.596 ops/s
# Warmup Iteration  19: 4479.551 ops/s
# Warmup Iteration  20: 4580.994 ops/s
Iteration   1: 4163.968 ops/s
Iteration   2: 4816.583 ops/s
Iteration   3: 4869.443 ops/s
Iteration   4: 5698.505 ops/s
Iteration   5: 5521.810 ops/s
Iteration   6: 5831.237 ops/s
Iteration   7: 4634.150 ops/s
Iteration   8: 5587.762 ops/s
Iteration   9: 5817.931 ops/s
Iteration  10: 5671.812 ops/s
Iteration  11: 5962.717 ops/s
Iteration  12: 5490.390 ops/s
Iteration  13: 5581.050 ops/s
Iteration  14: 6061.845 ops/s
Iteration  15: 5360.896 ops/s
Iteration  16: 5329.537 ops/s
Iteration  17: 5209.616 ops/s
Iteration  18: 4267.732 ops/s
Iteration  19: 4705.953 ops/s
Iteration  20: 4600.172 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPersonLinks":
  5393.624 ±(99.9%) 295.557 ops/s [Average]
  (min, avg, max) = (4163.968, 5393.624, 6156.031), stdev = 525.353
  CI (99.9%): [5098.067, 5689.182] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:50
# Fork: 1 of 2
# Warmup Iteration   1: 298.650 ops/s
# Warmup Iteration   2: 652.769 ops/s
# Warmup Iteration   3: 808.432 ops/s
# Warmup Iteration   4: 1298.555 ops/s
# Warmup Iteration   5: 2508.496 ops/s
# Warmup Iteration   6: 2703.070 ops/s
# Warmup Iteration   7: 3162.103 ops/s
# Warmup Iteration   8: 3352.231 ops/s
# Warmup Iteration   9: 3680.561 ops/s
# Warmup Iteration  10: 3779.706 ops/s
# Warmup Iteration  11: 3748.379 ops/s
# Warmup Iteration  12: 3889.403 ops/s
# Warmup Iteration  13: 4014.514 ops/s
# Warmup Iteration  14: 4573.539 ops/s
# Warmup Iteration  15: 4141.645 ops/s
# Warmup Iteration  16: 3162.612 ops/s
# Warmup Iteration  17: 4413.848 ops/s
# Warmup Iteration  18: 5168.209 ops/s
# Warmup Iteration  19: 5704.541 ops/s
# Warmup Iteration  20: 5352.833 ops/s
Iteration   1: 5515.650 ops/s
Iteration   2: 5991.717 ops/s
Iteration   3: 6211.210 ops/s
Iteration   4: 6320.765 ops/s
Iteration   5: 6541.176 ops/s
Iteration   6: 7440.258 ops/s
Iteration   7: 7272.276 ops/s
Iteration   8: 8065.855 ops/s
Iteration   9: 7921.190 ops/s
Iteration  10: 8254.497 ops/s
Iteration  11: 8132.099 ops/s
Iteration  12: 7642.953 ops/s
Iteration  13: 7881.541 ops/s
Iteration  14: 7696.943 ops/s
Iteration  15: 7691.757 ops/s
Iteration  16: 7643.671 ops/s
Iteration  17: 7634.476 ops/s
Iteration  18: 7883.445 ops/s
Iteration  19: 7723.555 ops/s
Iteration  20: 7809.725 ops/s

# Run progress: 70.00% complete, ETA 00:02:08
# Fork: 2 of 2
# Warmup Iteration   1: 301.037 ops/s
# Warmup Iteration   2: 755.808 ops/s
# Warmup Iteration   3: 995.379 ops/s
# Warmup Iteration   4: 2161.404 ops/s
# Warmup Iteration   5: 3104.273 ops/s
# Warmup Iteration   6: 3380.012 ops/s
# Warmup Iteration   7: 3652.046 ops/s
# Warmup Iteration   8: 3896.099 ops/s
# Warmup Iteration   9: 4202.783 ops/s
# Warmup Iteration  10: 4307.672 ops/s
# Warmup Iteration  11: 4624.487 ops/s
# Warmup Iteration  12: 4848.911 ops/s
# Warmup Iteration  13: 5481.540 ops/s
# Warmup Iteration  14: 5654.013 ops/s
# Warmup Iteration  15: 6225.821 ops/s
# Warmup Iteration  16: 6914.574 ops/s
# Warmup Iteration  17: 6914.017 ops/s
# Warmup Iteration  18: 8398.100 ops/s
# Warmup Iteration  19: 8101.725 ops/s
# Warmup Iteration  20: 8550.849 ops/s
Iteration   1: 9236.542 ops/s
Iteration   2: 8788.095 ops/s
Iteration   3: 9161.878 ops/s
Iteration   4: 9360.980 ops/s
Iteration   5: 9506.760 ops/s
Iteration   6: 9276.625 ops/s
Iteration   7: 9224.367 ops/s
Iteration   8: 9491.313 ops/s
Iteration   9: 9414.785 ops/s
Iteration  10: 8128.812 ops/s
Iteration  11: 8374.805 ops/s
Iteration  12: 8447.026 ops/s
Iteration  13: 8679.809 ops/s
Iteration  14: 9509.267 ops/s
Iteration  15: 9594.618 ops/s
Iteration  16: 9459.465 ops/s
Iteration  17: 9626.515 ops/s
Iteration  18: 9617.574 ops/s
Iteration  19: 8150.611 ops/s
Iteration  20: 8657.810 ops/s


Result "metrifier.benchmark.RPCBenchmark.listPersons":
  8224.560 ±(99.9%) 613.983 ops/s [Average]
  (min, avg, max) = (5515.650, 8224.560, 9626.515), stdev = 1091.354
  CI (99.9%): [7610.577, 8838.544] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:25
# Fork: 1 of 2
# Warmup Iteration   1: 45.472 ops/s
# Warmup Iteration   2: 109.216 ops/s
# Warmup Iteration   3: 180.840 ops/s
# Warmup Iteration   4: 367.651 ops/s
# Warmup Iteration   5: 440.481 ops/s
# Warmup Iteration   6: 515.247 ops/s
# Warmup Iteration   7: 566.229 ops/s
# Warmup Iteration   8: 600.823 ops/s
# Warmup Iteration   9: 640.555 ops/s
# Warmup Iteration  10: 679.399 ops/s
# Warmup Iteration  11: 746.702 ops/s
# Warmup Iteration  12: 831.170 ops/s
# Warmup Iteration  13: 860.345 ops/s
# Warmup Iteration  14: 897.997 ops/s
# Warmup Iteration  15: 939.790 ops/s
# Warmup Iteration  16: 1091.599 ops/s
# Warmup Iteration  17: 1173.785 ops/s
# Warmup Iteration  18: 1238.166 ops/s
# Warmup Iteration  19: 1162.490 ops/s
# Warmup Iteration  20: 1194.080 ops/s
Iteration   1: 1100.679 ops/s
Iteration   2: 1127.775 ops/s
Iteration   3: 1110.322 ops/s
Iteration   4: 991.288 ops/s
Iteration   5: 993.230 ops/s
Iteration   6: 1081.221 ops/s
Iteration   7: 989.863 ops/s
Iteration   8: 1065.139 ops/s
Iteration   9: 1139.566 ops/s
Iteration  10: 1207.781 ops/s
Iteration  11: 1198.080 ops/s
Iteration  12: 1154.789 ops/s
Iteration  13: 1199.249 ops/s
Iteration  14: 1143.690 ops/s
Iteration  15: 1151.746 ops/s
Iteration  16: 1149.531 ops/s
Iteration  17: 1153.849 ops/s
Iteration  18: 1210.430 ops/s
Iteration  19: 1190.107 ops/s
Iteration  20: 1144.521 ops/s

# Run progress: 90.00% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 38.261 ops/s
# Warmup Iteration   2: 98.861 ops/s
# Warmup Iteration   3: 160.652 ops/s
# Warmup Iteration   4: 357.525 ops/s
# Warmup Iteration   5: 417.417 ops/s
# Warmup Iteration   6: 512.754 ops/s
# Warmup Iteration   7: 558.492 ops/s
# Warmup Iteration   8: 586.866 ops/s
# Warmup Iteration   9: 615.910 ops/s
# Warmup Iteration  10: 631.969 ops/s
# Warmup Iteration  11: 691.911 ops/s
# Warmup Iteration  12: 704.289 ops/s
# Warmup Iteration  13: 785.972 ops/s
# Warmup Iteration  14: 861.676 ops/s
# Warmup Iteration  15: 887.930 ops/s
# Warmup Iteration  16: 895.109 ops/s
# Warmup Iteration  17: 973.828 ops/s
# Warmup Iteration  18: 1018.407 ops/s
# Warmup Iteration  19: 1118.928 ops/s
# Warmup Iteration  20: 1113.123 ops/s
Iteration   1: 1113.461 ops/s
Iteration   2: 1121.544 ops/s
Iteration   3: 1084.180 ops/s
Iteration   4: 997.866 ops/s
Iteration   5: 1013.427 ops/s
Iteration   6: 1100.493 ops/s
Iteration   7: 1106.412 ops/s
Iteration   8: 1170.259 ops/s
Iteration   9: 1189.682 ops/s
Iteration  10: 1109.980 ops/s
Iteration  11: 1147.872 ops/s
Iteration  12: 1025.216 ops/s
Iteration  13: 904.810 ops/s
Iteration  14: 999.807 ops/s
Iteration  15: 1065.675 ops/s
Iteration  16: 1051.285 ops/s
Iteration  17: 1080.437 ops/s
Iteration  18: 1234.583 ops/s
Iteration  19: 1236.249 ops/s
Iteration  20: 1222.641 ops/s


Result "metrifier.benchmark.RPCBenchmark.programComposition":
  1111.968 ±(99.9%) 44.460 ops/s [Average]
  (min, avg, max) = (904.810, 1111.968, 1236.249), stdev = 79.028
  CI (99.9%): [1067.508, 1156.429] (assumes normal distribution)


# Run complete. Total time: 00:07:07

Benchmark                         Mode  Cnt      Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  10637.672 ± 643.970  ops/s
RPCBenchmark.getPerson           thrpt   40  13579.929 ± 530.903  ops/s
RPCBenchmark.getPersonLinks      thrpt   40   5393.624 ± 295.557  ops/s
RPCBenchmark.listPersons         thrpt   40   8224.560 ± 613.983  ops/s
RPCBenchmark.programComposition  thrpt   40   1111.968 ±  44.460  ops/s
```

## Summary

### http

```bash
# Run complete. Total time: 00:07:13

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  2792.105 ± 126.448  ops/s
HttpBenchmark.getPerson           thrpt   40  2955.287 ± 139.535  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  2029.031 ± 124.303  ops/s
HttpBenchmark.listPersons         thrpt   40  2569.887 ± 167.753  ops/s
HttpBenchmark.programComposition  thrpt   40   318.553 ±  20.476  ops/s
```


### frees-rpc

```bash
# Run complete. Total time: 00:07:07

Benchmark                         Mode  Cnt      Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  10637.672 ± 643.970  ops/s
RPCBenchmark.getPerson           thrpt   40  13579.929 ± 530.903  ops/s
RPCBenchmark.getPersonLinks      thrpt   40   5393.624 ± 295.557  ops/s
RPCBenchmark.listPersons         thrpt   40   8224.560 ± 613.983  ops/s
RPCBenchmark.programComposition  thrpt   40   1111.968 ±  44.460  ops/s
```
