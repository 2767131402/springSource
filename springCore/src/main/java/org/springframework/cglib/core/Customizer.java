package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:45
 */
import org.springframework.asm.Type;

public interface Customizer extends KeyFactoryCustomizer {
    void customize(CodeEmitter var1, Type var2);
}
