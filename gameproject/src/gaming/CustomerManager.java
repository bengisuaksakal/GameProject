package gaming;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() +" isimli m��teri eklendi");
		
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() +" isimli m��teri silindi");
		
	}
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() +" isimli m��teri bilgilerini g�ncelledi");
		
	}

}
