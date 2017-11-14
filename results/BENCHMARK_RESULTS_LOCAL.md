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
# Warmup Iteration   1: 127.262 ops/s
# Warmup Iteration   2: 198.423 ops/s
# Warmup Iteration   3: 306.565 ops/s
# Warmup Iteration   4: 372.808 ops/s
# Warmup Iteration   5: 551.024 ops/s
# Warmup Iteration   6: 617.811 ops/s
# Warmup Iteration   7: 1101.778 ops/s
# Warmup Iteration   8: 1151.562 ops/s
# Warmup Iteration   9: 1287.815 ops/s
# Warmup Iteration  10: 1183.537 ops/s
# Warmup Iteration  11: 1552.339 ops/s
# Warmup Iteration  12: 1628.232 ops/s
# Warmup Iteration  13: 1882.553 ops/s
# Warmup Iteration  14: 2332.527 ops/s
# Warmup Iteration  15: 3061.030 ops/s
# Warmup Iteration  16: 3744.881 ops/s
# Warmup Iteration  17: 4079.613 ops/s
# Warmup Iteration  18: 4207.083 ops/s
# Warmup Iteration  19: 4926.330 ops/s
# Warmup Iteration  20: 5128.292 ops/s
Iteration   1: 5174.711 ops/s
Iteration   2: 5121.716 ops/s
Iteration   3: 5161.640 ops/s
Iteration   4: 5139.600 ops/s
Iteration   5: 5144.583 ops/s
Iteration   6: 5373.457 ops/s
Iteration   7: 5252.206 ops/s
Iteration   8: 5065.342 ops/s
Iteration   9: 5291.587 ops/s
Iteration  10: 5274.494 ops/s
Iteration  11: 5278.907 ops/s
Iteration  12: 5244.452 ops/s
Iteration  13: 5177.834 ops/s
Iteration  14: 5006.917 ops/s
Iteration  15: 5261.211 ops/s
Iteration  16: 5188.887 ops/s
Iteration  17: 5310.244 ops/s
Iteration  18: 5324.473 ops/s
Iteration  19: 5340.655 ops/s
Iteration  20: 5271.130 ops/s

# Run progress: 10.00% complete, ETA 00:07:58
# Fork: 2 of 2
# Warmup Iteration   1: 243.079 ops/s
# Warmup Iteration   2: 434.363 ops/s
# Warmup Iteration   3: 805.062 ops/s
# Warmup Iteration   4: 1109.715 ops/s
# Warmup Iteration   5: 1938.228 ops/s
# Warmup Iteration   6: 2433.538 ops/s
# Warmup Iteration   7: 2616.732 ops/s
# Warmup Iteration   8: 2768.809 ops/s
# Warmup Iteration   9: 2687.990 ops/s
# Warmup Iteration  10: 2553.032 ops/s
# Warmup Iteration  11: 2570.784 ops/s
# Warmup Iteration  12: 2756.735 ops/s
# Warmup Iteration  13: 3102.251 ops/s
# Warmup Iteration  14: 3236.028 ops/s
# Warmup Iteration  15: 3501.183 ops/s
# Warmup Iteration  16: 4638.743 ops/s
# Warmup Iteration  17: 4897.847 ops/s
# Warmup Iteration  18: 4993.013 ops/s
# Warmup Iteration  19: 4995.144 ops/s
# Warmup Iteration  20: 4990.663 ops/s
Iteration   1: 5067.958 ops/s
Iteration   2: 5041.190 ops/s
Iteration   3: 5058.691 ops/s
Iteration   4: 5033.246 ops/s
Iteration   5: 5124.622 ops/s
Iteration   6: 5046.036 ops/s
Iteration   7: 5033.408 ops/s
Iteration   8: 5138.771 ops/s
Iteration   9: 5077.352 ops/s
Iteration  10: 5146.831 ops/s
Iteration  11: 5097.175 ops/s
Iteration  12: 5015.169 ops/s
Iteration  13: 5199.016 ops/s
Iteration  14: 5140.942 ops/s
Iteration  15: 5151.718 ops/s
Iteration  16: 5105.184 ops/s
Iteration  17: 5153.424 ops/s
Iteration  18: 5114.392 ops/s
Iteration  19: 5066.574 ops/s
Iteration  20: 5162.751 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  5159.462 ±(99.9%) 55.083 ops/s [Average]
  (min, avg, max) = (5006.917, 5159.462, 5373.457), stdev = 97.910
  CI (99.9%): [5104.379, 5214.545] (assumes normal distribution)


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
# Warmup Iteration   1: 244.190 ops/s
# Warmup Iteration   2: 602.189 ops/s
# Warmup Iteration   3: 869.525 ops/s
# Warmup Iteration   4: 1549.074 ops/s
# Warmup Iteration   5: 2873.920 ops/s
# Warmup Iteration   6: 3681.325 ops/s
# Warmup Iteration   7: 3647.948 ops/s
# Warmup Iteration   8: 3582.745 ops/s
# Warmup Iteration   9: 3397.496 ops/s
# Warmup Iteration  10: 3539.559 ops/s
# Warmup Iteration  11: 3682.524 ops/s
# Warmup Iteration  12: 3984.798 ops/s
# Warmup Iteration  13: 4221.911 ops/s
# Warmup Iteration  14: 3854.707 ops/s
# Warmup Iteration  15: 4262.764 ops/s
# Warmup Iteration  16: 4280.119 ops/s
# Warmup Iteration  17: 5076.457 ops/s
# Warmup Iteration  18: 6436.819 ops/s
# Warmup Iteration  19: 6604.506 ops/s
# Warmup Iteration  20: 6915.676 ops/s
Iteration   1: 7018.515 ops/s
Iteration   2: 6910.900 ops/s
Iteration   3: 6981.799 ops/s
Iteration   4: 7345.745 ops/s
Iteration   5: 7273.480 ops/s
Iteration   6: 7444.969 ops/s
Iteration   7: 7292.301 ops/s
Iteration   8: 7469.755 ops/s
Iteration   9: 7306.038 ops/s
Iteration  10: 7558.865 ops/s
Iteration  11: 7607.409 ops/s
Iteration  12: 7636.506 ops/s
Iteration  13: 7554.803 ops/s
Iteration  14: 7808.488 ops/s
Iteration  15: 7761.094 ops/s
Iteration  16: 7771.468 ops/s
Iteration  17: 7698.277 ops/s
Iteration  18: 7696.188 ops/s
Iteration  19: 7284.455 ops/s
Iteration  20: 7835.402 ops/s

# Run progress: 30.00% complete, ETA 00:06:07
# Fork: 2 of 2
# Warmup Iteration   1: 320.897 ops/s
# Warmup Iteration   2: 605.337 ops/s
# Warmup Iteration   3: 929.203 ops/s
# Warmup Iteration   4: 1218.922 ops/s
# Warmup Iteration   5: 1924.768 ops/s
# Warmup Iteration   6: 3099.280 ops/s
# Warmup Iteration   7: 3371.583 ops/s
# Warmup Iteration   8: 3423.021 ops/s
# Warmup Iteration   9: 3687.123 ops/s
# Warmup Iteration  10: 3930.014 ops/s
# Warmup Iteration  11: 3986.832 ops/s
# Warmup Iteration  12: 3986.478 ops/s
# Warmup Iteration  13: 3715.883 ops/s
# Warmup Iteration  14: 4073.848 ops/s
# Warmup Iteration  15: 4361.806 ops/s
# Warmup Iteration  16: 5596.867 ops/s
# Warmup Iteration  17: 7717.853 ops/s
# Warmup Iteration  18: 7559.411 ops/s
# Warmup Iteration  19: 7640.590 ops/s
# Warmup Iteration  20: 7764.630 ops/s
Iteration   1: 7604.881 ops/s
Iteration   2: 7472.082 ops/s
Iteration   3: 7850.282 ops/s
Iteration   4: 7699.191 ops/s
Iteration   5: 7834.229 ops/s
Iteration   6: 7658.880 ops/s
Iteration   7: 6992.356 ops/s
Iteration   8: 7528.292 ops/s
Iteration   9: 7691.584 ops/s
Iteration  10: 7675.302 ops/s
Iteration  11: 7471.373 ops/s
Iteration  12: 7685.830 ops/s
Iteration  13: 7584.720 ops/s
Iteration  14: 7391.818 ops/s
Iteration  15: 7830.145 ops/s
Iteration  16: 7939.902 ops/s
Iteration  17: 7773.591 ops/s
Iteration  18: 7827.780 ops/s
Iteration  19: 8002.233 ops/s
Iteration  20: 7935.145 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  7567.652 ±(99.9%) 154.787 ops/s [Average]
  (min, avg, max) = (6910.900, 7567.652, 8002.233), stdev = 275.133
  CI (99.9%): [7412.865, 7722.438] (assumes normal distribution)


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

