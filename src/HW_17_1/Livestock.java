package HW_17_1;

public abstract class Livestock {
    private int weight;
    private String nickName;
    private String gender;
    private int age;

    public Livestock(int weight, String nickName, String gender, int age) {
        this.weight = weight;
        this.nickName = nickName;
        this.gender = gender;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "weight = " + weight + " kg" +
                "\nnickName = " + nickName +
                "\ngender = " + gender +
                "\nage = " + age
               + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
