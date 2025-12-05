package Lab_6_4;

class RemoveObject implements Command {
    private String objectName;
    private String position;

    public RemoveObject(String objectName, String position) {
        this.objectName = objectName;
        this.position = position;
    }

    @Override
    public void execute() {
        System.out.println("Удаляем объект '" + objectName + "' из позиции " + position);
    }

    @Override
    public void undo() {
        System.out.println("Восстанавливаем объект '" + objectName + "' в позицию " + position);
    }
}
