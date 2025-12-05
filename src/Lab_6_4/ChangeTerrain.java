package Lab_6_4;

class ChangeTerrain implements Command {
    private String terrainType;
    private String area;

    public ChangeTerrain(String terrainType, String area) {
        this.terrainType = terrainType;
        this.area = area;
    }

    @Override
    public void execute() {
        System.out.println("Меняем тип местности на '" + terrainType + "' в области " + area);
    }

    @Override
    public void undo() {
        System.out.println("Возвращаем прежний тип местности в области " + area);
    }
}
