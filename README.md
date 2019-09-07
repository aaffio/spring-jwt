# spring-jwt
Springboot with JWT

### Pre requisites
Install
- java jdk 8
- apache-maven-3.2.2

### Running The Development Server
```bash
mvn spring-boot:run
```

### Building
```bash
mvn clean package -DskipTests
```

### Testing
```bash
mvn test
```

###how to get bearer
```bash
/api/authenticate?username=username&password=password
```