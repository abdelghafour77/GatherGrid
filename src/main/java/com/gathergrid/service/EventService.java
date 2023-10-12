package com.gathergrid.service;

import com.gathergrid.repository.EventRepository;

public class EventService {
    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }
}
