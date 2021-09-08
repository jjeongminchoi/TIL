package TIL.java.this_;

public class EX1_Fruit {
	
	public int fruitNo; // 과일 고유번호
	public String fruitName; // 과일 이름

	public void setFruitNo(int fruitNo) {
		this.fruitNo = fruitNo;
	}
	
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	// this를 사용하지 않으면?
//	public void setFruitNo(int fruitNo) {
//		fruitNo = fruitNo;
//	}
//	
//	public void setFruitName(String fruitName) {
//		fruitName = fruitName;
//	}
	
}
