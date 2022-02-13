
# Setting Up Using Docker

## Start Kafka Server

Run docker-compose

```bash
  docker-compose up -d
```

## New Topic

Access the container

```bash
  docker exec -it kakfa /bin/sh
```

Navigate the container directory

```bash
  cd /opt/bitnami/kafka/bin
```

Create a topic

```bash
  kafka-topics.sh --create --bootstrap-server localhost:9092 --topic example
```
        