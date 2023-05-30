package com.example.springadvanced.trace;

public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs; // 로그 시작시간
    private String message; // 시작시 사용한 메시지이다. 이후 로그 종료시에도 이 메시지를 사용해서 출력

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }

    public TraceId getTraceId() {
        return traceId;
    }
}