# Run progress: 40.00% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 27.620 ops/s
# Warmup Iteration   2: 439.792 ops/s
# Warmup Iteration   3: 888.623 ops/s
# Warmup Iteration   4: 1290.572 ops/s
# Warmup Iteration   5: 1918.112 ops/s
# Warmup Iteration   6: 2172.479 ops/s
# Warmup Iteration   7: 2577.090 ops/s
# Warmup Iteration   8: 2587.125 ops/s
# Warmup Iteration   9: 2719.565 ops/s
# Warmup Iteration  10: 2856.689 ops/s
# Warmup Iteration  11: 3110.340 ops/s
# Warmup Iteration  12: 3182.269 ops/s
# Warmup Iteration  13: 3123.405 ops/s
# Warmup Iteration  14: 3864.139 ops/s
# Warmup Iteration  15: 4360.289 ops/s
# Warmup Iteration  16: 5007.351 ops/s
# Warmup Iteration  17: 5006.967 ops/s
# Warmup Iteration  18: 4904.765 ops/s
# Warmup Iteration  19: 5058.143 ops/s
# Warmup Iteration  20: 5077.706 ops/s
Iteration   1: 5100.237 ops/s
Iteration   2: 5057.482 ops/s
Iteration   3: 5096.305 ops/s
Iteration   4: 5123.045 ops/s
Iteration   5: 5057.698 ops/s
Iteration   6: 5176.776 ops/s
Iteration   7: 5204.122 ops/s
Iteration   8: 4945.561 ops/s
Iteration   9: 4996.582 ops/s
Iteration  10: 5109.815 ops/s
Iteration  11: 5137.315 ops/s
Iteration  12: 5158.946 ops/s
Iteration  13: 5042.077 ops/s
Iteration  14: 5071.383 ops/s
Iteration  15: 5140.422 ops/s
Iteration  16: 4976.578 ops/s
Iteration  17: 5090.422 ops/s
Iteration  18: 5045.458 ops/s
Iteration  19: 5140.600 ops/s
Iteration  20: 4908.656 ops/s

# Run progress: 50.00% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: 246.316 ops/s
# Warmup Iteration   2: 574.977 ops/s
# Warmup Iteration   3: 828.248 ops/s
# Warmup Iteration   4: 1145.043 ops/s
# Warmup Iteration   5: 1757.680 ops/s
# Warmup Iteration   6: 2596.923 ops/s
# Warmup Iteration   7: 2764.400 ops/s
# Warmup Iteration   8: 2724.881 ops/s
# Warmup Iteration   9: 2925.042 ops/s
# Warmup Iteration  10: 2767.146 ops/s
# Warmup Iteration  11: 2871.598 ops/s
# Warmup Iteration  12: 3199.524 ops/s
# Warmup Iteration  13: 3245.146 ops/s
# Warmup Iteration  14: 3217.226 ops/s
# Warmup Iteration  15: 3577.958 ops/s
# Warmup Iteration  16: 4892.993 ops/s
# Warmup Iteration  17: 5090.487 ops/s
# Warmup Iteration  18: 5176.277 ops/s
# Warmup Iteration  19: 5195.808 ops/s
# Warmup Iteration  20: 5101.732 ops/s
Iteration   1: 5140.611 ops/s
Iteration   2: 5236.265 ops/s
Iteration   3: 5176.629 ops/s
Iteration   4: 5071.893 ops/s
Iteration   5: 5111.941 ops/s
Iteration   6: 5283.292 ops/s
Iteration   7: 5345.501 ops/s
Iteration   8: 5312.082 ops/s
Iteration   9: 5327.119 ops/s
Iteration  10: 5280.168 ops/s
Iteration  11: 5312.928 ops/s
Iteration  12: 5320.720 ops/s
Iteration  13: 5320.695 ops/s
Iteration  14: 5302.748 ops/s
Iteration  15: 5281.774 ops/s
Iteration  16: 5313.069 ops/s
Iteration  17: 5307.946 ops/s
Iteration  18: 5324.328 ops/s
Iteration  19: 5293.333 ops/s
Iteration  20: 5332.196 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  5174.368 ±(99.9%) 69.700 ops/s [Average]
  (min, avg, max) = (4908.656, 5174.368, 5345.501), stdev = 123.891
  CI (99.9%): [5104.668, 5244.067] (assumes normal distribution)


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

# Run progress: 60.00% complete, ETA 00:03:29
# Fork: 1 of 2
# Warmup Iteration   1: 174.607 ops/s
# Warmup Iteration   2: 539.859 ops/s
# Warmup Iteration   3: 926.620 ops/s
# Warmup Iteration   4: 1144.650 ops/s
# Warmup Iteration   5: 1248.135 ops/s
# Warmup Iteration   6: 1919.066 ops/s
# Warmup Iteration   7: 2827.540 ops/s
# Warmup Iteration   8: 3091.173 ops/s
# Warmup Iteration   9: 3228.961 ops/s
# Warmup Iteration  10: 3322.720 ops/s
# Warmup Iteration  11: 3231.115 ops/s
# Warmup Iteration  12: 3494.788 ops/s
# Warmup Iteration  13: 3602.791 ops/s
# Warmup Iteration  14: 3779.151 ops/s
# Warmup Iteration  15: 4218.209 ops/s
# Warmup Iteration  16: 5525.346 ops/s
# Warmup Iteration  17: 5736.776 ops/s
# Warmup Iteration  18: 5161.695 ops/s
# Warmup Iteration  19: 5389.317 ops/s
# Warmup Iteration  20: 5169.222 ops/s
Iteration   1: 5468.376 ops/s
Iteration   2: 5828.199 ops/s
Iteration   3: 5851.983 ops/s
Iteration   4: 5769.927 ops/s
Iteration   5: 5978.436 ops/s
Iteration   6: 5916.318 ops/s
Iteration   7: 5792.860 ops/s
Iteration   8: 5793.732 ops/s
Iteration   9: 5801.936 ops/s
Iteration  10: 5902.837 ops/s
Iteration  11: 5691.879 ops/s
Iteration  12: 5836.665 ops/s
Iteration  13: 5726.690 ops/s
Iteration  14: 5807.611 ops/s
Iteration  15: 5845.821 ops/s
Iteration  16: 5852.613 ops/s
Iteration  17: 5890.665 ops/s
Iteration  18: 5960.535 ops/s
Iteration  19: 5900.857 ops/s
Iteration  20: 5972.828 ops/s

# Run progress: 70.00% complete, ETA 00:02:36
# Fork: 2 of 2
# Warmup Iteration   1: 259.515 ops/s
# Warmup Iteration   2: 604.651 ops/s
# Warmup Iteration   3: 1091.519 ops/s
# Warmup Iteration   4: 1535.619 ops/s
# Warmup Iteration   5: 2451.971 ops/s
# Warmup Iteration   6: 2934.352 ops/s
# Warmup Iteration   7: 3011.082 ops/s
# Warmup Iteration   8: 2904.534 ops/s
# Warmup Iteration   9: 2962.679 ops/s
# Warmup Iteration  10: 3173.267 ops/s
# Warmup Iteration  11: 3266.948 ops/s
# Warmup Iteration  12: 3466.106 ops/s
# Warmup Iteration  13: 3633.626 ops/s
# Warmup Iteration  14: 4168.591 ops/s
# Warmup Iteration  15: 5252.052 ops/s
# Warmup Iteration  16: 5743.789 ops/s
# Warmup Iteration  17: 5826.491 ops/s
# Warmup Iteration  18: 5873.519 ops/s
# Warmup Iteration  19: 5842.377 ops/s
# Warmup Iteration  20: 5854.866 ops/s
Iteration   1: 5854.613 ops/s
Iteration   2: 5915.155 ops/s
Iteration   3: 5906.327 ops/s
Iteration   4: 5871.290 ops/s
Iteration   5: 5827.509 ops/s
Iteration   6: 5873.180 ops/s
Iteration   7: 5933.992 ops/s
Iteration   8: 5983.073 ops/s
Iteration   9: 5891.962 ops/s
Iteration  10: 5335.132 ops/s
Iteration  11: 5522.977 ops/s
Iteration  12: 5756.310 ops/s
Iteration  13: 5739.870 ops/s
Iteration  14: 5551.262 ops/s
Iteration  15: 5809.885 ops/s
Iteration  16: 5869.375 ops/s
Iteration  17: 5878.756 ops/s
Iteration  18: 5928.992 ops/s
Iteration  19: 5899.946 ops/s
Iteration  20: 5924.516 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  5821.622 ±(99.9%) 78.599 ops/s [Average]
  (min, avg, max) = (5335.132, 5821.622, 5983.073), stdev = 139.710
  CI (99.9%): [5743.023, 5900.221] (assumes normal distribution)


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

