public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook inquiry = new PhoneBook();
        inquiry.add("Зиничев В.Н.", "88002000500");
        inquiry.add("Зиничев В.Н.", "88005550500");
        inquiry.add("Самигулин Р.М.", "89144428115");

        System.out.println(inquiry.get("Зиничев В.Н."));

    }
}
