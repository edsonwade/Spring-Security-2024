# Installing Apache Kafka on Ubuntu

## Prerequisites
- Ubuntu operating system
- Java Development Kit (JDK) installed

## Installation Steps

1. **Download Kafka:**
    - Download the latest version of Apache Kafka. Replace `<version>` with the actual version number.
      ```bash
      wget https://downloads.apache.org/kafka/<version>/kafka_<version>.tgz
      ```

2. **Extract Kafka:**
    - Extract the downloaded archive.
      ```bash
      tar -xzf kafka_<version>.tgz
      ```

3. **Navigate to Kafka Directory:**
    - Enter the Kafka directory.
      ```bash
      cd kafka_<version>
      ```

4. **Start Zookeeper:**
    - Apache Kafka requires Zookeeper for coordination. Start Zookeeper.
      ```bash
      bin/zookeeper-server-start.sh config/zookeeper.properties
      ```

5. **Start Kafka Server:**
    - Start the Kafka server.
      ```bash
      bin/kafka-server-start.sh config/server.properties
      ```

6. **Create a Topic (Optional):**
    - Create a Kafka topic if needed.
      ```bash
      bin/kafka-topics.sh --create --topic <topic_name> --bootstrap-server localhost:9092
      ```
      Replace `<topic_name>` with your desired topic name.

7. **Verify Installation:**
    - To verify that Kafka is running correctly, create a producer and a consumer to send and receive messages.

    - **Producer:**
      ```bash
      bin/kafka-console-producer.sh --topic <topic_name> --bootstrap-server localhost:9092
      ```

    - **Consumer:**
      ```bash
      bin/kafka-console-consumer.sh --topic <topic_name> --from-beginning --bootstrap-server localhost:9092
      ```
      Replace `<topic_name>` with the name of your Kafka topic.

