package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:50
 */
import java.lang.reflect.Member;

public class RejectModifierPredicate implements Predicate {
    private int rejectMask;

    public RejectModifierPredicate(int rejectMask) {
        this.rejectMask = rejectMask;
    }

    public boolean evaluate(Object arg) {
        return (((Member)arg).getModifiers() & this.rejectMask) == 0;
    }
}
