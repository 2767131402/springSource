package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:47
 */
public interface GeneratorStrategy {
    byte[] generate(ClassGenerator var1) throws Exception;

    boolean equals(Object var1);
}
