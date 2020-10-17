package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:49
 */
import org.springframework.asm.Label;

public interface ObjectSwitchCallback {
    void processCase(Object var1, Label var2) throws Exception;

    void processDefault() throws Exception;
}
