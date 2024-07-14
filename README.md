# Spring Boot Kafka Project

This project demonstrates how to integrate Apache Kafka with a Spring Boot application to publish and consume messages. It includes a simple setup for both producer and consumer components using Spring Kafka.

## Prerequisites

- Java 8 or higher
- Docker
- Apache Kafka (installed and running on `localhost:9092`)

## Technologies Used

- Spring Boot
- Spring Kafka
- Maven

## Setup Instructions

### 1. Docker Compose Setup

Start by setting up Kafka and Zookeeper using Docker Compose.

```bash
# Navigate to your project directory
cd your_project_directory

# Start Docker Compose
docker compose up -d
```

###2. Clone the Repository

```bash
gh repo clone s-ramyalakshmi/spring-boot-kafka
cd SpringBootKafka
```
Run the Spring Boot application

###3. Kafka Operations

Create Kafka topic
```bash
docker compose exec kafka bash

# Inside the Kafka container
cd /opt/kafka/bin
./kafka-topics.sh --create --topic mytopic --partitions 1 --replication-factor 1 --bootstrap-server localhost:9092
```

###4. REST API Endpoint
POST messages to Kafka topic via REST API:

Endpoint: POST http://localhost:8080/kafka/publish
Body: form-data 
KEY: message VALUE: *any message*
