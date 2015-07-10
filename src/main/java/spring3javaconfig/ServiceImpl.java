package spring3javaconfig;

public class ServiceImpl implements service {

	@Override
	public void update() {
		System.out.println("update successfull");
		
	}

	@Override
	public String sayHello(String user) {
		// TODO Auto-generated method stub
		return "HELLO "+user;
	}

}
