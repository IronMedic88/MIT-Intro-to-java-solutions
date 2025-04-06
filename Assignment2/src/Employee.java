public class Employee {
    double basePay;
    double hoursWorked;

    Employee(double basePay, double hoursWorked){
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }
    public void setBasePay(double basePay){
        this.basePay = basePay;
    }
    public double getBasePay(){
        return basePay;
    }
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public void getWage(double basePay, double hoursWorked){
        double finalPay = 0;
        double normalPay;
        double overtime;
        if(hoursWorked > 60){
            System.out.println("...error ");
        }
        if(hoursWorked > 40 && hoursWorked < 60){
        normalPay = basePay * 40;
        overtime = (hoursWorked-40) * (basePay * 1.5);
        finalPay = normalPay + overtime;
        System.out.println("final Pay: " + finalPay);
        }
        if(hoursWorked<=40) {
            finalPay = basePay * hoursWorked;
            System.out.println(finalPay);
        }

    }




    }

