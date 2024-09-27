package com.deliveryboy.demo.service;

import com.deliveryboy.demo.config.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME,location);
        logger.info("location produced");
        return true;
    }

}
