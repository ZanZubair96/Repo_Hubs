public class LombokDemoMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        speaker.setAge(4);
        int tempAge= speaker.getAge();
        System.out.println("The Age of the person is >>> "+tempAge);
    }
}
