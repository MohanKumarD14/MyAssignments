package week2.day4;

public class APIClient_HA {
	
	//OverLoading

	public void sendRequest(String endpoint) {

		System.out.println("sendRequest endpoint:"+endpoint);
	}

	public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {

		System.out.println("endpoint:"+endpoint + "\n"
				+"requestBody:" +requestBody +"\n"
				+"requestStatus:" +requestStatus);

	}

	public static void main(String[] args) {
		APIClient_HA AC=new APIClient_HA();
		AC.sendRequest("Overload");
		AC.sendRequest("OverloadEx", "requestBody", false);

	}

}
