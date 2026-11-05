package hudson.triggers;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class SafeTimerTaskCustomLogsRootTest {

    @Test
    void isUsingCustomLogsRootDefaultsToFalse() {
        assertFalse(SafeTimerTask.isUsingCustomLogsRoot());
    }
}
