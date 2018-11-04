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
  - [mu-rpc - Protobuf Serialization](#mu-rpc---protobuf-serialization)
  - [mu-rpc - Avro Serialization](#mu-rpc---avro-serialization)
- [Summary](#summary)
  - [HTTP](#http-1)
  - [mu-rpc - Protobuf Serialization](#mu-rpc---protobuf-serialization-1)
  - [mu-rpc - Avro Serialization](#mu-rpc---avro-serialization-1)

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
# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
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
# Warmup Iteration   1: 68.213 ops/s
# Warmup Iteration   2: 124.091 ops/s
# Warmup Iteration   3: 180.717 ops/s
# Warmup Iteration   4: 216.523 ops/s
# Warmup Iteration   5: 246.555 ops/s
# Warmup Iteration   6: 269.949 ops/s
# Warmup Iteration   7: 314.763 ops/s
# Warmup Iteration   8: 382.340 ops/s
# Warmup Iteration   9: 516.985 ops/s
# Warmup Iteration  10: 735.009 ops/s
# Warmup Iteration  11: 669.657 ops/s
# Warmup Iteration  12: 634.512 ops/s
# Warmup Iteration  13: 634.339 ops/s
# Warmup Iteration  14: 733.603 ops/s
# Warmup Iteration  15: 598.335 ops/s
# Warmup Iteration  16: 693.406 ops/s
# Warmup Iteration  17: 699.774 ops/s
# Warmup Iteration  18: 592.120 ops/s
# Warmup Iteration  19: 657.398 ops/s
# Warmup Iteration  20: 636.547 ops/s
Iteration   1: 632.083 ops/s
Iteration   2: 633.705 ops/s
Iteration   3: 632.850 ops/s
Iteration   4: 657.477 ops/s
Iteration   5: 616.726 ops/s
Iteration   6: 636.484 ops/s
Iteration   7: 657.036 ops/s
Iteration   8: 667.123 ops/s
Iteration   9: 637.563 ops/s
Iteration  10: 676.541 ops/s
Iteration  11: 705.974 ops/s
Iteration  12: 516.756 ops/s
Iteration  13: 693.657 ops/s
Iteration  14: 708.290 ops/s
Iteration  15: 657.110 ops/s
Iteration  16: 619.740 ops/s
Iteration  17: 679.672 ops/s
Iteration  18: 593.480 ops/s
Iteration  19: 679.449 ops/s
Iteration  20: 607.124 ops/s

# Run progress: 10.00% complete, ETA 00:06:40
# Fork: 2 of 2
# Warmup Iteration   1: 70.359 ops/s
# Warmup Iteration   2: 174.748 ops/s
# Warmup Iteration   3: 263.929 ops/s
# Warmup Iteration   4: 431.021 ops/s
# Warmup Iteration   5: 480.181 ops/s
# Warmup Iteration   6: 557.669 ops/s
# Warmup Iteration   7: 660.463 ops/s
# Warmup Iteration   8: 652.742 ops/s
# Warmup Iteration   9: 617.388 ops/s
# Warmup Iteration  10: 583.027 ops/s
# Warmup Iteration  11: 601.524 ops/s
# Warmup Iteration  12: 611.823 ops/s
# Warmup Iteration  13: 544.231 ops/s
# Warmup Iteration  14: 635.117 ops/s
# Warmup Iteration  15: 653.913 ops/s
# Warmup Iteration  16: 637.806 ops/s
# Warmup Iteration  17: 634.411 ops/s
# Warmup Iteration  18: 584.737 ops/s
# Warmup Iteration  19: 579.373 ops/s
# Warmup Iteration  20: 595.872 ops/s
Iteration   1: 657.185 ops/s
Iteration   2: 606.030 ops/s
Iteration   3: 580.331 ops/s
Iteration   4: 626.524 ops/s
Iteration   5: 588.487 ops/s
Iteration   6: 528.291 ops/s
Iteration   7: 639.975 ops/s
Iteration   8: 579.173 ops/s
Iteration   9: 566.325 ops/s
Iteration  10: 530.844 ops/s
Iteration  11: 604.480 ops/s
Iteration  12: 444.196 ops/s
Iteration  13: 488.455 ops/s
Iteration  14: 590.970 ops/s
Iteration  15: 589.869 ops/s
Iteration  16: 558.386 ops/s
Iteration  17: 353.678 ops/s
Iteration  18: 619.860 ops/s
Iteration  19: 442.590 ops/s
Iteration  20: 494.543 ops/s


Result "metrifier.benchmark.HttpBenchmark.createPerson":
  599.976 ±(99.9%) 43.344 ops/s [Average]
  (min, avg, max) = (353.678, 599.976, 708.290), stdev = 77.043
  CI (99.9%): [556.632, 643.319] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:56
# Fork: 1 of 2
# Warmup Iteration   1: 53.311 ops/s
# Warmup Iteration   2: 236.977 ops/s
# Warmup Iteration   3: 380.402 ops/s
# Warmup Iteration   4: 574.563 ops/s
# Warmup Iteration   5: 563.038 ops/s
# Warmup Iteration   6: 747.658 ops/s
# Warmup Iteration   7: 743.223 ops/s
# Warmup Iteration   8: 691.854 ops/s
# Warmup Iteration   9: 695.349 ops/s
# Warmup Iteration  10: 685.460 ops/s
# Warmup Iteration  11: 578.312 ops/s
# Warmup Iteration  12: 598.859 ops/s
# Warmup Iteration  13: 757.865 ops/s
# Warmup Iteration  14: 774.370 ops/s
# Warmup Iteration  15: 696.458 ops/s
# Warmup Iteration  16: 645.850 ops/s
# Warmup Iteration  17: 699.110 ops/s
# Warmup Iteration  18: 676.958 ops/s
# Warmup Iteration  19: 737.037 ops/s
# Warmup Iteration  20: 719.562 ops/s
Iteration   1: 741.049 ops/s
Iteration   2: 721.181 ops/s
Iteration   3: 661.563 ops/s
Iteration   4: 645.835 ops/s
Iteration   5: 706.273 ops/s
Iteration   6: 690.141 ops/s
Iteration   7: 689.255 ops/s
Iteration   8: 733.573 ops/s
Iteration   9: 773.282 ops/s
Iteration  10: 645.079 ops/s
Iteration  11: 625.280 ops/s
Iteration  12: 544.093 ops/s
Iteration  13: 517.862 ops/s
Iteration  14: 812.394 ops/s
Iteration  15: 773.212 ops/s
Iteration  16: 813.089 ops/s
Iteration  17: 659.395 ops/s
Iteration  18: 709.901 ops/s
Iteration  19: 721.247 ops/s
Iteration  20: 748.246 ops/s

# Run progress: 30.00% complete, ETA 00:05:12
# Fork: 2 of 2
# Warmup Iteration   1: 57.408 ops/s
# Warmup Iteration   2: 220.648 ops/s
# Warmup Iteration   3: 385.959 ops/s
# Warmup Iteration   4: 561.697 ops/s
# Warmup Iteration   5: 719.413 ops/s
# Warmup Iteration   6: 785.507 ops/s
# Warmup Iteration   7: 710.357 ops/s
# Warmup Iteration   8: 765.821 ops/s
# Warmup Iteration   9: 789.348 ops/s
# Warmup Iteration  10: 693.608 ops/s
# Warmup Iteration  11: 768.214 ops/s
# Warmup Iteration  12: 754.029 ops/s
# Warmup Iteration  13: 723.262 ops/s
# Warmup Iteration  14: 744.533 ops/s
# Warmup Iteration  15: 685.672 ops/s
# Warmup Iteration  16: 617.787 ops/s
# Warmup Iteration  17: 718.095 ops/s
# Warmup Iteration  18: 762.229 ops/s
# Warmup Iteration  19: 655.039 ops/s
# Warmup Iteration  20: 733.006 ops/s
Iteration   1: 587.736 ops/s
Iteration   2: 501.724 ops/s
Iteration   3: 730.253 ops/s
Iteration   4: 726.457 ops/s
Iteration   5: 755.171 ops/s
Iteration   6: 352.619 ops/s
Iteration   7: 706.409 ops/s
Iteration   8: 721.405 ops/s
Iteration   9: 692.447 ops/s
Iteration  10: 677.364 ops/s
Iteration  11: 639.386 ops/s
Iteration  12: 571.041 ops/s
Iteration  13: 544.682 ops/s
Iteration  14: 702.758 ops/s
Iteration  15: 706.557 ops/s
Iteration  16: 692.921 ops/s
Iteration  17: 742.408 ops/s
Iteration  18: 762.309 ops/s
Iteration  19: 704.420 ops/s
Iteration  20: 786.533 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPerson":
  680.914 ±(99.9%) 52.230 ops/s [Average]
  (min, avg, max) = (352.619, 680.914, 813.089), stdev = 92.839
  CI (99.9%): [628.683, 733.144] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:27
# Fork: 1 of 2
# Warmup Iteration   1: 39.844 ops/s
# Warmup Iteration   2: 162.311 ops/s
# Warmup Iteration   3: 305.466 ops/s
# Warmup Iteration   4: 475.193 ops/s
# Warmup Iteration   5: 501.097 ops/s
# Warmup Iteration   6: 724.772 ops/s
# Warmup Iteration   7: 770.494 ops/s
# Warmup Iteration   8: 566.139 ops/s
# Warmup Iteration   9: 752.207 ops/s
# Warmup Iteration  10: 671.803 ops/s
# Warmup Iteration  11: 684.053 ops/s
# Warmup Iteration  12: 673.819 ops/s
# Warmup Iteration  13: 709.940 ops/s
# Warmup Iteration  14: 384.809 ops/s
# Warmup Iteration  15: 842.018 ops/s
# Warmup Iteration  16: 751.910 ops/s
# Warmup Iteration  17: 708.445 ops/s
# Warmup Iteration  18: 729.296 ops/s
# Warmup Iteration  19: 732.742 ops/s
# Warmup Iteration  20: 755.688 ops/s
Iteration   1: 662.708 ops/s
Iteration   2: 629.261 ops/s
Iteration   3: 770.990 ops/s
Iteration   4: 740.510 ops/s
Iteration   5: 723.890 ops/s
Iteration   6: 744.751 ops/s
Iteration   7: 677.645 ops/s
Iteration   8: 771.939 ops/s
Iteration   9: 615.635 ops/s
Iteration  10: 787.916 ops/s
Iteration  11: 701.109 ops/s
Iteration  12: 726.703 ops/s
Iteration  13: 674.733 ops/s
Iteration  14: 530.917 ops/s
Iteration  15: 770.790 ops/s
Iteration  16: 761.598 ops/s
Iteration  17: 758.405 ops/s
Iteration  18: 761.559 ops/s
Iteration  19: 758.264 ops/s
Iteration  20: 762.531 ops/s

# Run progress: 50.00% complete, ETA 00:03:43
# Fork: 2 of 2
# Warmup Iteration   1: 48.654 ops/s
# Warmup Iteration   2: 180.287 ops/s
# Warmup Iteration   3: 354.030 ops/s
# Warmup Iteration   4: 569.605 ops/s
# Warmup Iteration   5: 620.305 ops/s
# Warmup Iteration   6: 750.044 ops/s
# Warmup Iteration   7: 765.655 ops/s
# Warmup Iteration   8: 674.324 ops/s
# Warmup Iteration   9: 724.220 ops/s
# Warmup Iteration  10: 872.693 ops/s
# Warmup Iteration  11: 743.496 ops/s
# Warmup Iteration  12: 676.939 ops/s
# Warmup Iteration  13: 625.543 ops/s
# Warmup Iteration  14: 895.759 ops/s
# Warmup Iteration  15: 813.646 ops/s
# Warmup Iteration  16: 698.028 ops/s
# Warmup Iteration  17: 641.780 ops/s
# Warmup Iteration  18: 866.003 ops/s
# Warmup Iteration  19: 697.697 ops/s
# Warmup Iteration  20: 564.362 ops/s
Iteration   1: 744.357 ops/s
Iteration   2: 746.706 ops/s
Iteration   3: 768.848 ops/s
Iteration   4: 660.396 ops/s
Iteration   5: 507.394 ops/s
Iteration   6: 657.043 ops/s
Iteration   7: 619.662 ops/s
Iteration   8: 715.632 ops/s
Iteration   9: 732.136 ops/s
Iteration  10: 592.318 ops/s
Iteration  11: 724.922 ops/s
Iteration  12: 740.323 ops/s
Iteration  13: 751.635 ops/s
Iteration  14: 544.555 ops/s
Iteration  15: 872.097 ops/s
Iteration  16: 821.805 ops/s
Iteration  17: 758.555 ops/s
Iteration  18: 793.625 ops/s
Iteration  19: 741.094 ops/s
Iteration  20: 706.886 ops/s


Result "metrifier.benchmark.HttpBenchmark.getPersonLinks":
  713.296 ±(99.9%) 43.999 ops/s [Average]
  (min, avg, max) = (507.394, 713.296, 872.097), stdev = 78.207
  CI (99.9%): [669.298, 757.295] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:58
# Fork: 1 of 2
# Warmup Iteration   1: 51.995 ops/s
# Warmup Iteration   2: 175.993 ops/s
# Warmup Iteration   3: 368.938 ops/s
# Warmup Iteration   4: 581.129 ops/s
# Warmup Iteration   5: 635.659 ops/s
# Warmup Iteration   6: 797.309 ops/s
# Warmup Iteration   7: 582.671 ops/s
# Warmup Iteration   8: 780.700 ops/s
# Warmup Iteration   9: 776.973 ops/s
# Warmup Iteration  10: 634.882 ops/s
# Warmup Iteration  11: 782.951 ops/s
# Warmup Iteration  12: 753.165 ops/s
# Warmup Iteration  13: 636.573 ops/s
# Warmup Iteration  14: 782.991 ops/s
# Warmup Iteration  15: 750.899 ops/s
# Warmup Iteration  16: 765.822 ops/s
# Warmup Iteration  17: 677.340 ops/s
# Warmup Iteration  18: 723.368 ops/s
# Warmup Iteration  19: 738.262 ops/s
# Warmup Iteration  20: 539.067 ops/s
Iteration   1: 790.413 ops/s
Iteration   2: 747.318 ops/s
Iteration   3: 579.366 ops/s
Iteration   4: 711.335 ops/s
Iteration   5: 801.974 ops/s
Iteration   6: 757.532 ops/s
Iteration   7: 709.337 ops/s
Iteration   8: 520.629 ops/s
Iteration   9: 774.518 ops/s
Iteration  10: 798.199 ops/s
Iteration  11: 757.932 ops/s
Iteration  12: 641.221 ops/s
Iteration  13: 741.990 ops/s
Iteration  14: 767.004 ops/s
Iteration  15: 705.273 ops/s
Iteration  16: 385.307 ops/s
Iteration  17: 854.054 ops/s
Iteration  18: 804.134 ops/s
Iteration  19: 865.950 ops/s
Iteration  20: 786.797 ops/s

# Run progress: 70.00% complete, ETA 00:02:13
# Fork: 2 of 2
# Warmup Iteration   1: 41.480 ops/s
# Warmup Iteration   2: 144.315 ops/s
# Warmup Iteration   3: 291.699 ops/s
# Warmup Iteration   4: 440.178 ops/s
# Warmup Iteration   5: 520.646 ops/s
# Warmup Iteration   6: 743.841 ops/s
# Warmup Iteration   7: 768.688 ops/s
# Warmup Iteration   8: 648.822 ops/s
# Warmup Iteration   9: 707.545 ops/s
# Warmup Iteration  10: 783.027 ops/s
# Warmup Iteration  11: 883.424 ops/s
# Warmup Iteration  12: 709.050 ops/s
# Warmup Iteration  13: 775.695 ops/s
# Warmup Iteration  14: 546.368 ops/s
# Warmup Iteration  15: 934.086 ops/s
# Warmup Iteration  16: 781.206 ops/s
# Warmup Iteration  17: 794.980 ops/s
# Warmup Iteration  18: 500.515 ops/s
# Warmup Iteration  19: 825.327 ops/s
# Warmup Iteration  20: 744.056 ops/s
Iteration   1: 631.339 ops/s
Iteration   2: 608.726 ops/s
Iteration   3: 842.427 ops/s
Iteration   4: 727.907 ops/s
Iteration   5: 536.247 ops/s
Iteration   6: 824.575 ops/s
Iteration   7: 874.429 ops/s
Iteration   8: 394.327 ops/s
Iteration   9: 756.357 ops/s
Iteration  10: 756.340 ops/s
Iteration  11: 342.410 ops/s
Iteration  12: 594.254 ops/s
Iteration  13: 743.233 ops/s
Iteration  14: 528.494 ops/s
Iteration  15: 740.889 ops/s
Iteration  16: 686.036 ops/s
Iteration  17: 629.792 ops/s
Iteration  18: 760.949 ops/s
Iteration  19: 726.561 ops/s
Iteration  20: 430.312 ops/s


Result "metrifier.benchmark.HttpBenchmark.listPersons":
  690.897 ±(99.9%) 76.741 ops/s [Average]
  (min, avg, max) = (342.410, 690.897, 874.429), stdev = 136.406
  CI (99.9%): [614.157, 767.638] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.HttpBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:29
# Fork: 1 of 2
# Warmup Iteration   1: 12.587 ops/s
# Warmup Iteration   2: 34.759 ops/s
# Warmup Iteration   3: 49.977 ops/s
# Warmup Iteration   4: 66.495 ops/s
# Warmup Iteration   5: 97.990 ops/s
# Warmup Iteration   6: 90.164 ops/s
# Warmup Iteration   7: 91.868 ops/s
# Warmup Iteration   8: 82.051 ops/s
# Warmup Iteration   9: 69.319 ops/s
# Warmup Iteration  10: 91.690 ops/s
# Warmup Iteration  11: 89.462 ops/s
# Warmup Iteration  12: 88.664 ops/s
# Warmup Iteration  13: 57.124 ops/s
# Warmup Iteration  14: 59.204 ops/s
# Warmup Iteration  15: 89.580 ops/s
# Warmup Iteration  16: 100.682 ops/s
# Warmup Iteration  17: 93.501 ops/s
# Warmup Iteration  18: 29.252 ops/s
# Warmup Iteration  19: 72.544 ops/s
# Warmup Iteration  20: 88.843 ops/s
Iteration   1: 90.941 ops/s
Iteration   2: 85.029 ops/s
Iteration   3: 72.288 ops/s
Iteration   4: 95.168 ops/s
Iteration   5: 85.713 ops/s
Iteration   6: 76.987 ops/s
Iteration   7: 83.181 ops/s
Iteration   8: 87.750 ops/s
Iteration   9: 42.591 ops/s
Iteration  10: 71.763 ops/s
Iteration  11: 88.378 ops/s
Iteration  12: 70.882 ops/s
Iteration  13: 66.492 ops/s
Iteration  14: 97.713 ops/s
Iteration  15: 91.312 ops/s
Iteration  16: 95.383 ops/s
Iteration  17: 90.972 ops/s
Iteration  18: 18.506 ops/s
Iteration  19: 74.394 ops/s
Iteration  20: 54.799 ops/s

# Run progress: 90.00% complete, ETA 00:00:45
# Fork: 2 of 2
# Warmup Iteration   1: 17.942 ops/s
# Warmup Iteration   2: 32.277 ops/s
# Warmup Iteration   3: 48.679 ops/s
# Warmup Iteration   4: 74.052 ops/s
# Warmup Iteration   5: 80.288 ops/s
# Warmup Iteration   6: 28.827 ops/s
# Warmup Iteration   7: 32.268 ops/s
# Warmup Iteration   8: 32.316 ops/s
# Warmup Iteration   9: 17.135 ops/s
# Warmup Iteration  10: 3.486 ops/s
# Warmup Iteration  11: 43.663 ops/s
# Warmup Iteration  12: 46.300 ops/s
# Warmup Iteration  13: 61.936 ops/s
# Warmup Iteration  14: 56.728 ops/s
# Warmup Iteration  15: 56.764 ops/s
# Warmup Iteration  16: 64.488 ops/s
# Warmup Iteration  17: 49.099 ops/s
# Warmup Iteration  18: 46.844 ops/s
# Warmup Iteration  19: 31.008 ops/s
# Warmup Iteration  20: 24.792 ops/s
Iteration   1: 46.346 ops/s
Iteration   2: 59.084 ops/s
Iteration   3: 57.026 ops/s
Iteration   4: 54.743 ops/s
Iteration   5: 51.687 ops/s
Iteration   6: 61.527 ops/s
Iteration   7: 37.354 ops/s
Iteration   8: 82.854 ops/s
Iteration   9: 75.642 ops/s
Iteration  10: 83.303 ops/s
Iteration  11: 81.456 ops/s
Iteration  12: 83.466 ops/s
Iteration  13: 92.347 ops/s
Iteration  14: 78.029 ops/s
Iteration  15: 88.727 ops/s
Iteration  16: 55.346 ops/s
Iteration  17: 70.467 ops/s
Iteration  18: 59.022 ops/s
Iteration  19: 89.785 ops/s
Iteration  20: 90.395 ops/s


Result "metrifier.benchmark.HttpBenchmark.programComposition":
  73.471 ±(99.9%) 10.356 ops/s [Average]
  (min, avg, max) = (18.506, 73.471, 97.713), stdev = 18.408
  CI (99.9%): [63.115, 83.827] (assumes normal distribution)


# Run complete. Total time: 00:07:35

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                          Mode  Cnt    Score    Error  Units
HttpBenchmark.createPerson        thrpt   40  599.976 ± 43.344  ops/s
HttpBenchmark.getPerson           thrpt   40  680.914 ± 52.230  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  713.296 ± 43.999  ops/s
HttpBenchmark.listPersons         thrpt   40  690.897 ± 76.741  ops/s
HttpBenchmark.programComposition  thrpt   40   73.471 ± 10.356  ops/s
```

### mu-rpc - Protobuf Serialization

```bash
# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
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
# Warmup Iteration   1: 197.950 ops/s
# Warmup Iteration   2: 385.065 ops/s
# Warmup Iteration   3: 604.451 ops/s
# Warmup Iteration   4: 1074.370 ops/s
# Warmup Iteration   5: 1822.899 ops/s
# Warmup Iteration   6: 2727.548 ops/s
# Warmup Iteration   7: 3001.755 ops/s
# Warmup Iteration   8: 3193.829 ops/s
# Warmup Iteration   9: 3102.670 ops/s
# Warmup Iteration  10: 3076.935 ops/s
# Warmup Iteration  11: 3033.821 ops/s
# Warmup Iteration  12: 3208.687 ops/s
# Warmup Iteration  13: 3537.382 ops/s
# Warmup Iteration  14: 3670.880 ops/s
# Warmup Iteration  15: 3586.608 ops/s
# Warmup Iteration  16: 3962.910 ops/s
# Warmup Iteration  17: 4101.893 ops/s
# Warmup Iteration  18: 4159.999 ops/s
# Warmup Iteration  19: 4176.581 ops/s
# Warmup Iteration  20: 4503.355 ops/s
Iteration   1: 4732.170 ops/s
Iteration   2: 4835.674 ops/s
Iteration   3: 5441.138 ops/s
Iteration   4: 5188.104 ops/s
Iteration   5: 5453.539 ops/s
Iteration   6: 6042.733 ops/s
Iteration   7: 7379.870 ops/s
Iteration   8: 8008.055 ops/s
Iteration   9: 8023.222 ops/s
Iteration  10: 8168.729 ops/s
Iteration  11: 8170.188 ops/s
Iteration  12: 8264.181 ops/s
Iteration  13: 8097.621 ops/s
Iteration  14: 8413.987 ops/s
Iteration  15: 8686.237 ops/s
Iteration  16: 8908.836 ops/s
Iteration  17: 8898.396 ops/s
Iteration  18: 8631.030 ops/s
Iteration  19: 8095.312 ops/s
Iteration  20: 8164.637 ops/s

# Run progress: 10.00% complete, ETA 00:06:25
# Fork: 2 of 2
# Warmup Iteration   1: 278.543 ops/s
# Warmup Iteration   2: 547.017 ops/s
# Warmup Iteration   3: 685.451 ops/s
# Warmup Iteration   4: 976.395 ops/s
# Warmup Iteration   5: 1997.251 ops/s
# Warmup Iteration   6: 2760.339 ops/s
# Warmup Iteration   7: 2950.439 ops/s
# Warmup Iteration   8: 3060.877 ops/s
# Warmup Iteration   9: 2973.876 ops/s
# Warmup Iteration  10: 2948.419 ops/s
# Warmup Iteration  11: 3054.901 ops/s
# Warmup Iteration  12: 3121.175 ops/s
# Warmup Iteration  13: 3199.001 ops/s
# Warmup Iteration  14: 3562.546 ops/s
# Warmup Iteration  15: 3613.161 ops/s
# Warmup Iteration  16: 3672.674 ops/s
# Warmup Iteration  17: 3813.926 ops/s
# Warmup Iteration  18: 3583.500 ops/s
# Warmup Iteration  19: 3809.663 ops/s
# Warmup Iteration  20: 3970.709 ops/s
Iteration   1: 4262.358 ops/s
Iteration   2: 4510.513 ops/s
Iteration   3: 5180.591 ops/s
Iteration   4: 5725.450 ops/s
Iteration   5: 6040.174 ops/s
Iteration   6: 6240.023 ops/s
Iteration   7: 6649.986 ops/s
Iteration   8: 7845.067 ops/s
Iteration   9: 7622.277 ops/s
Iteration  10: 8337.559 ops/s
Iteration  11: 8120.702 ops/s
Iteration  12: 8306.594 ops/s
Iteration  13: 8102.548 ops/s
Iteration  14: 8339.844 ops/s
Iteration  15: 8234.446 ops/s
Iteration  16: 8529.811 ops/s
Iteration  17: 8526.152 ops/s
Iteration  18: 8471.235 ops/s
Iteration  19: 8851.685 ops/s
Iteration  20: 9148.837 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.createPerson":
  7366.238 ±(99.9%) 825.910 ops/s [Average]
  (min, avg, max) = (4262.358, 7366.238, 9148.837), stdev = 1468.054
  CI (99.9%): [6540.328, 8192.148] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:41
# Fork: 1 of 2
# Warmup Iteration   1: 333.085 ops/s
# Warmup Iteration   2: 535.862 ops/s
# Warmup Iteration   3: 809.626 ops/s
# Warmup Iteration   4: 1266.015 ops/s
# Warmup Iteration   5: 2780.442 ops/s
# Warmup Iteration   6: 3203.703 ops/s
# Warmup Iteration   7: 3426.266 ops/s
# Warmup Iteration   8: 3514.975 ops/s
# Warmup Iteration   9: 3497.008 ops/s
# Warmup Iteration  10: 3546.524 ops/s
# Warmup Iteration  11: 3963.966 ops/s
# Warmup Iteration  12: 4209.873 ops/s
# Warmup Iteration  13: 4622.903 ops/s
# Warmup Iteration  14: 5051.871 ops/s
# Warmup Iteration  15: 4990.166 ops/s
# Warmup Iteration  16: 5170.662 ops/s
# Warmup Iteration  17: 5563.940 ops/s
# Warmup Iteration  18: 5864.954 ops/s
# Warmup Iteration  19: 5833.621 ops/s
# Warmup Iteration  20: 5444.002 ops/s
Iteration   1: 5748.394 ops/s
Iteration   2: 5247.519 ops/s
Iteration   3: 4078.337 ops/s
Iteration   4: 4422.053 ops/s
Iteration   5: 5120.123 ops/s
Iteration   6: 6593.754 ops/s
Iteration   7: 7151.278 ops/s
Iteration   8: 7122.957 ops/s
Iteration   9: 6791.267 ops/s
Iteration  10: 7274.887 ops/s
Iteration  11: 7341.371 ops/s
Iteration  12: 7692.144 ops/s
Iteration  13: 8303.276 ops/s
Iteration  14: 7457.443 ops/s
Iteration  15: 6688.467 ops/s
Iteration  16: 7262.482 ops/s
Iteration  17: 7958.288 ops/s
Iteration  18: 7903.614 ops/s
Iteration  19: 8527.974 ops/s
Iteration  20: 9562.531 ops/s

# Run progress: 30.00% complete, ETA 00:04:57
# Fork: 2 of 2
# Warmup Iteration   1: 292.296 ops/s
# Warmup Iteration   2: 533.596 ops/s
# Warmup Iteration   3: 803.149 ops/s
# Warmup Iteration   4: 1006.311 ops/s
# Warmup Iteration   5: 2478.966 ops/s
# Warmup Iteration   6: 2947.382 ops/s
# Warmup Iteration   7: 3211.941 ops/s
# Warmup Iteration   8: 3458.347 ops/s
# Warmup Iteration   9: 3405.338 ops/s
# Warmup Iteration  10: 3394.676 ops/s
# Warmup Iteration  11: 3375.197 ops/s
# Warmup Iteration  12: 3527.235 ops/s
# Warmup Iteration  13: 3746.994 ops/s
# Warmup Iteration  14: 4045.898 ops/s
# Warmup Iteration  15: 4488.633 ops/s
# Warmup Iteration  16: 4649.261 ops/s
# Warmup Iteration  17: 4777.099 ops/s
# Warmup Iteration  18: 4975.769 ops/s
# Warmup Iteration  19: 5407.378 ops/s
# Warmup Iteration  20: 5824.139 ops/s
Iteration   1: 6291.562 ops/s
Iteration   2: 6453.264 ops/s
Iteration   3: 6211.425 ops/s
Iteration   4: 6408.724 ops/s
Iteration   5: 7142.519 ops/s
Iteration   6: 9186.116 ops/s
Iteration   7: 9526.301 ops/s
Iteration   8: 9649.167 ops/s
Iteration   9: 9647.079 ops/s
Iteration  10: 9663.035 ops/s
Iteration  11: 9850.964 ops/s
Iteration  12: 9917.184 ops/s
Iteration  13: 10042.326 ops/s
Iteration  14: 9770.080 ops/s
Iteration  15: 9892.139 ops/s
Iteration  16: 9561.798 ops/s
Iteration  17: 9919.120 ops/s
Iteration  18: 9921.570 ops/s
Iteration  19: 9629.368 ops/s
Iteration  20: 10037.844 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPerson":
  7924.244 ±(99.9%) 980.973 ops/s [Average]
  (min, avg, max) = (4078.337, 7924.244, 10042.326), stdev = 1743.678
  CI (99.9%): [6943.271, 8905.216] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:14
# Fork: 1 of 2
# Warmup Iteration   1: 183.607 ops/s
# Warmup Iteration   2: 383.723 ops/s
# Warmup Iteration   3: 557.918 ops/s
# Warmup Iteration   4: 873.445 ops/s
# Warmup Iteration   5: 1329.232 ops/s
# Warmup Iteration   6: 1887.162 ops/s
# Warmup Iteration   7: 2161.560 ops/s
# Warmup Iteration   8: 2294.026 ops/s
# Warmup Iteration   9: 2334.016 ops/s
# Warmup Iteration  10: 2223.366 ops/s
# Warmup Iteration  11: 2306.523 ops/s
# Warmup Iteration  12: 2334.237 ops/s
# Warmup Iteration  13: 2286.993 ops/s
# Warmup Iteration  14: 2362.123 ops/s
# Warmup Iteration  15: 2475.759 ops/s
# Warmup Iteration  16: 2660.302 ops/s
# Warmup Iteration  17: 2755.276 ops/s
# Warmup Iteration  18: 2872.351 ops/s
# Warmup Iteration  19: 2969.673 ops/s
# Warmup Iteration  20: 3000.833 ops/s
Iteration   1: 2979.063 ops/s
Iteration   2: 2890.601 ops/s
Iteration   3: 2998.898 ops/s
Iteration   4: 3144.697 ops/s
Iteration   5: 3085.048 ops/s
Iteration   6: 3075.925 ops/s
Iteration   7: 3116.817 ops/s
Iteration   8: 3249.734 ops/s
Iteration   9: 3473.179 ops/s
Iteration  10: 3460.501 ops/s
Iteration  11: 3522.856 ops/s
Iteration  12: 3546.253 ops/s
Iteration  13: 3372.042 ops/s
Iteration  14: 3802.122 ops/s
Iteration  15: 4050.617 ops/s
Iteration  16: 4723.393 ops/s
Iteration  17: 4865.807 ops/s
Iteration  18: 4923.680 ops/s
Iteration  19: 4709.933 ops/s
Iteration  20: 4513.934 ops/s

# Run progress: 50.00% complete, ETA 00:03:32
# Fork: 2 of 2
# Warmup Iteration   1: 175.686 ops/s
# Warmup Iteration   2: 375.039 ops/s
# Warmup Iteration   3: 518.831 ops/s
# Warmup Iteration   4: 871.119 ops/s
# Warmup Iteration   5: 1552.474 ops/s
# Warmup Iteration   6: 2063.918 ops/s
# Warmup Iteration   7: 2170.539 ops/s
# Warmup Iteration   8: 2269.631 ops/s
# Warmup Iteration   9: 2187.075 ops/s
# Warmup Iteration  10: 2181.714 ops/s
# Warmup Iteration  11: 2222.281 ops/s
# Warmup Iteration  12: 2270.717 ops/s
# Warmup Iteration  13: 2321.611 ops/s
# Warmup Iteration  14: 2296.696 ops/s
# Warmup Iteration  15: 2295.983 ops/s
# Warmup Iteration  16: 2478.128 ops/s
# Warmup Iteration  17: 2455.575 ops/s
# Warmup Iteration  18: 2486.663 ops/s
# Warmup Iteration  19: 2565.084 ops/s
# Warmup Iteration  20: 2638.979 ops/s
Iteration   1: 2632.024 ops/s
Iteration   2: 2733.293 ops/s
Iteration   3: 2835.010 ops/s
Iteration   4: 2729.502 ops/s
Iteration   5: 2849.541 ops/s
Iteration   6: 2995.661 ops/s
Iteration   7: 3111.261 ops/s
Iteration   8: 3136.555 ops/s
Iteration   9: 3246.801 ops/s
Iteration  10: 3511.415 ops/s
Iteration  11: 3594.584 ops/s
Iteration  12: 3737.779 ops/s
Iteration  13: 3940.830 ops/s
Iteration  14: 4416.643 ops/s
Iteration  15: 4862.259 ops/s
Iteration  16: 4875.975 ops/s
Iteration  17: 5006.659 ops/s
Iteration  18: 4833.641 ops/s
Iteration  19: 4861.421 ops/s
Iteration  20: 4914.715 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.getPersonLinks":
  3708.267 ±(99.9%) 444.061 ops/s [Average]
  (min, avg, max) = (2632.024, 3708.267, 5006.659), stdev = 789.319
  CI (99.9%): [3264.205, 4152.328] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:49
# Fork: 1 of 2
# Warmup Iteration   1: 193.423 ops/s
# Warmup Iteration   2: 417.245 ops/s
# Warmup Iteration   3: 647.996 ops/s
# Warmup Iteration   4: 938.112 ops/s
# Warmup Iteration   5: 1707.742 ops/s
# Warmup Iteration   6: 2285.563 ops/s
# Warmup Iteration   7: 2337.364 ops/s
# Warmup Iteration   8: 2444.468 ops/s
# Warmup Iteration   9: 2605.542 ops/s
# Warmup Iteration  10: 2518.747 ops/s
# Warmup Iteration  11: 2667.644 ops/s
# Warmup Iteration  12: 2727.471 ops/s
# Warmup Iteration  13: 3011.553 ops/s
# Warmup Iteration  14: 3006.549 ops/s
# Warmup Iteration  15: 3113.407 ops/s
# Warmup Iteration  16: 3210.658 ops/s
# Warmup Iteration  17: 3348.308 ops/s
# Warmup Iteration  18: 3431.501 ops/s
# Warmup Iteration  19: 3629.114 ops/s
# Warmup Iteration  20: 3651.713 ops/s
Iteration   1: 3712.052 ops/s
Iteration   2: 3899.959 ops/s
Iteration   3: 4173.229 ops/s
Iteration   4: 4196.352 ops/s
Iteration   5: 4423.602 ops/s
Iteration   6: 4927.209 ops/s
Iteration   7: 5230.914 ops/s
Iteration   8: 5766.410 ops/s
Iteration   9: 5792.403 ops/s
Iteration  10: 5734.902 ops/s
Iteration  11: 5758.744 ops/s
Iteration  12: 5708.173 ops/s
Iteration  13: 5797.117 ops/s
Iteration  14: 5750.879 ops/s
Iteration  15: 5673.923 ops/s
Iteration  16: 5842.553 ops/s
Iteration  17: 5788.711 ops/s
Iteration  18: 5609.967 ops/s
Iteration  19: 5941.392 ops/s
Iteration  20: 5857.847 ops/s

# Run progress: 70.00% complete, ETA 00:02:07
# Fork: 2 of 2
# Warmup Iteration   1: 186.812 ops/s
# Warmup Iteration   2: 323.485 ops/s
# Warmup Iteration   3: 473.362 ops/s
# Warmup Iteration   4: 906.156 ops/s
# Warmup Iteration   5: 1510.851 ops/s
# Warmup Iteration   6: 2193.420 ops/s
# Warmup Iteration   7: 2365.296 ops/s
# Warmup Iteration   8: 2363.595 ops/s
# Warmup Iteration   9: 2446.418 ops/s
# Warmup Iteration  10: 2425.924 ops/s
# Warmup Iteration  11: 2816.106 ops/s
# Warmup Iteration  12: 2811.855 ops/s
# Warmup Iteration  13: 2840.489 ops/s
# Warmup Iteration  14: 2891.087 ops/s
# Warmup Iteration  15: 3090.234 ops/s
# Warmup Iteration  16: 3159.465 ops/s
# Warmup Iteration  17: 3291.278 ops/s
# Warmup Iteration  18: 3315.172 ops/s
# Warmup Iteration  19: 3568.167 ops/s
# Warmup Iteration  20: 3803.922 ops/s
Iteration   1: 4128.214 ops/s
Iteration   2: 4258.662 ops/s
Iteration   3: 4365.616 ops/s
Iteration   4: 4331.669 ops/s
Iteration   5: 4382.082 ops/s
Iteration   6: 5514.643 ops/s
Iteration   7: 5983.407 ops/s
Iteration   8: 6427.826 ops/s
Iteration   9: 6182.733 ops/s
Iteration  10: 6478.505 ops/s
Iteration  11: 6402.326 ops/s
Iteration  12: 6143.656 ops/s
Iteration  13: 6362.031 ops/s
Iteration  14: 6407.156 ops/s
Iteration  15: 6345.494 ops/s
Iteration  16: 6336.063 ops/s
Iteration  17: 6067.514 ops/s
Iteration  18: 5949.818 ops/s
Iteration  19: 5988.413 ops/s
Iteration  20: 5827.522 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.listPersons":
  5486.742 ±(99.9%) 465.748 ops/s [Average]
  (min, avg, max) = (3712.052, 5486.742, 6478.505), stdev = 827.866
  CI (99.9%): [5020.995, 5952.490] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCProtoBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:24
# Fork: 1 of 2
# Warmup Iteration   1: 23.177 ops/s
# Warmup Iteration   2: 43.200 ops/s
# Warmup Iteration   3: 65.924 ops/s
# Warmup Iteration   4: 109.525 ops/s
# Warmup Iteration   5: 174.740 ops/s
# Warmup Iteration   6: 230.319 ops/s
# Warmup Iteration   7: 264.396 ops/s
# Warmup Iteration   8: 288.358 ops/s
# Warmup Iteration   9: 305.052 ops/s
# Warmup Iteration  10: 322.140 ops/s
# Warmup Iteration  11: 311.291 ops/s
# Warmup Iteration  12: 307.183 ops/s
# Warmup Iteration  13: 314.723 ops/s
# Warmup Iteration  14: 323.235 ops/s
# Warmup Iteration  15: 342.157 ops/s
# Warmup Iteration  16: 351.879 ops/s
# Warmup Iteration  17: 360.188 ops/s
# Warmup Iteration  18: 387.714 ops/s
# Warmup Iteration  19: 417.825 ops/s
# Warmup Iteration  20: 407.910 ops/s
Iteration   1: 411.879 ops/s
Iteration   2: 428.709 ops/s
Iteration   3: 449.263 ops/s
Iteration   4: 468.397 ops/s
Iteration   5: 516.445 ops/s
Iteration   6: 545.125 ops/s
Iteration   7: 562.703 ops/s
Iteration   8: 598.890 ops/s
Iteration   9: 615.644 ops/s
Iteration  10: 612.964 ops/s
Iteration  11: 769.907 ops/s
Iteration  12: 724.633 ops/s
Iteration  13: 743.972 ops/s
Iteration  14: 814.531 ops/s
Iteration  15: 830.952 ops/s
Iteration  16: 753.710 ops/s
Iteration  17: 759.088 ops/s
Iteration  18: 724.120 ops/s
Iteration  19: 707.864 ops/s
Iteration  20: 784.585 ops/s

# Run progress: 90.00% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 24.922 ops/s
# Warmup Iteration   2: 43.014 ops/s
# Warmup Iteration   3: 67.236 ops/s
# Warmup Iteration   4: 95.639 ops/s
# Warmup Iteration   5: 171.196 ops/s
# Warmup Iteration   6: 250.868 ops/s
# Warmup Iteration   7: 276.968 ops/s
# Warmup Iteration   8: 312.403 ops/s
# Warmup Iteration   9: 316.587 ops/s
# Warmup Iteration  10: 311.972 ops/s
# Warmup Iteration  11: 312.430 ops/s
# Warmup Iteration  12: 322.619 ops/s
# Warmup Iteration  13: 324.483 ops/s
# Warmup Iteration  14: 371.830 ops/s
# Warmup Iteration  15: 399.666 ops/s
# Warmup Iteration  16: 417.235 ops/s
# Warmup Iteration  17: 431.793 ops/s
# Warmup Iteration  18: 419.191 ops/s
# Warmup Iteration  19: 446.279 ops/s
# Warmup Iteration  20: 444.039 ops/s
Iteration   1: 446.981 ops/s
Iteration   2: 463.721 ops/s
Iteration   3: 496.479 ops/s
Iteration   4: 529.775 ops/s
Iteration   5: 540.169 ops/s
Iteration   6: 575.628 ops/s
Iteration   7: 582.793 ops/s
Iteration   8: 606.022 ops/s
Iteration   9: 624.064 ops/s
Iteration  10: 663.560 ops/s
Iteration  11: 603.453 ops/s
Iteration  12: 571.954 ops/s
Iteration  13: 589.929 ops/s
Iteration  14: 580.417 ops/s
Iteration  15: 525.196 ops/s
Iteration  16: 488.663 ops/s
Iteration  17: 578.416 ops/s
Iteration  18: 711.562 ops/s
Iteration  19: 660.263 ops/s
Iteration  20: 665.783 ops/s


Result "metrifier.benchmark.RPCProtoBenchmark.programComposition":
  608.205 ±(99.9%) 63.402 ops/s [Average]
  (min, avg, max) = (411.879, 608.205, 830.952), stdev = 112.697
  CI (99.9%): [544.803, 671.607] (assumes normal distribution)


# Run complete. Total time: 00:07:06

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                              Mode  Cnt     Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40  7366.238 ± 825.910  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  7924.244 ± 980.973  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40  3708.267 ± 444.061  ops/s
RPCProtoBenchmark.listPersons         thrpt   40  5486.742 ± 465.748  ops/s
RPCProtoBenchmark.programComposition  thrpt   40   608.205 ±  63.402  ops/s
```

### mu-rpc - Avro Serialization

```bash
# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
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
# Warmup Iteration   1: 56.008 ops/s
# Warmup Iteration   2: 116.558 ops/s
# Warmup Iteration   3: 217.913 ops/s
# Warmup Iteration   4: 363.371 ops/s
# Warmup Iteration   5: 573.361 ops/s
# Warmup Iteration   6: 671.651 ops/s
# Warmup Iteration   7: 918.672 ops/s
# Warmup Iteration   8: 1388.591 ops/s
# Warmup Iteration   9: 1325.226 ops/s
# Warmup Iteration  10: 1353.648 ops/s
# Warmup Iteration  11: 1428.039 ops/s
# Warmup Iteration  12: 1402.731 ops/s
# Warmup Iteration  13: 1470.429 ops/s
# Warmup Iteration  14: 1641.231 ops/s
# Warmup Iteration  15: 1593.956 ops/s
# Warmup Iteration  16: 1656.736 ops/s
# Warmup Iteration  17: 1719.131 ops/s
# Warmup Iteration  18: 1836.142 ops/s
# Warmup Iteration  19: 1908.411 ops/s
# Warmup Iteration  20: 1978.019 ops/s
Iteration   1: 1956.806 ops/s
Iteration   2: 1988.491 ops/s
Iteration   3: 2060.938 ops/s
Iteration   4: 1859.862 ops/s
Iteration   5: 1887.284 ops/s
Iteration   6: 1490.281 ops/s
Iteration   7: 1833.099 ops/s
Iteration   8: 1918.621 ops/s
Iteration   9: 1882.620 ops/s
Iteration  10: 1802.763 ops/s
Iteration  11: 1798.096 ops/s
Iteration  12: 1885.163 ops/s
Iteration  13: 1862.977 ops/s
Iteration  14: 2048.840 ops/s
Iteration  15: 1926.920 ops/s
Iteration  16: 1888.816 ops/s
Iteration  17: 2040.860 ops/s
Iteration  18: 1817.698 ops/s
Iteration  19: 1983.537 ops/s
Iteration  20: 2254.269 ops/s

# Run progress: 10.00% complete, ETA 00:06:30
# Fork: 2 of 2
# Warmup Iteration   1: 150.758 ops/s
# Warmup Iteration   2: 201.440 ops/s
# Warmup Iteration   3: 305.193 ops/s
# Warmup Iteration   4: 396.395 ops/s
# Warmup Iteration   5: 525.096 ops/s
# Warmup Iteration   6: 674.134 ops/s
# Warmup Iteration   7: 799.741 ops/s
# Warmup Iteration   8: 1307.798 ops/s
# Warmup Iteration   9: 1475.237 ops/s
# Warmup Iteration  10: 1462.201 ops/s
# Warmup Iteration  11: 1358.537 ops/s
# Warmup Iteration  12: 1570.272 ops/s
# Warmup Iteration  13: 1592.643 ops/s
# Warmup Iteration  14: 1614.875 ops/s
# Warmup Iteration  15: 1713.648 ops/s
# Warmup Iteration  16: 1824.765 ops/s
# Warmup Iteration  17: 1826.687 ops/s
# Warmup Iteration  18: 1897.125 ops/s
# Warmup Iteration  19: 1756.851 ops/s
# Warmup Iteration  20: 1481.653 ops/s
Iteration   1: 1889.707 ops/s
Iteration   2: 1842.757 ops/s
Iteration   3: 1965.960 ops/s
Iteration   4: 2061.596 ops/s
Iteration   5: 2093.292 ops/s
Iteration   6: 2193.789 ops/s
Iteration   7: 2190.192 ops/s
Iteration   8: 2204.647 ops/s
Iteration   9: 2221.662 ops/s
Iteration  10: 2258.167 ops/s
Iteration  11: 2255.708 ops/s
Iteration  12: 2424.587 ops/s
Iteration  13: 2409.568 ops/s
Iteration  14: 2422.146 ops/s
Iteration  15: 2368.686 ops/s
Iteration  16: 2587.149 ops/s
Iteration  17: 2520.917 ops/s
Iteration  18: 2559.856 ops/s
Iteration  19: 2400.562 ops/s
Iteration  20: 2568.919 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.createPerson":
  2090.695 ±(99.9%) 147.251 ops/s [Average]
  (min, avg, max) = (1490.281, 2090.695, 2587.149), stdev = 261.739
  CI (99.9%): [1943.444, 2237.946] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPerson

# Run progress: 20.00% complete, ETA 00:05:44
# Fork: 1 of 2
# Warmup Iteration   1: 128.357 ops/s
# Warmup Iteration   2: 253.343 ops/s
# Warmup Iteration   3: 431.511 ops/s
# Warmup Iteration   4: 644.690 ops/s
# Warmup Iteration   5: 943.496 ops/s
# Warmup Iteration   6: 1397.473 ops/s
# Warmup Iteration   7: 1545.088 ops/s
# Warmup Iteration   8: 1655.445 ops/s
# Warmup Iteration   9: 1734.648 ops/s
# Warmup Iteration  10: 1711.289 ops/s
# Warmup Iteration  11: 1613.927 ops/s
# Warmup Iteration  12: 1811.956 ops/s
# Warmup Iteration  13: 1992.553 ops/s
# Warmup Iteration  14: 2097.152 ops/s
# Warmup Iteration  15: 2345.219 ops/s
# Warmup Iteration  16: 2468.576 ops/s
# Warmup Iteration  17: 2168.465 ops/s
# Warmup Iteration  18: 1948.160 ops/s
# Warmup Iteration  19: 1892.928 ops/s
# Warmup Iteration  20: 2213.648 ops/s
Iteration   1: 2398.067 ops/s
Iteration   2: 2366.752 ops/s
Iteration   3: 2202.007 ops/s
Iteration   4: 2504.209 ops/s
Iteration   5: 2673.421 ops/s
Iteration   6: 2611.754 ops/s
Iteration   7: 2577.058 ops/s
Iteration   8: 2617.819 ops/s
Iteration   9: 2683.535 ops/s
Iteration  10: 2701.938 ops/s
Iteration  11: 3169.104 ops/s
Iteration  12: 3017.669 ops/s
Iteration  13: 3140.223 ops/s
Iteration  14: 3158.394 ops/s
Iteration  15: 3401.274 ops/s
Iteration  16: 3095.461 ops/s
Iteration  17: 3359.906 ops/s
Iteration  18: 3455.173 ops/s
Iteration  19: 3521.716 ops/s
Iteration  20: 3189.517 ops/s

# Run progress: 30.00% complete, ETA 00:05:00
# Fork: 2 of 2
# Warmup Iteration   1: 175.060 ops/s
# Warmup Iteration   2: 205.290 ops/s
# Warmup Iteration   3: 297.528 ops/s
# Warmup Iteration   4: 363.408 ops/s
# Warmup Iteration   5: 567.545 ops/s
# Warmup Iteration   6: 777.372 ops/s
# Warmup Iteration   7: 1094.719 ops/s
# Warmup Iteration   8: 1446.729 ops/s
# Warmup Iteration   9: 1550.811 ops/s
# Warmup Iteration  10: 1559.650 ops/s
# Warmup Iteration  11: 1506.613 ops/s
# Warmup Iteration  12: 1652.656 ops/s
# Warmup Iteration  13: 1777.836 ops/s
# Warmup Iteration  14: 1869.325 ops/s
# Warmup Iteration  15: 2104.927 ops/s
# Warmup Iteration  16: 2066.937 ops/s
# Warmup Iteration  17: 2368.604 ops/s
# Warmup Iteration  18: 2467.098 ops/s
# Warmup Iteration  19: 2600.318 ops/s
# Warmup Iteration  20: 2251.390 ops/s
Iteration   1: 1901.654 ops/s
Iteration   2: 1958.240 ops/s
Iteration   3: 2133.440 ops/s
Iteration   4: 2085.267 ops/s
Iteration   5: 2393.551 ops/s
Iteration   6: 2451.504 ops/s
Iteration   7: 2396.049 ops/s
Iteration   8: 2600.518 ops/s
Iteration   9: 2427.300 ops/s
Iteration  10: 2718.506 ops/s
Iteration  11: 2672.089 ops/s
Iteration  12: 2318.137 ops/s
Iteration  13: 2766.558 ops/s
Iteration  14: 2896.722 ops/s
Iteration  15: 2893.826 ops/s
Iteration  16: 3211.098 ops/s
Iteration  17: 3030.749 ops/s
Iteration  18: 3261.260 ops/s
Iteration  19: 3255.255 ops/s
Iteration  20: 3625.315 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPerson":
  2771.051 ±(99.9%) 253.325 ops/s [Average]
  (min, avg, max) = (1901.654, 2771.051, 3625.315), stdev = 450.284
  CI (99.9%): [2517.726, 3024.375] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.getPersonLinks

# Run progress: 40.00% complete, ETA 00:04:16
# Fork: 1 of 2
# Warmup Iteration   1: 130.864 ops/s
# Warmup Iteration   2: 219.799 ops/s
# Warmup Iteration   3: 365.861 ops/s
# Warmup Iteration   4: 541.592 ops/s
# Warmup Iteration   5: 767.739 ops/s
# Warmup Iteration   6: 1114.319 ops/s
# Warmup Iteration   7: 1344.977 ops/s
# Warmup Iteration   8: 1183.498 ops/s
# Warmup Iteration   9: 1390.706 ops/s
# Warmup Iteration  10: 1429.948 ops/s
# Warmup Iteration  11: 1501.145 ops/s
# Warmup Iteration  12: 1477.539 ops/s
# Warmup Iteration  13: 1582.113 ops/s
# Warmup Iteration  14: 1725.167 ops/s
# Warmup Iteration  15: 1722.925 ops/s
# Warmup Iteration  16: 1627.504 ops/s
# Warmup Iteration  17: 1785.133 ops/s
# Warmup Iteration  18: 1636.976 ops/s
# Warmup Iteration  19: 1729.524 ops/s
# Warmup Iteration  20: 1728.208 ops/s
Iteration   1: 1782.253 ops/s
Iteration   2: 1680.056 ops/s
Iteration   3: 1702.481 ops/s
Iteration   4: 1511.837 ops/s
Iteration   5: 1671.328 ops/s
Iteration   6: 1516.023 ops/s
Iteration   7: 1846.568 ops/s
Iteration   8: 1780.529 ops/s
Iteration   9: 1898.425 ops/s
Iteration  10: 1950.799 ops/s
Iteration  11: 2024.137 ops/s
Iteration  12: 1882.412 ops/s
Iteration  13: 2085.390 ops/s
Iteration  14: 2133.082 ops/s
Iteration  15: 2086.086 ops/s
Iteration  16: 2124.632 ops/s
Iteration  17: 1944.999 ops/s
Iteration  18: 2158.890 ops/s
Iteration  19: 2234.670 ops/s
Iteration  20: 2403.803 ops/s

# Run progress: 50.00% complete, ETA 00:03:34
# Fork: 2 of 2
# Warmup Iteration   1: 114.839 ops/s
# Warmup Iteration   2: 201.928 ops/s
# Warmup Iteration   3: 301.883 ops/s
# Warmup Iteration   4: 359.310 ops/s
# Warmup Iteration   5: 485.261 ops/s
# Warmup Iteration   6: 571.640 ops/s
# Warmup Iteration   7: 789.684 ops/s
# Warmup Iteration   8: 1310.455 ops/s
# Warmup Iteration   9: 1326.679 ops/s
# Warmup Iteration  10: 1315.031 ops/s
# Warmup Iteration  11: 1412.895 ops/s
# Warmup Iteration  12: 1254.173 ops/s
# Warmup Iteration  13: 1064.812 ops/s
# Warmup Iteration  14: 1387.441 ops/s
# Warmup Iteration  15: 1306.176 ops/s
# Warmup Iteration  16: 1452.299 ops/s
# Warmup Iteration  17: 1528.061 ops/s
# Warmup Iteration  18: 1577.302 ops/s
# Warmup Iteration  19: 1655.158 ops/s
# Warmup Iteration  20: 1578.760 ops/s
Iteration   1: 1713.927 ops/s
Iteration   2: 1656.810 ops/s
Iteration   3: 1771.590 ops/s
Iteration   4: 1752.756 ops/s
Iteration   5: 1672.333 ops/s
Iteration   6: 1778.090 ops/s
Iteration   7: 1618.259 ops/s
Iteration   8: 1458.268 ops/s
Iteration   9: 1378.822 ops/s
Iteration  10: 1736.506 ops/s
Iteration  11: 1746.186 ops/s
Iteration  12: 1528.116 ops/s
Iteration  13: 1782.602 ops/s
Iteration  14: 1771.158 ops/s
Iteration  15: 1793.205 ops/s
Iteration  16: 1804.531 ops/s
Iteration  17: 1981.214 ops/s
Iteration  18: 1841.409 ops/s
Iteration  19: 1750.857 ops/s
Iteration  20: 1906.029 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.getPersonLinks":
  1821.527 ±(99.9%) 123.062 ops/s [Average]
  (min, avg, max) = (1378.822, 1821.527, 2403.803), stdev = 218.742
  CI (99.9%): [1698.465, 1944.588] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.listPersons

# Run progress: 60.00% complete, ETA 00:02:51
# Fork: 1 of 2
# Warmup Iteration   1: 157.956 ops/s
# Warmup Iteration   2: 219.945 ops/s
# Warmup Iteration   3: 332.414 ops/s
# Warmup Iteration   4: 417.158 ops/s
# Warmup Iteration   5: 546.001 ops/s
# Warmup Iteration   6: 752.295 ops/s
# Warmup Iteration   7: 1364.329 ops/s
# Warmup Iteration   8: 1408.721 ops/s
# Warmup Iteration   9: 1521.688 ops/s
# Warmup Iteration  10: 1411.630 ops/s
# Warmup Iteration  11: 1476.131 ops/s
# Warmup Iteration  12: 1434.836 ops/s
# Warmup Iteration  13: 1677.757 ops/s
# Warmup Iteration  14: 1578.896 ops/s
# Warmup Iteration  15: 1722.828 ops/s
# Warmup Iteration  16: 1433.144 ops/s
# Warmup Iteration  17: 1638.017 ops/s
# Warmup Iteration  18: 1556.847 ops/s
# Warmup Iteration  19: 1470.648 ops/s
# Warmup Iteration  20: 1677.623 ops/s
Iteration   1: 1696.491 ops/s
Iteration   2: 1837.258 ops/s
Iteration   3: 1880.651 ops/s
Iteration   4: 1948.565 ops/s
Iteration   5: 1763.912 ops/s
Iteration   6: 1623.119 ops/s
Iteration   7: 1425.312 ops/s
Iteration   8: 1697.728 ops/s
Iteration   9: 1590.132 ops/s
Iteration  10: 1591.574 ops/s
Iteration  11: 1800.973 ops/s
Iteration  12: 1568.571 ops/s
Iteration  13: 1758.826 ops/s
Iteration  14: 1683.016 ops/s
Iteration  15: 1860.784 ops/s
Iteration  16: 1653.090 ops/s
Iteration  17: 1773.309 ops/s
Iteration  18: 2076.534 ops/s
Iteration  19: 2123.749 ops/s
Iteration  20: 2078.776 ops/s

# Run progress: 70.00% complete, ETA 00:02:08
# Fork: 2 of 2
# Warmup Iteration   1: 150.806 ops/s
# Warmup Iteration   2: 202.707 ops/s
# Warmup Iteration   3: 290.843 ops/s
# Warmup Iteration   4: 371.968 ops/s
# Warmup Iteration   5: 529.275 ops/s
# Warmup Iteration   6: 634.258 ops/s
# Warmup Iteration   7: 1024.029 ops/s
# Warmup Iteration   8: 1446.278 ops/s
# Warmup Iteration   9: 1414.861 ops/s
# Warmup Iteration  10: 1594.599 ops/s
# Warmup Iteration  11: 1587.554 ops/s
# Warmup Iteration  12: 1414.767 ops/s
# Warmup Iteration  13: 1762.747 ops/s
# Warmup Iteration  14: 1676.391 ops/s
# Warmup Iteration  15: 1719.649 ops/s
# Warmup Iteration  16: 1778.466 ops/s
# Warmup Iteration  17: 1835.890 ops/s
# Warmup Iteration  18: 1997.706 ops/s
# Warmup Iteration  19: 1730.208 ops/s
# Warmup Iteration  20: 1925.162 ops/s
Iteration   1: 1932.330 ops/s
Iteration   2: 1993.228 ops/s
Iteration   3: 1884.929 ops/s
Iteration   4: 2024.475 ops/s
Iteration   5: 1982.666 ops/s
Iteration   6: 2174.677 ops/s
Iteration   7: 1980.730 ops/s
Iteration   8: 2331.844 ops/s
Iteration   9: 2207.313 ops/s
Iteration  10: 2382.925 ops/s
Iteration  11: 2032.880 ops/s
Iteration  12: 2161.642 ops/s
Iteration  13: 2158.478 ops/s
Iteration  14: 2379.519 ops/s
Iteration  15: 2354.086 ops/s
Iteration  16: 2367.449 ops/s
Iteration  17: 2595.519 ops/s
Iteration  18: 2363.697 ops/s
Iteration  19: 2743.025 ops/s
Iteration  20: 2607.018 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.listPersons":
  2002.270 ±(99.9%) 178.043 ops/s [Average]
  (min, avg, max) = (1425.312, 2002.270, 2743.025), stdev = 316.471
  CI (99.9%): [1824.227, 2180.313] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_181, OpenJDK 64-Bit Server VM, 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: metrifier.benchmark.RPCAvroBenchmark.programComposition

# Run progress: 80.00% complete, ETA 00:01:25
# Fork: 1 of 2
# Warmup Iteration   1: 20.135 ops/s
# Warmup Iteration   2: 38.832 ops/s
# Warmup Iteration   3: 51.750 ops/s
# Warmup Iteration   4: 71.262 ops/s
# Warmup Iteration   5: 108.801 ops/s
# Warmup Iteration   6: 167.476 ops/s
# Warmup Iteration   7: 151.041 ops/s
# Warmup Iteration   8: 177.772 ops/s
# Warmup Iteration   9: 156.935 ops/s
# Warmup Iteration  10: 173.298 ops/s
# Warmup Iteration  11: 186.780 ops/s
# Warmup Iteration  12: 184.736 ops/s
# Warmup Iteration  13: 196.477 ops/s
# Warmup Iteration  14: 176.448 ops/s
# Warmup Iteration  15: 200.955 ops/s
# Warmup Iteration  16: 203.151 ops/s
# Warmup Iteration  17: 215.691 ops/s
# Warmup Iteration  18: 208.085 ops/s
# Warmup Iteration  19: 240.188 ops/s
# Warmup Iteration  20: 219.545 ops/s
Iteration   1: 219.739 ops/s
Iteration   2: 222.596 ops/s
Iteration   3: 238.244 ops/s
Iteration   4: 228.762 ops/s
Iteration   5: 206.934 ops/s
Iteration   6: 210.033 ops/s
Iteration   7: 230.615 ops/s
Iteration   8: 245.138 ops/s
Iteration   9: 202.191 ops/s
Iteration  10: 224.598 ops/s
Iteration  11: 235.820 ops/s
Iteration  12: 234.278 ops/s
Iteration  13: 233.159 ops/s
Iteration  14: 234.388 ops/s
Iteration  15: 245.853 ops/s
Iteration  16: 240.816 ops/s
Iteration  17: 250.214 ops/s
Iteration  18: 240.529 ops/s
Iteration  19: 265.054 ops/s
Iteration  20: 285.686 ops/s

# Run progress: 90.00% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 17.114 ops/s
# Warmup Iteration   2: 23.939 ops/s
# Warmup Iteration   3: 32.761 ops/s
# Warmup Iteration   4: 48.592 ops/s
# Warmup Iteration   5: 66.860 ops/s
# Warmup Iteration   6: 97.690 ops/s
# Warmup Iteration   7: 130.318 ops/s
# Warmup Iteration   8: 104.742 ops/s
# Warmup Iteration   9: 138.511 ops/s
# Warmup Iteration  10: 142.239 ops/s
# Warmup Iteration  11: 151.040 ops/s
# Warmup Iteration  12: 164.037 ops/s
# Warmup Iteration  13: 183.958 ops/s
# Warmup Iteration  14: 178.310 ops/s
# Warmup Iteration  15: 209.960 ops/s
# Warmup Iteration  16: 194.455 ops/s
# Warmup Iteration  17: 209.106 ops/s
# Warmup Iteration  18: 183.429 ops/s
# Warmup Iteration  19: 187.864 ops/s
# Warmup Iteration  20: 198.639 ops/s
Iteration   1: 175.462 ops/s
Iteration   2: 204.728 ops/s
Iteration   3: 186.301 ops/s
Iteration   4: 206.589 ops/s
Iteration   5: 201.394 ops/s
Iteration   6: 205.579 ops/s
Iteration   7: 209.839 ops/s
Iteration   8: 230.474 ops/s
Iteration   9: 221.657 ops/s
Iteration  10: 242.657 ops/s
Iteration  11: 218.228 ops/s
Iteration  12: 240.337 ops/s
Iteration  13: 222.316 ops/s
Iteration  14: 231.268 ops/s
Iteration  15: 234.520 ops/s
Iteration  16: 269.393 ops/s
Iteration  17: 262.204 ops/s
Iteration  18: 261.091 ops/s
Iteration  19: 282.494 ops/s
Iteration  20: 278.740 ops/s


Result "metrifier.benchmark.RPCAvroBenchmark.programComposition":
  231.998 ±(99.9%) 14.091 ops/s [Average]
  (min, avg, max) = (175.462, 231.998, 285.686), stdev = 25.047
  CI (99.9%): [217.907, 246.089] (assumes normal distribution)


# Run complete. Total time: 00:07:11

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                             Mode  Cnt     Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40  2090.695 ± 147.251  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  2771.051 ± 253.325  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40  1821.527 ± 123.062  ops/s
RPCAvroBenchmark.listPersons         thrpt   40  2002.270 ± 178.043  ops/s
RPCAvroBenchmark.programComposition  thrpt   40   231.998 ±  14.091  ops/s
```

## Summary

### HTTP

```bash
# Run complete. Total time: 00:07:35

Benchmark                          Mode  Cnt    Score    Error  Units
HttpBenchmark.createPerson        thrpt   40  599.976 ± 43.344  ops/s
HttpBenchmark.getPerson           thrpt   40  680.914 ± 52.230  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  713.296 ± 43.999  ops/s
HttpBenchmark.listPersons         thrpt   40  690.897 ± 76.741  ops/s
HttpBenchmark.programComposition  thrpt   40   73.471 ± 10.356  ops/s
```

### mu-rpc - Protobuf Serialization

```bash
# Run complete. Total time: 00:07:06

Benchmark                              Mode  Cnt     Score     Error  Units
RPCProtoBenchmark.createPerson        thrpt   40  7366.238 ± 825.910  ops/s
RPCProtoBenchmark.getPerson           thrpt   40  7924.244 ± 980.973  ops/s
RPCProtoBenchmark.getPersonLinks      thrpt   40  3708.267 ± 444.061  ops/s
RPCProtoBenchmark.listPersons         thrpt   40  5486.742 ± 465.748  ops/s
RPCProtoBenchmark.programComposition  thrpt   40   608.205 ±  63.402  ops/s
```

### mu-rpc - Avro Serialization

```bash
# Run complete. Total time: 00:07:11

Benchmark                             Mode  Cnt     Score     Error  Units
RPCAvroBenchmark.createPerson        thrpt   40  2090.695 ± 147.251  ops/s
RPCAvroBenchmark.getPerson           thrpt   40  2771.051 ± 253.325  ops/s
RPCAvroBenchmark.getPersonLinks      thrpt   40  1821.527 ± 123.062  ops/s
RPCAvroBenchmark.listPersons         thrpt   40  2002.270 ± 178.043  ops/s
RPCAvroBenchmark.programComposition  thrpt   40   231.998 ±  14.091  ops/s
```