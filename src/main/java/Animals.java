
public class Animals {
	private String name;
	private int maxRun;
	private int maxSwim;
	
	public Animals(String name, int maxRun, int maxSwim) {
		super();
		this.name = name;
		this.maxRun = maxRun;
		this.maxSwim = maxSwim;
	}
	
	public void run(int distance) {
		if (maxRun == 0){
			System.out.println(name + " �� ����� ������.");
		} else if (distance <= maxRun && distance > 0) {
			System.out.println(name + " �������� " + distance + " �.");
		} else {
			System.out.println(name + ": ������, ���� ��������� �� ����� " + maxRun + " �.");
		} 
		
		
	}
	
	public void swim(int distance) {
		if (maxSwim == 0){
			System.out.println(name + " �� ����� �������.");
		} else if (distance <= maxSwim && distance > 0) {
			System.out.println(name + " ������� " + distance + " �.");
		} else {
			System.out.println(name + ": ������, ���� �������� �� ����� " + maxSwim + " �.");
		}
	}
}
