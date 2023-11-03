package training.kafka;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;


public class StreamsStarterApp {
    public static void main(String[] args) {
       Properties config = new Properties();
       config.put(StreamsConfig.APPLICATION_ID_CONFIG, "streams-start-app");
       config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
       config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
       config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
       config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

    }
}