public class Person {
    private String strFirstName = "";
    private String strLastName = "";
    private String strMiddleName = "";
    private int intBirthYear = 1970;
    private int intBirthMonth = 1;
    private int intBirthDay = 1;
    private char chrGender = ' ';
    private int intHeightIN = 72;
    private int intWeightLBS = 165;

    public void setFirstName(String pstrFirstName) {
        this.strFirstName = pstrFirstName;
    }
    public String getFirstName() {
        return this.strFirstName;
    }

    public void setLastName(String pstrLastName) {
        this.strLastName = pstrLastName;
    }
    public String getLastName() {
        return this.strLastName;
    }

    public void setMiddleName(String pstrMiddleName) {
        this.strMiddleName = pstrMiddleName;
    }
    public String getMiddleName() {
        return this.strMiddleName;
    }
    public void setBirthYear(int pintBirthYear) {
        this.intBirthYear = pintBirthYear;
    }
    public int getBirthYear {
        return this.intBirthYear;
    }
    public void setIntBirthMonth(int pintBirthMonth){
        this.intBirthMonth = pintBirthMonth;
    }
    public int getBirthMonth {
        return this.intBirthMonth;
    }
    public void setBirthDay {
        this.intBirthDay = pintBirthDay;
    }
    public int getIntBirthDay {
        return this.intBirthDay;
    }

    public String getName() {
        return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
    }
    public int getBirthdate(){
        return this.getBirthMonth() + " " + this.getBirthDay() + " " + this.getBirthYear();
    }
    public void setName(String pstrFirstName, 
                            String pstrMiddleName,
                            String pstrLastName) {
        this.setFirstName(pstrFirstName);
        this.setMiddleName(pstrMiddleName);
        this.setLastName(pstrLastName);
    }
}