# Run progress: 80.00% complete, ETA 00:01:44
# Fork: 1 of 2
# Warmup Iteration   1: 39.437 ops/s
# Warmup Iteration   2: 95.813 ops/s
# Warmup Iteration   3: 168.395 ops/s
# Warmup Iteration   4: 259.012 ops/s
# Warmup Iteration   5: 344.857 ops/s
# Warmup Iteration   6: 394.899 ops/s
# Warmup Iteration   7: 398.387 ops/s
# Warmup Iteration   8: 420.650 ops/s
# Warmup Iteration   9: 362.810 ops/s
# Warmup Iteration  10: 362.280 ops/s
# Warmup Iteration  11: 404.617 ops/s
# Warmup Iteration  12: 407.075 ops/s
# Warmup Iteration  13: 452.572 ops/s
# Warmup Iteration  14: 482.306 ops/s
# Warmup Iteration  15: 487.786 ops/s
# Warmup Iteration  16: 556.399 ops/s
# Warmup Iteration  17: 657.735 ops/s
# Warmup Iteration  18: 739.756 ops/s
# Warmup Iteration  19: 749.330 ops/s
# Warmup Iteration  20: 725.534 ops/s
Iteration   1: 773.784 ops/s
Iteration   2: 788.339 ops/s
Iteration   3: 821.202 ops/s
Iteration   4: 749.565 ops/s
Iteration   5: 721.605 ops/s
Iteration   6: 808.503 ops/s
Iteration   7: 817.749 ops/s
Iteration   8: 826.410 ops/s
Iteration   9: 839.077 ops/s
Iteration  10: 824.284 ops/s
Iteration  11: 820.085 ops/s
Iteration  12: 830.700 ops/s
Iteration  13: 835.338 ops/s
Iteration  14: 820.283 ops/s
Iteration  15: 819.107 ops/s
Iteration  16: 832.634 ops/s
Iteration  17: 842.765 ops/s
Iteration  18: 836.826 ops/s
Iteration  19: 824.936 ops/s
Iteration  20: 838.149 ops/s

# Run progress: 90.00% complete, ETA 00:00:52
# Fork: 2 of 2
# Warmup Iteration   1: 44.465 ops/s
# Warmup Iteration   2: 88.625 ops/s
# Warmup Iteration   3: 176.780 ops/s
# Warmup Iteration   4: 227.513 ops/s
# Warmup Iteration   5: 337.660 ops/s
# Warmup Iteration   6: 421.536 ops/s
# Warmup Iteration   7: 428.109 ops/s
# Warmup Iteration   8: 391.599 ops/s
# Warmup Iteration   9: 355.018 ops/s
# Warmup Iteration  10: 380.151 ops/s
# Warmup Iteration  11: 368.686 ops/s
# Warmup Iteration  12: 404.669 ops/s
# Warmup Iteration  13: 448.725 ops/s
# Warmup Iteration  14: 453.793 ops/s
# Warmup Iteration  15: 473.527 ops/s
# Warmup Iteration  16: 502.794 ops/s
# Warmup Iteration  17: 552.645 ops/s
# Warmup Iteration  18: 680.679 ops/s
# Warmup Iteration  19: 666.037 ops/s
# Warmup Iteration  20: 704.458 ops/s
Iteration   1: 735.657 ops/s
Iteration   2: 739.595 ops/s
Iteration   3: 787.062 ops/s
Iteration   4: 775.147 ops/s
Iteration   5: 628.995 ops/s
Iteration   6: 614.443 ops/s
Iteration   7: 765.666 ops/s
Iteration   8: 710.352 ops/s
Iteration   9: 620.832 ops/s
Iteration  10: 464.257 ops/s
Iteration  11: 660.453 ops/s
Iteration  12: 442.964 ops/s
Iteration  13: 461.606 ops/s
Iteration  14: 485.675 ops/s
Iteration  15: 769.512 ops/s
Iteration  16: 836.108 ops/s
Iteration  17: 815.989 ops/s
Iteration  18: 830.886 ops/s
Iteration  19: 822.570 ops/s
Iteration  20: 696.219 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  748.383 ±(99.9%) 64.809 ops/s [Average]
  (min, avg, max) = (442.964, 748.383, 842.765), stdev = 115.199
  CI (99.9%): [683.574, 813.193] (assumes normal distribution)


