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
sbt "demo/runMain metrifier.demo.HttpDemoApp"
```

By default, host and port will be `localhost` and `8080`, respectively. You can override this configuration through either configuration key or environment variable:

* Host: `http.host` VS `HTTP_HOST`.
* Port: `http.port` VS `HTTP_PORT`.

### frees-rpc

* Run Server:

```bash
sbt "frees-rpc/runMain metrifier.rpc.server.RPCServer"
```

* Run Client:

```bash
sbt "demo/runMain metrifier.demo.RPCDemoApp"
```

By default, host and port will be `localhost` and `8080`, respectively. You can override this configuration through either configuration key or environment variable:

* Host: `rpc.host` VS `RPC_HOST`.
* Port: `rpc.port` VS `RPC_PORT`.

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
sbt "bench/jmh:run -o http-benchmark-results.txt -i 20 -wi 20 -f 2 -t 4 metrifier.benchmark.HttpBenchmark"
```

Which means "20 iterations", "20 warmup iterations", "2 forks", "4 threads".

### frees-rpc

* Run Server:

```bash
sbt "frees-rpc/runMain metrifier.rpc.server.RPCServer"
```

* Run Benchmarks:

```bash
sbt "bench/jmh:run -o rpc-benchmark-results.txt -i 20 -wi 20 -f 2 -t 4 metrifier.benchmark.RPCBenchmark"
```

Which means "20 iterations", "20 warmup iterations", "2 forks", "4 threads".

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
# Run complete. Total time: 00:08:52

Benchmark                          Mode  Cnt     Score     Error  Units
HttpBenchmark.createPerson        thrpt   40   861.052 ± 106.109  ops/s
HttpBenchmark.getPerson           thrpt   40  1569.770 ± 153.491  ops/s
HttpBenchmark.getPersonLinks      thrpt   40  1072.277 ± 131.565  ops/s
HttpBenchmark.listPersons         thrpt   40  1196.642 ± 153.626  ops/s
HttpBenchmark.programComposition  thrpt   40   156.592 ±  14.936  ops/s
```

* RPCBenchmark Raw output:

```bash
# Run complete. Total time: 00:09:32

Benchmark                         Mode  Cnt     Score     Error  Units
RPCBenchmark.createPerson        thrpt   40  2127.367 ± 230.981  ops/s
RPCBenchmark.getPerson           thrpt   40  2859.026 ± 205.242  ops/s
RPCBenchmark.getPersonLinks      thrpt   40  1883.806 ± 127.808  ops/s
RPCBenchmark.listPersons         thrpt   40  1762.097 ± 161.918  ops/s
RPCBenchmark.programComposition  thrpt   40   272.358 ±  18.218  ops/s
```

##### Summary

###### **createPerson**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.createPerson | thrpt | 40 | 861.052 | 106.109 | ops/s
RPCBenchmark.createPerson | thrpt | 40 | 2127.367 | 230.981 | ops/s

###### **getPerson**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.getPerson | thrpt | 40 | 1569.770 | 153.491 | ops/s
RPCBenchmark.getPerson | thrpt | 40 | 2859.026 | 205.242 | ops/s

###### **getPersonLinks**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.getPersonLinks | thrpt | 40 | 1072.277 | 131.565 | ops/s
RPCBenchmark.getPersonLinks | thrpt | 40 | 1883.806 | 127.808 | ops/s

###### **listPersons**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.listPersons | thrpt | 40 | 1196.642 | 153.626 | ops/s
RPCBenchmark.listPersons | thrpt | 40 | 1762.097 | 161.918 | ops/s

###### **programComposition**

Source | Mode | Cnt | Score | Error | Units
--- | --- | --- | --- | --- | ---
HttpBenchmark.programComposition | thrpt | 40 | 156.592 |  14.936 | ops/s
RPCBenchmark.programComposition | thrpt | 40 | 272.358 |  18.218 | ops/s

##### Comparing both in Charts

You can find the following charts in [this jsfiddle](http://jsfiddle.net/juanpedromoreno/sjw5jgrj/).

* Bar Chart
![bar-chart-bench](chart-bar.png)

* Radar Chart
![radar-chart-bench](chart-radar.png)

#### Conclusion

Using JMH, we have checked out quickly the performance characteristics for both service architectures, and we can say that the RPC approach is noticeably faster.

## Assembling metrifier

To make a JAR file containing only the external dependencies, type:

```bash
sbt assemblyPackageDependency
```

Output (assuming we are in the project path):

```bash
bench/target/scala-2.12/metrifier-bench-assembly-0.0.2-deps.jar
demo/target/scala-2.12/metrifier-demo-assembly-0.0.2-deps.jar
frees-rpc/target/scala-2.12/metrifier-frees-rpc-assembly-0.0.2-deps.jar
http/target/scala-2.12/metrifier-http-assembly-0.0.2-deps.jar
shared/target/scala-2.12/metrifier-shared-assembly-0.0.2-deps.jar
```

This is intended to be used with a JAR that only contains your project, so now, you can write:

```bash
sbt assembly
```

And we'll get the following artifacts as the result:

```bash
bench/target/scala-2.12/metrifier-bench-assembly-0.0.2.jar
demo/target/scala-2.12/metrifier-demo-assembly-0.0.2.jar
frees-rpc/target/scala-2.12/metrifier-frees-rpc-assembly-0.0.2.jar
http/target/scala-2.12/metrifier-http-assembly-0.0.2.jar
shared/target/scala-2.12/metrifier-shared-assembly-0.0.2.jar
```

### Uploading jars to Google Cloud Storage

In this case, we've created a bucket named as `metrifier` within our GCP project. Assuming this name, these would be the set of commands to run (we're skipping the `bench` artifacts since we are not going to use them):

```bash
export METRIFIER_VERSION=0.0.2
gsutil cp demo/target/scala-2.12/metrifier-demo-assembly-${METRIFIER_VERSION}-deps.jar gs://metrifier/jars
gsutil cp frees-rpc/target/scala-2.12/metrifier-frees-rpc-assembly-${METRIFIER_VERSION}-deps.jar gs://metrifier/jars
gsutil cp http/target/scala-2.12/metrifier-http-assembly-${METRIFIER_VERSION}-deps.jar gs://metrifier/jars
gsutil cp shared/target/scala-2.12/metrifier-shared-assembly-${METRIFIER_VERSION}-deps.jar gs://metrifier/jars
gsutil cp demo/target/scala-2.12/metrifier-demo-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
gsutil cp frees-rpc/target/scala-2.12/metrifier-frees-rpc-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
gsutil cp http/target/scala-2.12/metrifier-http-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
gsutil cp shared/target/scala-2.12/metrifier-shared-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
```

If the project dependencies have not changed, you could just upload the project JARs:

```bash
export METRIFIER_VERSION=0.0.2
gsutil cp demo/target/scala-2.12/metrifier-demo-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
gsutil cp frees-rpc/target/scala-2.12/metrifier-frees-rpc-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
gsutil cp http/target/scala-2.12/metrifier-http-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
gsutil cp shared/target/scala-2.12/metrifier-shared-assembly-${METRIFIER_VERSION}.jar gs://metrifier/jars
```

## Running in Google Cloud Platform

See [this guide](deploy/README.md) to get information about how to deploy the different services in [Google Compute Engine](https://cloud.google.com/compute/).

Once everything is up, follow the next sections to run the benchmarks atop GCP.

### HTTP Server

#### Running the HTTP Server

1. SSH into `http-server-vm` instance.
2. Run the HTTP Server:
```bash
export METRIFIER_VERSION=0.0.2
env \
    HTTP_HOST=http-server-vm \
    HTTP_PORT=8080 \
    java -cp \
    /metrifier/jars/metrifier-shared-assembly-${METRIFIER_VERSION}-deps.jar:/metrifier/jars/metrifier-shared-assembly-${METRIFIER_VERSION}.jar:/metrifier/jars/metrifier-http-assembly-${METRIFIER_VERSION}-deps.jar:/metrifier/jars/metrifier-http-assembly-${METRIFIER_VERSION}.jar \
    metrifier.http.server.HttpServer
