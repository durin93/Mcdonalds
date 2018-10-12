package main.domain;


public enum  MenuItem{

    BIGMAC("빅맥",3000),
    SANGHAI("상하이",2500);

    private String name;
    private int cost;

    MenuItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public boolean isThisName(String menuName) {
        return name.equals(menuName);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
