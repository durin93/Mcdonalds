package main.domain;


public enum  MenuItem{

    BIGMAC("빅맥",3000,123),
    SANGHAI("상하이",2500,456),
    COKE("콜라",1500,1234);

    private String name;
    private int cost;
    private int kcal;

    MenuItem(String name, int cost, int kcal) {
        this.name = name;
        this.cost = cost;
        this.kcal = kcal;
    }

    public boolean isThisName(String menuName) {
        return name.equals(menuName);
    }

    public String getName() {
        return name;
    }

    public Food foodlization(){
        return new Food(name,kcal);
    }

    public int getCost() {
        return cost;
    }

    public int getKcal() {
        return kcal;
    }
}
