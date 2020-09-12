/**
 * 
 */
package employee;

/**
 * @author Naglis Bukauskas
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete COMPLETED
		// emp3.whoAmI() // prints PART TIME EMPLOYEE because the employee 3 emp3 object was assigned to 
		// pEmp1 which is a part time employee. The whoAmI method in the PartTimeEmployee class prints
		// PART TIME EMPLOYEE. When emp3 was assigned to pEmp1 this overrode the Employee whoAmI method
		// which would have printed EMPLOYEE.
		
		//System.out.println(((PartTimeEmployee) emp3).getHourlyRate());
		
		
		// emp3.getHourlyRate(); // returns syntax error because the method getHourlyRate is not defined
		// for emp3. What we did was upcast Employee emp3 to PartTimeEmployee. This narrows the list of methods
		// that are available to emp3, and so this method from PartTimeEmployee wasn't available. The whoAmI was
		// overridden by the upcast, but the getHourlyRate method was not added. 

		// TODO To complete COMPLETED
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
	
		if (emp3 instanceof PartTimeEmployee) { 
			System.out.println("emp3 is an instance of part time employee");
		} else {
			System.out.println("emp3 is not an instance of part time employee");
		}
		

		// Downcasting 1
		// TODO Uncomment and run the code COMPLETED
		//   PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete COMPLETED
		// This instruction compiles / does not compile
		// This instruction compiles.   
		// This instruction returns a ClassCastException at run time
		// because we are trying to directly downcast from a child class to
		// a parent class. Employee is not an instance of PartTimeEmployee, which is
		// why the exception is thrown. The reason this still compiles is because the downcast
		// might be possible at runtime; there is no way the compiler can check whether
		// or not the cast will succeed. 

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below COMPLETED
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 is an instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
