package Chapter5;

public class UserData {

	//저장 프로퍼티
	private String name;
	private int cost;
	private int dps;

	
	//생성자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDps() {
		return dps;
	}
	public void setDps(int dps) {
		this.dps = dps;
	}
	public UserData(String name, int cost, int dps) {
		super();
		this.name = name;
		this.cost = cost;
		this.dps = dps;
	}
	public UserData() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserData [name=" + name + ", cost=" + cost + ", dps=" + dps + "]";
	}
	


}
