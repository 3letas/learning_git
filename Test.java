class Test{

    private String firstName;
    private String lastName;
    private String middleName;
    private int age;

    public Test(String fName, String lName, String mName){
        fName = firstName;
        mName = middleName;
        lName = lastName;

    }

    public void getName(){
        System.out.println(this.firstName + " " + this.middleName + " " + this.lastName);
    }

}
