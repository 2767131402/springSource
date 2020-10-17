package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:51
 */
import java.lang.ref.WeakReference;

public class WeakCacheKey<T> extends WeakReference<T> {
    private final int hash;

    public WeakCacheKey(T referent) {
        super(referent);
        this.hash = referent.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakCacheKey)) {
            return false;
        } else {
            Object ours = this.get();
            Object theirs = ((WeakCacheKey)obj).get();
            return ours != null && theirs != null && ours.equals(theirs);
        }
    }

    public int hashCode() {
        return this.hash;
    }

    public String toString() {
        T t = this.get();
        return t == null ? "Clean WeakIdentityKey, hash: " + this.hash : t.toString();
    }
}

