package com.samsung.service;

import com.samsung.domain.Event;
import com.samsung.repository.EventRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EventServiceImplem implements EventService{

    private final EventRep eventRep;

    @Override
    public Event insert(String event, int user_id, String time) {
        Event event1 = Event.builder().event(event).users_id(user_id).time(time).build();
        return eventRep.save(event1);
    }

    @Override
    public List<Event> getAll() {
        return eventRep.findAllByOrderById();
    }

    @Override
    public Event getById(long id) {
        return eventRep.getById(id);
    }



    @Override
    public Event upadate(long id, int user_id, String event, String time) {
        Event event1 = Event.builder().id(id).users_id(user_id).event(event).time(time).build();
        return eventRep.save(event1);
    }

    @Override
    public void deleteById(long id) {
        eventRep.deleteById(id);
    }

    @Override
    public Event insert(Event toDomainObject) {
        return null;
    }
}
