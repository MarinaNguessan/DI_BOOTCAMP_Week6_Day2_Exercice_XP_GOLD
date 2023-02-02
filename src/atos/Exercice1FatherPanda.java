package atos;

public class Exercice1FatherPanda {
	
    public boolean isPredator;
    
    protected int weight;
    
    private int age;

    public void eat() {  
    
        System.out.println("Après chaque repas, Père Panda prend du poids: " + weight);
    
        System.out.println("Et son âge est: " + age);
      }

	public static void main(String[] args) {
		Exercice1FatherPanda father = new Exercice1FatherPanda();
	        father.eat();
	}

}
