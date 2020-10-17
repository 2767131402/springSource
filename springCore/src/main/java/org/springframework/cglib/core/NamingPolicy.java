package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:49
 */
public interface NamingPolicy {
    String getClassName(String var1, String var2, Object var3, Predicate var4);

    boolean equals(Object var1);
}
