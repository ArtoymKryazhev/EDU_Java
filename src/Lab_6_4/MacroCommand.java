package Lab_6_4;

import java.util.ArrayList;
import java.util.List;

class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        System.out.println("=== Выполнение макроса ===");
        for (Command command : commands) {
            command.execute();
        }
        System.out.println("=== Макрос завершен ===\n");
    }

    @Override
    public void undo() {
        System.out.println("=== Отмена макроса ===");
        // Отменяем команды в обратном порядке
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
        System.out.println("=== Отмена завершена ===\n");
    }
}
