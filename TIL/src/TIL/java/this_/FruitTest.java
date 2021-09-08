package TIL.java.this_;

public class FruitTest {
	
	public static void main(String[] args) {
		
		// 1) 자기 자신의 메모리를 가르킨다.
		EX1_Fruit getFruit = new EX1_Fruit();
		
		getFruit.setFruitNo(1001);
		getFruit.setFruitName("사과");
		
		System.out.println(getFruit.fruitNo);
		System.out.println(getFruit.fruitName);
		
		// 2) 생성자에서 다른 생성자를 호출할 경우 사용한다.
		EX2_Fruit getFruit_2 = new EX2_Fruit();
		getFruit_2.showInfo();
		
		EX2_Fruit getFruit_2_1 = new EX2_Fruit(1003, "귤");
		getFruit_2_1.showInfo();
		
		// 3) 인스턴스 자신의 주소를 반환할 때 사용한다.
		EX3_Fruit getFruit_3 = new EX3_Fruit(1005, "수박");
		System.out.println(getFruit_3);
		
		EX3_Fruit test = getFruit_3.getSelf();
		System.out.println(test);
		
	}
	
}
