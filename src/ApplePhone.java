class ApplePhone extends Phone<String> {
    public ApplePhone(String model, long number, int weight) {
        super(model, number, weight);
    }

    public void info() {
        System.out.println("Модель телефона: " + getModel() + "\tНомер: " + getNumber() + "\tВес: " + getWeight());
    }

    public void receiveCall() {
    }
    }