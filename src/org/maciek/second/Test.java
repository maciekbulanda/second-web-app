package org.maciek.second;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Test {
    @NotNull
    @Size(min=3, message = "message")
    private String val1;

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }
}
