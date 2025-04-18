// Интерфейс посредника
public interface ChatMediator {
    void sendMessage(String message, User user); // Отправка сообщения
    void addUser(User user);                     // Добавление пользователя
}
