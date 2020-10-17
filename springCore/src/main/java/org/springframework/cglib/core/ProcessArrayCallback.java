package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:49
 */
import org.springframework.asm.Type;

public interface ProcessArrayCallback {
    void processElement(Type var1);
}
