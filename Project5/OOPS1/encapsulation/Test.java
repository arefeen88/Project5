package encapsulation;

public class Test {

	public static void main(String[] args) {
		

		Professor pf = new Professor();
		
        pf.setName("Stephen Hawkins");
        
        pf.setAge(75);
        
        System.out.println(pf.getName());
        
        System.out.println(pf.getAge());
        
       
		
		
	}

}
