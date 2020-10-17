package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:48
 */
import org.springframework.asm.Type;

public abstract class MethodInfo {
    protected MethodInfo() {
    }

    public abstract ClassInfo getClassInfo();

    public abstract int getModifiers();

    public abstract Signature getSignature();

    public abstract Type[] getExceptionTypes();

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else {
            return !(o instanceof MethodInfo) ? false : this.getSignature().equals(((MethodInfo)o).getSignature());
        }
    }

    public int hashCode() {
        return this.getSignature().hashCode();
    }

    public String toString() {
        return this.getSignature().toString();
    }
}
