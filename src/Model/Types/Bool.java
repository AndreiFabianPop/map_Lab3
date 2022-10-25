package Model.Types;

import Model.Values.BoolValue;
import Model.Values.Values;

public class Bool implements Types {

    @Override
    public boolean equals(Types other) {
        return other instanceof Bool;
    }

    @Override
    public Values getDefault() {
        return new BoolValue(false);
    }

    @Override
    public String toString() {
        return "Bool";
    }
}
