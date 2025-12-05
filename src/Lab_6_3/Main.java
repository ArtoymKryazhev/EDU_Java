package Lab_6_3;

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создаем издателя новостей
        NewsPublisher publisher = new NewsPublisher();

        // Создаем подписчиков
        Subscriber alice = new EmailSubscriber("Алиса", "alice@example.com");
        Subscriber bob = new EmailSubscriber("Боб", "bob@example.com");
        Subscriber charlie = new MobileSubscriber("Чарли");
        Subscriber diana = new MobileSubscriber("Диана");

        // Подписываем пользователей
        publisher.subscribe(alice);
        publisher.subscribe(bob);
        publisher.subscribe(charlie);

        System.out.println("\nВсего подписчиков: " + publisher.getSubscriberCount());

        // Публикуем первую статью
        publisher.publish("Какая-то новая статья");

        // Добавляем еще одного подписчика
        publisher.subscribe(diana);

        // Публикуем вторую статью
        publisher.publish("Опять новая статья.");

        // Отписываем одного подписчика
        publisher.unsubscribe(bob);

        System.out.println("\nВсего подписчиков после отписки: " + publisher.getSubscriberCount());

        // Публикуем третью статью
        publisher.publish("Не орпять а снова. Новая статья.");
    }
}