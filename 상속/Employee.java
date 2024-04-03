package part1;

public class Employee // 근로자
{
	private String name;

	public Employee(String name) {
		this.name = name;
	}
	public void showYourName() {
		System.out.println("이름:" + name);
	}
    //오버라이딩 대상
	public int getPay() {
		return 0;
	}
	public void showSalaryInfo() {
	}
}
