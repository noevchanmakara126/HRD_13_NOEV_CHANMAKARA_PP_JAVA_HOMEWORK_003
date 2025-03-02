public abstract class StaffMember {
    protected Integer id;
    protected String name;
    protected String address;
    public StaffMember(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public StaffMember() {}

    @Override
    public String toString() {
        return "StaffMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    abstract Double pay(Double salary1);
    abstract Double pay(Double salary1, Double bonus1);
    abstract Double pay(Integer hourWorked, Double rate);
}
