import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Iterator;

public class Control {
    void mainMenu(){
        Table table = new Table(2, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.CENTER);
        CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        table.setColumnWidth(0,30,30);
        table.setColumnWidth(1,30,30);
        table.addCell("Welcome to Company",cellStyle,2);
        table.addCell("1.Insert Employee " ,cellStyle2 ,2);
        table.addCell("2.Display Information ",cellStyle2,2);
        table.addCell("3.Update Employee ",cellStyle2,2);
        table.addCell("4.Delete Employee ",cellStyle2,2);
        table.addCell("5.Exit Program ",cellStyle2,2);
        System.out.println(table.render());
    }
    void typeEmp(){
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
        CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        table.setColumnWidth(0,30,30);
        table.addCell("1.Volunteer  ",cellStyle2);
        table.addCell("2.Salary Employee",cellStyle2);
        table.addCell("3.Hourly Employee",cellStyle2);
        table.addCell("4.Back",cellStyle2);
        System.out.println(table.render());
    }
    void updateOptVol(StaffMember staff) {
        if (!(staff instanceof Volunteer)) {
            System.out.println("Invalid staff type.");
            return;
        }

       Volunteer vol = (Volunteer) staff;

        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
        CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        table.setColumnWidth(0, 30, 30);
        table.addCell("1. Name", cellStyle2, 3);
        table.addCell("2. Address", cellStyle2, 3);
        table.addCell("3. Salary", cellStyle2, 3);
        table.addCell("4. Back", cellStyle2, 3);
        System.out.println(table.render());
        System.out.printf("Select Your Option: ");
        String option = Main.sc.next();
        Main.sc.nextLine();
        switch (option) {
            case "1" -> {
                boolean wrong = false;
                String inputName ="";
                while (!wrong) {
                    System.out.printf("Please Enter New Name: ");
                    inputName = Main.sc.nextLine().toUpperCase();
                    if (inputName.matches("^[a-zA-Z]+$")) {
                        vol.name = inputName;
                        System.out.println("Staff updated successfully.");
                        wrong = true;
                    }
                    else {
                        System.out.println("Please Enter Valid Name.");
                    }

                }
            }
            case "2" -> {
                boolean wrong = false;
                String inputAddress ="";
                while (!wrong) {
                    System.out.printf("Please Enter New Address: ");
                    inputAddress = Main.sc.nextLine().toUpperCase();
                    if (inputAddress.matches("^[a-zA-Z]+$")) {
                        vol.address = inputAddress;
                        System.out.println("Staff updated successfully.");
                        wrong = true;
                    }
                    else {
                        System.out.println("Please Enter Valid Name.");
                    }

                }
            }
            case "3" -> {
                boolean wrongsalary = false;
                Double inputsalary = 0.0;
                while (!wrongsalary) {
                    System.out.printf("Please Enter New Salary: ");
                    Main.sc.nextLine();
                    String salary = Main.sc.nextLine();
                    if (salary.matches("^[0-9]*\\.?[0-9]*$")) {
                        inputsalary = Double.parseDouble(salary);
                        System.out.println("Staff updated successfully.");
                        wrongsalary = true;
                    } else if (salary.matches("^[a-zA-Z]+$")) {
                        System.out.println("Please Enter Valid Salary.");
                    }
                    else{
                        System.out.println("Please Enter Valid Salary.");
                    }
                    vol.setSalary(inputsalary);
                }

            }
            case "4" -> {
                System.out.println("Back to Previous Menu");
            }

            default -> {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
    void updateOptSal(StaffMember staff) {
        if (!(staff instanceof SalaredEmployee)) {
            System.out.println("Invalid staff type.");
            return;
        }

       SalaredEmployee sal = (SalaredEmployee) staff;

        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
        CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        table.setColumnWidth(0, 30, 30);
        table.addCell("1. Name", cellStyle2, 3);
        table.addCell("2. Address", cellStyle2, 3);
        table.addCell("3. Salary", cellStyle2, 3);
        table.addCell("4. Bonus", cellStyle2, 3);
        table.addCell("5. Back", cellStyle2, 3);
        System.out.println(table.render());
        System.out.printf("Select Your Option: ");
        String option = Main.sc.next();

        switch (option) {
            case "1" -> {
                boolean wrong = false;
                String inputName ="";
                while (!wrong) {
                    System.out.printf("Please Enter New Name: ");
                    Main.sc.nextLine();
                    inputName = Main.sc.nextLine().toUpperCase();
                    if (inputName.matches("^[a-zA-Z]+$")) {
                        sal.name = inputName;
                        System.out.println("Staff updated successfully.");
                        wrong = true;
                    }
                    else {
                        System.out.println("Please Enter Valid Name.");
                    }

                }
            }
            case "2" -> {
                boolean wrong = false;
                String inputAddress ="";
                while (!wrong) {
                    System.out.printf("Please Enter New Address: ");
                    Main.sc.nextLine();
                    inputAddress = Main.sc.nextLine().toUpperCase();
                    if (inputAddress.matches("^[a-zA-Z]+$")) {
                        sal.address = inputAddress;
                        System.out.println("Staff updated successfully.");
                        wrong = true;
                    }
                    else {
                        System.out.println("Please Enter Valid Name.");
                    }

                }
            }
            case "3" -> {
                boolean wrongsalary = false;
                Double inputsalary = 0.0;
                while (!wrongsalary) {
                    System.out.printf("Please Enter New Salary: ");
                    Main.sc.nextLine();
                    String salary = Main.sc.nextLine();
                    if (salary.matches("^[0-9]*\\.?[0-9]*$")) {
                        inputsalary = Double.parseDouble(salary);
                        System.out.println("Staff updated successfully.");
                        wrongsalary = true;
                    } else if (salary.matches("^[a-zA-Z]+$")) {
                        System.out.println("Please Enter Valid Salary.");
                    }
                    else{
                        System.out.println("Please Enter Valid Salary.");
                    }
                    sal.setSalary(inputsalary);
                }
            }
            case "4" -> {
                boolean wrongbonus = false;
                Double inputbonus = 0.0;
                while (!wrongbonus) {
                    System.out.printf("Please Enter New Bonus : ");
                    Main.sc.nextLine();
                    String bonus = Main.sc.nextLine();
                    if (bonus.matches("^[0-9]*\\.?[0-9]*$")) {
                        inputbonus = Double.parseDouble(bonus);
                        System.out.println("Staff updated successfully.");
                        wrongbonus = true;
                    } else if (bonus.matches("^[a-zA-Z]+$")) {
                        System.out.println("Please Enter Valid Bonus.");
                    }
                    else{
                        System.out.println("Please Enter Valid Bonus.");
                    }
                    sal.setBonus(inputbonus);
                }
            }
            case "5" -> {
                System.out.println("Returning to the previous menu...");
            }
            default -> {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
    void updateOptHour(StaffMember staff) {
        if (!(staff instanceof HourlyEmployee)) {
            System.out.println("Invalid staff type.");
            return;
        }

        HourlyEmployee hour = (HourlyEmployee) staff;
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
        CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        table.setColumnWidth(0, 30, 30);
        table.addCell("1. Name", cellStyle2, 3);
        table.addCell("2. Address", cellStyle2, 3);
        table.addCell("3. Hour", cellStyle2, 3);
        table.addCell("4. Rate", cellStyle2, 3);
        table.addCell("5. Back", cellStyle2, 3);

        System.out.println(table.render());

        System.out.printf("Select Your Option: ");
        String option = Main.sc.next();
        Main.sc.nextLine();
        switch (option) {
            case "1" -> {
                boolean wrong = false;
                String inputName ="";
                while (!wrong) {
                    System.out.printf("Please Enter New Name: ");
                    inputName = Main.sc.nextLine().toUpperCase();
                    if (inputName.matches("^[a-zA-Z]+$")) {
                        hour.name = inputName;
                        System.out.println("Staff updated successfully.");
                        wrong = true;
                    }
                    else {
                        System.out.println("Please Enter Valid Name.");
                    }

                }
            }
            case "2" -> {
                boolean wrong = false;
                String inputAddress ="";
                while (!wrong) {
                    System.out.printf("Please Enter New Address: ");
                    Main.sc.nextLine();
                    inputAddress = Main.sc.nextLine().toUpperCase();
                    if (inputAddress.matches("^[a-zA-Z]+$")) {
                        hour.address = inputAddress;
                        System.out.println("Staff updated successfully.");
                        wrong = true;
                    }
                    else {
                        System.out.println("Please Enter Valid Name.");
                    }

                }

            }
            case "3" -> {
                boolean wronghour = false;
                Integer inputhour= 0;
                while (!wronghour) {
                    System.out.printf("Please Enter New Hour : ");
                    Main.sc.nextLine();
                    String hours = Main.sc.nextLine();
                    if (hours.matches("^[0-9]*\\.?[0-9]*$")) {
                        inputhour = Integer.parseInt(hours);
                        System.out.println("Staff updated successfully.");
                        wronghour = true;
                    } else if (hours.matches("^[a-zA-Z]+$")) {
                        System.out.println("Please Enter Valid Hour.");
                    }
                    else{
                        System.out.println("Please Enter Valid Hour.");
                    }
                    hour.setHourWorked(inputhour);
                }

            }
            case "4" -> {
                boolean wrongrate = false;
                Double inputrate = 0.0;
                while (!wrongrate) {
                    System.out.printf("Please Enter New Rate : ");
                    Main.sc.nextLine();
                    String rate = Main.sc.nextLine();
                    if (rate.matches("^[0-9]*\\.?[0-9]*$")) {
                        inputrate = Double.parseDouble(rate);
                        System.out.println("Staff updated successfully.");
                        wrongrate = true;
                    } else if (rate.matches("^[a-zA-Z]+$")) {
                        System.out.println("Please Enter Valid Rate.");
                    }
                    else{
                        System.out.println("Please Enter Valid Rate.");
                    }
                    hour.setRate(inputrate);
                }

            }
            case "5" -> {
                System.out.println("Returning to the previous menu...");
            }
            default -> {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }


void updateStaff() {
    if (Main.he.isEmpty()) {
        System.out.println("No staff available.");
        return;
    }
    displaywhenDelete();
    boolean exit = false;
    leave :
    while(!exit) {
        boolean wrong = false;
        String option ="";
        while (!wrong) {
            System.out.printf("1.Update Staff \t");
            System.out.printf("2.Back To Main Menu \n");
            System.out.print("Enter Your Option: ");
            option = Main.sc.nextLine();
            if (option.matches("^[1-2]")) {
                wrong = true;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        switch (option) {
            case "1" -> {
                System.out.printf("Please enter the ID of the staff you want to update: ");
                int inputId = Main.sc.nextInt();
                Main.sc.nextLine();
                boolean found = false;
                for (StaffMember staff : Main.he) {
                    if (staff.id == inputId) {
                        found = true;
                        if (staff instanceof Volunteer) {
                            found = true;
                            updateOptVol(staff);
                        } else if (staff instanceof SalaredEmployee) {
                            found = true;
                            updateOptSal(staff);
                        } else if (staff instanceof HourlyEmployee) {
                            found = true;
                            updateOptHour(staff);
                        } else {
                            System.out.println("Invalid staff type.");
                        }
                        break;

                    }


                }
                if (!found) {
                    System.out.println("Staff not found.");
                }
            }
            case "2" ->{
                System.out.println("Returning to the Main menu...");
                break leave;
            }
            default -> {
                System.out.println("Please Enter Valid Option.");
            }
        }
        exit = false;
    }

}
    void displayAll() {
        int showrow = 3;
        int totalpage, startpage, endpage;
        int currentpage = 1;
        if (Main.he.isEmpty()) {
            System.out.println("No staff");
            return;
        }
        totalpage =(int)Math.ceil((double)Main.he.size() / showrow);
        exit:
        while (true){
            startpage =(currentpage-1)*showrow;
            endpage = Math.min(startpage+showrow,Main.he.size());
            Table table = new Table(9, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
            table.setColumnWidth(0,30,30);
            table.setColumnWidth(1,10,10);
            table.setColumnWidth(2,10,10);
            table.setColumnWidth(3,10,10);
            table.setColumnWidth(4,10,10);
            table.setColumnWidth(5,10,10);
            table.setColumnWidth(6,10,10);
            table.setColumnWidth(7,10,10);
            table.setColumnWidth(8,10,10);
            CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.CENTER);
            CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
            table.addCell("TYPE", cellStyle);
            table.addCell("ID", cellStyle);
            table.addCell("NAME", cellStyle);
            table.addCell("ADDRESS", cellStyle);
            table.addCell("SALARY", cellStyle);
            table.addCell("BONUS", cellStyle);
            table.addCell("HOUR", cellStyle);
            table.addCell("RATE", cellStyle);
            table.addCell("PAY", cellStyle);
            for (int i = startpage; i < endpage; i++) {
                    if (Main.he.get(i) instanceof Volunteer) {
                        Volunteer vol = (Volunteer) Main.he.get(i);
                        table.addCell("VOLUNTEER", cellStyle2);
                        table.addCell(String.valueOf(vol.id), cellStyle2);
                        table.addCell(vol.name, cellStyle2);
                        table.addCell(vol.address, cellStyle2);
                        table.addCell(String.valueOf("$"+vol.getSalary()), cellStyle2);
                        table.addCell("...", cellStyle2);
                        table.addCell("...", cellStyle2);
                        table.addCell("...", cellStyle2);
                        Double payed = vol.pay(vol.getSalary());
                        table.addCell(String.valueOf(payed), cellStyle2);
                    }
                    if (Main.he.get(i) instanceof SalaredEmployee) {
                        SalaredEmployee salared = (SalaredEmployee) Main.he.get(i);
                        table.addCell("SALARED_EMPLOYEE", cellStyle2);
                        table.addCell(String.valueOf(salared.id), cellStyle2);
                        table.addCell(salared.name, cellStyle2);
                        table.addCell(salared.address, cellStyle2);
                        table.addCell(String.valueOf("$"+salared.getSalary()), cellStyle2);
                        table.addCell(String.valueOf("$"+salared.getBonus()), cellStyle2);
                        table.addCell("...", cellStyle2);
                        table.addCell("...", cellStyle2);
                        Double payed = salared.pay(salared.getSalary(), salared.getBonus());
                        table.addCell(String.valueOf(payed), cellStyle2);
                    }
                    if (Main.he.get(i) instanceof HourlyEmployee) {
                        HourlyEmployee hoe = (HourlyEmployee) Main.he.get(i);
                        table.addCell("HOURLY EMPLOYEE", cellStyle2);
                        table.addCell(String.valueOf(hoe.id), cellStyle2);
                        table.addCell(hoe.name, cellStyle2);
                        table.addCell(hoe.address, cellStyle2);
                        table.addCell("...", cellStyle2);
                        table.addCell("...", cellStyle2);
                        table.addCell(String.valueOf(hoe.getHourWorked()+"H"), cellStyle2);
                        table.addCell(String.valueOf("$"+hoe.getRate()), cellStyle2);
                        Double payed = hoe.pay(hoe.getHourWorked(), hoe.getRate());
                        table.addCell(String.valueOf(payed), cellStyle2);
                    }


            }
            System.out.println(table.render());
            System.out.printf("Page["+currentpage+"/"+totalpage+"] \t");
            System.out.printf("Total Employee ["+Main.he.size()+"] \n");
            System.out.printf("1.Next \t");
            System.out.printf("2.Previous \t");
            System.out.printf("3.First \t");
            System.out.printf("4.Last \t");
            System.out.printf("5.Back to Main Menu \n");
            boolean wrong = false;
            Integer inputpage =0;
            while (!wrong) {
                System.out.printf("Choosing Page : ");
                String page = Main.sc.nextLine();
                if (page.matches("^[1-5]$")){
                   inputpage = Integer.parseInt(page);
                    wrong = true;
                }
                else {
                    System.out.println("Please Enter Valid Page [1-5] ");
                }
                switch (inputpage) {
                    case 1 ->{
                        if (currentpage < totalpage) {
                            currentpage++;
                        }
                        else {
                            System.out.println("This is Last Page");
                        }
                    }
                    case 2->{
                        if(currentpage>1){
                            currentpage--;
                        }
                        else {
                            System.out.println("This is First Page");
                        }

                    }
                    case 3->{
                            currentpage =1;
                    }
                    case 4->{
                        currentpage=totalpage;

                    }
                    case 5 ->{
                        System.out.println("Back To Main Menu");
                        break exit;
                    }
                    default -> {
                        System.out.println("Please Enter Valid Page [1-5] ");
                    }

                }
            }
        }

    }
    void displaywhenDelete(){
        Table table = new Table(9, BorderStyle.UNICODE_ROUND_BOX_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,30,30);
        table.setColumnWidth(1,10,10);
        table.setColumnWidth(2,10,10);
        table.setColumnWidth(3,10,10);
        table.setColumnWidth(4,10,10);
        table.setColumnWidth(5,10,10);
        table.setColumnWidth(6,10,10);
        table.setColumnWidth(7,10,10);
        table.setColumnWidth(8,10,10);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.CENTER);
        CellStyle cellStyle2 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        table.addCell("TYPE", cellStyle);
        table.addCell("ID", cellStyle);
        table.addCell("NAME", cellStyle);
        table.addCell("ADDRESS", cellStyle);
        table.addCell("SALARY", cellStyle);
        table.addCell("BONUS", cellStyle);
        table.addCell("HOUR", cellStyle);
        table.addCell("RATE", cellStyle);
        table.addCell("PAY", cellStyle);
        for (int i = 0; i < Main.he.size(); i++) {
            if (Main.he.get(i) instanceof Volunteer) {
                Volunteer vol = (Volunteer) Main.he.get(i);
                table.addCell("VOLUNTEER", cellStyle2);
                table.addCell(String.valueOf(vol.id), cellStyle2);
                table.addCell(vol.name, cellStyle2);
                table.addCell(vol.address, cellStyle2);
                table.addCell(String.valueOf("$"+vol.getSalary()), cellStyle2);
                table.addCell("...", cellStyle2);
                table.addCell("...", cellStyle2);
                table.addCell("...", cellStyle2);
                Double payed = vol.pay(vol.getSalary());
                table.addCell(String.valueOf(payed), cellStyle2);
            }
            if (Main.he.get(i) instanceof SalaredEmployee) {
                SalaredEmployee salared = (SalaredEmployee) Main.he.get(i);
                table.addCell("SALARED_EMPLOYEE", cellStyle2);
                table.addCell(String.valueOf(salared.id), cellStyle2);
                table.addCell(salared.name, cellStyle2);
                table.addCell(salared.address, cellStyle2);
                table.addCell(String.valueOf("$"+salared.getSalary()), cellStyle2);
                table.addCell(String.valueOf("$"+salared.getBonus()), cellStyle2);
                table.addCell("...", cellStyle2);
                table.addCell("...", cellStyle2);
                Double payed = salared.pay(salared.getSalary(), salared.getBonus());
                table.addCell(String.valueOf(payed), cellStyle2);
            }
            if (Main.he.get(i) instanceof HourlyEmployee) {
                HourlyEmployee hoe = (HourlyEmployee) Main.he.get(i);
                table.addCell("HOURLY EMPLOYEE", cellStyle2);
                table.addCell(String.valueOf(hoe.id), cellStyle2);
                table.addCell(hoe.name, cellStyle2);
                table.addCell(hoe.address, cellStyle2);
                table.addCell("...", cellStyle2);
                table.addCell("...", cellStyle2);
                table.addCell(String.valueOf(hoe.getHourWorked()+" H"), cellStyle2);
                table.addCell(String.valueOf("$"+hoe.getRate()), cellStyle2);
                Double payed = hoe.pay(hoe.getHourWorked(), hoe.getRate());
                table.addCell(String.valueOf(payed), cellStyle2);
            }
        }
        System.out.println(table.render());
    }
    void deleteStaff() {
        displaywhenDelete();
        if (Main.he.isEmpty()) {
            System.out.println("No staff");
            return;
        }
        boolean delete = false;
        Integer inputId =0;
        String input ="";
        while (!delete) {
            System.out.printf("Please Enter Employee ID: ");
            input = Main.sc.nextLine();
            if (input.matches("^[0-9]*\\.?[0-9]*$")){
                delete = true;
                inputId = Integer.parseInt(input);
            }
            else {
                System.out.println("Please Enter Valid Employee ID.");
            }
        }
        boolean found = false;
        Iterator<StaffMember> iterator = Main.he.iterator();
        while (iterator.hasNext()) {
            StaffMember staffMember = iterator.next();
            if (staffMember.id == inputId) {
                iterator.remove();
                found = true;
                System.out.println("Deleted Successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Staff not found");
        }
    }
}
