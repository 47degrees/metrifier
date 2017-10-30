# Benchmark Results

See [README](README.md#running-benchmarks) for reference.

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
[info] Running (fork) org.openjdk.jmh.Main -i 20 -wi 20 -f 2 -t 1 metrifier.benchmark.HttpBenchmark
# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 0.107 ops/s
# Warmup Iteration   2: 8.071 ops/s
# Warmup Iteration   3: 8.398 ops/s
# Warmup Iteration   4: 8.727 ops/s
# Warmup Iteration   5: 8.821 ops/s
# Warmup Iteration   6: 8.761 ops/s
# Warmup Iteration   7: 8.834 ops/s
# Warmup Iteration   8: 8.896 ops/s
# Warmup Iteration   9: 8.796 ops/s
# Warmup Iteration  10: 8.713 ops/s
# Warmup Iteration  11: 8.912 ops/s
# Warmup Iteration  12: 8.954 ops/s
# Warmup Iteration  13: 8.979 ops/s
# Warmup Iteration  14: 9.081 ops/s
# Warmup Iteration  15: 9.125 ops/s
# Warmup Iteration  16: 9.230 ops/s
# Warmup Iteration  17: 7.822 ops/s
# Warmup Iteration  18: 9.173 ops/s
# Warmup Iteration  19: 9.165 ops/s
# Warmup Iteration  20: 9.200 ops/s
Iteration   1: 8.977 ops/s
Iteration   2: 8.942 ops/s
Iteration   3: 8.949 ops/s
Iteration   4: 8.920 ops/s
Iteration   5: 8.957 ops/s
Iteration   6: 9.161 ops/s
Iteration   7: 9.257 ops/s
Iteration   8: 9.096 ops/s
Iteration   9: 9.190 ops/s
Iteration  10: 9.210 ops/s
Iteration  11: 9.312 ops/s
Iteration  12: 9.304 ops/s
Iteration  13: 9.202 ops/s
Iteration  14: 9.356 ops/s
Iteration  15: 9.280 ops/s
Iteration  16: 9.360 ops/s
Iteration  17: 9.234 ops/s
Iteration  18: 9.283 ops/s
Iteration  19: 9.234 ops/s
Iteration  20: 9.266 ops/s

# Run progress: 10.00% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.135 ops/s
# Warmup Iteration   2: 8.698 ops/s
# Warmup Iteration   3: 8.893 ops/s
# Warmup Iteration   4: 9.008 ops/s
# Warmup Iteration   5: 9.105 ops/s
# Warmup Iteration   6: 9.077 ops/s
# Warmup Iteration   7: 9.121 ops/s
# Warmup Iteration   8: 9.104 ops/s
# Warmup Iteration   9: 9.240 ops/s
# Warmup Iteration  10: 9.153 ops/s
# Warmup Iteration  11: 9.184 ops/s
# Warmup Iteration  12: 9.176 ops/s
# Warmup Iteration  13: 9.174 ops/s
# Warmup Iteration  14: 9.202 ops/s
# Warmup Iteration  15: 9.093 ops/s
# Warmup Iteration  16: 9.205 ops/s
# Warmup Iteration  17: 9.238 ops/s
# Warmup Iteration  18: 9.244 ops/s
# Warmup Iteration  19: 9.284 ops/s
# Warmup Iteration  20: 9.232 ops/s
Iteration   1: 9.237 ops/s
Iteration   2: 9.289 ops/s
Iteration   3: 9.251 ops/s
Iteration   4: 9.326 ops/s
Iteration   5: 9.274 ops/s
Iteration   6: 9.278 ops/s
Iteration   7: 9.194 ops/s
Iteration   8: 9.251 ops/s
Iteration   9: 9.300 ops/s
Iteration  10: 9.324 ops/s
Iteration  11: 9.260 ops/s
Iteration  12: 9.372 ops/s
Iteration  13: 9.335 ops/s
Iteration  14: 9.382 ops/s
Iteration  15: 9.347 ops/s
Iteration  16: 9.300 ops/s
Iteration  17: 9.271 ops/s
Iteration  18: 9.302 ops/s
Iteration  19: 9.352 ops/s
Iteration  20: 9.324 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  9.236 ±(99.9%) 0.070 ops/s [Average]
  (min, avg, max) = (8.920, 9.236, 9.382), stdev = 0.125
  CI (99.9%): [9.166, 9.307] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:07:30
# Fork: 1 of 2
# Warmup Iteration   1: 0.138 ops/s
# Warmup Iteration   2: 157.189 ops/s
# Warmup Iteration   3: 219.381 ops/s
# Warmup Iteration   4: 257.177 ops/s
# Warmup Iteration   5: 279.869 ops/s
# Warmup Iteration   6: 329.589 ops/s
# Warmup Iteration   7: 389.755 ops/s
# Warmup Iteration   8: 430.786 ops/s
# Warmup Iteration   9: 470.886 ops/s
# Warmup Iteration  10: 545.911 ops/s
# Warmup Iteration  11: 650.677 ops/s
# Warmup Iteration  12: 704.421 ops/s
# Warmup Iteration  13: 733.191 ops/s
# Warmup Iteration  14: 686.494 ops/s
# Warmup Iteration  15: 791.788 ops/s
# Warmup Iteration  16: 879.427 ops/s
# Warmup Iteration  17: 844.914 ops/s
# Warmup Iteration  18: 822.992 ops/s
# Warmup Iteration  19: 889.211 ops/s
# Warmup Iteration  20: 980.063 ops/s
Iteration   1: 919.463 ops/s
Iteration   2: 859.846 ops/s
Iteration   3: 935.294 ops/s
Iteration   4: 1097.202 ops/s
Iteration   5: 1158.355 ops/s
Iteration   6: 1282.159 ops/s
Iteration   7: 1324.083 ops/s
Iteration   8: 1444.377 ops/s
Iteration   9: 1649.097 ops/s
Iteration  10: 1664.935 ops/s
Iteration  11: 1885.897 ops/s
Iteration  12: 2129.512 ops/s
Iteration  13: 2075.900 ops/s
Iteration  14: 1709.579 ops/s
Iteration  15: 1646.532 ops/s
Iteration  16: 1694.394 ops/s
Iteration  17: 1720.208 ops/s
Iteration  18: 1720.718 ops/s
Iteration  19: 1706.299 ops/s
Iteration  20: 1719.407 ops/s

# Run progress: 30.00% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 0.137 ops/s
# Warmup Iteration   2: 230.532 ops/s
# Warmup Iteration   3: 350.310 ops/s
# Warmup Iteration   4: 369.191 ops/s
# Warmup Iteration   5: 445.060 ops/s
# Warmup Iteration   6: 486.794 ops/s
# Warmup Iteration   7: 544.653 ops/s
# Warmup Iteration   8: 665.239 ops/s
# Warmup Iteration   9: 870.442 ops/s
# Warmup Iteration  10: 989.237 ops/s
# Warmup Iteration  11: 873.542 ops/s
# Warmup Iteration  12: 968.937 ops/s
# Warmup Iteration  13: 1082.810 ops/s
# Warmup Iteration  14: 1062.743 ops/s
# Warmup Iteration  15: 1136.115 ops/s
# Warmup Iteration  16: 1094.097 ops/s
# Warmup Iteration  17: 1049.050 ops/s
# Warmup Iteration  18: 1043.229 ops/s
# Warmup Iteration  19: 1213.263 ops/s
# Warmup Iteration  20: 1265.920 ops/s
Iteration   1: 1257.791 ops/s
Iteration   2: 1388.120 ops/s
Iteration   3: 1454.326 ops/s
Iteration   4: 1520.457 ops/s
Iteration   5: 1726.062 ops/s
Iteration   6: 1921.876 ops/s
Iteration   7: 2067.260 ops/s
Iteration   8: 2103.226 ops/s
Iteration   9: 2055.832 ops/s
Iteration  10: 2140.757 ops/s
Iteration  11: 2096.543 ops/s
Iteration  12: 2086.778 ops/s
Iteration  13: 2005.678 ops/s
Iteration  14: 2096.587 ops/s
Iteration  15: 2089.262 ops/s
Iteration  16: 2119.436 ops/s
Iteration  17: 2113.267 ops/s
Iteration  18: 2018.001 ops/s
Iteration  19: 2010.987 ops/s
Iteration  20: 2094.314 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  1717.745 ±(99.9%) 216.141 ops/s [Average]
  (min, avg, max) = (859.846, 1717.745, 2140.757), stdev = 384.190
  CI (99.9%): [1501.605, 1933.886] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:05:25
# Fork: 1 of 2
# Warmup Iteration   1: 0.136 ops/s
# Warmup Iteration   2: 147.510 ops/s
# Warmup Iteration   3: 245.422 ops/s
# Warmup Iteration   4: 295.649 ops/s
# Warmup Iteration   5: 375.214 ops/s
# Warmup Iteration   6: 456.589 ops/s
# Warmup Iteration   7: 497.679 ops/s
# Warmup Iteration   8: 668.099 ops/s
# Warmup Iteration   9: 795.389 ops/s
# Warmup Iteration  10: 638.053 ops/s
# Warmup Iteration  11: 673.699 ops/s
# Warmup Iteration  12: 748.378 ops/s
# Warmup Iteration  13: 842.515 ops/s
# Warmup Iteration  14: 930.812 ops/s
# Warmup Iteration  15: 850.718 ops/s
# Warmup Iteration  16: 914.502 ops/s
# Warmup Iteration  17: 968.718 ops/s
# Warmup Iteration  18: 945.762 ops/s
# Warmup Iteration  19: 870.267 ops/s
# Warmup Iteration  20: 1003.485 ops/s
Iteration   1: 1033.597 ops/s
Iteration   2: 1030.315 ops/s
Iteration   3: 1036.974 ops/s
Iteration   4: 1031.722 ops/s
Iteration   5: 1134.153 ops/s
Iteration   6: 1141.909 ops/s
Iteration   7: 1268.219 ops/s
Iteration   8: 1340.795 ops/s
Iteration   9: 1395.757 ops/s
Iteration  10: 1432.015 ops/s
Iteration  11: 1441.090 ops/s
Iteration  12: 1396.070 ops/s
Iteration  13: 1429.059 ops/s
Iteration  14: 1445.793 ops/s
Iteration  15: 1326.899 ops/s
Iteration  16: 1101.087 ops/s
Iteration  17: 1127.143 ops/s
Iteration  18: 1130.855 ops/s
Iteration  19: 1113.028 ops/s
Iteration  20: 1126.701 ops/s

# Run progress: 50.00% complete, ETA 00:04:29
# Fork: 2 of 2
# Warmup Iteration   1: 0.134 ops/s
# Warmup Iteration   2: 196.145 ops/s
# Warmup Iteration   3: 319.702 ops/s
# Warmup Iteration   4: 379.863 ops/s
# Warmup Iteration   5: 469.845 ops/s
# Warmup Iteration   6: 508.726 ops/s
# Warmup Iteration   7: 610.846 ops/s
# Warmup Iteration   8: 786.727 ops/s
# Warmup Iteration   9: 792.575 ops/s
# Warmup Iteration  10: 788.987 ops/s
# Warmup Iteration  11: 888.361 ops/s
# Warmup Iteration  12: 924.974 ops/s
# Warmup Iteration  13: 816.556 ops/s
# Warmup Iteration  14: 828.466 ops/s
# Warmup Iteration  15: 838.450 ops/s
# Warmup Iteration  16: 838.826 ops/s
# Warmup Iteration  17: 963.995 ops/s
# Warmup Iteration  18: 856.322 ops/s
# Warmup Iteration  19: 957.855 ops/s
# Warmup Iteration  20: 1037.921 ops/s
Iteration   1: 1033.207 ops/s
Iteration   2: 1036.619 ops/s
Iteration   3: 1067.860 ops/s
Iteration   4: 1083.547 ops/s
Iteration   5: 1101.839 ops/s
Iteration   6: 1164.297 ops/s
Iteration   7: 1286.308 ops/s
Iteration   8: 1314.612 ops/s
Iteration   9: 1371.174 ops/s
Iteration  10: 1388.578 ops/s
Iteration  11: 1307.449 ops/s
Iteration  12: 1357.544 ops/s
Iteration  13: 1457.936 ops/s
Iteration  14: 1421.344 ops/s
Iteration  15: 1205.377 ops/s
Iteration  16: 1096.504 ops/s
Iteration  17: 1079.453 ops/s
Iteration  18: 1096.155 ops/s
Iteration  19: 1091.391 ops/s
Iteration  20: 1087.425 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  1213.295 ±(99.9%) 84.572 ops/s [Average]
  (min, avg, max) = (1030.315, 1213.295, 1457.936), stdev = 150.326
  CI (99.9%): [1128.723, 1297.867] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:03:34
# Fork: 1 of 2
# Warmup Iteration   1: 0.128 ops/s
# Warmup Iteration   2: 186.336 ops/s
# Warmup Iteration   3: 311.591 ops/s
# Warmup Iteration   4: 376.185 ops/s
# Warmup Iteration   5: 444.133 ops/s
# Warmup Iteration   6: 515.080 ops/s
# Warmup Iteration   7: 483.385 ops/s
# Warmup Iteration   8: 517.239 ops/s
# Warmup Iteration   9: 475.330 ops/s
# Warmup Iteration  10: 612.394 ops/s
# Warmup Iteration  11: 547.086 ops/s
# Warmup Iteration  12: 548.202 ops/s
# Warmup Iteration  13: 657.441 ops/s
# Warmup Iteration  14: 591.554 ops/s
# Warmup Iteration  15: 624.553 ops/s
# Warmup Iteration  16: 745.736 ops/s
# Warmup Iteration  17: 840.617 ops/s
# Warmup Iteration  18: 698.192 ops/s
# Warmup Iteration  19: 783.066 ops/s
# Warmup Iteration  20: 840.658 ops/s
Iteration   1: 824.318 ops/s
Iteration   2: 841.664 ops/s
Iteration   3: 771.444 ops/s
Iteration   4: 661.275 ops/s
Iteration   5: 635.793 ops/s
Iteration   6: 775.468 ops/s
Iteration   7: 714.681 ops/s
Iteration   8: 646.206 ops/s
Iteration   9: 676.957 ops/s
Iteration  10: 801.061 ops/s
Iteration  11: 809.012 ops/s
Iteration  12: 925.021 ops/s
Iteration  13: 1048.444 ops/s
Iteration  14: 1113.944 ops/s
Iteration  15: 1138.769 ops/s
Iteration  16: 1234.405 ops/s
Iteration  17: 1132.163 ops/s
Iteration  18: 1244.678 ops/s
Iteration  19: 1206.023 ops/s
Iteration  20: 1252.141 ops/s

# Run progress: 70.00% complete, ETA 00:02:40
# Fork: 2 of 2
# Warmup Iteration   1: 0.133 ops/s
# Warmup Iteration   2: 208.562 ops/s
# Warmup Iteration   3: 325.396 ops/s
# Warmup Iteration   4: 365.778 ops/s
# Warmup Iteration   5: 446.938 ops/s
# Warmup Iteration   6: 468.567 ops/s
# Warmup Iteration   7: 459.200 ops/s
# Warmup Iteration   8: 701.010 ops/s
# Warmup Iteration   9: 814.726 ops/s
# Warmup Iteration  10: 676.880 ops/s
# Warmup Iteration  11: 737.750 ops/s
# Warmup Iteration  12: 680.964 ops/s
# Warmup Iteration  13: 882.806 ops/s
# Warmup Iteration  14: 932.370 ops/s
# Warmup Iteration  15: 607.065 ops/s
# Warmup Iteration  16: 745.116 ops/s
# Warmup Iteration  17: 952.761 ops/s
# Warmup Iteration  18: 805.182 ops/s
# Warmup Iteration  19: 729.157 ops/s
# Warmup Iteration  20: 822.386 ops/s
Iteration   1: 636.329 ops/s
Iteration   2: 714.921 ops/s
Iteration   3: 779.347 ops/s
Iteration   4: 859.098 ops/s
Iteration   5: 748.885 ops/s
Iteration   6: 923.645 ops/s
Iteration   7: 1032.731 ops/s
Iteration   8: 812.230 ops/s
Iteration   9: 1041.284 ops/s
Iteration  10: 1054.996 ops/s
Iteration  11: 1002.216 ops/s
Iteration  12: 1232.276 ops/s
Iteration  13: 1201.527 ops/s
Iteration  14: 1369.654 ops/s
Iteration  15: 1169.517 ops/s
Iteration  16: 1271.280 ops/s
Iteration  17: 1273.908 ops/s
Iteration  18: 1209.465 ops/s
Iteration  19: 1256.358 ops/s
Iteration  20: 1462.216 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  987.634 ±(99.9%) 133.290 ops/s [Average]
  (min, avg, max) = (635.793, 987.634, 1462.216), stdev = 236.923
  CI (99.9%): [854.344, 1120.924] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:47
# Fork: 1 of 2
# Warmup Iteration   1: 0.131 ops/s
# Warmup Iteration   2: 6.553 ops/s
# Warmup Iteration   3: 7.069 ops/s
# Warmup Iteration   4: 7.460 ops/s
# Warmup Iteration   5: 7.510 ops/s
# Warmup Iteration   6: 7.850 ops/s
# Warmup Iteration   7: 7.829 ops/s
# Warmup Iteration   8: 8.135 ops/s
# Warmup Iteration   9: 8.044 ops/s
# Warmup Iteration  10: 7.884 ops/s
# Warmup Iteration  11: 8.214 ops/s
# Warmup Iteration  12: 7.979 ops/s
# Warmup Iteration  13: 7.733 ops/s
# Warmup Iteration  14: 8.109 ops/s
# Warmup Iteration  15: 8.223 ops/s
# Warmup Iteration  16: 8.287 ops/s
# Warmup Iteration  17: 8.207 ops/s
# Warmup Iteration  18: 8.241 ops/s
# Warmup Iteration  19: 8.347 ops/s
# Warmup Iteration  20: 8.394 ops/s
Iteration   1: 8.408 ops/s
Iteration   2: 8.310 ops/s
Iteration   3: 8.397 ops/s
Iteration   4: 8.147 ops/s
Iteration   5: 8.385 ops/s
Iteration   6: 8.619 ops/s
Iteration   7: 8.659 ops/s
Iteration   8: 8.655 ops/s
Iteration   9: 8.625 ops/s
Iteration  10: 8.660 ops/s
Iteration  11: 8.667 ops/s
Iteration  12: 8.637 ops/s
Iteration  13: 8.794 ops/s
Iteration  14: 8.702 ops/s
Iteration  15: 8.680 ops/s
Iteration  16: 8.894 ops/s
Iteration  17: 8.763 ops/s
Iteration  18: 8.793 ops/s
Iteration  19: 8.864 ops/s
Iteration  20: 8.839 ops/s

# Run progress: 90.00% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 0.110 ops/s
# Warmup Iteration   2: 6.295 ops/s
# Warmup Iteration   3: 6.857 ops/s
# Warmup Iteration   4: 7.233 ops/s
# Warmup Iteration   5: 7.282 ops/s
# Warmup Iteration   6: 7.606 ops/s
# Warmup Iteration   7: 7.710 ops/s
# Warmup Iteration   8: 7.853 ops/s
# Warmup Iteration   9: 8.136 ops/s
# Warmup Iteration  10: 8.033 ops/s
# Warmup Iteration  11: 8.049 ops/s
# Warmup Iteration  12: 8.062 ops/s
# Warmup Iteration  13: 7.976 ops/s
# Warmup Iteration  14: 8.107 ops/s
# Warmup Iteration  15: 8.152 ops/s
# Warmup Iteration  16: 8.256 ops/s
# Warmup Iteration  17: 8.302 ops/s
# Warmup Iteration  18: 8.445 ops/s
# Warmup Iteration  19: 8.400 ops/s
# Warmup Iteration  20: 8.265 ops/s
Iteration   1: 8.325 ops/s
Iteration   2: 8.283 ops/s
Iteration   3: 8.156 ops/s
Iteration   4: 8.326 ops/s
Iteration   5: 8.549 ops/s
Iteration   6: 8.595 ops/s
Iteration   7: 8.550 ops/s
Iteration   8: 8.649 ops/s
Iteration   9: 8.637 ops/s
Iteration  10: 8.655 ops/s
Iteration  11: 8.538 ops/s
Iteration  12: 8.574 ops/s
Iteration  13: 8.659 ops/s
Iteration  14: 8.694 ops/s
Iteration  15: 8.649 ops/s
Iteration  16: 8.670 ops/s
Iteration  17: 8.751 ops/s
Iteration  18: 8.718 ops/s
Iteration  19: 8.881 ops/s
Iteration  20: 8.891 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  8.606 ±(99.9%) 0.108 ops/s [Average]
  (min, avg, max) = (8.147, 8.606, 8.894), stdev = 0.193
  CI (99.9%): [8.498, 8.715] (assumes normal distribution)


# Run complete. Total time: 00:08:59

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40     9.236 ±   0.070  ops/s
HttpBenchmark.getPerson           thrpt   40  1717.745 ± 216.141  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  1213.295 ±  84.572  ops/s
HttpBenchmark.listPersons         thrpt   40   987.634 ± 133.290  ops/s
HttpBenchmark.programComposition  thrpt   40     8.606 ±   0.108  ops/s
```

## jmh - frees-rpc

```bash
[info] Running (fork) org.openjdk.jmh.Main -i 20 -wi 20 -f 2 -t 1 metrifier.benchmark.RPCBenchmark
# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 0.172 ops/s
# Warmup Iteration   2: 8.874 ops/s
# Warmup Iteration   3: 9.099 ops/s
# Warmup Iteration   4: 9.103 ops/s
# Warmup Iteration   5: 9.244 ops/s
# Warmup Iteration   6: 9.239 ops/s
# Warmup Iteration   7: 9.122 ops/s
# Warmup Iteration   8: 9.280 ops/s
# Warmup Iteration   9: 9.249 ops/s
# Warmup Iteration  10: 9.291 ops/s
# Warmup Iteration  11: 9.323 ops/s
# Warmup Iteration  12: 9.236 ops/s
# Warmup Iteration  13: 9.384 ops/s
# Warmup Iteration  14: 9.282 ops/s
# Warmup Iteration  15: 9.326 ops/s
# Warmup Iteration  16: 9.356 ops/s
# Warmup Iteration  17: 9.361 ops/s
# Warmup Iteration  18: 9.335 ops/s
# Warmup Iteration  19: 9.337 ops/s
# Warmup Iteration  20: 9.375 ops/s
Iteration   1: 9.383 ops/s
Iteration   2: 9.424 ops/s
Iteration   3: 9.373 ops/s
Iteration   4: 9.316 ops/s
Iteration   5: 9.323 ops/s
Iteration   6: 9.357 ops/s
Iteration   7: 9.386 ops/s
Iteration   8: 9.395 ops/s
Iteration   9: 9.379 ops/s
Iteration  10: 9.395 ops/s
Iteration  11: 9.432 ops/s
Iteration  12: 9.357 ops/s
Iteration  13: 9.338 ops/s
Iteration  14: 9.435 ops/s
Iteration  15: 9.257 ops/s
Iteration  16: 9.356 ops/s
Iteration  17: 9.371 ops/s
Iteration  18: 9.464 ops/s
Iteration  19: 9.331 ops/s
Iteration  20: 8.134 ops/s

# Run progress: 10.00% complete, ETA 00:08:57
# Fork: 2 of 2
# Warmup Iteration   1: 0.160 ops/s
# Warmup Iteration   2: 9.118 ops/s
# Warmup Iteration   3: 9.198 ops/s
# Warmup Iteration   4: 9.268 ops/s
# Warmup Iteration   5: 9.317 ops/s
# Warmup Iteration   6: 9.025 ops/s
# Warmup Iteration   7: 9.191 ops/s
# Warmup Iteration   8: 9.112 ops/s
# Warmup Iteration   9: 9.365 ops/s
# Warmup Iteration  10: 9.379 ops/s
# Warmup Iteration  11: 9.385 ops/s
# Warmup Iteration  12: 9.378 ops/s
# Warmup Iteration  13: 9.374 ops/s
# Warmup Iteration  14: 9.283 ops/s
# Warmup Iteration  15: 9.397 ops/s
# Warmup Iteration  16: 9.331 ops/s
# Warmup Iteration  17: 9.422 ops/s
# Warmup Iteration  18: 9.437 ops/s
# Warmup Iteration  19: 9.411 ops/s
# Warmup Iteration  20: 9.402 ops/s
Iteration   1: 9.402 ops/s
Iteration   2: 9.468 ops/s
Iteration   3: 9.367 ops/s
Iteration   4: 9.433 ops/s
Iteration   5: 9.465 ops/s
Iteration   6: 9.396 ops/s
Iteration   7: 9.379 ops/s
Iteration   8: 9.433 ops/s
Iteration   9: 9.404 ops/s
Iteration  10: 9.450 ops/s
Iteration  11: 9.372 ops/s
Iteration  12: 9.534 ops/s
Iteration  13: 9.390 ops/s
Iteration  14: 9.505 ops/s
Iteration  15: 9.471 ops/s
Iteration  16: 9.460 ops/s
Iteration  17: 9.452 ops/s
Iteration  18: 9.465 ops/s
Iteration  19: 9.397 ops/s
Iteration  20: 9.389 ops/s


Result "metrifier.benchmark.RPCBenchmark.createPerson":
  9.371 ±(99.9%) 0.117 ops/s [Average]
  (min, avg, max) = (8.134, 9.371, 9.534), stdev = 0.208
  CI (99.9%): [9.254, 9.488] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:08:28
# Fork: 1 of 2
# Warmup Iteration   1: 0.183 ops/s
# Warmup Iteration   2: 277.099 ops/s
# Warmup Iteration   3: 379.495 ops/s
# Warmup Iteration   4: 440.221 ops/s
# Warmup Iteration   5: 589.445 ops/s
# Warmup Iteration   6: 616.092 ops/s
# Warmup Iteration   7: 936.412 ops/s
# Warmup Iteration   8: 950.641 ops/s
# Warmup Iteration   9: 932.486 ops/s
# Warmup Iteration  10: 877.618 ops/s
# Warmup Iteration  11: 894.867 ops/s
# Warmup Iteration  12: 1010.028 ops/s
# Warmup Iteration  13: 1254.232 ops/s
# Warmup Iteration  14: 1687.475 ops/s
# Warmup Iteration  15: 1773.382 ops/s
# Warmup Iteration  16: 1501.494 ops/s
# Warmup Iteration  17: 2332.705 ops/s
# Warmup Iteration  18: 2294.513 ops/s
# Warmup Iteration  19: 3350.052 ops/s
# Warmup Iteration  20: 3374.504 ops/s
Iteration   1: 3316.936 ops/s
Iteration   2: 3411.180 ops/s
Iteration   3: 3420.308 ops/s
Iteration   4: 3243.847 ops/s
Iteration   5: 3377.348 ops/s
Iteration   6: 3374.192 ops/s
Iteration   7: 3472.688 ops/s
Iteration   8: 3653.107 ops/s
Iteration   9: 3383.467 ops/s
Iteration  10: 2928.256 ops/s
Iteration  11: 3107.838 ops/s
Iteration  12: 3140.019 ops/s
Iteration  13: 3226.043 ops/s
Iteration  14: 3348.222 ops/s
Iteration  15: 3549.789 ops/s
Iteration  16: 3239.850 ops/s
Iteration  17: 3247.275 ops/s
Iteration  18: 3369.111 ops/s
Iteration  19: 3208.990 ops/s
Iteration  20: 3253.680 ops/s

# Run progress: 30.00% complete, ETA 00:07:08
# Fork: 2 of 2
# Warmup Iteration   1: 0.185 ops/s
# Warmup Iteration   2: 357.671 ops/s
# Warmup Iteration   3: 532.407 ops/s
# Warmup Iteration   4: 591.946 ops/s
# Warmup Iteration   5: 694.907 ops/s
# Warmup Iteration   6: 1047.212 ops/s
# Warmup Iteration   7: 1333.101 ops/s
# Warmup Iteration   8: 1339.373 ops/s
# Warmup Iteration   9: 1334.611 ops/s
# Warmup Iteration  10: 1772.087 ops/s
# Warmup Iteration  11: 1676.716 ops/s
# Warmup Iteration  12: 1992.647 ops/s
# Warmup Iteration  13: 1868.848 ops/s
# Warmup Iteration  14: 2136.887 ops/s
# Warmup Iteration  15: 2289.651 ops/s
# Warmup Iteration  16: 2331.220 ops/s
# Warmup Iteration  17: 2944.186 ops/s
# Warmup Iteration  18: 2940.595 ops/s
# Warmup Iteration  19: 2931.446 ops/s
# Warmup Iteration  20: 2981.507 ops/s
Iteration   1: 3151.635 ops/s
Iteration   2: 2837.621 ops/s
Iteration   3: 3047.984 ops/s
Iteration   4: 3072.165 ops/s
Iteration   5: 3091.216 ops/s
Iteration   6: 3012.484 ops/s
Iteration   7: 2936.268 ops/s
Iteration   8: 3055.873 ops/s
Iteration   9: 3136.446 ops/s
Iteration  10: 3168.005 ops/s
Iteration  11: 3176.186 ops/s
Iteration  12: 3174.340 ops/s
Iteration  13: 3121.193 ops/s
Iteration  14: 3133.824 ops/s
Iteration  15: 2880.358 ops/s
Iteration  16: 2932.010 ops/s
Iteration  17: 3079.933 ops/s
Iteration  18: 3110.521 ops/s
Iteration  19: 3175.726 ops/s
Iteration  20: 3169.191 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPerson":
  3193.378 ±(99.9%) 101.669 ops/s [Average]
  (min, avg, max) = (2837.621, 3193.378, 3653.107), stdev = 180.716
  CI (99.9%): [3091.709, 3295.047] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:06:00
# Fork: 1 of 2
# Warmup Iteration   1: 0.184 ops/s
# Warmup Iteration   2: 327.467 ops/s
# Warmup Iteration   3: 525.184 ops/s
# Warmup Iteration   4: 645.940 ops/s
# Warmup Iteration   5: 716.445 ops/s
# Warmup Iteration   6: 1083.160 ops/s
# Warmup Iteration   7: 1075.656 ops/s
# Warmup Iteration   8: 1134.611 ops/s
# Warmup Iteration   9: 1283.804 ops/s
# Warmup Iteration  10: 1695.301 ops/s
# Warmup Iteration  11: 1375.340 ops/s
# Warmup Iteration  12: 1770.594 ops/s
# Warmup Iteration  13: 1720.523 ops/s
# Warmup Iteration  14: 1868.266 ops/s
# Warmup Iteration  15: 1769.056 ops/s
# Warmup Iteration  16: 1919.072 ops/s
# Warmup Iteration  17: 1762.421 ops/s
# Warmup Iteration  18: 2269.446 ops/s
# Warmup Iteration  19: 2284.296 ops/s
# Warmup Iteration  20: 2324.149 ops/s
Iteration   1: 2242.449 ops/s
Iteration   2: 2235.886 ops/s
Iteration   3: 2274.504 ops/s
Iteration   4: 2332.076 ops/s
Iteration   5: 2319.377 ops/s
Iteration   6: 2324.720 ops/s
Iteration   7: 2342.860 ops/s
Iteration   8: 2373.883 ops/s
Iteration   9: 2360.076 ops/s
Iteration  10: 2256.965 ops/s
Iteration  11: 2249.808 ops/s
Iteration  12: 2317.443 ops/s
Iteration  13: 2318.338 ops/s
Iteration  14: 2328.865 ops/s
Iteration  15: 2162.586 ops/s
Iteration  16: 2153.585 ops/s
Iteration  17: 2379.383 ops/s
Iteration  18: 2243.521 ops/s
Iteration  19: 2213.698 ops/s
Iteration  20: 2278.295 ops/s

# Run progress: 50.00% complete, ETA 00:04:56
# Fork: 2 of 2
# Warmup Iteration   1: 0.184 ops/s
# Warmup Iteration   2: 388.383 ops/s
# Warmup Iteration   3: 524.838 ops/s
# Warmup Iteration   4: 629.403 ops/s
# Warmup Iteration   5: 748.354 ops/s
# Warmup Iteration   6: 1092.913 ops/s
# Warmup Iteration   7: 1257.339 ops/s
# Warmup Iteration   8: 1134.106 ops/s
# Warmup Iteration   9: 1322.986 ops/s
# Warmup Iteration  10: 1604.182 ops/s
# Warmup Iteration  11: 1530.037 ops/s
# Warmup Iteration  12: 1560.067 ops/s
# Warmup Iteration  13: 1626.592 ops/s
# Warmup Iteration  14: 1563.219 ops/s
# Warmup Iteration  15: 1864.725 ops/s
# Warmup Iteration  16: 1694.318 ops/s
# Warmup Iteration  17: 2106.046 ops/s
# Warmup Iteration  18: 2133.118 ops/s
# Warmup Iteration  19: 2285.517 ops/s
# Warmup Iteration  20: 2264.877 ops/s
Iteration   1: 2271.104 ops/s
Iteration   2: 2244.336 ops/s
Iteration   3: 2254.663 ops/s
Iteration   4: 2194.526 ops/s
Iteration   5: 2180.041 ops/s
Iteration   6: 2252.902 ops/s
Iteration   7: 2167.162 ops/s
Iteration   8: 2306.493 ops/s
Iteration   9: 2317.106 ops/s
Iteration  10: 2284.102 ops/s
Iteration  11: 2308.611 ops/s
Iteration  12: 2162.249 ops/s
Iteration  13: 2171.237 ops/s
Iteration  14: 2204.887 ops/s
Iteration  15: 2250.665 ops/s
Iteration  16: 2155.711 ops/s
Iteration  17: 2221.500 ops/s
Iteration  18: 2288.083 ops/s
Iteration  19: 2278.570 ops/s
Iteration  20: 2160.910 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPersonLinks":
  2259.579 ±(99.9%) 36.616 ops/s [Average]
  (min, avg, max) = (2153.585, 2259.579, 2379.383), stdev = 65.086
  CI (99.9%): [2222.963, 2296.196] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:03:55
# Fork: 1 of 2
# Warmup Iteration   1: 0.183 ops/s
# Warmup Iteration   2: 358.117 ops/s
# Warmup Iteration   3: 529.956 ops/s
# Warmup Iteration   4: 599.932 ops/s
# Warmup Iteration   5: 713.445 ops/s
# Warmup Iteration   6: 1055.085 ops/s
# Warmup Iteration   7: 1163.077 ops/s
# Warmup Iteration   8: 1334.088 ops/s
# Warmup Iteration   9: 1406.831 ops/s
# Warmup Iteration  10: 1256.790 ops/s
# Warmup Iteration  11: 1294.557 ops/s
# Warmup Iteration  12: 1494.748 ops/s
# Warmup Iteration  13: 1647.040 ops/s
# Warmup Iteration  14: 1911.450 ops/s
# Warmup Iteration  15: 1827.763 ops/s
# Warmup Iteration  16: 1790.727 ops/s
# Warmup Iteration  17: 1940.455 ops/s
# Warmup Iteration  18: 2202.177 ops/s
# Warmup Iteration  19: 2354.286 ops/s
# Warmup Iteration  20: 2378.287 ops/s
Iteration   1: 2408.735 ops/s
Iteration   2: 2383.370 ops/s
Iteration   3: 2343.889 ops/s
Iteration   4: 2154.686 ops/s
Iteration   5: 2343.114 ops/s
Iteration   6: 2416.991 ops/s
Iteration   7: 2375.651 ops/s
Iteration   8: 2379.987 ops/s
Iteration   9: 2379.020 ops/s
Iteration  10: 2238.635 ops/s
Iteration  11: 2297.370 ops/s
Iteration  12: 2363.420 ops/s
Iteration  13: 2464.882 ops/s
Iteration  14: 2476.341 ops/s
Iteration  15: 2410.351 ops/s
Iteration  16: 2547.969 ops/s
Iteration  17: 2536.518 ops/s
Iteration  18: 2535.859 ops/s
Iteration  19: 2521.188 ops/s
Iteration  20: 2441.172 ops/s

# Run progress: 70.00% complete, ETA 00:02:55
# Fork: 2 of 2
# Warmup Iteration   1: 0.183 ops/s
# Warmup Iteration   2: 389.413 ops/s
# Warmup Iteration   3: 542.847 ops/s
# Warmup Iteration   4: 567.152 ops/s
# Warmup Iteration   5: 664.245 ops/s
# Warmup Iteration   6: 958.049 ops/s
# Warmup Iteration   7: 1104.760 ops/s
# Warmup Iteration   8: 1224.519 ops/s
# Warmup Iteration   9: 1082.099 ops/s
# Warmup Iteration  10: 1394.106 ops/s
# Warmup Iteration  11: 1341.544 ops/s
# Warmup Iteration  12: 1666.408 ops/s
# Warmup Iteration  13: 1775.049 ops/s
# Warmup Iteration  14: 1850.062 ops/s
# Warmup Iteration  15: 2042.080 ops/s
# Warmup Iteration  16: 2035.961 ops/s
# Warmup Iteration  17: 2334.169 ops/s
# Warmup Iteration  18: 2276.971 ops/s
# Warmup Iteration  19: 2306.444 ops/s
# Warmup Iteration  20: 2414.114 ops/s
Iteration   1: 2080.337 ops/s
Iteration   2: 2204.200 ops/s
Iteration   3: 2374.713 ops/s
Iteration   4: 2307.107 ops/s
Iteration   5: 2259.086 ops/s
Iteration   6: 2338.466 ops/s
Iteration   7: 2170.974 ops/s
Iteration   8: 2083.233 ops/s
Iteration   9: 2328.788 ops/s
Iteration  10: 2303.862 ops/s
Iteration  11: 2249.819 ops/s
Iteration  12: 2358.670 ops/s
Iteration  13: 2298.962 ops/s
Iteration  14: 2314.702 ops/s
Iteration  15: 2113.228 ops/s
Iteration  16: 2182.544 ops/s
Iteration  17: 2375.919 ops/s
Iteration  18: 2299.899 ops/s
Iteration  19: 2280.715 ops/s
Iteration  20: 2402.870 ops/s


Result "metrifier.benchmark.RPCBenchmark.listPersons":
  2333.681 ±(99.9%) 66.979 ops/s [Average]
  (min, avg, max) = (2080.337, 2333.681, 2547.969), stdev = 119.055
  CI (99.9%): [2266.702, 2400.660] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:56
# Fork: 1 of 2
# Warmup Iteration   1: 0.176 ops/s
# Warmup Iteration   2: 7.472 ops/s
# Warmup Iteration   3: 8.011 ops/s
# Warmup Iteration   4: 8.084 ops/s
# Warmup Iteration   5: 8.240 ops/s
# Warmup Iteration   6: 8.356 ops/s
# Warmup Iteration   7: 8.346 ops/s
# Warmup Iteration   8: 8.374 ops/s
# Warmup Iteration   9: 8.364 ops/s
# Warmup Iteration  10: 8.363 ops/s
# Warmup Iteration  11: 8.355 ops/s
# Warmup Iteration  12: 8.318 ops/s
# Warmup Iteration  13: 8.433 ops/s
# Warmup Iteration  14: 8.416 ops/s
# Warmup Iteration  15: 8.340 ops/s
# Warmup Iteration  16: 8.475 ops/s
# Warmup Iteration  17: 8.519 ops/s
# Warmup Iteration  18: 8.629 ops/s
# Warmup Iteration  19: 8.748 ops/s
# Warmup Iteration  20: 8.568 ops/s
Iteration   1: 8.599 ops/s
Iteration   2: 8.653 ops/s
Iteration   3: 8.748 ops/s
Iteration   4: 8.751 ops/s
Iteration   5: 8.703 ops/s
Iteration   6: 8.785 ops/s
Iteration   7: 8.849 ops/s
Iteration   8: 8.707 ops/s
Iteration   9: 8.782 ops/s
Iteration  10: 8.589 ops/s
Iteration  11: 8.839 ops/s
Iteration  12: 8.708 ops/s
Iteration  13: 8.737 ops/s
Iteration  14: 8.793 ops/s
Iteration  15: 8.778 ops/s
Iteration  16: 8.832 ops/s
Iteration  17: 8.806 ops/s
Iteration  18: 8.748 ops/s
Iteration  19: 8.708 ops/s
Iteration  20: 8.817 ops/s

# Run progress: 90.00% complete, ETA 00:00:58
# Fork: 2 of 2
# Warmup Iteration   1: 0.176 ops/s
# Warmup Iteration   2: 7.594 ops/s
# Warmup Iteration   3: 7.910 ops/s
# Warmup Iteration   4: 7.992 ops/s
# Warmup Iteration   5: 8.222 ops/s
# Warmup Iteration   6: 8.388 ops/s
# Warmup Iteration   7: 8.337 ops/s
# Warmup Iteration   8: 8.338 ops/s
# Warmup Iteration   9: 8.342 ops/s
# Warmup Iteration  10: 8.404 ops/s
# Warmup Iteration  11: 8.454 ops/s
# Warmup Iteration  12: 8.530 ops/s
# Warmup Iteration  13: 8.459 ops/s
# Warmup Iteration  14: 8.533 ops/s
# Warmup Iteration  15: 8.486 ops/s
# Warmup Iteration  16: 8.584 ops/s
# Warmup Iteration  17: 8.555 ops/s
# Warmup Iteration  18: 8.697 ops/s
# Warmup Iteration  19: 8.625 ops/s
# Warmup Iteration  20: 8.640 ops/s
Iteration   1: 8.661 ops/s
Iteration   2: 8.652 ops/s
Iteration   3: 8.619 ops/s
Iteration   4: 8.817 ops/s
Iteration   5: 8.720 ops/s
Iteration   6: 8.772 ops/s
Iteration   7: 8.752 ops/s
Iteration   8: 8.818 ops/s
Iteration   9: 8.738 ops/s
Iteration  10: 8.881 ops/s
Iteration  11: 8.809 ops/s
Iteration  12: 8.852 ops/s
Iteration  13: 8.787 ops/s
Iteration  14: 8.933 ops/s
Iteration  15: 8.835 ops/s
Iteration  16: 8.766 ops/s
Iteration  17: 8.814 ops/s
Iteration  18: 8.903 ops/s
Iteration  19: 8.865 ops/s
Iteration  20: 8.906 ops/s


Result "metrifier.benchmark.RPCBenchmark.programComposition":
  8.771 ±(99.9%) 0.047 ops/s [Average]
  (min, avg, max) = (8.589, 8.771, 8.933), stdev = 0.083
  CI (99.9%): [8.724, 8.818] (assumes normal distribution)


# Run complete. Total time: 00:09:43

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40     9.371 ±   0.117  ops/s
RPCBenchmark.getPerson           thrpt   40  3193.378 ± 101.669  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  2259.579 ±  36.616  ops/s
RPCBenchmark.listPersons         thrpt   40  2333.681 ±  66.979  ops/s
RPCBenchmark.programComposition  thrpt   40     8.771 ±   0.047  ops/s
```

## Summary

### http

```bash
# Run complete. Total time: 00:08:59

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40     9.236 ±   0.070  ops/s
HttpBenchmark.getPerson           thrpt   40  1717.745 ± 216.141  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  1213.295 ±  84.572  ops/s
HttpBenchmark.listPersons         thrpt   40   987.634 ± 133.290  ops/s
HttpBenchmark.programComposition  thrpt   40     8.606 ±   0.108  ops/s
```


### frees-rpc

```bash
# Run complete. Total time: 00:09:43

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40     9.371 ±   0.117  ops/s
RPCBenchmark.getPerson           thrpt   40  3193.378 ± 101.669  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  2259.579 ±  36.616  ops/s
RPCBenchmark.listPersons         thrpt   40  2333.681 ±  66.979  ops/s
RPCBenchmark.programComposition  thrpt   40     8.771 ±   0.047  ops/s
```
