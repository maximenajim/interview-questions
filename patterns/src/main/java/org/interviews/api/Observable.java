package org.interviews.api;

public interface Observable<Event> {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notify(Event event);

}
