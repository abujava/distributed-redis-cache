package com.abujava.cache.config;

import com.abujava.cache.UnifiedRedisCache;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.boot.actuate.metrics.cache.CacheMeterBinderProvider;

public class UnifiedRedisCacheMeterBinderProvider implements CacheMeterBinderProvider<UnifiedRedisCache> {

    @Override
    public MeterBinder getMeterBinder(UnifiedRedisCache cache, Iterable<Tag> tags) {
        return new UnifiedRedisCacheMetrics(cache, cache.getName(), tags);
    }
}
