package hello.advenced.trace.logtrace;

import hello.advenced.trace.TraceStatus;

public interface LogTrace {
    TraceStatus begin(String name);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
