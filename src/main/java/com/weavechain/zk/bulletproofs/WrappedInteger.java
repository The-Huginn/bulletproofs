package com.weavechain.zk.bulletproofs;

public class WrappedInteger {
    private int value;

    public WrappedInteger(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Integer increment() {
        return value++;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
