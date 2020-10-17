package org.springframework.cglib.core;

/**
 * @author chenkh
 * @time 2020/10/17 22:43
 */
import org.springframework.asm.Label;

public class Block {
    private CodeEmitter e;
    private Label start;
    private Label end;

    public Block(CodeEmitter e) {
        this.e = e;
        this.start = e.mark();
    }

    public CodeEmitter getCodeEmitter() {
        return this.e;
    }

    public void end() {
        if (this.end != null) {
            throw new IllegalStateException("end of label already set");
        } else {
            this.end = this.e.mark();
        }
    }

    public Label getStart() {
        return this.start;
    }

    public Label getEnd() {
        return this.end;
    }
}
