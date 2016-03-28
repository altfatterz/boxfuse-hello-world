In this case `dev` profile is active using the expected 8081

```
java -jar -Dspring.profiles.active=dev build/libs/boxfuse-hello-world-0.0.1.jar
```

If running with boxfuse (on VirtualBox) dev profile is also activated but the port is on 8080 (which is wrong)

```
boxfuse run '-envvars.SPRING_PROFILES_ACTIVE=dev'
```

The `server.port` is not taken into account in case of custom Spring profiles.

In dev mode (running on VirtualBox) with the `-portsmap.http` we can configure how the port.

On AWS we need to use the `-ports.http`. This will configure the load balancer port.



