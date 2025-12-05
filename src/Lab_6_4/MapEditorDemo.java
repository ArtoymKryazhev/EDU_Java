package Lab_6_4;

public class MapEditorDemo {
    public static void main(String[] args) {
        // Создаем отдельные команды
        Command addTree = new AddObject("Дерево", "(10, 15)");
        Command removeRock = new RemoveObject("Камень", "(5, 8)");
        Command changeToForest = new ChangeTerrain("Лес", "Зона А");

        // Создаем макрос и добавляем в него команды
        MacroCommand macro = new MacroCommand();
        macro.addCommand(addTree);
        macro.addCommand(removeRock);
        macro.addCommand(changeToForest);

        // Выполняем макрос
        macro.execute();

        // Отменяем макрос
        macro.undo();

        // Демонстрация выполнения команд по отдельности
        System.out.println("--- Выполнение команд по отдельности ---");
        addTree.execute();
        removeRock.execute();
        changeToForest.execute();

        System.out.println("\n--- Отмена команд по отдельности ---");
        changeToForest.undo();
        removeRock.undo();
        addTree.undo();
    }
}