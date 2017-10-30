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
[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.HttpBenchmark.createPerson
[info] # Run progress: 0.00% complete, ETA 00:03:20
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.135 ops/s
[info] # Warmup Iteration   2: 8.458 ops/s
[info] # Warmup Iteration   3: 8.824 ops/s
[info] # Warmup Iteration   4: 7.620 ops/s
[info] # Warmup Iteration   5: 8.978 ops/s
[info] # Warmup Iteration   6: 8.757 ops/s
[info] # Warmup Iteration   7: 9.042 ops/s
[info] # Warmup Iteration   8: 9.103 ops/s
[info] # Warmup Iteration   9: 9.018 ops/s
[info] # Warmup Iteration  10: 9.092 ops/s
[info] Iteration   1: 9.132 ops/s
[info] Iteration   2: 9.176 ops/s
[info] Iteration   3: 9.061 ops/s
[info] Iteration   4: 9.095 ops/s
[info] Iteration   5: 9.135 ops/s
[info] Iteration   6: 9.156 ops/s
[info] Iteration   7: 9.193 ops/s
[info] Iteration   8: 9.137 ops/s
[info] Iteration   9: 9.184 ops/s
[info] Iteration  10: 9.256 ops/s
[info] # Run progress: 10.00% complete, ETA 00:05:05
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.146 ops/s
[info] # Warmup Iteration   2: 8.756 ops/s
[info] # Warmup Iteration   3: 7.633 ops/s
[info] # Warmup Iteration   4: 8.979 ops/s
[info] # Warmup Iteration   5: 9.147 ops/s
[info] # Warmup Iteration   6: 9.064 ops/s
[info] # Warmup Iteration   7: 9.181 ops/s
[info] # Warmup Iteration   8: 9.161 ops/s
[info] # Warmup Iteration   9: 9.045 ops/s
[info] # Warmup Iteration  10: 9.168 ops/s
[info] Iteration   1: 9.174 ops/s
[info] Iteration   2: 9.169 ops/s
[info] Iteration   3: 9.255 ops/s
[info] Iteration   4: 9.147 ops/s
[info] Iteration   5: 9.120 ops/s
[info] Iteration   6: 9.271 ops/s
[info] Iteration   7: 9.213 ops/s
[info] Iteration   8: 9.269 ops/s
[info] Iteration   9: 9.220 ops/s
[info] Iteration  10: 9.205 ops/s
[info] Result "metrifier.benchmark.HttpBenchmark.createPerson":
[info]   9.178 ±(99.9%) 0.050 ops/s [Average]
[info]   (min, avg, max) = (9.061, 9.178, 9.271), stdev = 0.058
[info]   CI (99.9%): [9.128, 9.229] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.HttpBenchmark.getPerson
[info] # Run progress: 20.00% complete, ETA 00:04:28
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.146 ops/s
[info] # Warmup Iteration   2: 219.184 ops/s
[info] # Warmup Iteration   3: 334.887 ops/s
[info] # Warmup Iteration   4: 354.014 ops/s
[info] # Warmup Iteration   5: 409.010 ops/s
[info] # Warmup Iteration   6: 473.887 ops/s
[info] # Warmup Iteration   7: 583.699 ops/s
[info] # Warmup Iteration   8: 693.049 ops/s
[info] # Warmup Iteration   9: 806.414 ops/s
[info] # Warmup Iteration  10: 991.595 ops/s
[info] Iteration   1: 856.217 ops/s
[info] Iteration   2: 1017.451 ops/s
[info] Iteration   3: 1178.473 ops/s
[info] Iteration   4: 1148.082 ops/s
[info] Iteration   5: 1320.677 ops/s
[info] Iteration   6: 1349.948 ops/s
[info] Iteration   7: 963.800 ops/s
[info] Iteration   8: 1232.866 ops/s
[info] Iteration   9: 1555.631 ops/s
[info] Iteration  10: 1687.265 ops/s
[info] # Run progress: 30.00% complete, ETA 00:03:51
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.150 ops/s
[info] # Warmup Iteration   2: 329.262 ops/s
[info] # Warmup Iteration   3: 475.157 ops/s
[info] # Warmup Iteration   4: 579.429 ops/s
[info] # Warmup Iteration   5: 730.202 ops/s
[info] # Warmup Iteration   6: 934.398 ops/s
[info] # Warmup Iteration   7: 1208.693 ops/s
[info] # Warmup Iteration   8: 1219.484 ops/s
[info] # Warmup Iteration   9: 1320.199 ops/s
[info] # Warmup Iteration  10: 1516.313 ops/s
[info] Iteration   1: 1579.863 ops/s
[info] Iteration   2: 1428.697 ops/s
[info] Iteration   3: 1378.384 ops/s
[info] Iteration   4: 1819.030 ops/s
[info] Iteration   5: 1836.729 ops/s
[info] Iteration   6: 2168.417 ops/s
[info] Iteration   7: 2163.157 ops/s
[info] Iteration   8: 2787.835 ops/s
[info] Iteration   9: 2983.657 ops/s
[info] Iteration  10: 3151.549 ops/s
[info] Result "metrifier.benchmark.HttpBenchmark.getPerson":
[info]   1680.386 ±(99.9%) 577.062 ops/s [Average]
[info]   (min, avg, max) = (856.217, 1680.386, 3151.549), stdev = 664.546
[info]   CI (99.9%): [1103.324, 2257.449] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.HttpBenchmark.getPersonLinks
[info] # Run progress: 40.00% complete, ETA 00:03:15
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.145 ops/s
[info] # Warmup Iteration   2: 173.939 ops/s
[info] # Warmup Iteration   3: 386.565 ops/s
[info] # Warmup Iteration   4: 406.309 ops/s
[info] # Warmup Iteration   5: 516.973 ops/s
[info] # Warmup Iteration   6: 503.130 ops/s
[info] # Warmup Iteration   7: 736.516 ops/s
[info] # Warmup Iteration   8: 927.944 ops/s
[info] # Warmup Iteration   9: 884.460 ops/s
[info] # Warmup Iteration  10: 977.713 ops/s
[info] Iteration   1: 1146.142 ops/s
[info] Iteration   2: 1158.693 ops/s
[info] Iteration   3: 1212.162 ops/s
[info] Iteration   4: 1281.472 ops/s
[info] Iteration   5: 1062.814 ops/s
[info] Iteration   6: 1098.647 ops/s
[info] Iteration   7: 1323.317 ops/s
[info] Iteration   8: 1274.534 ops/s
[info] Iteration   9: 1461.539 ops/s
[info] Iteration  10: 1477.062 ops/s
[info] # Run progress: 50.00% complete, ETA 00:02:42
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.148 ops/s
[info] # Warmup Iteration   2: 277.126 ops/s
[info] # Warmup Iteration   3: 459.242 ops/s
[info] # Warmup Iteration   4: 570.147 ops/s
[info] # Warmup Iteration   5: 661.871 ops/s
[info] # Warmup Iteration   6: 872.458 ops/s
[info] # Warmup Iteration   7: 1136.678 ops/s
[info] # Warmup Iteration   8: 1123.677 ops/s
[info] # Warmup Iteration   9: 1249.813 ops/s
[info] # Warmup Iteration  10: 1210.197 ops/s
[info] Iteration   1: 1295.259 ops/s
[info] Iteration   2: 1305.222 ops/s
[info] Iteration   3: 1143.589 ops/s
[info] Iteration   4: 1343.722 ops/s
[info] Iteration   5: 1407.266 ops/s
[info] Iteration   6: 1451.507 ops/s
[info] Iteration   7: 1501.891 ops/s
[info] Iteration   8: 1550.315 ops/s
[info] Iteration   9: 1605.301 ops/s
[info] Iteration  10: 1892.867 ops/s
[info] Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
[info]   1349.666 ±(99.9%) 174.447 ops/s [Average]
[info]   (min, avg, max) = (1062.814, 1349.666, 1892.867), stdev = 200.894
[info]   CI (99.9%): [1175.219, 1524.113] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.HttpBenchmark.listPersons
[info] # Run progress: 60.00% complete, ETA 00:02:09
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.147 ops/s
[info] # Warmup Iteration   2: 256.568 ops/s
[info] # Warmup Iteration   3: 409.377 ops/s
[info] # Warmup Iteration   4: 547.208 ops/s
[info] # Warmup Iteration   5: 638.751 ops/s
[info] # Warmup Iteration   6: 797.983 ops/s
[info] # Warmup Iteration   7: 1180.725 ops/s
[info] # Warmup Iteration   8: 1115.868 ops/s
[info] # Warmup Iteration   9: 1285.521 ops/s
[info] # Warmup Iteration  10: 1440.581 ops/s
[info] Iteration   1: 1498.751 ops/s
[info] Iteration   2: 1312.158 ops/s
[info] Iteration   3: 1302.480 ops/s
[info] Iteration   4: 1660.756 ops/s
[info] Iteration   5: 1654.316 ops/s
[info] Iteration   6: 1803.941 ops/s
[info] Iteration   7: 1714.078 ops/s
[info] Iteration   8: 2116.506 ops/s
[info] Iteration   9: 2447.021 ops/s
[info] Iteration  10: 2668.111 ops/s
[info] # Run progress: 70.00% complete, ETA 00:01:36
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.149 ops/s
[info] # Warmup Iteration   2: 299.459 ops/s
[info] # Warmup Iteration   3: 445.946 ops/s
[info] # Warmup Iteration   4: 575.267 ops/s
[info] # Warmup Iteration   5: 693.457 ops/s
[info] # Warmup Iteration   6: 924.626 ops/s
[info] # Warmup Iteration   7: 1246.228 ops/s
[info] # Warmup Iteration   8: 1148.598 ops/s
[info] # Warmup Iteration   9: 1353.673 ops/s
[info] # Warmup Iteration  10: 1533.637 ops/s
[info] Iteration   1: 1550.425 ops/s
[info] Iteration   2: 1128.220 ops/s
[info] Iteration   3: 1522.350 ops/s
[info] Iteration   4: 1513.943 ops/s
[info] Iteration   5: 1622.364 ops/s
[info] Iteration   6: 1601.407 ops/s
[info] Iteration   7: 1820.978 ops/s
[info] Iteration   8: 2071.804 ops/s
[info] Iteration   9: 2540.159 ops/s
[info] Iteration  10: 2682.227 ops/s
[info] Result "metrifier.benchmark.HttpBenchmark.listPersons":
[info]   1811.600 ±(99.9%) 400.316 ops/s [Average]
[info]   (min, avg, max) = (1128.220, 1811.600, 2682.227), stdev = 461.005
[info]   CI (99.9%): [1411.284, 2211.916] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.HttpBenchmark.programComposition
[info] # Run progress: 80.00% complete, ETA 00:01:04
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.144 ops/s
[info] # Warmup Iteration   2: 7.200 ops/s
[info] # Warmup Iteration   3: 7.551 ops/s
[info] # Warmup Iteration   4: 7.937 ops/s
[info] # Warmup Iteration   5: 7.937 ops/s
[info] # Warmup Iteration   6: 7.920 ops/s
[info] # Warmup Iteration   7: 8.141 ops/s
[info] # Warmup Iteration   8: 8.317 ops/s
[info] # Warmup Iteration   9: 8.314 ops/s
[info] # Warmup Iteration  10: 8.401 ops/s
[info] Iteration   1: 8.430 ops/s
[info] Iteration   2: 8.321 ops/s
[info] Iteration   3: 8.318 ops/s
[info] Iteration   4: 8.360 ops/s
[info] Iteration   5: 8.445 ops/s
[info] Iteration   6: 8.481 ops/s
[info] Iteration   7: 8.511 ops/s
[info] Iteration   8: 8.537 ops/s
[info] Iteration   9: 8.548 ops/s
[info] Iteration  10: 8.616 ops/s
[info] # Run progress: 90.00% complete, ETA 00:00:32
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.144 ops/s
[info] # Warmup Iteration   2: 7.249 ops/s
[info] # Warmup Iteration   3: 7.670 ops/s
[info] # Warmup Iteration   4: 8.055 ops/s
[info] # Warmup Iteration   5: 8.061 ops/s
[info] # Warmup Iteration   6: 8.186 ops/s
[info] # Warmup Iteration   7: 8.213 ops/s
[info] # Warmup Iteration   8: 8.367 ops/s
[info] # Warmup Iteration   9: 8.340 ops/s
[info] # Warmup Iteration  10: 8.434 ops/s
[info] Iteration   1: 8.511 ops/s
[info] Iteration   2: 8.471 ops/s
[info] Iteration   3: 8.410 ops/s
[info] Iteration   4: 8.353 ops/s
[info] Iteration   5: 8.580 ops/s
[info] Iteration   6: 8.595 ops/s
[info] Iteration   7: 8.608 ops/s
[info] Iteration   8: 8.619 ops/s
[info] Iteration   9: 8.500 ops/s
[info] Iteration  10: 8.628 ops/s
[info] Result "metrifier.benchmark.HttpBenchmark.programComposition":
[info]   8.492 ±(99.9%) 0.089 ops/s [Average]
[info]   (min, avg, max) = (8.318, 8.492, 8.628), stdev = 0.102
[info]   CI (99.9%): [8.404, 8.581] (assumes normal distribution)

[info] # Run complete. Total time: 00:05:23
[info] Benchmark                          Mode  Cnt     Score     Error  Units
[info] HttpBenchmark.createPerson        thrpt   20     9.178 ±   0.050  ops/s
[info] HttpBenchmark.getPerson           thrpt   20  1680.386 ± 577.062  ops/s
[info] HttpBenchmark.getPersonLinks      thrpt   20  1349.666 ± 174.447  ops/s
[info] HttpBenchmark.listPersons         thrpt   20  1811.600 ± 400.316  ops/s
[info] HttpBenchmark.programComposition  thrpt   20     8.492 ±   0.089  ops/s
```

## jmh - frees-rpc

```bash
[info] Running (fork) org.openjdk.jmh.Main -i 20 -wi 20 -f 2 -t 1 metrifier.benchmark.RPCBenchmark
[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.RPCBenchmark.createPerson
[info] # Run progress: 0.00% complete, ETA 00:03:20
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.087 ops/s
[info] # Warmup Iteration   2: 8.928 ops/s
[info] # Warmup Iteration   3: 9.133 ops/s
[info] # Warmup Iteration   4: 9.098 ops/s
[info] # Warmup Iteration   5: 9.235 ops/s
[info] # Warmup Iteration   6: 9.159 ops/s
[info] # Warmup Iteration   7: 9.216 ops/s
[info] # Warmup Iteration   8: 9.254 ops/s
[info] # Warmup Iteration   9: 9.197 ops/s
[info] # Warmup Iteration  10: 9.265 ops/s
[info] Iteration   1: 9.260 ops/s
[info] Iteration   2: 9.333 ops/s
[info] Iteration   3: 9.240 ops/s
[info] Iteration   4: 9.240 ops/s
[info] Iteration   5: 9.305 ops/s
[info] Iteration   6: 9.247 ops/s
[info] Iteration   7: 9.297 ops/s
[info] Iteration   8: 9.251 ops/s
[info] Iteration   9: 9.331 ops/s
[info] Iteration  10: 9.271 ops/s
[info] # Run progress: 10.00% complete, ETA 00:05:42
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.088 ops/s
[info] # Warmup Iteration   2: 9.033 ops/s
[info] # Warmup Iteration   3: 9.185 ops/s
[info] # Warmup Iteration   4: 9.254 ops/s
[info] # Warmup Iteration   5: 9.267 ops/s
[info] # Warmup Iteration   6: 9.289 ops/s
[info] # Warmup Iteration   7: 9.276 ops/s
[info] # Warmup Iteration   8: 9.292 ops/s
[info] # Warmup Iteration   9: 9.405 ops/s
[info] # Warmup Iteration  10: 9.332 ops/s
[info] Iteration   1: 9.249 ops/s
[info] Iteration   2: 9.290 ops/s
[info] Iteration   3: 9.334 ops/s
[info] Iteration   4: 9.375 ops/s
[info] Iteration   5: 9.408 ops/s
[info] Iteration   6: 9.268 ops/s
[info] Iteration   7: 9.358 ops/s
[info] Iteration   8: 9.259 ops/s
[info] Iteration   9: 9.365 ops/s
[info] Iteration  10: 9.285 ops/s
[info] Result "metrifier.benchmark.RPCBenchmark.createPerson":
[info]   9.298 ±(99.9%) 0.044 ops/s [Average]
[info]   (min, avg, max) = (9.240, 9.298, 9.408), stdev = 0.050
[info]   CI (99.9%): [9.254, 9.342] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.RPCBenchmark.getPerson
[info] # Run progress: 20.00% complete, ETA 00:05:02
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.089 ops/s
[info] # Warmup Iteration   2: 335.667 ops/s
[info] # Warmup Iteration   3: 425.636 ops/s
[info] # Warmup Iteration   4: 507.482 ops/s
[info] # Warmup Iteration   5: 607.567 ops/s
[info] # Warmup Iteration   6: 739.196 ops/s
[info] # Warmup Iteration   7: 1018.982 ops/s
[info] # Warmup Iteration   8: 1210.378 ops/s
[info] # Warmup Iteration   9: 1032.442 ops/s
[info] # Warmup Iteration  10: 1505.626 ops/s
[info] Iteration   1: 1414.794 ops/s
[info] Iteration   2: 1558.914 ops/s
[info] Iteration   3: 1983.469 ops/s
[info] Iteration   4: 2057.577 ops/s
[info] Iteration   5: 2774.966 ops/s
[info] Iteration   6: 2782.472 ops/s
[info] Iteration   7: 4085.283 ops/s
[info] Iteration   8: 4112.476 ops/s
[info] Iteration   9: 4297.841 ops/s
[info] Iteration  10: 4361.512 ops/s
[info] # Run progress: 30.00% complete, ETA 00:04:20
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.089 ops/s
[info] # Warmup Iteration   2: 506.440 ops/s
[info] # Warmup Iteration   3: 776.901 ops/s
[info] # Warmup Iteration   4: 841.528 ops/s
[info] # Warmup Iteration   5: 1240.139 ops/s
[info] # Warmup Iteration   6: 1804.451 ops/s
[info] # Warmup Iteration   7: 1637.576 ops/s
[info] # Warmup Iteration   8: 2329.147 ops/s
[info] # Warmup Iteration   9: 2211.617 ops/s
[info] # Warmup Iteration  10: 2505.123 ops/s
[info] Iteration   1: 2864.172 ops/s
[info] Iteration   2: 2927.036 ops/s
[info] Iteration   3: 4266.366 ops/s
[info] Iteration   4: 4495.163 ops/s
[info] Iteration   5: 4587.056 ops/s
[info] Iteration   6: 4479.009 ops/s
[info] Iteration   7: 4432.784 ops/s
[info] Iteration   8: 4393.625 ops/s
[info] Iteration   9: 4469.990 ops/s
[info] Iteration  10: 4545.855 ops/s
[info] Result "metrifier.benchmark.RPCBenchmark.getPerson":
[info]   3544.518 ±(99.9%) 970.798 ops/s [Average]
[info]   (min, avg, max) = (1414.794, 3544.518, 4587.056), stdev = 1117.973
[info]   CI (99.9%): [2573.720, 4515.316] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.RPCBenchmark.getPersonLinks
[info] # Run progress: 40.00% complete, ETA 00:03:41
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.089 ops/s
[info] # Warmup Iteration   2: 428.856 ops/s
[info] # Warmup Iteration   3: 546.378 ops/s
[info] # Warmup Iteration   4: 732.654 ops/s
[info] # Warmup Iteration   5: 997.706 ops/s
[info] # Warmup Iteration   6: 1524.494 ops/s
[info] # Warmup Iteration   7: 1673.672 ops/s
[info] # Warmup Iteration   8: 1777.518 ops/s
[info] # Warmup Iteration   9: 1967.263 ops/s
[info] # Warmup Iteration  10: 1826.859 ops/s
[info] Iteration   1: 2267.142 ops/s
[info] Iteration   2: 2175.704 ops/s
[info] Iteration   3: 2155.522 ops/s
[info] Iteration   4: 2509.512 ops/s
[info] Iteration   5: 2430.407 ops/s
[info] Iteration   6: 2951.934 ops/s
[info] Iteration   7: 2979.554 ops/s
[info] Iteration   8: 2993.155 ops/s
[info] Iteration   9: 2919.544 ops/s
[info] Iteration  10: 3058.664 ops/s
[info] # Run progress: 50.00% complete, ETA 00:03:03
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.089 ops/s
[info] # Warmup Iteration   2: 489.100 ops/s
[info] # Warmup Iteration   3: 641.331 ops/s
[info] # Warmup Iteration   4: 773.263 ops/s
[info] # Warmup Iteration   5: 1102.488 ops/s
[info] # Warmup Iteration   6: 1403.911 ops/s
[info] # Warmup Iteration   7: 1576.466 ops/s
[info] # Warmup Iteration   8: 1919.126 ops/s
[info] # Warmup Iteration   9: 1930.432 ops/s
[info] # Warmup Iteration  10: 1961.104 ops/s
[info] Iteration   1: 2333.966 ops/s
[info] Iteration   2: 2517.811 ops/s
[info] Iteration   3: 2435.771 ops/s
[info] Iteration   4: 2627.235 ops/s
[info] Iteration   5: 2964.152 ops/s
[info] Iteration   6: 2967.974 ops/s
[info] Iteration   7: 3008.928 ops/s
[info] Iteration   8: 2950.128 ops/s
[info] Iteration   9: 2938.871 ops/s
[info] Iteration  10: 2978.464 ops/s
[info] Result "metrifier.benchmark.RPCBenchmark.getPersonLinks":
[info]   2708.222 ±(99.9%) 277.988 ops/s [Average]
[info]   (min, avg, max) = (2155.522, 2708.222, 3058.664), stdev = 320.131
[info]   CI (99.9%): [2430.234, 2986.210] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.RPCBenchmark.listPersons
[info] # Run progress: 60.00% complete, ETA 00:02:26
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.088 ops/s
[info] # Warmup Iteration   2: 467.512 ops/s
[info] # Warmup Iteration   3: 667.659 ops/s
[info] # Warmup Iteration   4: 790.928 ops/s
[info] # Warmup Iteration   5: 1121.082 ops/s
[info] # Warmup Iteration   6: 1581.186 ops/s
[info] # Warmup Iteration   7: 1721.557 ops/s
[info] # Warmup Iteration   8: 2000.256 ops/s
[info] # Warmup Iteration   9: 2271.634 ops/s
[info] # Warmup Iteration  10: 2205.771 ops/s
[info] Iteration   1: 2766.881 ops/s
[info] Iteration   2: 2771.500 ops/s
[info] Iteration   3: 3212.588 ops/s
[info] Iteration   4: 2969.895 ops/s
[info] Iteration   5: 3145.499 ops/s
[info] Iteration   6: 3093.416 ops/s
[info] Iteration   7: 3129.978 ops/s
[info] Iteration   8: 3222.880 ops/s
[info] Iteration   9: 3328.964 ops/s
[info] Iteration  10: 3265.203 ops/s
[info] # Run progress: 70.00% complete, ETA 00:01:49
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.089 ops/s
[info] # Warmup Iteration   2: 558.575 ops/s
[info] # Warmup Iteration   3: 786.354 ops/s
[info] # Warmup Iteration   4: 944.371 ops/s
[info] # Warmup Iteration   5: 1534.257 ops/s
[info] # Warmup Iteration   6: 1764.903 ops/s
[info] # Warmup Iteration   7: 1908.468 ops/s
[info] # Warmup Iteration   8: 1968.196 ops/s
[info] # Warmup Iteration   9: 2218.330 ops/s
[info] # Warmup Iteration  10: 2686.059 ops/s
[info] Iteration   1: 2771.567 ops/s
[info] Iteration   2: 2769.097 ops/s
[info] Iteration   3: 3258.413 ops/s
[info] Iteration   4: 2717.509 ops/s
[info] Iteration   5: 2149.818 ops/s
[info] Iteration   6: 2270.190 ops/s
[info] Iteration   7: 3540.655 ops/s
[info] Iteration   8: 3393.370 ops/s
[info] Iteration   9: 3543.098 ops/s
[info] Iteration  10: 3526.124 ops/s
[info] Result "metrifier.benchmark.RPCBenchmark.listPersons":
[info]   3042.332 ±(99.9%) 340.310 ops/s [Average]
[info]   (min, avg, max) = (2149.818, 3042.332, 3543.098), stdev = 391.902
[info]   CI (99.9%): [2702.022, 3382.642] (assumes normal distribution)

[info] # JMH version: 1.19
[info] # VM version: JDK 1.8.0_131, VM 25.131-b11
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 1 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time
[info] # Benchmark: metrifier.benchmark.RPCBenchmark.programComposition
[info] # Run progress: 80.00% complete, ETA 00:01:13
[info] # Fork: 1 of 2
[info] # Warmup Iteration   1: 0.088 ops/s
[info] # Warmup Iteration   2: 7.900 ops/s
[info] # Warmup Iteration   3: 8.180 ops/s
[info] # Warmup Iteration   4: 8.409 ops/s
[info] # Warmup Iteration   5: 8.534 ops/s
[info] # Warmup Iteration   6: 8.619 ops/s
[info] # Warmup Iteration   7: 8.609 ops/s
[info] # Warmup Iteration   8: 8.725 ops/s
[info] # Warmup Iteration   9: 8.644 ops/s
[info] # Warmup Iteration  10: 8.661 ops/s
[info] Iteration   1: 8.656 ops/s
[info] Iteration   2: 8.661 ops/s
[info] Iteration   3: 8.717 ops/s
[info] Iteration   4: 8.709 ops/s
[info] Iteration   5: 8.714 ops/s
[info] Iteration   6: 8.777 ops/s
[info] Iteration   7: 8.715 ops/s
[info] Iteration   8: 8.843 ops/s
[info] Iteration   9: 8.835 ops/s
[info] Iteration  10: 8.881 ops/s
[info] # Run progress: 90.00% complete, ETA 00:00:36
[info] # Fork: 2 of 2
[info] # Warmup Iteration   1: 0.088 ops/s
[info] # Warmup Iteration   2: 8.146 ops/s
[info] # Warmup Iteration   3: 8.432 ops/s
[info] # Warmup Iteration   4: 8.393 ops/s
[info] # Warmup Iteration   5: 8.653 ops/s
[info] # Warmup Iteration   6: 8.651 ops/s
[info] # Warmup Iteration   7: 8.641 ops/s
[info] # Warmup Iteration   8: 8.662 ops/s
[info] # Warmup Iteration   9: 8.729 ops/s
[info] # Warmup Iteration  10: 8.737 ops/s
[info] Iteration   1: 8.690 ops/s
[info] Iteration   2: 8.686 ops/s
[info] Iteration   3: 8.708 ops/s
[info] Iteration   4: 8.699 ops/s
[info] Iteration   5: 8.745 ops/s
[info] Iteration   6: 8.824 ops/s
[info] Iteration   7: 8.871 ops/s
[info] Iteration   8: 8.765 ops/s
[info] Iteration   9: 8.724 ops/s
[info] Iteration  10: 8.873 ops/s
[info] Result "metrifier.benchmark.RPCBenchmark.programComposition":
[info]   8.755 ±(99.9%) 0.064 ops/s [Average]
[info]   (min, avg, max) = (8.656, 8.755, 8.881), stdev = 0.074
[info]   CI (99.9%): [8.690, 8.819] (assumes normal distribution)

[info] # Run complete. Total time: 00:06:06
[info] Benchmark                         Mode  Cnt     Score     Error  Units
[info] RPCBenchmark.createPerson        thrpt   20     9.298 ±   0.044  ops/s
[info] RPCBenchmark.getPerson           thrpt   20  3544.518 ± 970.798  ops/s
[info] RPCBenchmark.getPersonLinks      thrpt   20  2708.222 ± 277.988  ops/s
[info] RPCBenchmark.listPersons         thrpt   20  3042.332 ± 340.310  ops/s
[info] RPCBenchmark.programComposition  thrpt   20     8.755 ±   0.064  ops/s
```

## Summary

### http

```bash
[info] # Run complete. Total time: 00:05:23
[info] Benchmark                          Mode  Cnt     Score     Error  Units
[info] HttpBenchmark.createPerson        thrpt   20     9.178 ±   0.050  ops/s
[info] HttpBenchmark.getPerson           thrpt   20  1680.386 ± 577.062  ops/s
[info] HttpBenchmark.getPersonLinks      thrpt   20  1349.666 ± 174.447  ops/s
[info] HttpBenchmark.listPersons         thrpt   20  1811.600 ± 400.316  ops/s
[info] HttpBenchmark.programComposition  thrpt   20     8.492 ±   0.089  ops/s
```


### frees-rpc

```bash
[info] # Run complete. Total time: 00:06:06
[info] Benchmark                         Mode  Cnt     Score     Error  Units
[info] RPCBenchmark.createPerson        thrpt   20     9.298 ±   0.044  ops/s
[info] RPCBenchmark.getPerson           thrpt   20  3544.518 ± 970.798  ops/s
[info] RPCBenchmark.getPersonLinks      thrpt   20  2708.222 ± 277.988  ops/s
[info] RPCBenchmark.listPersons         thrpt   20  3042.332 ± 340.310  ops/s
[info] RPCBenchmark.programComposition  thrpt   20     8.755 ±   0.064  ops/s
```
