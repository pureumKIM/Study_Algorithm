package pureum.review;

public class Student {
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return name+" "+grade;
	}
	//지울수 있는 방법, 객체의 값을 비교하여 삭제는 돕는다.
	@Override
	public boolean equals(Object obj) {
		//들어온값을 toString()으로 바꾼다.
		String compareValue = obj.toString();
		//현재 내가 가지고 있는 값.
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	@Override
	public int hashCode() {
		// hashCode()에 맞는 값을 이름과 학년으로 뽑아낸다.
		return toString().hashCode();
	}
}
