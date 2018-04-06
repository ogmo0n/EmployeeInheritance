
public class EmployeeTest {

	public static void main(String[] args) {

		final int arraySize = 10;
		Employee[] employee = new Employee[arraySize];
		employee[0] = new CommissionEmployee("Chen", "Lin", "222-22-2222", 10000.00, 0.06);
		employee[1] = new BasePlusCommissionEmployee("Bob", "Grewus", "333-33-3333", 5000.00, 0.04, 300.00);
		employee[2] = new CommissionEmployee("Phil", "Marker", "555-55-5555", 8000.00, 0.05);
		employee[3] = new CommissionEmployee("Glen", "Huffner", "911-00-0000", 11000.00, 0.07);
		employee[4] = new BasePlusCommissionEmployee("Franklin", "Manchettes", "111-11-1111", 6500.00, 0.05, 250.00);
		employee[5] = new BasePlusCommissionEmployee("Barry", "Goldwater", "000-00-0000", 7500.00, 0.04, 420.00);
		employee[6] = new SalariedEmployee("Fred", "Moosefelt", "444-44-4444", 45000.00);
		employee[7] = new SalariedEmployee("Janet", "Reno", "666-66-6666", 80000.00);
		employee[8] = new SalariedEmployee("Jesus", "Romero", "777-77-7777", 77777.77);
		employee[9] = new SalariedEmployee("Penelope", "Butler", "888-88-8888", 69690.69);
		
		System.out.printf("%s%n", "Chris Odden: Graded Programming Exercise 1.2");
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("%n%s%n", employee[i]);
		}
	}

}
