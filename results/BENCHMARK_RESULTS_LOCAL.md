# Benchmark Results

See [README](../README.md#running-benchmarks) for reference.

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
[info] Running (fork) org.openjdk.jmh.Main -o http-benchmark-results.txt -i 20 -wi 20 -f 2 -t 1 metrifier.benchmark.HttpBenchmark

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
# Warmup Iteration   1: 0.105 ops/s
# Warmup Iteration   2: 98.146 ops/s
# Warmup Iteration   3: 150.523 ops/s
# Warmup Iteration   4: 193.127 ops/s
# Warmup Iteration   5: 201.831 ops/s
# Warmup Iteration   6: 229.213 ops/s
# Warmup Iteration   7: 265.690 ops/s
# Warmup Iteration   8: 300.318 ops/s
# Warmup Iteration   9: 325.810 ops/s
# Warmup Iteration  10: 377.405 ops/s
# Warmup Iteration  11: 274.590 ops/s
# Warmup Iteration  12: 453.667 ops/s
# Warmup Iteration  13: 528.892 ops/s
# Warmup Iteration  14: 593.282 ops/s
# Warmup Iteration  15: 594.902 ops/s
# Warmup Iteration  16: 581.960 ops/s
# Warmup Iteration  17: 502.734 ops/s
# Warmup Iteration  18: 630.397 ops/s
# Warmup Iteration  19: 646.573 ops/s
# Warmup Iteration  20: 698.147 ops/s
Iteration   1: 716.770 ops/s
Iteration   2: 640.627 ops/s
Iteration   3: 710.789 ops/s
Iteration   4: 706.288 ops/s
Iteration   5: 621.900 ops/s
Iteration   6: 701.832 ops/s
Iteration   7: 799.806 ops/s
Iteration   8: 699.541 ops/s
Iteration   9: 691.254 ops/s
Iteration  10: 789.789 ops/s
Iteration  11: 791.610 ops/s
Iteration  12: 696.676 ops/s
Iteration  13: 774.205 ops/s
Iteration  14: 854.603 ops/s
Iteration  15: 776.280 ops/s
Iteration  16: 852.916 ops/s
Iteration  17: 927.439 ops/s
Iteration  18: 938.737 ops/s
Iteration  19: 836.584 ops/s
Iteration  20: 958.098 ops/s

# Run progress: 10.00% complete, ETA 00:08:13
# Fork: 2 of 2
# Warmup Iteration   1: 0.119 ops/s
# Warmup Iteration   2: 153.356 ops/s
# Warmup Iteration   3: 231.009 ops/s
# Warmup Iteration   4: 284.125 ops/s
# Warmup Iteration   5: 322.233 ops/s
# Warmup Iteration   6: 376.766 ops/s
# Warmup Iteration   7: 458.376 ops/s
# Warmup Iteration   8: 443.112 ops/s
# Warmup Iteration   9: 464.929 ops/s
# Warmup Iteration  10: 631.966 ops/s
# Warmup Iteration  11: 663.206 ops/s
# Warmup Iteration  12: 618.272 ops/s
# Warmup Iteration  13: 529.411 ops/s
# Warmup Iteration  14: 679.308 ops/s
# Warmup Iteration  15: 734.797 ops/s
# Warmup Iteration  16: 822.528 ops/s
# Warmup Iteration  17: 849.616 ops/s
# Warmup Iteration  18: 785.756 ops/s
# Warmup Iteration  19: 822.618 ops/s
# Warmup Iteration  20: 771.127 ops/s
Iteration   1: 661.743 ops/s
Iteration   2: 763.918 ops/s
Iteration   3: 844.760 ops/s
Iteration   4: 647.496 ops/s
Iteration   5: 688.848 ops/s
Iteration   6: 804.950 ops/s
Iteration   7: 832.085 ops/s
Iteration   8: 888.157 ops/s
Iteration   9: 859.227 ops/s
Iteration  10: 864.113 ops/s
Iteration  11: 869.696 ops/s
Iteration  12: 845.037 ops/s
Iteration  13: 858.420 ops/s
Iteration  14: 1082.050 ops/s
Iteration  15: 1176.946 ops/s
Iteration  16: 1186.448 ops/s
Iteration  17: 1276.276 ops/s
Iteration  18: 1306.230 ops/s
Iteration  19: 1232.384 ops/s
Iteration  20: 1267.566 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  861.052 ±(99.9%) 106.109 ops/s [Average]
  (min, avg, max) = (621.900, 861.052, 1306.230), stdev = 188.609
  CI (99.9%): [754.943, 967.162] (assumes normal distribution)


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

# Run progress: 20.00% complete, ETA 00:07:14
# Fork: 1 of 2
# Warmup Iteration   1: 0.136 ops/s
# Warmup Iteration   2: 166.049 ops/s
# Warmup Iteration   3: 266.763 ops/s
# Warmup Iteration   4: 318.418 ops/s
# Warmup Iteration   5: 347.499 ops/s
# Warmup Iteration   6: 461.348 ops/s
# Warmup Iteration   7: 494.589 ops/s
# Warmup Iteration   8: 606.455 ops/s
# Warmup Iteration   9: 694.390 ops/s
# Warmup Iteration  10: 910.898 ops/s
# Warmup Iteration  11: 876.455 ops/s
# Warmup Iteration  12: 803.516 ops/s
# Warmup Iteration  13: 1015.217 ops/s
# Warmup Iteration  14: 1073.062 ops/s
# Warmup Iteration  15: 1088.485 ops/s
# Warmup Iteration  16: 1116.181 ops/s
# Warmup Iteration  17: 960.667 ops/s
# Warmup Iteration  18: 1082.721 ops/s
# Warmup Iteration  19: 975.980 ops/s
# Warmup Iteration  20: 1081.493 ops/s
Iteration   1: 1153.774 ops/s
Iteration   2: 1158.449 ops/s
Iteration   3: 1263.525 ops/s
Iteration   4: 1244.730 ops/s
Iteration   5: 1440.425 ops/s
Iteration   6: 1465.721 ops/s
Iteration   7: 1483.527 ops/s
Iteration   8: 1596.471 ops/s
Iteration   9: 1846.494 ops/s
Iteration  10: 1779.183 ops/s
Iteration  11: 1580.581 ops/s
Iteration  12: 1243.928 ops/s
Iteration  13: 1752.277 ops/s
Iteration  14: 1775.425 ops/s
Iteration  15: 1847.345 ops/s
Iteration  16: 1935.540 ops/s
Iteration  17: 1833.612 ops/s
Iteration  18: 1579.313 ops/s
Iteration  19: 1955.545 ops/s
Iteration  20: 1970.927 ops/s

# Run progress: 30.00% complete, ETA 00:06:16
# Fork: 2 of 2
# Warmup Iteration   1: 0.136 ops/s
# Warmup Iteration   2: 220.112 ops/s
# Warmup Iteration   3: 355.817 ops/s
# Warmup Iteration   4: 388.559 ops/s
# Warmup Iteration   5: 433.302 ops/s
# Warmup Iteration   6: 533.506 ops/s
# Warmup Iteration   7: 613.867 ops/s
# Warmup Iteration   8: 772.323 ops/s
# Warmup Iteration   9: 954.274 ops/s
# Warmup Iteration  10: 928.452 ops/s
# Warmup Iteration  11: 816.781 ops/s
# Warmup Iteration  12: 908.460 ops/s
# Warmup Iteration  13: 848.713 ops/s
# Warmup Iteration  14: 1055.860 ops/s
# Warmup Iteration  15: 1067.474 ops/s
# Warmup Iteration  16: 956.918 ops/s
# Warmup Iteration  17: 975.666 ops/s
# Warmup Iteration  18: 1103.659 ops/s
# Warmup Iteration  19: 1029.149 ops/s
# Warmup Iteration  20: 1102.663 ops/s
Iteration   1: 1145.572 ops/s
Iteration   2: 1195.068 ops/s
Iteration   3: 1111.649 ops/s
Iteration   4: 1360.740 ops/s
Iteration   5: 1466.083 ops/s
Iteration   6: 1458.711 ops/s
Iteration   7: 1457.899 ops/s
Iteration   8: 1328.088 ops/s
Iteration   9: 1360.853 ops/s
Iteration  10: 1570.199 ops/s
Iteration  11: 1866.726 ops/s
Iteration  12: 1913.798 ops/s
Iteration  13: 1835.592 ops/s
Iteration  14: 1900.503 ops/s
Iteration  15: 1779.629 ops/s
Iteration  16: 1888.911 ops/s
Iteration  17: 1777.994 ops/s
Iteration  18: 1486.787 ops/s
Iteration  19: 1238.731 ops/s
Iteration  20: 1740.498 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  1569.770 ±(99.9%) 153.491 ops/s [Average]
  (min, avg, max) = (1111.649, 1569.770, 1970.927), stdev = 272.830
  CI (99.9%): [1416.279, 1723.262] (assumes normal distribution)


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

# Run progress: 40.00% complete, ETA 00:05:20
# Fork: 1 of 2
# Warmup Iteration   1: 0.127 ops/s
# Warmup Iteration   2: 133.964 ops/s
# Warmup Iteration   3: 235.188 ops/s
# Warmup Iteration   4: 287.141 ops/s
# Warmup Iteration   5: 278.113 ops/s
# Warmup Iteration   6: 369.914 ops/s
# Warmup Iteration   7: 424.960 ops/s
# Warmup Iteration   8: 466.827 ops/s
# Warmup Iteration   9: 587.144 ops/s
# Warmup Iteration  10: 679.659 ops/s
# Warmup Iteration  11: 562.462 ops/s
# Warmup Iteration  12: 528.188 ops/s
# Warmup Iteration  13: 593.487 ops/s
# Warmup Iteration  14: 775.641 ops/s
# Warmup Iteration  15: 837.914 ops/s
# Warmup Iteration  16: 901.631 ops/s
# Warmup Iteration  17: 902.181 ops/s
# Warmup Iteration  18: 934.633 ops/s
# Warmup Iteration  19: 813.933 ops/s
# Warmup Iteration  20: 702.363 ops/s
Iteration   1: 839.118 ops/s
Iteration   2: 949.432 ops/s
Iteration   3: 971.930 ops/s
Iteration   4: 891.191 ops/s
Iteration   5: 888.035 ops/s
Iteration   6: 924.464 ops/s
Iteration   7: 984.107 ops/s
Iteration   8: 1002.553 ops/s
Iteration   9: 997.787 ops/s
Iteration  10: 1099.398 ops/s
Iteration  11: 1219.951 ops/s
Iteration  12: 1305.103 ops/s
Iteration  13: 1437.103 ops/s
Iteration  14: 1403.908 ops/s
Iteration  15: 1427.716 ops/s
Iteration  16: 1436.999 ops/s
Iteration  17: 1389.606 ops/s
Iteration  18: 1426.446 ops/s
Iteration  19: 1333.690 ops/s
Iteration  20: 1054.519 ops/s

# Run progress: 50.00% complete, ETA 00:04:26
# Fork: 2 of 2
# Warmup Iteration   1: 0.124 ops/s
# Warmup Iteration   2: 131.402 ops/s
# Warmup Iteration   3: 223.803 ops/s
# Warmup Iteration   4: 255.692 ops/s
# Warmup Iteration   5: 296.418 ops/s
# Warmup Iteration   6: 351.933 ops/s
# Warmup Iteration   7: 373.608 ops/s
# Warmup Iteration   8: 412.541 ops/s
# Warmup Iteration   9: 520.916 ops/s
# Warmup Iteration  10: 582.616 ops/s
# Warmup Iteration  11: 599.865 ops/s
# Warmup Iteration  12: 666.855 ops/s
# Warmup Iteration  13: 634.997 ops/s
# Warmup Iteration  14: 607.536 ops/s
# Warmup Iteration  15: 645.390 ops/s
# Warmup Iteration  16: 768.752 ops/s
# Warmup Iteration  17: 756.058 ops/s
# Warmup Iteration  18: 643.105 ops/s
# Warmup Iteration  19: 623.731 ops/s
# Warmup Iteration  20: 627.083 ops/s
Iteration   1: 634.046 ops/s
Iteration   2: 635.734 ops/s
Iteration   3: 702.738 ops/s
Iteration   4: 702.972 ops/s
Iteration   5: 771.164 ops/s
Iteration   6: 904.044 ops/s
Iteration   7: 882.728 ops/s
Iteration   8: 959.369 ops/s
Iteration   9: 997.529 ops/s
Iteration  10: 969.379 ops/s
Iteration  11: 1006.758 ops/s
Iteration  12: 1097.787 ops/s
Iteration  13: 1042.602 ops/s
Iteration  14: 1045.914 ops/s
Iteration  15: 1275.916 ops/s
Iteration  16: 1260.865 ops/s
Iteration  17: 1203.953 ops/s
Iteration  18: 1360.975 ops/s
Iteration  19: 1251.758 ops/s
Iteration  20: 1201.784 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  1072.277 ±(99.9%) 131.565 ops/s [Average]
  (min, avg, max) = (634.046, 1072.277, 1437.103), stdev = 233.857
  CI (99.9%): [940.712, 1203.842] (assumes normal distribution)


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

# Run progress: 60.00% complete, ETA 00:03:33
# Fork: 1 of 2
# Warmup Iteration   1: 0.132 ops/s
# Warmup Iteration   2: 164.531 ops/s
# Warmup Iteration   3: 287.098 ops/s
# Warmup Iteration   4: 346.561 ops/s
# Warmup Iteration   5: 392.422 ops/s
# Warmup Iteration   6: 466.574 ops/s
# Warmup Iteration   7: 457.747 ops/s
# Warmup Iteration   8: 588.724 ops/s
# Warmup Iteration   9: 690.138 ops/s
# Warmup Iteration  10: 772.951 ops/s
# Warmup Iteration  11: 684.462 ops/s
# Warmup Iteration  12: 713.045 ops/s
# Warmup Iteration  13: 864.245 ops/s
# Warmup Iteration  14: 828.978 ops/s
# Warmup Iteration  15: 847.324 ops/s
# Warmup Iteration  16: 838.807 ops/s
# Warmup Iteration  17: 831.426 ops/s
# Warmup Iteration  18: 913.499 ops/s
# Warmup Iteration  19: 919.263 ops/s
# Warmup Iteration  20: 770.735 ops/s
Iteration   1: 788.506 ops/s
Iteration   2: 811.025 ops/s
Iteration   3: 902.517 ops/s
Iteration   4: 887.560 ops/s
Iteration   5: 947.753 ops/s
Iteration   6: 993.425 ops/s
Iteration   7: 899.379 ops/s
Iteration   8: 767.921 ops/s
Iteration   9: 1040.089 ops/s
Iteration  10: 1352.725 ops/s
Iteration  11: 1413.981 ops/s
Iteration  12: 1534.624 ops/s
Iteration  13: 1639.802 ops/s
Iteration  14: 1625.342 ops/s
Iteration  15: 1502.149 ops/s
Iteration  16: 1381.320 ops/s
Iteration  17: 1401.952 ops/s
Iteration  18: 1364.278 ops/s
Iteration  19: 1288.160 ops/s
Iteration  20: 1190.527 ops/s

# Run progress: 70.00% complete, ETA 00:02:39
# Fork: 2 of 2
# Warmup Iteration   1: 0.128 ops/s
# Warmup Iteration   2: 149.365 ops/s
# Warmup Iteration   3: 254.811 ops/s
# Warmup Iteration   4: 341.532 ops/s
# Warmup Iteration   5: 390.014 ops/s
# Warmup Iteration   6: 477.266 ops/s
# Warmup Iteration   7: 447.227 ops/s
# Warmup Iteration   8: 504.832 ops/s
# Warmup Iteration   9: 704.032 ops/s
# Warmup Iteration  10: 797.669 ops/s
# Warmup Iteration  11: 715.184 ops/s
# Warmup Iteration  12: 836.796 ops/s
# Warmup Iteration  13: 903.057 ops/s
# Warmup Iteration  14: 917.454 ops/s
# Warmup Iteration  15: 984.463 ops/s
# Warmup Iteration  16: 745.709 ops/s
# Warmup Iteration  17: 852.507 ops/s
# Warmup Iteration  18: 861.899 ops/s
# Warmup Iteration  19: 735.401 ops/s
# Warmup Iteration  20: 743.095 ops/s
Iteration   1: 768.882 ops/s
Iteration   2: 913.668 ops/s
Iteration   3: 960.738 ops/s
Iteration   4: 1002.675 ops/s
Iteration   5: 1008.548 ops/s
Iteration   6: 805.313 ops/s
Iteration   7: 1040.246 ops/s
Iteration   8: 965.695 ops/s
Iteration   9: 1085.362 ops/s
Iteration  10: 1250.257 ops/s
Iteration  11: 1330.564 ops/s
Iteration  12: 1323.816 ops/s
Iteration  13: 1386.685 ops/s
Iteration  14: 1505.622 ops/s
Iteration  15: 1476.758 ops/s
Iteration  16: 1485.842 ops/s
Iteration  17: 1491.053 ops/s
Iteration  18: 1446.873 ops/s
Iteration  19: 1483.167 ops/s
Iteration  20: 1400.869 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  1196.642 ±(99.9%) 153.626 ops/s [Average]
  (min, avg, max) = (767.921, 1196.642, 1639.802), stdev = 273.071
  CI (99.9%): [1043.015, 1350.268] (assumes normal distribution)


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

# Run progress: 80.00% complete, ETA 00:01:46
# Fork: 1 of 2
# Warmup Iteration   1: 0.126 ops/s
# Warmup Iteration   2: 24.820 ops/s
# Warmup Iteration   3: 38.095 ops/s
# Warmup Iteration   4: 39.602 ops/s
# Warmup Iteration   5: 51.141 ops/s
# Warmup Iteration   6: 61.553 ops/s
# Warmup Iteration   7: 65.855 ops/s
# Warmup Iteration   8: 84.342 ops/s
# Warmup Iteration   9: 93.210 ops/s
# Warmup Iteration  10: 105.216 ops/s
# Warmup Iteration  11: 99.768 ops/s
# Warmup Iteration  12: 97.838 ops/s
# Warmup Iteration  13: 95.544 ops/s
# Warmup Iteration  14: 116.726 ops/s
# Warmup Iteration  15: 115.554 ops/s
# Warmup Iteration  16: 130.424 ops/s
# Warmup Iteration  17: 115.120 ops/s
# Warmup Iteration  18: 124.321 ops/s
# Warmup Iteration  19: 142.909 ops/s
# Warmup Iteration  20: 145.010 ops/s
Iteration   1: 110.528 ops/s
Iteration   2: 123.425 ops/s
Iteration   3: 126.524 ops/s
Iteration   4: 124.235 ops/s
Iteration   5: 130.630 ops/s
Iteration   6: 159.176 ops/s
Iteration   7: 163.503 ops/s
Iteration   8: 184.231 ops/s
Iteration   9: 135.816 ops/s
Iteration  10: 135.833 ops/s
Iteration  11: 136.156 ops/s
Iteration  12: 129.846 ops/s
Iteration  13: 124.532 ops/s
Iteration  14: 159.788 ops/s
Iteration  15: 200.258 ops/s
Iteration  16: 177.197 ops/s
Iteration  17: 178.353 ops/s
Iteration  18: 151.999 ops/s
Iteration  19: 170.728 ops/s
Iteration  20: 163.605 ops/s

# Run progress: 90.00% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 0.134 ops/s
# Warmup Iteration   2: 25.393 ops/s
# Warmup Iteration   3: 41.870 ops/s
# Warmup Iteration   4: 39.793 ops/s
# Warmup Iteration   5: 44.297 ops/s
# Warmup Iteration   6: 54.802 ops/s
# Warmup Iteration   7: 61.872 ops/s
# Warmup Iteration   8: 73.355 ops/s
# Warmup Iteration   9: 82.194 ops/s
# Warmup Iteration  10: 83.752 ops/s
# Warmup Iteration  11: 91.549 ops/s
# Warmup Iteration  12: 80.906 ops/s
# Warmup Iteration  13: 97.008 ops/s
# Warmup Iteration  14: 110.968 ops/s
# Warmup Iteration  15: 108.896 ops/s
# Warmup Iteration  16: 107.333 ops/s
# Warmup Iteration  17: 99.983 ops/s
# Warmup Iteration  18: 83.325 ops/s
# Warmup Iteration  19: 131.745 ops/s
# Warmup Iteration  20: 121.780 ops/s
Iteration   1: 126.371 ops/s
Iteration   2: 115.972 ops/s
Iteration   3: 114.048 ops/s
Iteration   4: 139.942 ops/s
Iteration   5: 135.529 ops/s
Iteration   6: 165.053 ops/s
Iteration   7: 152.518 ops/s
Iteration   8: 159.108 ops/s
Iteration   9: 161.896 ops/s
Iteration  10: 193.854 ops/s
Iteration  11: 166.213 ops/s
Iteration  12: 170.312 ops/s
Iteration  13: 193.627 ops/s
Iteration  14: 166.631 ops/s
Iteration  15: 208.305 ops/s
Iteration  16: 199.590 ops/s
Iteration  17: 167.351 ops/s
Iteration  18: 176.327 ops/s
Iteration  19: 181.865 ops/s
Iteration  20: 182.826 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  156.592 ±(99.9%) 14.936 ops/s [Average]
  (min, avg, max) = (110.528, 156.592, 208.305), stdev = 26.548
  CI (99.9%): [141.657, 171.528] (assumes normal distribution)


# Run complete. Total time: 00:08:52

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40   861.052 ± 106.109  ops/s
HttpBenchmark.getPerson           thrpt   40  1569.770 ± 153.491  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  1072.277 ± 131.565  ops/s
HttpBenchmark.listPersons         thrpt   40  1196.642 ± 153.626  ops/s
HttpBenchmark.programComposition  thrpt   40   156.592 ±  14.936  ops/s
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
# Warmup Iteration   1: 0.154 ops/s
# Warmup Iteration   2: 192.381 ops/s
# Warmup Iteration   3: 260.544 ops/s
# Warmup Iteration   4: 278.862 ops/s
# Warmup Iteration   5: 280.385 ops/s
# Warmup Iteration   6: 322.644 ops/s
# Warmup Iteration   7: 393.450 ops/s
# Warmup Iteration   8: 482.318 ops/s
# Warmup Iteration   9: 597.713 ops/s
# Warmup Iteration  10: 576.653 ops/s
# Warmup Iteration  11: 610.467 ops/s
# Warmup Iteration  12: 644.982 ops/s
# Warmup Iteration  13: 826.077 ops/s
# Warmup Iteration  14: 914.673 ops/s
# Warmup Iteration  15: 984.586 ops/s
# Warmup Iteration  16: 936.530 ops/s
# Warmup Iteration  17: 974.525 ops/s
# Warmup Iteration  18: 932.816 ops/s
# Warmup Iteration  19: 963.531 ops/s
# Warmup Iteration  20: 1030.966 ops/s
Iteration   1: 1035.215 ops/s
Iteration   2: 1412.778 ops/s
Iteration   3: 1305.046 ops/s
Iteration   4: 1548.403 ops/s
Iteration   5: 2128.105 ops/s
Iteration   6: 1689.179 ops/s
Iteration   7: 2014.035 ops/s
Iteration   8: 2296.389 ops/s
Iteration   9: 2020.910 ops/s
Iteration  10: 2262.050 ops/s
Iteration  11: 2217.983 ops/s
Iteration  12: 1880.587 ops/s
Iteration  13: 2176.550 ops/s
Iteration  14: 2030.937 ops/s
Iteration  15: 2179.013 ops/s
Iteration  16: 1904.921 ops/s
Iteration  17: 1626.177 ops/s
Iteration  18: 2163.083 ops/s
Iteration  19: 1851.339 ops/s
Iteration  20: 1873.239 ops/s

# Run progress: 10.00% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 0.180 ops/s
# Warmup Iteration   2: 337.431 ops/s
# Warmup Iteration   3: 428.068 ops/s
# Warmup Iteration   4: 478.148 ops/s
# Warmup Iteration   5: 565.922 ops/s
# Warmup Iteration   6: 844.749 ops/s
# Warmup Iteration   7: 1176.693 ops/s
# Warmup Iteration   8: 1163.876 ops/s
# Warmup Iteration   9: 819.152 ops/s
# Warmup Iteration  10: 1310.639 ops/s
# Warmup Iteration  11: 1565.872 ops/s
# Warmup Iteration  12: 1566.321 ops/s
# Warmup Iteration  13: 1771.814 ops/s
# Warmup Iteration  14: 2067.244 ops/s
# Warmup Iteration  15: 2378.866 ops/s
# Warmup Iteration  16: 2297.863 ops/s
# Warmup Iteration  17: 2311.644 ops/s
# Warmup Iteration  18: 2865.944 ops/s
# Warmup Iteration  19: 2364.024 ops/s
# Warmup Iteration  20: 2235.324 ops/s
Iteration   1: 2277.146 ops/s
Iteration   2: 2093.387 ops/s
Iteration   3: 2385.067 ops/s
Iteration   4: 2630.150 ops/s
Iteration   5: 2090.534 ops/s
Iteration   6: 1702.359 ops/s
Iteration   7: 2113.904 ops/s
Iteration   8: 2271.176 ops/s
Iteration   9: 2730.623 ops/s
Iteration  10: 2675.342 ops/s
Iteration  11: 2005.980 ops/s
Iteration  12: 2398.788 ops/s
Iteration  13: 2128.959 ops/s
Iteration  14: 2162.417 ops/s
Iteration  15: 2332.151 ops/s
Iteration  16: 2837.976 ops/s
Iteration  17: 2482.643 ops/s
Iteration  18: 2575.692 ops/s
Iteration  19: 2713.262 ops/s
Iteration  20: 2871.190 ops/s


Result "metrifier.benchmark.RPCBenchmark.createPerson":
  2127.367 ±(99.9%) 230.981 ops/s [Average]
  (min, avg, max) = (1035.215, 2127.367, 2871.190), stdev = 410.568
  CI (99.9%): [1896.386, 2358.348] (assumes normal distribution)


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

# Run progress: 20.00% complete, ETA 00:07:42
# Fork: 1 of 2
# Warmup Iteration   1: 0.182 ops/s
# Warmup Iteration   2: 324.330 ops/s
# Warmup Iteration   3: 410.025 ops/s
# Warmup Iteration   4: 470.636 ops/s
# Warmup Iteration   5: 541.206 ops/s
# Warmup Iteration   6: 660.464 ops/s
# Warmup Iteration   7: 905.799 ops/s
# Warmup Iteration   8: 1194.153 ops/s
# Warmup Iteration   9: 829.156 ops/s
# Warmup Iteration  10: 721.486 ops/s
# Warmup Iteration  11: 1288.038 ops/s
# Warmup Iteration  12: 1310.757 ops/s
# Warmup Iteration  13: 1486.596 ops/s
# Warmup Iteration  14: 1319.155 ops/s
# Warmup Iteration  15: 1369.844 ops/s
# Warmup Iteration  16: 1623.704 ops/s
# Warmup Iteration  17: 1400.002 ops/s
# Warmup Iteration  18: 2251.643 ops/s
# Warmup Iteration  19: 2299.739 ops/s
# Warmup Iteration  20: 2295.519 ops/s
Iteration   1: 2874.776 ops/s
Iteration   2: 3086.769 ops/s
Iteration   3: 3337.998 ops/s
Iteration   4: 3121.565 ops/s
Iteration   5: 3093.885 ops/s
Iteration   6: 3173.111 ops/s
Iteration   7: 3003.206 ops/s
Iteration   8: 2935.255 ops/s
Iteration   9: 2635.715 ops/s
Iteration  10: 2436.850 ops/s
Iteration  11: 2383.921 ops/s
Iteration  12: 3143.103 ops/s
Iteration  13: 3230.374 ops/s
Iteration  14: 3168.783 ops/s
Iteration  15: 3007.485 ops/s
Iteration  16: 2163.478 ops/s
Iteration  17: 3004.713 ops/s
Iteration  18: 2265.449 ops/s
Iteration  19: 2613.948 ops/s
Iteration  20: 3084.343 ops/s

# Run progress: 30.00% complete, ETA 00:06:42
# Fork: 2 of 2
# Warmup Iteration   1: 0.176 ops/s
# Warmup Iteration   2: 408.947 ops/s
# Warmup Iteration   3: 581.809 ops/s
# Warmup Iteration   4: 634.802 ops/s
# Warmup Iteration   5: 796.445 ops/s
# Warmup Iteration   6: 1000.073 ops/s
# Warmup Iteration   7: 1196.927 ops/s
# Warmup Iteration   8: 1212.072 ops/s
# Warmup Iteration   9: 1518.033 ops/s
# Warmup Iteration  10: 1704.838 ops/s
# Warmup Iteration  11: 1654.255 ops/s
# Warmup Iteration  12: 1702.077 ops/s
# Warmup Iteration  13: 2212.329 ops/s
# Warmup Iteration  14: 2084.896 ops/s
# Warmup Iteration  15: 2283.804 ops/s
# Warmup Iteration  16: 2214.941 ops/s
# Warmup Iteration  17: 2852.636 ops/s
# Warmup Iteration  18: 2694.319 ops/s
# Warmup Iteration  19: 3011.359 ops/s
# Warmup Iteration  20: 3202.431 ops/s
Iteration   1: 2895.884 ops/s
Iteration   2: 2777.869 ops/s
Iteration   3: 2711.071 ops/s
Iteration   4: 3002.440 ops/s
Iteration   5: 3173.874 ops/s
Iteration   6: 3122.955 ops/s
Iteration   7: 3123.562 ops/s
Iteration   8: 3168.717 ops/s
Iteration   9: 3118.827 ops/s
Iteration  10: 3060.872 ops/s
Iteration  11: 3162.299 ops/s
Iteration  12: 2801.870 ops/s
Iteration  13: 3064.543 ops/s
Iteration  14: 3061.916 ops/s
Iteration  15: 2709.526 ops/s
Iteration  16: 3117.510 ops/s
Iteration  17: 2209.893 ops/s
Iteration  18: 2066.080 ops/s
Iteration  19: 2183.551 ops/s
Iteration  20: 2063.038 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPerson":
  2859.026 ±(99.9%) 205.242 ops/s [Average]
  (min, avg, max) = (2063.038, 2859.026, 3337.998), stdev = 364.817
  CI (99.9%): [2653.784, 3064.268] (assumes normal distribution)


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

# Run progress: 40.00% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 0.180 ops/s
# Warmup Iteration   2: 291.306 ops/s
# Warmup Iteration   3: 434.144 ops/s
# Warmup Iteration   4: 511.565 ops/s
# Warmup Iteration   5: 531.509 ops/s
# Warmup Iteration   6: 579.052 ops/s
# Warmup Iteration   7: 912.678 ops/s
# Warmup Iteration   8: 1054.999 ops/s
# Warmup Iteration   9: 1040.767 ops/s
# Warmup Iteration  10: 953.222 ops/s
# Warmup Iteration  11: 1224.156 ops/s
# Warmup Iteration  12: 1349.741 ops/s
# Warmup Iteration  13: 1387.215 ops/s
# Warmup Iteration  14: 1471.958 ops/s
# Warmup Iteration  15: 1487.068 ops/s
# Warmup Iteration  16: 1809.709 ops/s
# Warmup Iteration  17: 1852.433 ops/s
# Warmup Iteration  18: 1524.875 ops/s
# Warmup Iteration  19: 1779.094 ops/s
# Warmup Iteration  20: 1872.224 ops/s
Iteration   1: 1623.525 ops/s
Iteration   2: 1637.059 ops/s
Iteration   3: 1437.481 ops/s
Iteration   4: 1328.963 ops/s
Iteration   5: 1525.311 ops/s
Iteration   6: 1840.821 ops/s
Iteration   7: 1870.783 ops/s
Iteration   8: 2040.122 ops/s
Iteration   9: 1883.969 ops/s
Iteration  10: 2032.336 ops/s
Iteration  11: 1983.127 ops/s
Iteration  12: 2160.460 ops/s
Iteration  13: 2090.215 ops/s
Iteration  14: 2053.201 ops/s
Iteration  15: 1950.753 ops/s
Iteration  16: 1861.109 ops/s
Iteration  17: 1968.809 ops/s
Iteration  18: 2097.212 ops/s
Iteration  19: 1739.551 ops/s
Iteration  20: 1734.083 ops/s

# Run progress: 50.00% complete, ETA 00:04:47
# Fork: 2 of 2
# Warmup Iteration   1: 0.180 ops/s
# Warmup Iteration   2: 304.170 ops/s
# Warmup Iteration   3: 332.257 ops/s
# Warmup Iteration   4: 488.218 ops/s
# Warmup Iteration   5: 661.410 ops/s
# Warmup Iteration   6: 813.314 ops/s
# Warmup Iteration   7: 970.517 ops/s
# Warmup Iteration   8: 1070.327 ops/s
# Warmup Iteration   9: 1083.941 ops/s
# Warmup Iteration  10: 1024.556 ops/s
# Warmup Iteration  11: 1312.638 ops/s
# Warmup Iteration  12: 1131.589 ops/s
# Warmup Iteration  13: 1177.159 ops/s
# Warmup Iteration  14: 1402.716 ops/s
# Warmup Iteration  15: 1178.328 ops/s
# Warmup Iteration  16: 1741.737 ops/s
# Warmup Iteration  17: 1655.404 ops/s
# Warmup Iteration  18: 1716.449 ops/s
# Warmup Iteration  19: 1823.442 ops/s
# Warmup Iteration  20: 1750.450 ops/s
Iteration   1: 1954.201 ops/s
Iteration   2: 2022.508 ops/s
Iteration   3: 2045.386 ops/s
Iteration   4: 2056.562 ops/s
Iteration   5: 1847.823 ops/s
Iteration   6: 1723.506 ops/s
Iteration   7: 2113.454 ops/s
Iteration   8: 2032.263 ops/s
Iteration   9: 2066.021 ops/s
Iteration  10: 2065.615 ops/s
Iteration  11: 2085.478 ops/s
Iteration  12: 1977.578 ops/s
Iteration  13: 2096.920 ops/s
Iteration  14: 2077.126 ops/s
Iteration  15: 2010.020 ops/s
Iteration  16: 1544.918 ops/s
Iteration  17: 1995.743 ops/s
Iteration  18: 1882.912 ops/s
Iteration  19: 1584.066 ops/s
Iteration  20: 1311.266 ops/s


Result "metrifier.benchmark.RPCBenchmark.getPersonLinks":
  1883.806 ±(99.9%) 127.808 ops/s [Average]
  (min, avg, max) = (1311.266, 1883.806, 2160.460), stdev = 227.178
  CI (99.9%): [1755.999, 2011.614] (assumes normal distribution)


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

# Run progress: 60.00% complete, ETA 00:03:49
# Fork: 1 of 2
# Warmup Iteration   1: 0.181 ops/s
# Warmup Iteration   2: 380.089 ops/s
# Warmup Iteration   3: 445.259 ops/s
# Warmup Iteration   4: 510.666 ops/s
# Warmup Iteration   5: 670.775 ops/s
# Warmup Iteration   6: 909.701 ops/s
# Warmup Iteration   7: 1235.208 ops/s
# Warmup Iteration   8: 1258.107 ops/s
# Warmup Iteration   9: 1359.628 ops/s
# Warmup Iteration  10: 1444.454 ops/s
# Warmup Iteration  11: 1381.628 ops/s
# Warmup Iteration  12: 1032.360 ops/s
# Warmup Iteration  13: 980.337 ops/s
# Warmup Iteration  14: 1458.340 ops/s
# Warmup Iteration  15: 1722.351 ops/s
# Warmup Iteration  16: 1644.471 ops/s
# Warmup Iteration  17: 1585.762 ops/s
# Warmup Iteration  18: 1918.516 ops/s
# Warmup Iteration  19: 1320.907 ops/s
# Warmup Iteration  20: 1345.907 ops/s
Iteration   1: 1213.685 ops/s
Iteration   2: 1777.066 ops/s
Iteration   3: 1483.956 ops/s
Iteration   4: 1433.393 ops/s
Iteration   5: 1262.279 ops/s
Iteration   6: 1360.825 ops/s
Iteration   7: 1259.882 ops/s
Iteration   8: 1498.685 ops/s
Iteration   9: 2081.052 ops/s
Iteration  10: 2202.749 ops/s
Iteration  11: 1820.549 ops/s
Iteration  12: 1992.385 ops/s
Iteration  13: 1612.698 ops/s
Iteration  14: 1857.307 ops/s
Iteration  15: 1699.988 ops/s
Iteration  16: 2191.358 ops/s
Iteration  17: 2014.671 ops/s
Iteration  18: 2031.415 ops/s
Iteration  19: 2028.513 ops/s
Iteration  20: 2242.841 ops/s

# Run progress: 70.00% complete, ETA 00:02:51
# Fork: 2 of 2
# Warmup Iteration   1: 0.179 ops/s
# Warmup Iteration   2: 319.701 ops/s
# Warmup Iteration   3: 437.906 ops/s
# Warmup Iteration   4: 576.166 ops/s
# Warmup Iteration   5: 657.651 ops/s
# Warmup Iteration   6: 854.376 ops/s
# Warmup Iteration   7: 1091.921 ops/s
# Warmup Iteration   8: 1213.127 ops/s
# Warmup Iteration   9: 1240.434 ops/s
# Warmup Iteration  10: 1278.139 ops/s
# Warmup Iteration  11: 1330.209 ops/s
# Warmup Iteration  12: 1568.145 ops/s
# Warmup Iteration  13: 1687.060 ops/s
# Warmup Iteration  14: 1652.584 ops/s
# Warmup Iteration  15: 1439.405 ops/s
# Warmup Iteration  16: 1645.078 ops/s
# Warmup Iteration  17: 1787.699 ops/s
# Warmup Iteration  18: 2203.023 ops/s
# Warmup Iteration  19: 1716.569 ops/s
# Warmup Iteration  20: 1906.861 ops/s
Iteration   1: 1728.809 ops/s
Iteration   2: 1631.305 ops/s
Iteration   3: 1485.830 ops/s
Iteration   4: 1536.760 ops/s
Iteration   5: 1520.312 ops/s
Iteration   6: 1345.151 ops/s
Iteration   7: 1700.131 ops/s
Iteration   8: 1764.998 ops/s
Iteration   9: 1982.751 ops/s
Iteration  10: 1967.028 ops/s
Iteration  11: 1991.093 ops/s
Iteration  12: 2260.526 ops/s
Iteration  13: 1908.764 ops/s
Iteration  14: 1562.790 ops/s
Iteration  15: 1667.919 ops/s
Iteration  16: 1732.664 ops/s
Iteration  17: 2008.773 ops/s
Iteration  18: 1798.641 ops/s
Iteration  19: 1753.723 ops/s
Iteration  20: 2070.622 ops/s


Result "metrifier.benchmark.RPCBenchmark.listPersons":
  1762.097 ±(99.9%) 161.918 ops/s [Average]
  (min, avg, max) = (1213.685, 1762.097, 2260.526), stdev = 287.810
  CI (99.9%): [1600.179, 1924.016] (assumes normal distribution)


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

# Run progress: 80.00% complete, ETA 00:01:54
# Fork: 1 of 2
# Warmup Iteration   1: 0.178 ops/s
# Warmup Iteration   2: 51.168 ops/s
# Warmup Iteration   3: 72.666 ops/s
# Warmup Iteration   4: 71.528 ops/s
# Warmup Iteration   5: 100.306 ops/s
# Warmup Iteration   6: 132.851 ops/s
# Warmup Iteration   7: 148.004 ops/s
# Warmup Iteration   8: 150.284 ops/s
# Warmup Iteration   9: 148.301 ops/s
# Warmup Iteration  10: 206.374 ops/s
# Warmup Iteration  11: 194.166 ops/s
# Warmup Iteration  12: 163.520 ops/s
# Warmup Iteration  13: 208.996 ops/s
# Warmup Iteration  14: 225.412 ops/s
# Warmup Iteration  15: 234.367 ops/s
# Warmup Iteration  16: 226.385 ops/s
# Warmup Iteration  17: 268.805 ops/s
# Warmup Iteration  18: 235.852 ops/s
# Warmup Iteration  19: 286.356 ops/s
# Warmup Iteration  20: 284.620 ops/s
Iteration   1: 254.959 ops/s
Iteration   2: 190.810 ops/s
Iteration   3: 246.704 ops/s
Iteration   4: 250.271 ops/s
Iteration   5: 267.229 ops/s
Iteration   6: 231.565 ops/s
Iteration   7: 276.484 ops/s
Iteration   8: 268.814 ops/s
Iteration   9: 266.663 ops/s
Iteration  10: 288.768 ops/s
Iteration  11: 268.739 ops/s
Iteration  12: 248.626 ops/s
Iteration  13: 249.413 ops/s
Iteration  14: 256.208 ops/s
Iteration  15: 287.790 ops/s
Iteration  16: 289.582 ops/s
Iteration  17: 278.557 ops/s
Iteration  18: 259.286 ops/s
Iteration  19: 291.819 ops/s
Iteration  20: 309.163 ops/s

# Run progress: 90.00% complete, ETA 00:00:57
# Fork: 2 of 2
# Warmup Iteration   1: 0.179 ops/s
# Warmup Iteration   2: 50.884 ops/s
# Warmup Iteration   3: 72.350 ops/s
# Warmup Iteration   4: 88.128 ops/s
# Warmup Iteration   5: 115.737 ops/s
# Warmup Iteration   6: 144.979 ops/s
# Warmup Iteration   7: 136.735 ops/s
# Warmup Iteration   8: 123.185 ops/s
# Warmup Iteration   9: 164.147 ops/s
# Warmup Iteration  10: 201.256 ops/s
# Warmup Iteration  11: 194.580 ops/s
# Warmup Iteration  12: 208.549 ops/s
# Warmup Iteration  13: 260.943 ops/s
# Warmup Iteration  14: 260.571 ops/s
# Warmup Iteration  15: 270.563 ops/s
# Warmup Iteration  16: 304.469 ops/s
# Warmup Iteration  17: 305.088 ops/s
# Warmup Iteration  18: 320.412 ops/s
# Warmup Iteration  19: 297.664 ops/s
# Warmup Iteration  20: 304.921 ops/s
Iteration   1: 309.533 ops/s
Iteration   2: 265.964 ops/s
Iteration   3: 259.553 ops/s
Iteration   4: 319.399 ops/s
Iteration   5: 297.845 ops/s
Iteration   6: 314.970 ops/s
Iteration   7: 246.227 ops/s
Iteration   8: 271.487 ops/s
Iteration   9: 285.937 ops/s
Iteration  10: 247.245 ops/s
Iteration  11: 244.618 ops/s
Iteration  12: 276.502 ops/s
Iteration  13: 332.911 ops/s
Iteration  14: 339.844 ops/s
Iteration  15: 319.634 ops/s
Iteration  16: 304.013 ops/s
Iteration  17: 282.037 ops/s
Iteration  18: 208.240 ops/s
Iteration  19: 220.542 ops/s
Iteration  20: 266.379 ops/s


Result "metrifier.benchmark.RPCBenchmark.programComposition":
  272.358 ±(99.9%) 18.218 ops/s [Average]
  (min, avg, max) = (190.810, 272.358, 339.844), stdev = 32.382
  CI (99.9%): [254.141, 290.576] (assumes normal distribution)


# Run complete. Total time: 00:09:32

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  2127.367 ± 230.981  ops/s
RPCBenchmark.getPerson           thrpt   40  2859.026 ± 205.242  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  1883.806 ± 127.808  ops/s
RPCBenchmark.listPersons         thrpt   40  1762.097 ± 161.918  ops/s
RPCBenchmark.programComposition  thrpt   40   272.358 ±  18.218  ops/s
```

## Summary

### http

```bash
# Run complete. Total time: 00:08:52

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40   861.052 ± 106.109  ops/s
HttpBenchmark.getPerson           thrpt   40  1569.770 ± 153.491  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  1072.277 ± 131.565  ops/s
HttpBenchmark.listPersons         thrpt   40  1196.642 ± 153.626  ops/s
HttpBenchmark.programComposition  thrpt   40   156.592 ±  14.936  ops/s
```


### frees-rpc

```bash
# Run complete. Total time: 00:09:32

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  2127.367 ± 230.981  ops/s
RPCBenchmark.getPerson           thrpt   40  2859.026 ± 205.242  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  1883.806 ± 127.808  ops/s
RPCBenchmark.listPersons         thrpt   40  1762.097 ± 161.918  ops/s
RPCBenchmark.programComposition  thrpt   40   272.358 ±  18.218  ops/s
```
