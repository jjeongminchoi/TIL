package TIL.java.this_;

public class EX3_Fruit {
	
	public int fruitNo; // 과일 고유번호
	public String fruitName; // 과일 이름
	
	public EX3_Fruit(int fruitNo, String fruitName) {
		this.fruitNo = fruitNo;
		this.fruitName = fruitName;
	}
	
	public EX3_Fruit getSelf() {
		return this;
	}
	
}
