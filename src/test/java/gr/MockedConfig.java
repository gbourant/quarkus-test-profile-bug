package gr;

import io.quarkus.test.Mock;
import io.smallrye.config.SmallRyeConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

public class MockedConfig {

    @Inject
    SmallRyeConfig smallRyeConfig;

    @Mock
    @Produces
    @ApplicationScoped
    ProjectConfig projectConfig() {
        return smallRyeConfig.getConfigMapping(ProjectConfig.class);
    }

}
