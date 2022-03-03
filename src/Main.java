public class Main {
    private static EmailExample emailExample;
    public static final String[] validEmailTest = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com", "ab@gmail.", "@#abc@gmail.com","@gmail.com" };


    public static void main(String args[]) {
        emailExample = new EmailExample(); // tạo đối tượng emailExample từ class EmailExample. phải có đối tượng mới gọi ra pthuc
        // Lặp mảng validEmailTest
        for (String e: validEmailTest
             ) {
            boolean isValid = emailExample.validate(e);
            System.out.println("Email is " + e +" is valid: "+ isValid);
        }
    }
}
