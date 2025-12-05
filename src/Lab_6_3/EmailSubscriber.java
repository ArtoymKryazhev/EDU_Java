package Lab_6_3;

class EmailSubscriber implements Subscriber {
    private String name;
    private String email;

    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String article) {
        System.out.println("Отправляем email на адрес " + email);
        System.out.println("Уважаемый " + name + "!");
        System.out.println("Новая статья: " + article);
        System.out.println("----------------------------------");
    }
}

