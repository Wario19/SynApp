public class Miracast implements Device{
    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public String getContent() {
        return "I am Miracast";
    }
}