public class SalaredEmployee extends StaffMember {
    private Double salary =0.0;
    private Double bonus =0.0;
    public SalaredEmployee(Integer id, String name, String address) {
        super(id, name, address);
    }
    public SalaredEmployee(Double salary, Double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public SalaredEmployee(){
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    Double pay(Double salary1) {
        return salary1;
    }

    @Override
    Double pay(Double salary1, Double bonus1) {
        return salary1 + bonus;
    }

    @Override
    Double pay(Integer hourWorked, Double rate) {
        return hourWorked * rate;
    }
}
