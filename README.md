[![Build Status](https://travis-ci.com/47deg/metrifier.svg?token=x4DpWRL5qXeuK6kxqVSP&branch=master)](https://travis-ci.com/47deg/metrifier)

# metrifier

Comparing HTTP endpoints against frees-rpc services.

## http

* Run Server:

```bash
sbt "http/runMain metrifier.Server"
```

* Run Client:

```bash
sbt "bench/runMain metrifier.http.ClientApp"
```

## frees-rpc

* Run Server:

```bash
sbt "frees-rpc/runMain metrifier.ServerApp"
```

* Run Client:

```bash
sbt "bench/runMain metrifier.rpc.ClientApp"
```