# Run complete. Total time: 00:08:43

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  5159.462 ±  55.083  ops/s
HttpBenchmark.getPerson           thrpt   40  7567.652 ± 154.787  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  5174.368 ±  69.700  ops/s
HttpBenchmark.listPersons         thrpt   40  5821.622 ±  78.599  ops/s
HttpBenchmark.programComposition  thrpt   40   748.383 ±  64.809  ops/s
```

### frees-rpc - Protobuf Serialization

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
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 128.284 ops/s
# Warmup Iteration   2: 462.327 ops/s
# Warmup Iteration   3: 823.457 ops/s
# Warmup Iteration   4: 1613.518 ops/s
# Warmup Iteration   5: 1934.057 ops/s
# Warmup Iteration   6: 2231.750 ops/s
# Warmup Iteration   7: 2330.099 ops/s
# Warmup Iteration   8: 2488.546 ops/s
# Warmup Iteration   9: 2619.829 ops/s
# Warmup Iteration  10: 2900.903 ops/s
# Warmup Iteration  11: 3656.169 ops/s
# Warmup Iteration  12: 4485.216 ops/s
# Warmup Iteration  13: 4577.040 ops/s
# Warmup Iteration  14: 4452.220 ops/s
# Warmup Iteration  15: 6066.235 ops/s
# Warmup Iteration  16: 7030.332 ops/s
# Warmup Iteration  17: 7778.864 ops/s
# Warmup Iteration  18: 7538.162 ops/s
# Warmup Iteration  19: 8280.704 ops/s
# Warmup Iteration  20: 7848.575 ops/s
Iteration   1: 6774.476 ops/s
Iteration   2: 7133.257 ops/s
Iteration   3: 6467.023 ops/s
Iteration   4: 6479.801 ops/s
Iteration   5: 8202.649 ops/s
Iteration   6: 8276.088 ops/s
Iteration   7: 7881.300 ops/s
Iteration   8: 6921.567 ops/s
Iteration   9: 8781.581 ops/s
Iteration  10: 8920.652 ops/s
Iteration  11: 8344.137 ops/s
Iteration  12: 7691.338 ops/s
Iteration  13: 8077.505 ops/s
Iteration  14: 7197.227 ops/s
Iteration  15: 7904.441 ops/s
Iteration  16: 7868.588 ops/s
Iteration  17: 7705.335 ops/s
Iteration  18: 8364.184 ops/s
Iteration  19: 7611.551 ops/s
Iteration  20: 7844.908 ops/s

# Run progress: 10.00% complete, ETA 00:08:34
# Fork: 2 of 2
# Warmup Iteration   1: 252.349 ops/s
# Warmup Iteration   2: 912.928 ops/s
# Warmup Iteration   3: 2164.340 ops/s
# Warmup Iteration   4: 2807.083 ops/s
# Warmup Iteration   5: 3152.507 ops/s
# Warmup Iteration   6: 3751.912 ops/s
# Warmup Iteration   7: 3766.267 ops/s
# Warmup Iteration   8: 4685.106 ops/s
# Warmup Iteration   9: 6949.693 ops/s
# Warmup Iteration  10: 8261.615 ops/s
# Warmup Iteration  11: 7893.320 ops/s
# Warmup Iteration  12: 7746.363 ops/s
# Warmup Iteration  13: 8802.668 ops/s
# Warmup Iteration  14: 7494.882 ops/s
# Warmup Iteration  15: 8356.285 ops/s
# Warmup Iteration  16: 8774.062 ops/s
# Warmup Iteration  17: 8886.162 ops/s
# Warmup Iteration  18: 9099.931 ops/s
# Warmup Iteration  19: 8326.322 ops/s
# Warmup Iteration  20: 8370.429 ops/s
Iteration   1: 8286.483 ops/s
Iteration   2: 8721.356 ops/s
Iteration   3: 8740.111 ops/s
Iteration   4: 8667.876 ops/s
Iteration   5: 8864.804 ops/s
Iteration   6: 8679.726 ops/s
Iteration   7: 8763.408 ops/s
Iteration   8: 8604.799 ops/s
Iteration   9: 10317.924 ops/s
Iteration  10: 8763.318 ops/s
Iteration  11: 8694.232 ops/s
Iteration  12: 8406.883 ops/s
Iteration  13: 8291.864 ops/s
Iteration  14: 8217.409 ops/s
Iteration  15: 9137.203 ops/s
Iteration  16: 8008.425 ops/s
Iteration  17: 8614.252 ops/s
Iteration  18: 8584.945 ops/s
Iteration  19: 8516.726 ops/s
Iteration  20: 8810.320 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.createPerson":
  8203.492 ±(99.9%) 429.421 ops/s [Average]
  (min, avg, max) = (6467.023, 8203.492, 10317.924), stdev = 763.295
  CI (99.9%): [7774.071, 8632.913] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:07:35
# Fork: 1 of 2
# Warmup Iteration   1: 317.766 ops/s
# Warmup Iteration   2: 1125.318 ops/s
# Warmup Iteration   3: 2430.805 ops/s
# Warmup Iteration   4: 3582.240 ops/s
# Warmup Iteration   5: 3525.334 ops/s
# Warmup Iteration   6: 4052.067 ops/s
# Warmup Iteration   7: 4493.718 ops/s
# Warmup Iteration   8: 5112.450 ops/s
# Warmup Iteration   9: 6625.571 ops/s
# Warmup Iteration  10: 7723.417 ops/s
# Warmup Iteration  11: 8213.973 ops/s
# Warmup Iteration  12: 9470.650 ops/s
# Warmup Iteration  13: 8165.043 ops/s
# Warmup Iteration  14: 8392.282 ops/s
# Warmup Iteration  15: 8493.676 ops/s
# Warmup Iteration  16: 10458.220 ops/s
# Warmup Iteration  17: 9056.258 ops/s
# Warmup Iteration  18: 10528.775 ops/s
# Warmup Iteration  19: 8362.126 ops/s
# Warmup Iteration  20: 9688.005 ops/s
Iteration   1: 9032.157 ops/s
Iteration   2: 9524.151 ops/s
Iteration   3: 9205.900 ops/s
Iteration   4: 9545.431 ops/s
Iteration   5: 9408.895 ops/s
Iteration   6: 9497.525 ops/s
Iteration   7: 10176.014 ops/s
Iteration   8: 8754.253 ops/s
Iteration   9: 9209.175 ops/s
Iteration  10: 8144.348 ops/s
Iteration  11: 8975.817 ops/s
Iteration  12: 8673.670 ops/s
Iteration  13: 10200.910 ops/s
Iteration  14: 9716.991 ops/s
Iteration  15: 9282.544 ops/s
Iteration  16: 9247.618 ops/s
Iteration  17: 9284.475 ops/s
Iteration  18: 8781.935 ops/s
Iteration  19: 9666.639 ops/s
Iteration  20: 10245.608 ops/s

# Run progress: 30.00% complete, ETA 00:06:38
# Fork: 2 of 2
# Warmup Iteration   1: 314.466 ops/s
# Warmup Iteration   2: 977.277 ops/s
# Warmup Iteration   3: 2484.310 ops/s
# Warmup Iteration   4: 3227.693 ops/s
# Warmup Iteration   5: 4179.279 ops/s
# Warmup Iteration   6: 4264.319 ops/s
# Warmup Iteration   7: 5095.502 ops/s
# Warmup Iteration   8: 5116.206 ops/s
# Warmup Iteration   9: 7658.243 ops/s
# Warmup Iteration  10: 7533.109 ops/s
# Warmup Iteration  11: 7349.689 ops/s
# Warmup Iteration  12: 8602.496 ops/s
# Warmup Iteration  13: 8820.653 ops/s
# Warmup Iteration  14: 8187.504 ops/s
# Warmup Iteration  15: 8192.303 ops/s
# Warmup Iteration  16: 8758.977 ops/s
# Warmup Iteration  17: 8448.644 ops/s
# Warmup Iteration  18: 8921.786 ops/s
# Warmup Iteration  19: 8655.202 ops/s
# Warmup Iteration  20: 7776.834 ops/s
Iteration   1: 9082.132 ops/s
Iteration   2: 9227.459 ops/s
Iteration   3: 9314.480 ops/s
Iteration   4: 8786.780 ops/s
Iteration   5: 8640.409 ops/s
Iteration   6: 10955.373 ops/s
Iteration   7: 8688.092 ops/s
Iteration   8: 9534.048 ops/s
Iteration   9: 9224.553 ops/s
Iteration  10: 9338.172 ops/s
Iteration  11: 10008.019 ops/s
Iteration  12: 9265.678 ops/s
Iteration  13: 10375.219 ops/s
Iteration  14: 8529.375 ops/s
Iteration  15: 9316.810 ops/s
Iteration  16: 8941.002 ops/s
Iteration  17: 9615.635 ops/s
Iteration  18: 9986.203 ops/s
Iteration  19: 9142.645 ops/s
Iteration  20: 8977.040 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPerson":
  9338.080 ±(99.9%) 317.038 ops/s [Average]
  (min, avg, max) = (8144.348, 9338.080, 10955.373), stdev = 563.536
  CI (99.9%): [9021.041, 9655.118] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:05:41
# Fork: 1 of 2
# Warmup Iteration   1: 0.744 ops/s
# Warmup Iteration   2: 802.173 ops/s
# Warmup Iteration   3: 1613.534 ops/s
# Warmup Iteration   4: 2545.951 ops/s
# Warmup Iteration   5: 3148.734 ops/s
# Warmup Iteration   6: 3074.928 ops/s
# Warmup Iteration   7: 3429.276 ops/s
# Warmup Iteration   8: 4127.313 ops/s
# Warmup Iteration   9: 4924.041 ops/s
# Warmup Iteration  10: 5997.220 ops/s
# Warmup Iteration  11: 6350.871 ops/s
# Warmup Iteration  12: 6359.890 ops/s
# Warmup Iteration  13: 6315.212 ops/s
# Warmup Iteration  14: 6450.020 ops/s
# Warmup Iteration  15: 6294.068 ops/s
# Warmup Iteration  16: 6484.138 ops/s
# Warmup Iteration  17: 6435.684 ops/s
# Warmup Iteration  18: 6488.145 ops/s
# Warmup Iteration  19: 6222.693 ops/s
# Warmup Iteration  20: 5938.685 ops/s
Iteration   1: 6418.783 ops/s
Iteration   2: 6413.783 ops/s
Iteration   3: 6246.021 ops/s
Iteration   4: 6346.990 ops/s
Iteration   5: 6408.146 ops/s
Iteration   6: 6847.907 ops/s
Iteration   7: 6455.932 ops/s
Iteration   8: 6473.937 ops/s
Iteration   9: 6688.728 ops/s
Iteration  10: 6255.626 ops/s
Iteration  11: 6319.232 ops/s
Iteration  12: 6561.352 ops/s
Iteration  13: 6457.416 ops/s
Iteration  14: 6435.250 ops/s
Iteration  15: 6438.673 ops/s
Iteration  16: 6604.555 ops/s
Iteration  17: 6352.539 ops/s
Iteration  18: 6252.229 ops/s
Iteration  19: 6504.871 ops/s
Iteration  20: 5864.410 ops/s

# Run progress: 50.00% complete, ETA 00:04:44
# Fork: 2 of 2
# Warmup Iteration   1: 217.024 ops/s
# Warmup Iteration   2: 1063.913 ops/s
# Warmup Iteration   3: 2240.661 ops/s
# Warmup Iteration   4: 3170.113 ops/s
# Warmup Iteration   5: 3009.244 ops/s
# Warmup Iteration   6: 3063.654 ops/s
# Warmup Iteration   7: 4243.779 ops/s
# Warmup Iteration   8: 4064.496 ops/s
# Warmup Iteration   9: 5405.049 ops/s
# Warmup Iteration  10: 6445.014 ops/s
# Warmup Iteration  11: 6424.532 ops/s
# Warmup Iteration  12: 6597.178 ops/s
# Warmup Iteration  13: 6380.888 ops/s
# Warmup Iteration  14: 6605.141 ops/s
# Warmup Iteration  15: 6624.773 ops/s
# Warmup Iteration  16: 5530.118 ops/s
# Warmup Iteration  17: 6688.965 ops/s
# Warmup Iteration  18: 6701.875 ops/s
# Warmup Iteration  19: 6537.002 ops/s
# Warmup Iteration  20: 6271.950 ops/s
Iteration   1: 6610.973 ops/s
Iteration   2: 6431.831 ops/s
Iteration   3: 6528.021 ops/s
Iteration   4: 6584.199 ops/s
Iteration   5: 6479.988 ops/s
Iteration   6: 6699.057 ops/s
Iteration   7: 6575.525 ops/s
Iteration   8: 6267.855 ops/s
Iteration   9: 6027.724 ops/s
Iteration  10: 6540.646 ops/s
Iteration  11: 6356.480 ops/s
Iteration  12: 6463.280 ops/s
Iteration  13: 6235.064 ops/s
Iteration  14: 6390.685 ops/s
Iteration  15: 6160.639 ops/s
Iteration  16: 6389.031 ops/s
Iteration  17: 6402.148 ops/s
Iteration  18: 6706.442 ops/s
Iteration  19: 6262.632 ops/s
Iteration  20: 6422.122 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPersonLinks":
  6422.018 ±(99.9%) 103.726 ops/s [Average]
  (min, avg, max) = (5864.410, 6422.018, 6847.907), stdev = 184.372
  CI (99.9%): [6318.292, 6525.744] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:03:47
# Fork: 1 of 2
# Warmup Iteration   1: 0.744 ops/s
# Warmup Iteration   2: 959.092 ops/s
# Warmup Iteration   3: 2174.639 ops/s
# Warmup Iteration   4: 2926.441 ops/s
# Warmup Iteration   5: 3474.196 ops/s
# Warmup Iteration   6: 3756.841 ops/s
# Warmup Iteration   7: 3947.403 ops/s
# Warmup Iteration   8: 4454.544 ops/s
# Warmup Iteration   9: 6108.266 ops/s
# Warmup Iteration  10: 6735.456 ops/s
# Warmup Iteration  11: 6827.520 ops/s
# Warmup Iteration  12: 6885.774 ops/s
# Warmup Iteration  13: 7073.584 ops/s
# Warmup Iteration  14: 7124.504 ops/s
# Warmup Iteration  15: 7249.608 ops/s
# Warmup Iteration  16: 7094.361 ops/s
# Warmup Iteration  17: 7021.070 ops/s
# Warmup Iteration  18: 7216.887 ops/s
# Warmup Iteration  19: 6981.263 ops/s
# Warmup Iteration  20: 7140.778 ops/s
Iteration   1: 6974.973 ops/s
Iteration   2: 6917.182 ops/s
Iteration   3: 6955.465 ops/s
Iteration   4: 7033.523 ops/s
Iteration   5: 7161.263 ops/s
Iteration   6: 7244.681 ops/s
Iteration   7: 7248.554 ops/s
Iteration   8: 7258.313 ops/s
Iteration   9: 7197.083 ops/s
Iteration  10: 7181.069 ops/s
Iteration  11: 6914.478 ops/s
Iteration  12: 7502.780 ops/s
Iteration  13: 7325.558 ops/s
Iteration  14: 7120.348 ops/s
Iteration  15: 7257.208 ops/s
Iteration  16: 7057.406 ops/s
Iteration  17: 6352.844 ops/s
Iteration  18: 7480.216 ops/s
Iteration  19: 6898.956 ops/s
Iteration  20: 7172.412 ops/s

# Run progress: 70.00% complete, ETA 00:02:50
# Fork: 2 of 2
# Warmup Iteration   1: 300.993 ops/s
# Warmup Iteration   2: 1091.495 ops/s
# Warmup Iteration   3: 2298.071 ops/s
# Warmup Iteration   4: 3021.008 ops/s
# Warmup Iteration   5: 3280.054 ops/s
# Warmup Iteration   6: 3936.016 ops/s
# Warmup Iteration   7: 4905.565 ops/s
# Warmup Iteration   8: 5613.480 ops/s
# Warmup Iteration   9: 6872.702 ops/s
# Warmup Iteration  10: 7052.077 ops/s
# Warmup Iteration  11: 6956.618 ops/s
# Warmup Iteration  12: 7583.867 ops/s
# Warmup Iteration  13: 7270.252 ops/s
# Warmup Iteration  14: 6856.054 ops/s
# Warmup Iteration  15: 7308.334 ops/s
# Warmup Iteration  16: 7327.921 ops/s
# Warmup Iteration  17: 7427.454 ops/s
# Warmup Iteration  18: 7453.146 ops/s
# Warmup Iteration  19: 7259.628 ops/s
# Warmup Iteration  20: 7523.367 ops/s
Iteration   1: 7094.473 ops/s
Iteration   2: 7271.492 ops/s
Iteration   3: 7289.083 ops/s
Iteration   4: 7248.577 ops/s
Iteration   5: 7232.463 ops/s
Iteration   6: 7334.780 ops/s
Iteration   7: 7228.516 ops/s
Iteration   8: 7432.412 ops/s
Iteration   9: 7285.363 ops/s
Iteration  10: 7184.560 ops/s
Iteration  11: 7205.366 ops/s
Iteration  12: 7301.835 ops/s
Iteration  13: 7382.885 ops/s
Iteration  14: 7447.435 ops/s
Iteration  15: 7164.364 ops/s
Iteration  16: 7247.027 ops/s
Iteration  17: 7312.676 ops/s
Iteration  18: 7321.460 ops/s
Iteration  19: 7204.426 ops/s
Iteration  20: 6858.889 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.listPersons":
  7182.560 ±(99.9%) 116.855 ops/s [Average]
  (min, avg, max) = (6352.844, 7182.560, 7502.780), stdev = 207.709
  CI (99.9%): [7065.705, 7299.415] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:53
# Fork: 1 of 2
# Warmup Iteration   1: 64.909 ops/s
# Warmup Iteration   2: 168.909 ops/s
# Warmup Iteration   3: 308.937 ops/s
# Warmup Iteration   4: 427.473 ops/s
# Warmup Iteration   5: 425.851 ops/s
# Warmup Iteration   6: 465.027 ops/s
# Warmup Iteration   7: 503.437 ops/s
# Warmup Iteration   8: 566.514 ops/s
# Warmup Iteration   9: 556.079 ops/s
# Warmup Iteration  10: 713.712 ops/s
# Warmup Iteration  11: 905.703 ops/s
# Warmup Iteration  12: 774.945 ops/s
# Warmup Iteration  13: 946.659 ops/s
# Warmup Iteration  14: 968.664 ops/s
# Warmup Iteration  15: 914.084 ops/s
# Warmup Iteration  16: 1002.897 ops/s
# Warmup Iteration  17: 984.077 ops/s
# Warmup Iteration  18: 990.127 ops/s
# Warmup Iteration  19: 1026.062 ops/s
# Warmup Iteration  20: 954.212 ops/s
Iteration   1: 984.999 ops/s
Iteration   2: 955.962 ops/s
Iteration   3: 981.576 ops/s
Iteration   4: 980.273 ops/s
Iteration   5: 1142.274 ops/s
Iteration   6: 1040.724 ops/s
Iteration   7: 986.880 ops/s
Iteration   8: 1049.848 ops/s
Iteration   9: 1062.040 ops/s
Iteration  10: 966.693 ops/s
Iteration  11: 1012.239 ops/s
Iteration  12: 1093.290 ops/s
Iteration  13: 961.720 ops/s
Iteration  14: 1024.240 ops/s
Iteration  15: 954.855 ops/s
Iteration  16: 962.206 ops/s
Iteration  17: 965.361 ops/s
Iteration  18: 968.690 ops/s
Iteration  19: 1104.462 ops/s
Iteration  20: 940.454 ops/s

# Run progress: 90.00% complete, ETA 00:00:56
# Fork: 2 of 2
# Warmup Iteration   1: 65.253 ops/s
# Warmup Iteration   2: 167.135 ops/s
# Warmup Iteration   3: 307.093 ops/s
# Warmup Iteration   4: 387.596 ops/s
# Warmup Iteration   5: 454.026 ops/s
# Warmup Iteration   6: 490.907 ops/s
# Warmup Iteration   7: 504.603 ops/s
# Warmup Iteration   8: 555.896 ops/s
# Warmup Iteration   9: 652.295 ops/s
# Warmup Iteration  10: 899.711 ops/s
# Warmup Iteration  11: 889.563 ops/s
# Warmup Iteration  12: 871.092 ops/s
# Warmup Iteration  13: 962.291 ops/s
# Warmup Iteration  14: 1041.697 ops/s
# Warmup Iteration  15: 948.704 ops/s
# Warmup Iteration  16: 818.834 ops/s
# Warmup Iteration  17: 913.801 ops/s
# Warmup Iteration  18: 989.396 ops/s
# Warmup Iteration  19: 949.111 ops/s
# Warmup Iteration  20: 997.786 ops/s
Iteration   1: 974.662 ops/s
Iteration   2: 973.749 ops/s
Iteration   3: 985.056 ops/s
Iteration   4: 994.080 ops/s
Iteration   5: 985.257 ops/s
Iteration   6: 969.912 ops/s
Iteration   7: 995.757 ops/s
Iteration   8: 998.563 ops/s
Iteration   9: 976.743 ops/s
Iteration  10: 1029.807 ops/s
Iteration  11: 995.949 ops/s
Iteration  12: 1067.368 ops/s
Iteration  13: 958.689 ops/s
Iteration  14: 967.934 ops/s
Iteration  15: 1067.649 ops/s
Iteration  16: 989.681 ops/s
Iteration  17: 1012.683 ops/s
Iteration  18: 968.158 ops/s
Iteration  19: 980.378 ops/s
Iteration  20: 957.856 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.programComposition":
  999.718 ±(99.9%) 25.936 ops/s [Average]
  (min, avg, max) = (940.454, 999.718, 1142.274), stdev = 46.101
  CI (99.9%): [973.782, 1025.654] (assumes normal distribution)


# Run complete. Total time: 00:09:29

Benchmark                              Mode  Cnt     Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40  8203.492 ± 429.421  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  9338.080 ± 317.038  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40  6422.018 ± 103.726  ops/s
RPCProtoBenchmark.listPersons         thrpt   40  7182.560 ± 116.855  ops/s
RPCProtoBenchmark.programComposition  thrpt   40   999.718 ±  25.936  ops/s
```

