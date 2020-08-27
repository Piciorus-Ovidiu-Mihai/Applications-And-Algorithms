package Piciorus.Ovidiu.Lab8.ex4;

abstract class Event {

    EventType type;

    Event(EventType type) {
        this.type = type;
    }

    EventType getType() {
        return type;
    }

}