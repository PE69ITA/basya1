// Демонстрация работы паттерна Посредник
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator chatroom = new ChatRoom();

        User user1 = new ConcreteUser(chatroom, "Алихан");
        User user2 = new ConcreteUser(chatroom, "Бекзат");
        User user3 = new ConcreteUser(chatroom, "Данияр");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);

        user1.send("Привет, парни!");
        user2.send("Салам, Алихан!");
        user3.send("Как вы?");
    }
}
