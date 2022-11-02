package View;

import Controller.Controller;
import Exceptions.MyException;
import Model.ADT.IList;
import Model.ADT.MyList;
import Model.Expressions.ValueExpression;
import Model.Expressions.VariableExpression;
import Model.ProgramState;
import Model.Statements.*;
import Model.Types.IntType;
import Model.Values.IntValue;
import Repository.Repository;

public class ExamplesView implements View {
    public static IStatement buildExample(IStatement... statements) {
        if (statements.length == 0) {
            return new NopStatement();
        } else if (statements.length == 1) {
            return statements[0];
        }
        IStatement finalStatement = new CompStatement(statements[0], statements[1]);
        for (int i = 2; i < statements.length; ++i) {
            finalStatement = new CompStatement(finalStatement, statements[i]);
        }
        return finalStatement;
    }

    protected IStatement example0() {
        return buildExample(
                new DeclarationStatement("v", new IntType()),
                new AssStatement("v", new ValueExpression(new IntValue(2))),
                new PrintStatement(new VariableExpression("v"))
        );
    }

    @Override
    public void execute() {
        ProgramState programState = new ProgramState();
        IList<ProgramState> programStates = new MyList<>();
        programStates.add(programState);
        Repository repository = new Repository(programStates);
        Controller controller = new Controller(repository);
        IStatement statement = example0();
        try {
            statement.execute(programState);
            controller.displayOn();
            controller.allStep();
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }
}
