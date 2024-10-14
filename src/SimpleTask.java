class SimpleTask extends Task {
    public SimpleTask(String description) {
        super(description);
    }

    @Override
    public void displayTask() {
        System.out.println(toString());
    }
}
