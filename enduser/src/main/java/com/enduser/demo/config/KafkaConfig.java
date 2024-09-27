package com.enduser.demo.config;

import com.enduser.demo.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;


@Configuration
public class KafkaConfig {

    @KafkaListener(topics = Constants.LOCATION_UPDATE_TOPIC, groupId = Constants.GROUP_ID)
    public void updatedLocation(String location){
        System.out.println(location);
    }
}
