//see readme
public class aePhonebookTest {
    public static void main(String[] args) {
        Contact p1 = new Contact("Tom", "Green", "206-605-6717", "240 West Babylon St.",
        "Bellingham");
        String myString = p1.toString();
        System.out.println(myString);
    }
}