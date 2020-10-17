package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:46
 */
import org.springframework.asm.Type;

public interface FieldTypeCustomizer extends KeyFactoryCustomizer {
    void customize(CodeEmitter var1, int var2, Type var3);

    Type getOutType(int var1, Type var2);
}
