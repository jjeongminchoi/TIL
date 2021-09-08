package TIL.java.this_;

public class EX2_Fruit {
	
	public int fruitNo; // 과일 고유번호
	public String fruitName; // 과일 이름
	
	public EX2_Fruit() {
		this(1002, "오렌지");
	}

	// 해당 구문이 첫번째 구문이 되어야 한다. 해당 코드로 실행할 경우 에러 발생.
//	public EX2_Fruit() {
//		fruitNo = 1003;
//		this(1004, "낑깡");
//	}
	
	public EX2_Fruit(int fruitNo, String fruitName) {
		this.fruitNo = fruitNo;
		this.fruitName = fruitName;
	}
	
	public void showInfo() {
		System.out.println("과일 고유번호 : " + fruitNo);
		System.out.println("과일 이름 : " + fruitName);
	}
	
}
