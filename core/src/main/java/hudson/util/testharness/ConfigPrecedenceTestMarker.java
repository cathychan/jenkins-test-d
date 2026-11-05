package hudson.util.testharness;

/**
 * Test harness marker file for the BEE-74961 PR-Agent config-precedence scenario.
 * No functional purpose; exists only to give /describe a diff complex enough
 * to generate a PR diagram.
 */
public class ConfigPrecedenceTestMarker {
    private final ConfigPrecedenceTestHelper helper = new ConfigPrecedenceTestHelper();

    public String describe() {
        return helper.summarize();
    }
}
