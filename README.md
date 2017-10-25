[![Build Status](https://travis-ci.com/47deg/metrifier.svg?token=x4DpWRL5qXeuK6kxqVSP&branch=master)](https://travis-ci.com/47deg/metrifier)

# metrifier

Comparing HTTP endpoints against frees-rpc services.

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

### http

* Run Server:

```bash
sbt "http/runMain metrifier.http.server.HttpServer"
```

* Run Benchmarks:

```bash
sbt "bench/jmh:run -i 10 -wi 10 -f 2 -t 1 metrifier.benchmark.HttpBenchmark"
```

Which means "10 iterations", "10 warm-up iterations", "2 fork", "1 thread".

### frees-rpc

* Run Server:

```bash
sbt "frees-rpc/runMain metrifier.rpc.server.RPCServer"
```

* Run Benchmarks:

```bash
sbt "bench/jmh:run -i 10 -wi 10 -f 2 -t 1 metrifier.benchmark.RPCBenchmark"
```

Which means "10 iterations", "10 warm-up iterations", "2 fork", "1 thread".

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
[info] # Run complete. Total time: 00:05:23
[info] Benchmark                          Mode  Cnt     Score     Error  Units
[info] HttpBenchmark.createPerson        thrpt   20     9.178 ±   0.050  ops/s
[info] HttpBenchmark.getPerson           thrpt   20  1680.386 ± 577.062  ops/s
[info] HttpBenchmark.getPersonLinks      thrpt   20  1349.666 ± 174.447  ops/s
[info] HttpBenchmark.listPersons         thrpt   20  1811.600 ± 400.316  ops/s
[info] HttpBenchmark.programComposition  thrpt   20     8.492 ±   0.089  ops/s
```
* RPCBenchmark Raw output:

```bash
[info] # Run complete. Total time: 00:06:06
[info] Benchmark                         Mode  Cnt     Score     Error  Units
[info] RPCBenchmark.createPerson        thrpt   20     9.298 ±   0.044  ops/s
[info] RPCBenchmark.getPerson           thrpt   20  3544.518 ± 970.798  ops/s
[info] RPCBenchmark.getPersonLinks      thrpt   20  2708.222 ± 277.988  ops/s
[info] RPCBenchmark.listPersons         thrpt   20  3042.332 ± 340.310  ops/s
[info] RPCBenchmark.programComposition  thrpt   20     8.755 ±   0.064  ops/s
```

##### Summary

###### **createPerson**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.createPerson | thrpt | 20 | 9.178 | 0.050 | ops/s
RPCBenchmark.createPerson | thrpt | 20 | 9.298 | 0.044 | ops/s

###### **getPerson**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.getPerson | thrpt | 20 | 1680.386 | 577.062 | ops/s
RPCBenchmark.getPerson | thrpt | 20 | 3544.518 | 970.798 | ops/s

###### **getPersonLinks**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.getPersonLinks | thrpt | 20 | 1349.666 | 174.447 | ops/s
RPCBenchmark.getPersonLinks | thrpt | 20 | 2708.222 | 277.988 | ops/s

###### **listPersons**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.listPersons | thrpt | 20 | 1811.600 | 400.316 | ops/s
RPCBenchmark.listPersons | thrpt | 20 | 3042.332 | 340.310 | ops/s

###### **programComposition**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.programComposition | thrpt | 20 | 8.492 | 0.089 | ops/s
RPCBenchmark.programComposition | thrpt | 20 | 8.755 | 0.064 | ops/s
