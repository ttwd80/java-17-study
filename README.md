# java-17-study

Java 17 - 1Z0-829 - [Link](https://education.oracle.com/java-se-17-developer/pexam_1Z0-829)

## Setup Docker

`docker run -it --rm --name java_17 -v $(pwd):/code amazoncorretto:17.0.3 /bin/bash`

```sh
yum upgrade -y
yum install -y git tar gzip unzip
```

## [Handling date, time, text, numeric and boolean values](./chapter01/README.md)

- Use primitives and wrapper classes including Math API, parentheses,
  type promotion, and casting to evaluate arithmetic and boolean expressions
- Manipulate text, including text blocks, using String and StringBuilder classes
- Manipulate date, time, duration, period, instant and time-zone objects using
  Date-Time API
