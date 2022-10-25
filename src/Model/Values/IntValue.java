package Model.Values;

import Model.Types.IntType;
import Model.Types.Types;

public class IntValue implements Values {
    private int value;

    public IntValue(int value_) {
        this.value = value_;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Types getType() {
        return new IntType();
    }

    @Override
    public String toString() {
        return String.format("%d", this.value);
    }

    @Override
    public boolean equals(Object obj) {

    }
}