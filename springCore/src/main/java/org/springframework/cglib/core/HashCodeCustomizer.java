package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:47
 */
import org.springframework.asm.Type;

public interface HashCodeCustomizer extends KeyFactoryCustomizer {
    boolean customize(CodeEmitter var1, Type var2);
}
