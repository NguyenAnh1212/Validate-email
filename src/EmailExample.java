import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public boolean validate(String inputEmail) {
        pattern = Pattern.compile(EMAIL_REGEX);// tạo đối tượng pattern thông qua method compile()
        matcher = pattern.matcher(inputEmail);// lấy ra đối tượng matcher
        //Matcher là một phương tiện để so khớp chuỗi dữ liệu đầu vào với đối tượng Pattern đã được tạo ra ở trên
        return matcher.matches();
    }
}
