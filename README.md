
# Configurando o Kafka

## Subindo o Kafka

Executar o docker-compose

```bash
  docker-compose up -d
```

## Novo tópico

Acessar o container

```bash
  docker exec -it kakfa /bin/sh
```

Navegar no diretório do container

```bash
  cd /opt/bitnami/kafka/bin
```

Criar um tópico

```bash
  kafka-topics.sh --create --bootstrap-server localhost:9092 --topic example
```
        