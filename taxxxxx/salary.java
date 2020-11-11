
public class salary{
    private double fee;
    private double salary;
    private double yFee;
    private double ySalary;
    private double tax;
    /**
     * this is what tax i use
     * salary tax% number
     * <5000   0%     0
     * <8000   3%     0
     * <17000  10%   210
     * <30000  20%  1440
     * <40000  25%  2660
     * <60000  30%  4410
     * <85000  35%  7160
     * >85000  40% 15160
     * */

    void setSalary(double salary){
        this.salary = salary;
    }

    void setFee(double fee){
        this.fee = fee;
    }
    double getSalary(){
        ySalary = salary * 12;
        return ySalary;
    }

    double getFee(){
        yFee = fee * 2;
        return yFee;
    }

    double getTax(){
        double sl;
        sl =salary - yFee/12;
        if (salary <= 5000){
            tax = sl;
        }else if(salary>5000&&salary<=8000){
            tax = (((sl - 5000) * 0.03)-0);
        }else if(salary>8000&&salary<=17000){
            tax = (((sl - 5000) * 0.10)-210);
        }else if(salary>17000&&salary<=30000){
            tax = (((sl - 5000) * 0.20)-1410);
        }else if(salary>30000&&salary<=40000){
            tax = (((sl - 5000) * 0.25)-2660);
        }else if(salary>40000&&salary<=60000){
            tax = (((sl - 5000) * 0.30)-4410);
        }else if(salary>60000&&salary<=85000){
            tax = (((sl - 5000) * 0.35)-7160);
        }else{
            tax = (((sl - 5000) * 0.40)-15160);
        }
        return tax;
    }

}
