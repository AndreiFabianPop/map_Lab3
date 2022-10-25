package Model.Types;

import Model.Values.Values;

public class Bool implements Types {

    @Override
    public boolean equals(Types other) {
        return other instanceof Bool;
    }

    @Override
    public Values getDefault() {
        return null;
    }
}
