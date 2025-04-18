// Абстрактный пользователь чата
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);   // Отправить сообщение
    public abstract void receive(String message); // Получить сообщение
}
