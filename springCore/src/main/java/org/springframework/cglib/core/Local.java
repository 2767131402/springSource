package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:48
 */
import org.springframework.asm.Type;

public class Local {
    private Type type;
    private int index;

    public Local(int index, Type type) {
        this.type = type;
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public Type getType() {
        return this.type;
    }
}
