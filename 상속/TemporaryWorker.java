package part1;

public class TemporaryWorker extends Employee // 임시직(비정규직)
{
	private int workTime;// = 0; // 근무한 시간
	private int payPerHour=0; // 시간당 급여

	public TemporaryWorker(String name, int pay) {
		super(name);
		payPerHour = pay;
	}

	public void addWorkTime(int time) {
		workTime += time;
	}
	@Override
	public int getPay() {
		return workTime * payPerHour;//...복잡한 계산식
	}
	@Override
	public void showSalaryInfo() {
		showYourName();
		System.out.println("비정규직 급여: " + getPay());
	}
}
