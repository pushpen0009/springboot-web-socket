package com.nabp.pulse.websocket.controller;

import com.nabp.pulse.websocket.dto.PulsePointRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PulsePointsRestController {
    @Autowired
    private SimpMessagingTemplate template;
    @PostMapping("/api/v1/add/points")
    public ResponseEntity<Long> addPulsePoint(@RequestBody PulsePointRequest request) throws Exception {
        Thread.sleep(1000);
        this.template.convertAndSend("/topic/add/pulse-points", request.getPoints());
        return ResponseEntity.status(HttpStatus.OK).body(request.getPoints());
    }
}