```

#### Running HTTP Benchmarks

1. SSH into `http-jmh-vm` instance.
2. Run the following `GET` to fetch all the persons (checking connectivity):
```bash
curl "http://http-server-vm:8080/person"
```
3. If step was successful, run the benchmarks:
```bash
cd /metrifier/repo
env \
    HTTP_HOST=http-server-vm \
    HTTP_PORT=8080 \
    sbt "bench/jmh:run -o /metrifier/bench_results/http-benchmark-results.txt -i 20 -wi 20 -f 2 -t 4 metrifier.benchmark.HttpBenchmark"
```

Given the port `8080` was opened to the exterior when deploying the cluster with Google Cloud Manager, you could even run the benchmarks from your local machine, using the external IP address (changing to HTTP_HOST=[HTTP_SERVER_INSTANCE_EXTERNAL_IP]).

### RPC Server

#### Running the RPC Server

1. SSH into `rpc-server-vm` instance.
2. Run the RPC Server:
```bash
export METRIFIER_VERSION=0.0.2
env \
    RPC_HOST=rpc-server-vm \
    RPC_PORT=8080 \
    java -cp \
    /metrifier/jars/metrifier-shared-assembly-${METRIFIER_VERSION}-deps.jar:/metrifier/jars/metrifier-shared-assembly-${METRIFIER_VERSION}.jar:/metrifier/jars/metrifier-frees-rpc-assembly-${METRIFIER_VERSION}-deps.jar:/metrifier/jars/metrifier-frees-rpc-assembly-${METRIFIER_VERSION}.jar \
    metrifier.rpc.server.RPCServer
```

#### Running RPC Benchmarks

1. SSH into `rpc-jmh-vm` instance.
2. Run the benchmarks:
```bash
cd /metrifier/repo
env \
    RPC_HOST=rpc-server-vm \
    RPC_PORT=8080 \
    sbt "bench/jmh:run -o /metrifier/bench_results/rpc-benchmark-results.txt -i 20 -wi 20 -f 2 -t 4 metrifier.benchmark.RPCBenchmark"
```

As we mentioned for the Http benchmarks, in this case we could also run the benchmarks from our local machine, using the external IP address (changing to RPC_HOST=[RPC_SERVER_INSTANCE_EXTERNAL_IP]).