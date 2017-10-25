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
