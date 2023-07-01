package memory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Slf4j
public class MemoryCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String memory = context.getEnvironment().getProperty("memory");
        log.info("memory={}",memory);

        // memory값이 on이면 true를 반환
        return "on".equals(memory);
    }
}