### frees-rpc - Avro Serialization

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
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.createPerson

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 0.685 ops/s
# Warmup Iteration   2: 424.715 ops/s
# Warmup Iteration   3: 656.338 ops/s
# Warmup Iteration   4: 1076.842 ops/s
# Warmup Iteration   5: 1246.340 ops/s
# Warmup Iteration   6: 1370.264 ops/s
# Warmup Iteration   7: 1630.126 ops/s
# Warmup Iteration   8: 1774.655 ops/s
# Warmup Iteration   9: 2024.826 ops/s
# Warmup Iteration  10: 2395.735 ops/s
# Warmup Iteration  11: 2571.501 ops/s
# Warmup Iteration  12: 2800.957 ops/s
# Warmup Iteration  13: 3152.445 ops/s
# Warmup Iteration  14: 4129.883 ops/s
# Warmup Iteration  15: 4636.704 ops/s
# Warmup Iteration  16: 6070.042 ops/s
# Warmup Iteration  17: 6065.063 ops/s
# Warmup Iteration  18: 6305.429 ops/s
# Warmup Iteration  19: 6565.947 ops/s
# Warmup Iteration  20: 6709.563 ops/s
Iteration   1: 6279.424 ops/s
Iteration   2: 6978.219 ops/s
Iteration   3: 8711.543 ops/s
Iteration   4: 8247.477 ops/s
Iteration   5: 7551.194 ops/s
Iteration   6: 7538.276 ops/s
Iteration   7: 7817.175 ops/s
Iteration   8: 7666.030 ops/s
Iteration   9: 7554.515 ops/s
Iteration  10: 8727.152 ops/s
Iteration  11: 7733.897 ops/s
Iteration  12: 6801.034 ops/s
Iteration  13: 6924.492 ops/s
Iteration  14: 7349.935 ops/s
Iteration  15: 7331.641 ops/s
Iteration  16: 7534.846 ops/s
Iteration  17: 6684.220 ops/s
Iteration  18: 7096.816 ops/s
Iteration  19: 7600.965 ops/s
Iteration  20: 8202.153 ops/s

