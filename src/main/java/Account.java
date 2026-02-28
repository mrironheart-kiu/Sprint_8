import lombok.Data;

@Data
public class Account {
    private final String name;

    /*
     Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
     Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
    */
    public boolean checkNameToEmboss() {
        if (name == null || name.isBlank()) {
            System.out.println("ОШИБКА! Имя не может быть пустым");
            return false;
        }
        int length = name.length();
        if (length < 3 || name.length() > 19) {
            System.out.println("ОШИБКА! Имя должно быть от 3 до 19 символов (сейчас: " + name.length() + ")");
            return false;
        }
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        if (firstSpace == -1
                || firstSpace != lastSpace
                || firstSpace == 0 ||
                firstSpace == length - 1) {
            System.out.println("ОШИБКА! Имя должно содержать ровно один пробел, и он не может быть по краям: " + name);
            return false;
        }
        System.out.println("УСПЕХ! Имя прошло валидацию: " + name);
        return true;
    }
}