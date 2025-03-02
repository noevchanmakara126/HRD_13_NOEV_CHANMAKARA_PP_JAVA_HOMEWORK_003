public class HourlyEmployee extends StaffMember{
    private Integer hourWorked =0;
    private Double rate =0.0;
    public HourlyEmployee(Integer id, String name, String address) {
        super(id, name, address);
    }
    public HourlyEmployee(){
    }



    public Integer getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(Integer hourWorked) {
        this.hourWorked = hourWorked;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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
