class XiaomiPhone extends Phone<String> {
    public XiaomiPhone(String model, long number, int weight) {
        super(model, number, weight);
    }

    @Override
    public void info(){
            System.out.println("Модель телефона: " + getModel() + "\tНомер: " + getNumber() + "\tВес: " + getWeight());
        }

    @Override
    public void receiveCall() {

    }
}