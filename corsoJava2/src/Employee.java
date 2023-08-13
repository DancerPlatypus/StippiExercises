public class Employee extends Person {
    private double annualSalary;
    private int hireDate;
    private String identificationNumber;

    public Employee (){
        super();
        this.annualSalary = 0;
        this.hireDate = 0;
        this.identificationNumber = null;
    }

    public void setAnnualSalary(double newAnnualSalary){
        this.annualSalary = newAnnualSalary;
    }

    public void setHireDate (int newHireDate){
        this.hireDate = newHireDate;
    }

    public void setIdentificationNumber (String newIdentificationNumber){
        this.identificationNumber = newIdentificationNumber;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public int getHireDate(){
        return hireDate;
    }

    public String getIdentificationNumber(){
        return identificationNumber;
    }

    public boolean equals(Employee newEmployee){
        boolean ck = false;
            if(newEmployee != null){
                if(annualSalary == newEmployee.getAnnualSalary() && hireDate == newEmployee.getHireDate() && identificationNumber == newEmployee.getIdentificationNumber()){
                    ck = true;
                }
            }
        return ck;
    }

}
