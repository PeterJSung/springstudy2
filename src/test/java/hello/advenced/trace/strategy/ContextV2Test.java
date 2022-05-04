package hello.advenced.trace.strategy;

import hello.advenced.trace.strategy.code.strategy.ContextV2;
import hello.advenced.trace.strategy.code.strategy.StrategyLogic1;
import hello.advenced.trace.strategy.code.strategy.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    @Test
    void strategyV2() {
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(new StrategyLogic1());
        contextV2.execute(new StrategyLogic2());

        contextV2.execute(() -> log.info("Test 3"));
        contextV2.execute(() -> log.info("Test 4"));
    }
}
