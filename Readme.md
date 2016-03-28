In this case `dev` profile is active using the expected 8081

```
java -jar -Dspring.profiles.active=dev build/libs/boxfuse-hello-world-0.0.1.jar
```

If running with boxfuse (on VirtualBox) dev profile is also activated but the port is on 8080 (which is wrong)

```
boxfuse run '-envvars.SPRING_PROFILES_ACTIVE=dev'
```




