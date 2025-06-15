package gr;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@QuarkusTest
@Disabled // if you enable this, the tests somehow pass.
public class NoSpyTest {

    @Inject
    ProjectConfig projectConfig;

    @Test
    public void shouldRun() {
    }
}
