public class AddressBook {

    public static void main(String [] strArgs) {
        Person objPersonOne = new Person();
        System.out.println(objPersonOne.getName());
        objPersonOne.setFirstName("Brandon");
        objPersonOne.setMiddleName("K");
        objPersonOne.setLastName("Miller");
        objPersonOne.setBirthYear("1998");
        objPersonOne.setBirthMonth("02");
        objPersonOne.setBirthDay("28");
        System.out.println(objPersonOne.getBirthDate());
        System.out.println(objPersonOne.getName());

        objPersonOne.setName("J","F","K");
        System.out.println(objPersonOne.getName());
    }
}