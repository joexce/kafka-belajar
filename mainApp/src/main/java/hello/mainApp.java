package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class mainApp {
    public static void main(String[] args){
        SpringApplication.run(mainApp.class, args);
    }

    @KafkaListener(id = "kafka", topics = "pesan-saya")
    public void dltListen(String in) {
        System.out.println("Data yang ditarik : " + in);
    }
}
