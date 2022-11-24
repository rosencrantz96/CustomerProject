package customer.project;


public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public void VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
	
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio); //보너스 포인트 계산
		return price - (int) (price * saleRatio);
	}
	
	/*
	【문항4】 아래 항목과 클래스 다이어그램을 참고하여 Customer 클래스에서 override된 showCustomerInfo
    메소드를 VIPCustomer.java에 작성하시오.
      -메소드 실행시 실행 결과는 ‘이율곡님의 등급: VIP, 보너스 포인트: 0점, 담당 상담원 번호:12345’.
      - Customer클래스의 showCustomerInfo()를 호출하여 완성.
     */
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 번호: " + agentID;
	}


	public int getAgentID(){
		return agentID;
	}



}
