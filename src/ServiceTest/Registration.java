package ServiceTest;

public class Registration {
    public String name;
    public int age;
    public String address;
    public String gender;
    public String disease;

    public Registration(String name, int age, String address, String gender, String disease) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.disease = disease;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
