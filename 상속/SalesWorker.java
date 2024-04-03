package part1;

public class SalesWorker extends PermanentWorker {
	private int salesResult; // 월판매 실적
	private double bonusRatio; // 상여금 비율

	public SalesWorker(String name, int salary, double ratio) {
		super(name, salary);  //이름, 연봉
		salesResult = 0;
		bonusRatio = ratio;
	}

	public void addSalesResult(int value) {
		salesResult += value;
	}
	@Override
	public int getPay(){
		return super.getPay()+(int)(salesResult*bonusRatio);
	}
	@Override
	public void showSalaryInfo() {
		showYourName();
		System.out.println("영업직 급여: " + getPay());
	}
}
