package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:43
 */
import org.springframework.asm.ClassVisitor;

public interface ClassGenerator {
    void generateClass(ClassVisitor var1) throws Exception;
}

