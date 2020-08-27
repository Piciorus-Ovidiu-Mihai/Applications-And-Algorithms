package Piciorus.Ovidiu.Lab8.ex4;

class NoEvent extends Event{

    NoEvent() {
        super(EventType.NONE);
    }

    @Override
    public String toString() {
        return "NoEvent{}";
    }
}
enum EventType {
    TEMPERATURE, FIRE, NONE;
}