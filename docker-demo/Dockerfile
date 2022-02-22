FROM gradle:jdk8

WORKDIR /docker-demo
COPY . .
RUN gradle clean build

CMD gradle bootRun
