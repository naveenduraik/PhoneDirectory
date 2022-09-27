import com.phonedirectory.BO.AddressBO;
import com.phonedirectory.BO.ContactBO;
import com.phonedirectory.BO.DepartmentBO;
import com.phonedirectory.BO.UserDetailsBO;
import com.phonedirectory.entities.Address;
import com.phonedirectory.entities.Contact;
import com.phonedirectory.entities.Department;
import com.phonedirectory.entities.UserDetails;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter department details");
		Department department = new Department("120","Stark","L&D");
		DepartmentBO departmentBO = new DepartmentBO();
		departmentBO.createDepartmentBO();
		departmentBO.insertDepartmentBO(department);
		
		System.out.println("Enter User details:");
		UserDetails userDetails = new UserDetails("naveen","durai","james@gmail.com","james@gmail.com","lionking999","lionking999","102","member");
		
		UserDetailsBO userDetailsBO = new UserDetailsBO();
		userDetailsBO.createUserBO();
		userDetailsBO.insertUserBO(userDetails);
		userDetailsBO.displayUserList();
		
		System.out.println("Enter Address details");
		Address address = new Address("1","welcome" , "welcome", "welcome","welcome",
				"test", "test", "test", "test", "test", "test","test",10101);
		AddressBO addressBO = new AddressBO();
		addressBO.createAddressBO();
		addressBO.insertAddressBO(address);
		
		System.out.println("Enter Contact details");
		Contact contact = new Contact(5023,"+1","850.245.6059","850.225.7929",10101);		
		ContactBO contactBO = new ContactBO();
		contactBO.createContactBO();
		contactBO.insertContactBO(contact);
	}
}
