1. Download https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/
    Start zipkin-server-2.xxx-exec.jar
    Open in browser: http://localhost:9411/zipkin
    Tool for distributed tracing in microservices ecosystem

2. Start services:
    zipkin-service-1
    zipkin-service-2
    zipkin-service-3
    zipkin-service-4

3. Call zipkin-service-1 to zipkin-service-4 with url following:
    http://localhost:8081/zipkin

