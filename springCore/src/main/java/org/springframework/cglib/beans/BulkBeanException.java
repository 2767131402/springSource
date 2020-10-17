package org.springframework.cglib.beans;

/**
 * @author chenkh
 * @time 2020/10/17 22:36
 */
public class BulkBeanException extends RuntimeException {
    private int index;
    private Throwable cause;

    public BulkBeanException(String message, int index) {
        super(message);
        this.index = index;
    }

    public BulkBeanException(Throwable cause, int index) {
        super(cause.getMessage());
        this.index = index;
        this.cause = cause;
    }

    public int getIndex() {
        return this.index;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
