package com.samsung.service;

import com.samsung.domain.Event;

import java.util.List;

public interface EventService {
    Event insert(String event, int user_id, String time);

    List<Event> getAll();

    Event getById(long id);

    Event upadate(long id, int userId, String event, String time);

    void deleteById(long id);

    Event insert(Event toDomainObject);
}
