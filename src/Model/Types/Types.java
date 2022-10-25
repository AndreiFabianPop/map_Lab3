package Model.Types;

import Model.Values.Values;

public interface Types {
    boolean equals(Types other);

    Values getDefault();
}