# Run progress: 10.00% complete, ETA 00:08:36
# Fork: 2 of 2
# Warmup Iteration   1: 0.731 ops/s
# Warmup Iteration   2: 718.605 ops/s
# Warmup Iteration   3: 1604.061 ops/s
# Warmup Iteration   4: 2516.180 ops/s
# Warmup Iteration   5: 2479.013 ops/s
# Warmup Iteration   6: 3159.812 ops/s
# Warmup Iteration   7: 3764.197 ops/s
# Warmup Iteration   8: 3221.922 ops/s
# Warmup Iteration   9: 3971.202 ops/s
# Warmup Iteration  10: 4450.428 ops/s
# Warmup Iteration  11: 6279.361 ops/s
# Warmup Iteration  12: 7098.114 ops/s
# Warmup Iteration  13: 6725.949 ops/s
# Warmup Iteration  14: 6087.047 ops/s
# Warmup Iteration  15: 7452.059 ops/s
# Warmup Iteration  16: 7041.332 ops/s
# Warmup Iteration  17: 8049.553 ops/s
# Warmup Iteration  18: 8546.407 ops/s
# Warmup Iteration  19: 6858.571 ops/s
# Warmup Iteration  20: 7063.596 ops/s
Iteration   1: 7655.647 ops/s
Iteration   2: 8575.675 ops/s
Iteration   3: 7663.454 ops/s
Iteration   4: 8292.739 ops/s
Iteration   5: 8165.591 ops/s
Iteration   6: 7839.047 ops/s
Iteration   7: 7964.516 ops/s
Iteration   8: 7570.074 ops/s
Iteration   9: 7912.453 ops/s
Iteration  10: 7756.515 ops/s
Iteration  11: 8070.485 ops/s
Iteration  12: 7422.384 ops/s
Iteration  13: 7587.169 ops/s
Iteration  14: 7503.968 ops/s
Iteration  15: 7808.969 ops/s
Iteration  16: 7664.254 ops/s
Iteration  17: 6998.863 ops/s
Iteration  18: 7259.472 ops/s
Iteration  19: 8010.690 ops/s
Iteration  20: 7404.149 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.createPerson":
  7636.428 ±(99.9%) 296.527 ops/s [Average]
  (min, avg, max) = (6279.424, 7636.428, 8727.152), stdev = 527.077
  CI (99.9%): [7339.901, 7932.955] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:07:37
# Fork: 1 of 2
# Warmup Iteration   1: 0.730 ops/s
# Warmup Iteration   2: 785.380 ops/s
# Warmup Iteration   3: 1740.131 ops/s
# Warmup Iteration   4: 2224.644 ops/s
# Warmup Iteration   5: 2326.641 ops/s
# Warmup Iteration   6: 2566.883 ops/s
# Warmup Iteration   7: 3288.851 ops/s
# Warmup Iteration   8: 3650.033 ops/s
# Warmup Iteration   9: 4518.063 ops/s
# Warmup Iteration  10: 4886.112 ops/s
# Warmup Iteration  11: 4865.987 ops/s
# Warmup Iteration  12: 6409.980 ops/s
# Warmup Iteration  13: 7311.575 ops/s
# Warmup Iteration  14: 8694.005 ops/s
# Warmup Iteration  15: 7831.906 ops/s
# Warmup Iteration  16: 8050.360 ops/s
# Warmup Iteration  17: 7738.414 ops/s
# Warmup Iteration  18: 7848.609 ops/s
# Warmup Iteration  19: 9135.925 ops/s
# Warmup Iteration  20: 9099.133 ops/s
Iteration   1: 7725.378 ops/s
Iteration   2: 7588.023 ops/s
Iteration   3: 7657.002 ops/s
Iteration   4: 8483.033 ops/s
Iteration   5: 8460.517 ops/s
Iteration   6: 8453.928 ops/s
Iteration   7: 7669.701 ops/s
Iteration   8: 8143.360 ops/s
Iteration   9: 8277.462 ops/s
Iteration  10: 7579.019 ops/s
Iteration  11: 7574.297 ops/s
Iteration  12: 7926.877 ops/s
Iteration  13: 8053.058 ops/s
Iteration  14: 7804.296 ops/s
Iteration  15: 8579.577 ops/s
Iteration  16: 8079.717 ops/s
Iteration  17: 9335.635 ops/s
Iteration  18: 8463.646 ops/s
Iteration  19: 8583.027 ops/s
Iteration  20: 8078.630 ops/s

