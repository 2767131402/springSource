package org.springframework.cglib.core.internal;

/**
 * @author chenkh
 * @time 2020/10/17 22:40
 */
public interface Function<K, V> {
    V apply(K var1);
}
