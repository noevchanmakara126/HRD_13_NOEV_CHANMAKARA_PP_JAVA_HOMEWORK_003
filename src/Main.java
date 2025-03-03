
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static Integer  id = 7;
    public static List<StaffMember> he = new ArrayList(List.of(
            new Volunteer(1,"MAKARA","KPT"),
            new SalaredEmployee(2,"BOTZIN","TBK"),
            new HourlyEmployee(3,"YAMU","KPT"),
            new Volunteer(4,"MENGHOUR","SR"),
            new SalaredEmployee(5,"MONY","KPS"),
            new HourlyEmployee(6,"LIMMENG","KPC")
    )

    );

    public static void main(String[] args) {

        Control control = new Control();
        boolean exit = false;
        while (!exit) {
            control.mainMenu();
            boolean valid = false;
            String choice ="";
            while (!valid) {
                System.out.printf("Please enter your choice: ");
               choice = sc.nextLine();
               if (choice.matches("^[0-9]*\\.?[0-9]*$")) {
                   valid = true;}
               else {

                   System.out.println("Please Enter Valid Option");
               }

            }
            switch (choice) {
                case "1" -> {
                    control.typeEmp();
                    System.out.printf("Please Enter your Option : ");
                    String option = sc.nextLine();
                    switch (option) {
                        case "1" -> {
                            boolean again = false;
                            while (!again) {
                                System.out.println("Employee ID : " +id);
                                boolean wrong = false;
                                String inputName ="";
                                while (!wrong) {
                                    System.out.printf("Enter the name of the Volunteer Employee : ");
                                    inputName = sc.nextLine().toUpperCase();

                                    if (inputName.matches("^[a-zA-Z]+$")) {
                                     wrong = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Name.");
                                    }

                                }

                                boolean wrongadd = false;
                                String inputAddress ="";
                                while (!wrongadd) {
                                    System.out.printf("Enter [" + inputName + "] Address :  ");
                                    inputAddress = sc.nextLine().toUpperCase();
                                    if (inputAddress.matches("^[a-zA-Z ]+$")) {
                                        wrongadd = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Address.");
                                    }
                                }
                                boolean wrongsalary = false;
                                Double inputSalary = 0.0;
                                while (!wrongsalary) {
                                    System.out.printf("Enter Salary : ");
                                    String salary = sc.nextLine();
                                     if (salary.matches("^[0-9]*\\.?[0-9]*$")) {
                                         inputSalary = Double.parseDouble(salary);
                                         wrongsalary = true;
                                    } else if (salary.matches("^[a-zA-Z]+$")) {
                                        System.out.println("Please Enter Valid Salary.");
                                    }
                                     else{
                                         System.out.println("Please Enter Valid Salary.");
                                     }

                                }
                                StaffMember volunteer = new Volunteer(id, inputName, inputAddress);
                                ((Volunteer) volunteer).setSalary(inputSalary);
                               id++;
                                he.add(volunteer);
                                boolean validadd = false;
                                while(!validadd){
                                    System.out.printf("Enter Again Click Y:");
                                    String inputAgain = sc.nextLine().toLowerCase();
                                    if(inputAgain.equals("y")){
                                        break;
                                    }
                                    else if (inputAgain.equals("n")) {
                                        validadd = true;
                                        again = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Option");
                                      return;
                                    }
                                }

                            }
                        }
                        case "2" -> {
                            boolean again = false;
                            while (!again) {
                                System.out.println("Employee ID : " +id);
                                boolean wrong = false;
                                String inputName ="";
                                while (!wrong) {
                                    System.out.printf("Enter the name of the Volunteer Employee : ");
                                    inputName = sc.nextLine().toUpperCase();

                                    if (inputName.matches("^[a-zA-Z]+$")) {
                                        wrong = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Name.");
                                    }

                                }
                                boolean wrongadd = false;
                                String inputAddress ="";
                                while (!wrongadd) {
                                    System.out.printf("Enter [" + inputName + "] Address :  ");
                                    inputAddress = sc.nextLine().toUpperCase();
                                    if (inputAddress.matches("^[a-zA-Z ]+$")) {
                                        wrongadd = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Address.");
                                    }
                                }
                                boolean wrongsalary = false;
                                Double inputSalary = 0.0;
                                while (!wrongsalary) {
                                    System.out.printf("Enter Salary : ");
                                    String salary = sc.nextLine();
                                    if (salary.matches("^[0-9]*\\.?[0-9]*$")) {
                                        inputSalary = Double.parseDouble(salary);
                                        wrongsalary = true;
                                    } else if (salary.matches("^[a-zA-Z]+$")) {
                                        System.out.println("Please Enter Valid Salary.");
                                    }
                                    else{
                                        System.out.println("Please Enter Valid Salary.");
                                    }

                                }
                                boolean wrongbonus = false;
                               Double inputBonus = 0.0;
                                while (!wrongbonus) {
                                    System.out.printf("Enter Bonus : ");
                                    String bonus = sc.nextLine();
                                    if (bonus.matches("^[0-9]*\\.?[0-9]*$")) {
                                        inputBonus = Double.parseDouble(bonus);
                                        wrongbonus= true;
                                    } else if (bonus.matches("^[a-zA-Z]+$")) {
                                        System.out.println("Please Enter Valid Bonus.");
                                    }
                                    else{
                                        System.out.println("Please Enter Valid Bonus.");
                                    }
                                }
                                StaffMember salaredEmployee = new SalaredEmployee(id, inputName, inputAddress);
                                ((SalaredEmployee) salaredEmployee).setSalary(inputSalary);
                                ((SalaredEmployee) salaredEmployee).setBonus(inputBonus);
                                id++;
                                he.add(salaredEmployee);
                                boolean validadd = false;
                                while(!validadd){
                                    System.out.printf("Enter Again Click Y:");
                                    String inputAgain = sc.nextLine().toLowerCase();
                                    if(inputAgain.equals("y")){
                                        break;
                                    }
                                    else if (inputAgain.equals("n")) {
                                        validadd = true;
                                        again = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Option");
                                        return;
                                    }
                                }

                            }
                        }
                        case "3" -> {
                            boolean again = false;
                            while (!again) {
                                System.out.println("Employee ID : " +id);
                                boolean wrong = false;
                                String inputName ="";
                                while (!wrong) {
                                    System.out.printf("Enter the name of the Volunteer Employee : ");
                                    inputName = sc.nextLine().toUpperCase();

                                    if (inputName.matches("^[a-zA-Z]+$")) {
                                        wrong = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Name.");
                                    }

                                }
                                boolean wrongadd = false;
                                String inputAddress ="";
                                while (!wrongadd) {
                                    System.out.printf("Enter [" + inputName + "] Address :  ");
                                    inputAddress = sc.nextLine().toUpperCase();
                                    if (inputAddress.matches("^[a-zA-Z ]+$")) {
                                        wrongadd = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Address.");
                                    }
                                }
                                boolean wronghour = false;
                                Integer inputHour = 0;
                                while (!wronghour) {
                                    System.out.printf("Enter Hour: ");
                                    String hour = sc.nextLine();
                                    if (hour.matches("^[0-9]*\\.?[0-9]*$")) {
                                        inputHour = Integer.parseInt(hour);
                                        wronghour = true;
                                    } else if (hour.matches("^[a-zA-Z]+$")) {
                                        System.out.println("Please Enter Valid Salary.");
                                    }
                                    else{
                                        System.out.println("Please Enter Valid Salary.");
                                    }

                                }
                                boolean wrongrate = false;
                                Double inputRate = 0.0;
                                while (!wrongrate) {
                                    System.out.printf("Enter Rate : ");
                                    String rate = sc.nextLine();
                                    if (rate.matches("^[0-9]*\\.?[0-9]*$")) {
                                        inputRate = Double.parseDouble(rate);
                                        wrongrate = true;
                                    } else if (rate.matches("^[a-zA-Z]+$")) {
                                        System.out.println("Please Enter Valid Rate.");
                                    }
                                    else{
                                        System.out.println("Please Enter Valid Rate.");
                                    }
                                }
                                StaffMember hourEmployee = new HourlyEmployee(id, inputName, inputAddress);
                                ((HourlyEmployee) hourEmployee).setRate(inputRate);
                                ((HourlyEmployee) hourEmployee).setHourWorked(inputHour);
                                id++;
                                he.add(hourEmployee);
                                boolean validadd = false;
                                while(!validadd){
                                    System.out.printf("Enter Again Click Y:");
                                    String inputAgain = sc.nextLine().toLowerCase();
                                    if(inputAgain.equals("y")){
                                        break;
                                    }
                                    else if (inputAgain.equals("n")) {
                                        validadd = true;
                                        again = true;
                                    }
                                    else {
                                        System.out.println("Please Enter Valid Option");
                                        return;
                                    }
                                }
                            }
                        }
                        case "4"->{
                            System.out.println("Back to Main Menu");
                        }
                        default -> {
                            System.out.println("Please Enter Valid Option.");
                        }
                    }
                }
                case "2" -> {
                    control.displayAll();
                }
                case "3" -> {
                    control.updateStaff();
                }
                case "4" -> {
                    control.deleteStaff();
                }
                case "5" ->{
                    System.out.println("Thanks You");
                    System.exit(0);
                }
            }

        }

    }

}