[![Build Status](https://travis-ci.com/47deg/metrifier.svg?token=x4DpWRL5qXeuK6kxqVSP&branch=master)](https://travis-ci.com/47deg/metrifier)

# metrifier

Comparing `HTTP` against `frees-rpc` services.

## Running Demo

### http

* Run Server:

```bash
sbt "http/runMain metrifier.http.server.HttpServer"
```

* Run Client:

```bash
sbt "demo/runMain metrifier.demo.http.HttpDemoApp"
```

### frees-rpc

* Run Server:

```bash
sbt "frees-rpc/runMain metrifier.rpc.server.RPCServer"
```

* Run Client:

```bash
sbt "demo/runMain metrifier.demo.rpc.RPCDemoApp"
```

## Running Benchmarks

We are using the [Java Microbenchmark Harness (JMH)](http://openjdk.java.net/projects/code-tools/jmh/) tool, which is helping us to get an experimental answer to a basic question about which implementation executes fastest among:

* HTTP stack based on:
  * `http4s`, version `0.15.12a`.
  * `argonaut`, version `6.2`.
* RPC services stack based on:
  * `freestyle`, version `0.4.1`.
  * `frees-rpc`, version `0.1.2` (atop of [gRPC](https://grpc.io/), version `1.6.1`).

### http

* Run Server:

```bash
sbt "http/runMain metrifier.http.server.HttpServer"
```

* Run Benchmarks:

```bash
sbt "bench/jmh:run -o http-benchmark-results.txt -i 20 -wi 20 -f 2 -t 1 metrifier.benchmark.HttpBenchmark"
```

Which means "20 iterations", "20 warmup iterations", "2 forks", "1 thread".

### frees-rpc

* Run Server:

```bash
sbt "frees-rpc/runMain metrifier.rpc.server.RPCServer"
```

* Run Benchmarks:

```bash
sbt "bench/jmh:run -o rpc-benchmark-results.txt -i 20 -wi 20 -f 2 -t 1 metrifier.benchmark.RPCBenchmark"
```

Which means "20 iterations", "20 warmup iterations", "2 forks", "1 thread".

### Benchmark Results

Expanded version is in the [BENCHMARK_RESULTS.md](BENCHMARK_RESULTS.md) file.

#### Machine Details

* Model Name: MacBook Pro
* Model Identifier: MacBookPro12,1
* Intel(R) Core(TM) i5-5257U CPU @ 2.70GHz
* Number of Processors: 1
* Total Number of Cores: 2
* L2 Cache (per Core): 256 KB
* L3 Cache: 3 MB
* Memory: 16 GB

#### http vs frees-rpc summary

* HttpBenchmark Raw output:

```bash
# Run complete. Total time: 00:08:59

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40     9.236 ±   0.070  ops/s
HttpBenchmark.getPerson           thrpt   40  1717.745 ± 216.141  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  1213.295 ±  84.572  ops/s
HttpBenchmark.listPersons         thrpt   40   987.634 ± 133.290  ops/s
HttpBenchmark.programComposition  thrpt   40     8.606 ±   0.108  ops/s
```

* RPCBenchmark Raw output:

```bash
# Run complete. Total time: 00:09:43

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40     9.371 ±   0.117  ops/s
RPCBenchmark.getPerson           thrpt   40  3193.378 ± 101.669  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  2259.579 ±  36.616  ops/s
RPCBenchmark.listPersons         thrpt   40  2333.681 ±  66.979  ops/s
RPCBenchmark.programComposition  thrpt   40     8.771 ±   0.047  ops/s
```

##### Summary

###### **createPerson**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.createPerson | thrpt | 40 | 9.236 | 0.070 | ops/s
RPCBenchmark.createPerson | thrpt | 40 | 9.371 | 0.117 | ops/s

###### **getPerson**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.getPerson | thrpt | 40 | 1717.745 | 216.141 | ops/s
RPCBenchmark.getPerson | thrpt | 40 | 3193.378 | 101.669 | ops/s

###### **getPersonLinks**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.getPersonLinks | thrpt | 40 | 1213.295 | 84.572 | ops/s
RPCBenchmark.getPersonLinks | thrpt | 40 | 2259.579 | 36.616 | ops/s

###### **listPersons**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.listPersons | thrpt | 40 | 987.634 | 133.290 | ops/s
RPCBenchmark.listPersons | thrpt | 40 | 2333.681 | 66.979 | ops/s

###### **programComposition**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.programComposition | thrpt | 40 | 8.606 | 0.108 | ops/s
RPCBenchmark.programComposition | thrpt | 40 | 8.771 | 0.047 | ops/s

##### Comparing both in a Radar Chart

![bench](radar-chart.png)

#### Conclusion

Using JMH, we have checked out quickly the performance characteristics for both service architectures, and we can say that the RPC approach is noticeably faster.
