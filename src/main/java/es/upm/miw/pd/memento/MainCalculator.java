package es.upm.miw.pd.memento;


import es.upm.miw.pd.command.calculator.AddCommand;
import es.upm.miw.pd.command.calculator.CommandManager;
import es.upm.miw.pd.command.calculator.PrintCommand;
import es.upm.miw.pd.command.calculator.ResetCommand;
import es.upm.miw.pd.command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        CalculadoraMementable calculator = new CalculadoraMementable();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new DeshacerMementable(calculator));
        this.commandManager.add(new SaveCommandMementable(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
