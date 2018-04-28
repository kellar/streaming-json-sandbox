# streaming-json-sandbox

```
./gradlew bootRun
```

```
$ curl -v localhost:8080/things
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /things HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.52.1
> Accept: */*
> 
< HTTP/1.1 200 OK
< transfer-encoding: chunked
< Content-Type: application/stream+json
< 
{"state":"oof","createdAt":"2018-04-28T14:00:28.363Z","modifiedAt":"2018-04-28T14:00:29.363Z"}
{"state":"rab","createdAt":"2018-04-28T14:00:28.363Z","modifiedAt":"2018-04-28T14:00:30.364Z"}
{"state":"zab","createdAt":"2018-04-28T14:00:28.363Z","modifiedAt":"2018-04-28T14:00:31.365Z"}
* Curl_http_done: called premature == 0
* Connection #0 to host localhost left intact
```

