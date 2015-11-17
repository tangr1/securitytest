# Security Test

## Prerequisites

Install the following tools before you continue:

* Java 1.8
* Gradle 2.8

## Quick Start

Start web server
```
gradle run
```

Access with wrong token
```
curl -i -H "Content-Type: application/json" -H "X-AUTH-TOKEN: aaa" http://localhost:8090/api/users
```

Login to get right token
```
curl -i -H "Content-Type: application/json" -X POST -d '{"username":"admin","password":"admin"}' http://localhost:8090/api/login
export TOKEN=...
```

Access with right token
```
curl -i -H "Content-Type: application/json" -H "X-AUTH-TOKEN: $TOKEN" http://localhost:8090/api/users
```
