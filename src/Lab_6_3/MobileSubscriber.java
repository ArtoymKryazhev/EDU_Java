package Lab_6_3;

class MobileSubscriber implements Subscriber {
    private String username;

    public MobileSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String article) {
        System.out.println("Отправляем push-уведомление пользователю " + username);
        System.out.println("Новая статья: " + (article.length() > 30 ? article.substring(0, 30) + "..." : article));
        System.out.println("----------------------------------");
    }
}
