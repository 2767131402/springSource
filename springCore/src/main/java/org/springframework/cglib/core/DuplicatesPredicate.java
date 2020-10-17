package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:46
 */
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesPredicate implements Predicate {
    private Set unique = new HashSet();

    public DuplicatesPredicate() {
    }

    public boolean evaluate(Object arg) {
        return this.unique.add(MethodWrapper.create((Method)arg));
    }
}

