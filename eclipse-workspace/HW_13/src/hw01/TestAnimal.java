package hw01;

public class TestAnimal {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Cat cat = new Cat("����");
		Animal a_fish = new Fish();
		Animal a_spider = new Spider();
		Pet pet = new Cat();
		
		System.out.println("**FIsh�� �޼ҵ� ȣ��");
		fish.setName("�ؾ�θ���");
		System.out.println("������� �̸��� " + fish.getName() + "�Դϴ�");
		fish.play();
		fish.eat();
		fish.walk();
		System.out.println();
		
		System.out.println("**Cat�� �޼ҵ� ȣ��");
		System.out.println("������� �̸��� " + cat.getName() + "�Դϴ�");
		cat.setName("�丣�þ�");
		System.out.println("������� �̸��� " + cat.getName() + "(��)�� �ٲ���ϴ�.");
		cat.play();
		cat.eat();
		cat.walk();
		System.out.println();
		
		System.out.println("**Animal Fish�� �޼ҵ� ȣ��");
		a_fish.eat();
		a_fish.walk();
		System.out.println();
		
		System.out.println("**Animal Spider�� �޼ҵ� ȣ��");
		a_spider.eat();
		a_spider.walk();
		System.out.println();
		
		System.out.println("**Pet Cat�� �޼ҵ� ȣ��");
		pet.play();
		pet.setName("��Ų���");
		System.out.println("�ֿ� ������ �̸��� " + pet.getName() + "(��)�� �����մϴ�.");
		System.out.println();
		
		System.out.println("**��ü�� ���� ���� ��ȯ");
		((Fish)a_fish).play();
		((Fish)a_fish).walk();
		((Fish)a_fish).eat();
		System.out.println();
		
		System.out.println("**������ �׽�Ʈ");
		Animal[] animal = new Animal[3];
		animal[0] = a_spider;
		animal[1] = cat;
		animal[2] = fish;
		for( int i = 0; i < 3; i++ ){
			animal[i].walk();
			animal[i].eat();
		}
		System.out.println();
	}
}
