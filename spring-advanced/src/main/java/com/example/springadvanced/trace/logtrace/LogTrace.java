package com.example.springadvanced.trace.logtrace;

import com.example.springadvanced.trace.TraceStatus;

public interface LogTrace {
    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
