
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
			System.out.println(name + " не умеет бегать.");
		} else if (distance <= maxRun && distance > 0) {
			System.out.println(name + " пробежал " + distance + " м.");
		} else {
			System.out.println(name + ": ’оз€ин, могу пробежать не более " + maxRun + " м.");
		} 
		
		
	}
	
	public void swim(int distance) {
		if (maxSwim == 0){
			System.out.println(name + " не умеет плавать.");
		} else if (distance <= maxSwim && distance > 0) {
			System.out.println(name + " проплыл " + distance + " м.");
		} else {
			System.out.println(name + ": ’оз€ин, могу проплыть не более " + maxSwim + " м.");
		}
	}
}
