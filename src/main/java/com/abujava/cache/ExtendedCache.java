package com.abujava.cache;

import org.springframework.cache.Cache;

import java.util.Collection;

public interface ExtendedCache extends Cache {
    <T, C extends Collection<T>> void evictAll(C keys);
}