# Run progress: 30.00% complete, ETA 00:06:39
# Fork: 2 of 2
# Warmup Iteration   1: 0.735 ops/s
# Warmup Iteration   2: 990.931 ops/s
# Warmup Iteration   3: 2373.249 ops/s
# Warmup Iteration   4: 2741.204 ops/s
# Warmup Iteration   5: 3528.135 ops/s
# Warmup Iteration   6: 4101.123 ops/s
# Warmup Iteration   7: 4262.304 ops/s
# Warmup Iteration   8: 4122.916 ops/s
# Warmup Iteration   9: 4691.230 ops/s
# Warmup Iteration  10: 6172.680 ops/s
# Warmup Iteration  11: 7001.880 ops/s
# Warmup Iteration  12: 7080.649 ops/s
# Warmup Iteration  13: 7078.656 ops/s
# Warmup Iteration  14: 7319.660 ops/s
# Warmup Iteration  15: 7678.632 ops/s
# Warmup Iteration  16: 9051.795 ops/s
# Warmup Iteration  17: 8064.595 ops/s
# Warmup Iteration  18: 7622.571 ops/s
# Warmup Iteration  19: 7972.819 ops/s
# Warmup Iteration  20: 7484.344 ops/s
Iteration   1: 7908.911 ops/s
Iteration   2: 8287.482 ops/s
Iteration   3: 7887.557 ops/s
Iteration   4: 8166.612 ops/s
Iteration   5: 8090.554 ops/s
Iteration   6: 8237.937 ops/s
Iteration   7: 8146.933 ops/s
Iteration   8: 8174.950 ops/s
Iteration   9: 8351.842 ops/s
Iteration  10: 8399.286 ops/s
Iteration  11: 9057.163 ops/s
Iteration  12: 8902.128 ops/s
Iteration  13: 8075.275 ops/s
Iteration  14: 8021.689 ops/s
Iteration  15: 8789.310 ops/s
Iteration  16: 8956.559 ops/s
Iteration  17: 8278.573 ops/s
Iteration  18: 7970.240 ops/s
Iteration  19: 9339.240 ops/s
Iteration  20: 7922.714 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPerson":
  8237.028 ±(99.9%) 254.020 ops/s [Average]
  (min, avg, max) = (7574.297, 8237.028, 9339.240), stdev = 451.519
  CI (99.9%): [7983.009, 8491.048] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:05:42
# Fork: 1 of 2
# Warmup Iteration   1: 163.577 ops/s
# Warmup Iteration   2: 671.683 ops/s
# Warmup Iteration   3: 1334.309 ops/s
# Warmup Iteration   4: 1889.097 ops/s
# Warmup Iteration   5: 2165.449 ops/s
# Warmup Iteration   6: 2827.096 ops/s
# Warmup Iteration   7: 3003.643 ops/s
# Warmup Iteration   8: 3323.528 ops/s
# Warmup Iteration   9: 4258.752 ops/s
# Warmup Iteration  10: 5486.764 ops/s
# Warmup Iteration  11: 5743.869 ops/s
# Warmup Iteration  12: 5444.291 ops/s
# Warmup Iteration  13: 5719.939 ops/s
# Warmup Iteration  14: 5444.726 ops/s
# Warmup Iteration  15: 5472.196 ops/s
# Warmup Iteration  16: 5414.802 ops/s
# Warmup Iteration  17: 5310.129 ops/s
# Warmup Iteration  18: 5667.547 ops/s
# Warmup Iteration  19: 5716.117 ops/s
# Warmup Iteration  20: 5689.146 ops/s
Iteration   1: 5706.293 ops/s
Iteration   2: 5811.314 ops/s
Iteration   3: 5774.373 ops/s
Iteration   4: 5811.590 ops/s
Iteration   5: 5812.824 ops/s
Iteration   6: 5769.183 ops/s
Iteration   7: 5730.707 ops/s
Iteration   8: 5553.929 ops/s
Iteration   9: 5435.296 ops/s
Iteration  10: 5453.159 ops/s
Iteration  11: 5571.314 ops/s
Iteration  12: 5628.186 ops/s
Iteration  13: 5553.531 ops/s
Iteration  14: 5426.179 ops/s
Iteration  15: 5760.140 ops/s
Iteration  16: 5465.806 ops/s
Iteration  17: 5677.218 ops/s
Iteration  18: 5342.349 ops/s
Iteration  19: 5754.518 ops/s
Iteration  20: 5734.011 ops/s

# Run progress: 50.00% complete, ETA 00:04:44
# Fork: 2 of 2
# Warmup Iteration   1: 227.203 ops/s
# Warmup Iteration   2: 911.563 ops/s
# Warmup Iteration   3: 2009.850 ops/s
# Warmup Iteration   4: 2781.487 ops/s
# Warmup Iteration   5: 2837.508 ops/s
# Warmup Iteration   6: 2625.577 ops/s
# Warmup Iteration   7: 2949.087 ops/s
# Warmup Iteration   8: 3203.346 ops/s
# Warmup Iteration   9: 3700.896 ops/s
# Warmup Iteration  10: 4583.230 ops/s
# Warmup Iteration  11: 5503.991 ops/s
# Warmup Iteration  12: 6124.239 ops/s
# Warmup Iteration  13: 5757.047 ops/s
# Warmup Iteration  14: 5707.664 ops/s
# Warmup Iteration  15: 5907.678 ops/s
# Warmup Iteration  16: 5977.242 ops/s
# Warmup Iteration  17: 6052.805 ops/s
# Warmup Iteration  18: 6035.405 ops/s
# Warmup Iteration  19: 5964.827 ops/s
# Warmup Iteration  20: 6066.767 ops/s
Iteration   1: 5897.372 ops/s
Iteration   2: 6073.798 ops/s
Iteration   3: 5789.377 ops/s
Iteration   4: 6195.079 ops/s
Iteration   5: 6101.735 ops/s
Iteration   6: 5999.821 ops/s
Iteration   7: 6046.204 ops/s
Iteration   8: 5957.944 ops/s
Iteration   9: 6005.816 ops/s
Iteration  10: 6006.986 ops/s
Iteration  11: 6122.003 ops/s
Iteration  12: 6135.711 ops/s
Iteration  13: 6093.576 ops/s
Iteration  14: 6051.599 ops/s
Iteration  15: 5974.073 ops/s
Iteration  16: 5988.489 ops/s
Iteration  17: 6003.727 ops/s
Iteration  18: 5922.725 ops/s
Iteration  19: 5860.210 ops/s
Iteration  20: 5383.537 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPersonLinks":
  5809.542 ±(99.9%) 132.402 ops/s [Average]
  (min, avg, max) = (5342.349, 5809.542, 6195.079), stdev = 235.344
  CI (99.9%): [5677.141, 5941.944] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:03:47
# Fork: 1 of 2
# Warmup Iteration   1: 180.612 ops/s
# Warmup Iteration   2: 927.784 ops/s
# Warmup Iteration   3: 1805.377 ops/s
# Warmup Iteration   4: 2528.610 ops/s
# Warmup Iteration   5: 2714.041 ops/s
# Warmup Iteration   6: 3256.455 ops/s
# Warmup Iteration   7: 3332.577 ops/s
# Warmup Iteration   8: 3386.936 ops/s
# Warmup Iteration   9: 3887.811 ops/s
# Warmup Iteration  10: 4846.537 ops/s
# Warmup Iteration  11: 6140.203 ops/s
# Warmup Iteration  12: 5818.799 ops/s
# Warmup Iteration  13: 6140.121 ops/s
# Warmup Iteration  14: 6733.360 ops/s
# Warmup Iteration  15: 6444.285 ops/s
# Warmup Iteration  16: 6739.144 ops/s
# Warmup Iteration  17: 6368.361 ops/s
# Warmup Iteration  18: 6193.564 ops/s
# Warmup Iteration  19: 6355.738 ops/s
# Warmup Iteration  20: 6293.577 ops/s
Iteration   1: 6168.481 ops/s
Iteration   2: 6319.018 ops/s
Iteration   3: 6248.782 ops/s
Iteration   4: 6352.635 ops/s
Iteration   5: 6035.289 ops/s
Iteration   6: 6934.523 ops/s
Iteration   7: 6390.600 ops/s
Iteration   8: 6383.038 ops/s
Iteration   9: 5876.201 ops/s
Iteration  10: 5524.384 ops/s
Iteration  11: 6219.534 ops/s
Iteration  12: 6375.573 ops/s
Iteration  13: 6652.476 ops/s
Iteration  14: 6647.043 ops/s
Iteration  15: 6341.717 ops/s
Iteration  16: 6408.554 ops/s
Iteration  17: 6285.402 ops/s
Iteration  18: 6415.167 ops/s
Iteration  19: 6485.644 ops/s
Iteration  20: 6148.270 ops/s

