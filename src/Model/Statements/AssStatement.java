package Model.Statements;

import Exceptions.MyException;
import Model.ProgramState;

public class AssStatement implements IStatement{
    private final String key;

    public AssStatement() {
        this.key = new String();
    }

    public AssStatement(String key) {
        this.key = key;
    }

    @Override
    public ProgramState execute(ProgramState state) throws MyException {
        return null;
    }
}
