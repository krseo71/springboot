package memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

/**
 * JVM에서 메모리 정보를 실시간으로 조회하는 기능
 */
@Slf4j
public class MemoryFinder {

    public Memory get() {
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long used = total - free;
        return new Memory(used, max);
    }

    @PostConstruct
    public void init() {
        log.info("init memoryFinder");
    }
}
