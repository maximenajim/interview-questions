package org.interviews.api;


public interface Observer {

    void update(Observable o, Event event);
}
