// SalariedEmployee.java

public class SalariedEmployee extends Employee {
	                 
   private double annualSalary; 

   // five-argument constructor
   public SalariedEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double annualSalary)
   {
      // explicit call to superclass Employee constructor 
	  super(firstName, lastName, socialSecurityNumber);

      // if annualSalary is invalid throw exception
      if (annualSalary < 0.0) 
         throw new IllegalArgumentException(
            "Annual salary must be >= 0.0");
      
      this.annualSalary = annualSalary;
   } // end constructor 

   // set annual salary amount
   public void setAnnualSalary(double annualSalary)
   {
      if (annualSalary < 0.0) 
         throw new IllegalArgumentException(
            "Annual salary must be >= 0.0");

      this.annualSalary = annualSalary;
   } 

   // return annual salary
   public double getAnnualSalary()
   {
      return annualSalary;
   }

   @Override 
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", 
         "salaried", super.toString(),
         "annual salary", getAnnualSalary());
   } 
} // end class SalariedEmployee

