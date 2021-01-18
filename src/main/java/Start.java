
public class Start {

	private static int countCat;
	private static int countDog;

	public static void main(String[] args) {
		Animals[] animalsArray = new Animals[3];
		animalsArray[0] = new Dog("Тузик");
		animalsArray[1] = new Cat("Барсик");
		animalsArray[2] = new Dog("Бобик");
		
		
		for (Animals animal : animalsArray) {
			animal.run(100);
			animal.swim(5);
			countAnimals(animal); 
		}
				
		System.out.println("Созданных котов: " + countCat + " Собак: " + countDog + " Животных всего: " + animalsArray.length);
		
	}

	private static void countAnimals(Animals animal) {
		if (animal instanceof Cat){
			countCat++;
		} else if (animal instanceof Dog) {
			countDog++;
		}
		
	}

}