# Run progress: 70.00% complete, ETA 00:02:50
# Fork: 2 of 2
# Warmup Iteration   1: 263.528 ops/s
# Warmup Iteration   2: 990.081 ops/s
# Warmup Iteration   3: 1879.230 ops/s
# Warmup Iteration   4: 2210.783 ops/s
# Warmup Iteration   5: 2673.098 ops/s
# Warmup Iteration   6: 2801.998 ops/s
# Warmup Iteration   7: 3320.188 ops/s
# Warmup Iteration   8: 3797.218 ops/s
# Warmup Iteration   9: 4902.936 ops/s
# Warmup Iteration  10: 6212.555 ops/s
# Warmup Iteration  11: 6195.401 ops/s
# Warmup Iteration  12: 6233.538 ops/s
# Warmup Iteration  13: 6206.953 ops/s
# Warmup Iteration  14: 6410.619 ops/s
# Warmup Iteration  15: 6306.979 ops/s
# Warmup Iteration  16: 6479.768 ops/s
# Warmup Iteration  17: 6408.476 ops/s
# Warmup Iteration  18: 6403.514 ops/s
# Warmup Iteration  19: 6345.326 ops/s
# Warmup Iteration  20: 6331.775 ops/s
Iteration   1: 6251.068 ops/s
Iteration   2: 6344.661 ops/s
Iteration   3: 6592.166 ops/s
Iteration   4: 6361.186 ops/s
Iteration   5: 6234.901 ops/s
Iteration   6: 6358.393 ops/s
Iteration   7: 6442.957 ops/s
Iteration   8: 6435.667 ops/s
Iteration   9: 6433.764 ops/s
Iteration  10: 6291.160 ops/s
Iteration  11: 6429.886 ops/s
Iteration  12: 6299.496 ops/s
Iteration  13: 6561.074 ops/s
Iteration  14: 6401.320 ops/s
Iteration  15: 6538.961 ops/s
Iteration  16: 6417.156 ops/s
Iteration  17: 6555.912 ops/s
Iteration  18: 6493.589 ops/s
Iteration  19: 6373.130 ops/s
Iteration  20: 6333.635 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.listPersons":
  6359.060 ±(99.9%) 125.067 ops/s [Average]
  (min, avg, max) = (5524.384, 6359.060, 6934.523), stdev = 222.306
  CI (99.9%): [6233.993, 6484.127] (assumes normal distribution)


# JMH version: 1.19
# VM version: JDK 1.8.0_131, VM 25.131-b11
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:53
# Fork: 1 of 2
# Warmup Iteration   1: 60.190 ops/s
# Warmup Iteration   2: 134.239 ops/s
# Warmup Iteration   3: 286.689 ops/s
# Warmup Iteration   4: 368.802 ops/s
# Warmup Iteration   5: 345.270 ops/s
# Warmup Iteration   6: 407.375 ops/s
# Warmup Iteration   7: 403.781 ops/s
# Warmup Iteration   8: 413.413 ops/s
# Warmup Iteration   9: 497.640 ops/s
# Warmup Iteration  10: 588.568 ops/s
# Warmup Iteration  11: 758.881 ops/s
# Warmup Iteration  12: 768.740 ops/s
# Warmup Iteration  13: 681.461 ops/s
# Warmup Iteration  14: 717.468 ops/s
# Warmup Iteration  15: 758.961 ops/s
# Warmup Iteration  16: 872.069 ops/s
# Warmup Iteration  17: 809.714 ops/s
# Warmup Iteration  18: 830.252 ops/s
# Warmup Iteration  19: 838.383 ops/s
# Warmup Iteration  20: 877.799 ops/s
Iteration   1: 869.761 ops/s
Iteration   2: 845.924 ops/s
Iteration   3: 840.400 ops/s
Iteration   4: 901.066 ops/s
Iteration   5: 873.507 ops/s
Iteration   6: 877.788 ops/s
Iteration   7: 879.091 ops/s
Iteration   8: 883.310 ops/s
Iteration   9: 903.182 ops/s
Iteration  10: 1022.158 ops/s
Iteration  11: 925.267 ops/s
Iteration  12: 861.227 ops/s
Iteration  13: 886.742 ops/s
Iteration  14: 884.157 ops/s
Iteration  15: 899.961 ops/s
Iteration  16: 949.666 ops/s
Iteration  17: 902.213 ops/s
Iteration  18: 845.452 ops/s
Iteration  19: 864.600 ops/s
Iteration  20: 991.662 ops/s

# Run progress: 90.00% complete, ETA 00:00:57
# Fork: 2 of 2
# Warmup Iteration   1: 71.045 ops/s
# Warmup Iteration   2: 144.380 ops/s
# Warmup Iteration   3: 268.018 ops/s
# Warmup Iteration   4: 364.730 ops/s
# Warmup Iteration   5: 385.517 ops/s
# Warmup Iteration   6: 397.510 ops/s
# Warmup Iteration   7: 407.551 ops/s
# Warmup Iteration   8: 493.839 ops/s
# Warmup Iteration   9: 490.683 ops/s
# Warmup Iteration  10: 646.479 ops/s
# Warmup Iteration  11: 753.462 ops/s
# Warmup Iteration  12: 780.893 ops/s
# Warmup Iteration  13: 633.047 ops/s
# Warmup Iteration  14: 780.870 ops/s
# Warmup Iteration  15: 649.291 ops/s
# Warmup Iteration  16: 835.681 ops/s
# Warmup Iteration  17: 910.817 ops/s
# Warmup Iteration  18: 840.868 ops/s
# Warmup Iteration  19: 834.350 ops/s
# Warmup Iteration  20: 861.324 ops/s
Iteration   1: 860.398 ops/s
Iteration   2: 848.069 ops/s
Iteration   3: 896.932 ops/s
Iteration   4: 854.527 ops/s
Iteration   5: 874.004 ops/s
Iteration   6: 884.354 ops/s
Iteration   7: 888.443 ops/s
Iteration   8: 856.041 ops/s
Iteration   9: 999.494 ops/s
Iteration  10: 854.301 ops/s
Iteration  11: 847.675 ops/s
Iteration  12: 914.830 ops/s
Iteration  13: 1023.443 ops/s
Iteration  14: 864.476 ops/s
Iteration  15: 1038.373 ops/s
Iteration  16: 863.054 ops/s
Iteration  17: 886.214 ops/s
Iteration  18: 860.214 ops/s
Iteration  19: 869.973 ops/s
Iteration  20: 1033.116 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.programComposition":
  898.127 ±(99.9%) 31.652 ops/s [Average]
  (min, avg, max) = (840.400, 898.127, 1038.373), stdev = 56.261
  CI (99.9%): [866.475, 929.778] (assumes normal distribution)


# Run complete. Total time: 00:09:30

Benchmark                             Mode  Cnt     Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40  7636.428 ± 296.527  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  8237.028 ± 254.020  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40  5809.542 ± 132.402  ops/s
RPCAvroBenchmark.listPersons         thrpt   40  6359.060 ± 125.067  ops/s
RPCAvroBenchmark.programComposition  thrpt   40   898.127 ±  31.652  ops/s
```

## Summary

### HTTP

```bash
# Run complete. Total time: 00:08:43

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40  5159.462 ±  55.083  ops/s
HttpBenchmark.getPerson           thrpt   40  7567.652 ± 154.787  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  5174.368 ±  69.700  ops/s
HttpBenchmark.listPersons         thrpt   40  5821.622 ±  78.599  ops/s
HttpBenchmark.programComposition  thrpt   40   748.383 ±  64.809  ops/s
```

### frees-rpc - Protobuf Serialization

```bash
# Run complete. Total time: 00:09:29

Benchmark                              Mode  Cnt     Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40  8203.492 ± 429.421  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  9338.080 ± 317.038  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40  6422.018 ± 103.726  ops/s
RPCProtoBenchmark.listPersons         thrpt   40  7182.560 ± 116.855  ops/s
RPCProtoBenchmark.programComposition  thrpt   40   999.718 ±  25.936  ops/s
```

### frees-rpc - Avro Serialization

```bash
# Run complete. Total time: 00:09:30

Benchmark                             Mode  Cnt     Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40  7636.428 ± 296.527  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  8237.028 ± 254.020  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40  5809.542 ± 132.402  ops/s
RPCAvroBenchmark.listPersons         thrpt   40  6359.060 ± 125.067  ops/s
RPCAvroBenchmark.programComposition  thrpt   40   898.127 ±  31.652  ops/s
```