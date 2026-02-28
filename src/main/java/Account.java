import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class Account {
    private final String name;

    /*
     Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
     Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
    */
    public boolean checkNameToEmboss() {
        if (name.isBlank() || name.isEmpty()) {
            System.out.println("ОШИБКА! Имя не может быть пустым");
            return false;
        } else if (name.length() < 3){
            System.out.println("ОШИБКА! Имя не может содержать менее 3 символов: " + name);
            return false;
        } else if (name.length() > 19) {
            System.out.println("ОШИБКА! Имя не может содержать более 19 символов " + name);
            return false;
        } else if (StringUtils.countMatches(name, " ") == 0){
            System.out.println("ОШИБКА! Имя не может содержать менее 1 символа пробела " + name);
            return false;
        } else if (StringUtils.countMatches(name, " ") > 1){
            System.out.println("ОШИБКА! Имя не может содержать более 1 символа пробела " + name);
            return false;
        } else if (name.indexOf(" ") == 0) {
            System.out.println("ОШИБКА! Имя не может содержать символ пробела в начале " + name);
            return false;
        } else if (name.lastIndexOf(" ") == name.length() - 1) {
            System.out.println("ОШИБКА! Имя не может содержать символ пробела в конце " + name);
            return false;
        }
        System.out.println("УСПЕХ! Имя прошло валидацию: " + name);
        return true;
    }
}