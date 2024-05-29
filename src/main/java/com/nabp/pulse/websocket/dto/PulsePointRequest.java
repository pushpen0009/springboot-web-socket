package com.nabp.pulse.websocket.dto;

public class PulsePointRequest {

        private Long points;

        public PulsePointRequest() {
        }

        public PulsePointRequest(Long name) {
            this.points = name;
        }

        public Long getPoints() {
            return points;
        }

        public void setPoints(Long points) {
            this.points = points;
        }
}
