package hello.advenced.trace.hellotrace;

import hello.advenced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTraceV2Test {
    @Test
    void begin_end() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("Hello");
        TraceStatus status2 = trace.begin_sync(status1.getTraceId(), "Hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_ex() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("Hello");
        TraceStatus status2 = trace.begin_sync(status1.getTraceId(), "Hello2");
        trace.exception(status2, new Exception("Test Exception2"));
        trace.exception(status1, new Exception("Test Exception1"));
    }
}