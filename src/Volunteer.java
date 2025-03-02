public class Volunteer extends StaffMember{
    private Double salary =0.0;
    public Volunteer(Integer id, String name, String address) {
        super(id, name, address);
    }
    public Volunteer() {
        super();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    Double pay(Double salary1) {
        return salary1;
    }

    @Override
    Double pay(Double salary1, Double bonus1) {
        return salary1 + bonus1;
    }
    @Override
    Double pay(Integer hourWorked, Double rate) {
        return hourWorked * rate;
    }

}
