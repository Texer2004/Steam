public class Data
{
    String firstName;
    String lastName;
    String phoneNumber;
    String address;
    int age;
    Data [] relations;
    //CONSTRUCTOR
    public Data(){
        relations = new Data[10];
    }
    public Data(String first_name, String last_name, ice_age){
        firstName = first_name;
        lastName = last_name;
        age = ice_age;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String first_name){
        firstName = first_name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String last_name){
        lastName = last_name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phone_number){
        phoneNumber = phone_number;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String my_address){
        address = my_address;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int ice_age){
        age = ice_age;
    }
    public Data [] getRelations(){
        return relations;
    }
    public void setRelations(Data [] jesus_relations){
        relations = jesus_relations;
    }


}
