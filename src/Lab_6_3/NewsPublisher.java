package Lab_6_3;

import java.util.ArrayList;
import java.util.List;

// Класс издателя новостей (субъект в паттерне Observer)
class NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestArticle;

    // Метод для подписки
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Новый подписчик добавлен: " +
                subscriber.getClass().getSimpleName());
    }

    // Метод для отписки
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Подписчик удален: " +
                subscriber.getClass().getSimpleName());
    }

    // Основной метод публикации статьи (из задания)
    public void publish(String article) {
        this.latestArticle = article;
        System.out.println("\n=== Публикуем новую статью ===");
        System.out.println(article);
        System.out.println("==============================\n");
        notifySubscribers();
    }

    // Уведомление всех подписчиков
    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestArticle);
        }
    }

    // Дополнительный метод для получения количества подписчиков
    public int getSubscriberCount() {
        return subscribers.size();
    }
}
