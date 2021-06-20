package jun.예외처리;

public class exam_10_7_1 {
	public static void main(String[] args) {
		
		try {
			method1(1, 2);
		} catch (JunException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method1(int a, int b) throws JunException {
		if(a < b) {
			throw new JunException();
		}
	}
	
}

class JunException extends Exception {
	public JunException() {
		// TODO Auto-generated constructor stub
	}
	public JunException(String message) {
		super(message);
	}
}
