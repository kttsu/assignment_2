public class Main {
    public static void main(String[] args) {
        Dog dog1 =  new Dog("マルチーズ", "オス", "2023年10月10日");

        String searchBreed = "マルチーズ";
        String searchGender = "オス";
        String searchBirthdate = "2023年10月10日";

        if (dog1.getBreed().equals(searchBreed) && dog1.getGender().equals(searchGender) && dog1.getBirthdate().equals(searchBirthdate)) {
            System.out.println("ご希望の子犬が見つかりました。");
            System.out.println("犬種：" + dog1.getBreed());
            System.out.println("性別 : " + dog1.getGender());
            System.out.println("誕生日 : " + dog1.getBirthdate());
        } else {
            System.out.println("ご希望の子犬は見つかりませんでした。");
        }
    }
}