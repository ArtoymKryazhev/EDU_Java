package Lab_6_4;

class AddObject implements Command {
    private String objectName;
    private String position;

    public AddObject(String objectName, String position) {
        this.objectName = objectName;
        this.position = position;
    }

    @Override
    public void execute() {
        System.out.println("Добавляем объект '" + objectName + "' в позицию " + position);
    }

    @Override
    public void undo() {
        System.out.println("Удаляем объект '" + objectName + "' из позиции " + position);
    }
}
