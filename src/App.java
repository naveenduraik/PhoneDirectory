
import com.phonedirectory.BO.AddressBO;
import com.phonedirectory.BO.ContactBO;
import com.phonedirectory.BO.DepartmentBO;
import com.phonedirectory.BO.UserDetailsBO;
import com.phonedirectory.entities.Address;
import com.phonedirectory.entities.Contact;
import com.phonedirectory.entities.Department;
import com.phonedirectory.entities.UserDetails;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {	
		System.out.println("Enter department details..");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter DepartmentId");
		String departmentId = scanner.next();
		System.out.print("Enter departmentName");
		String departmentName = scanner.next();
		System.out.println("Enter Department details");
		String details = scanner.next();
		
		Department department = new Department(departmentId,departmentName,details);
		DepartmentBO departmentBO = new DepartmentBO();
		departmentBO.createDepartmentBO();
		departmentBO.insertDepartmentBO(department);
		
		System.out.println("User details:");
		System.out.println("Enter FirstName:");
		String firstName = scanner.next();
		System.out.println("Enter LastName:");
		String lastName = scanner.next();
		System.out.println("Enter PrimaryEmailId:");
		String primaryEmailId = scanner.next();
		System.out.println("Enter SecondaryEmailId");
		String secondaryEmailId = scanner.next();
		System.out.println("Enter PassKey");
		String passkey = scanner.next();
		System.out.println("ConfirmPasskey");
		String confirmPassKey = scanner.next();
		System.out.println("Enter DepartmentId");
		String department_Id = scanner.next();
		System.out.println("Enter designation");
		String designation = scanner.next();
		UserDetails userDetails = new UserDetails(firstName,lastName,primaryEmailId,secondaryEmailId,passkey,confirmPassKey
													,department_Id,designation);
		
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
		Contact contact = new Contact(5026,"+1","850.245.6059","850.225.7929",10101);		
		ContactBO contactBO = new ContactBO();
		contactBO.createContactBO();
		contactBO.insertContactBO(contact);

		scanner.close();
	}
}
