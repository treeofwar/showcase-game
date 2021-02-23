
public class Prize {
private String name;
private int cost;
public Prize(String xName, int xCost) {
	this.setName(xName);
	this.setCost(xCost);
}
public String getName() {
	return name;
}
public void setName(String xName) {
	this.name = xName;
}
public int getCost() {
	return cost;
}
public void setCost(int xCost) {
	this.cost = xCost;
}

}
