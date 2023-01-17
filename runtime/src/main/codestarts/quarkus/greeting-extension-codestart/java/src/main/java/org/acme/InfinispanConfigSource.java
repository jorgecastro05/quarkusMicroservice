package org.acme.config;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InfinispanConfigSource implements ConfigSource {
    private static final Map<String, String> configuration = new HashMap<>();

    static {
        configuration.put("my.prop.infi", "1234");
    }

    @Override
    public int getOrdinal() {
        return 275;
    }

    @Override
    public Set<String> getPropertyNames() {
        return configuration.keySet();
    }

    @Override
    public String getValue(final String propertyName) {
        return configuration.get(propertyName);
    }

    @Override
    public String getName() {
        return InfinispanConfigSource.class.getSimpleName();
    }
}
