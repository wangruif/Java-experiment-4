

public class boshisheng extends salary implements stJiekou, thJiekou {
    private String name;
    private String gender;
    private int age;
    public boshisheng(String name, String gender, int age){
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String getName(){
        return name;
    }

    String getGender(){
        return gender;
    }

    int getAge(){
        return age;
    }



    @Override
    public double getThSalary() {
        return 0;
    }

    @Override
    public double checkThSalary() {
        return 0;
    }

    @Override
    public double getStFee() {
        return 0;
    }

    @Override
    public double checkStFee() {
        return 0;
    }
}
