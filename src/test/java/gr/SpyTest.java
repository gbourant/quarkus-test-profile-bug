package gr;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectSpy;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class SpyTest {

    @InjectSpy
    ProjectConfig projectConfig;

    @Test
    public void shouldRun() {
    }
}
