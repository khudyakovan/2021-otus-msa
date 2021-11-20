FROM maven:3.3-jdk-8

ENV PROJECT_DIR=/opt/homework-02

RUN rm -Rf $PROJECT_DIR

RUN mkdir -p $PROJECT_DIR

EXPOSE 8000

WORKDIR $PROJECT_DIR

#Получение ДЗ#02 из github внутри контейнера
RUN git init && \
    git config core.sparsecheckout true && \
    echo homework-02 > .git/info/sparse-checkout && \
    git remote add -f origin https://github.com/khudyakovan/2021-otus-msa.git && \
    git pull origin master && \
    mv ./homework-02/* ./ && \
    rm -Rf ./homework-01 && rm -Rf ./.git && \
    mvn dependency:resolve && \
    mvn package -DskipTests && \
    mv ./target/homework-*.jar /opt/homework-02/hw02-service.jar

#Запуск сервиса
ENTRYPOINT ["java","-jar","/opt/homework-02/hw02-service.jar"]
