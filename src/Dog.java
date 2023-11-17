public class Dog {
    private final String breed;
    private final String gender;
    private final String birthdate;

    public Dog(String breed, String gender, String birthdate) {
        this.breed = breed;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate;
    }
}