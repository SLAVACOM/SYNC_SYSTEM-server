package com.samsung.controller;

import com.samsung.domain.Event;
import com.samsung.dto.EventDto;
import com.samsung.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/event")
    public List<EventDto> getAllEvent(){
        return eventService.getAll().stream().map(EventDto::toDto).collect(Collectors.toList());
    }


    @PostMapping("/event")
    public EventDto insertEvent(@RequestParam int user_id, String event,String time){
        Event event1 = eventService.insert(event, user_id, time);
        return EventDto.toDto(event1);
    }


    @PutMapping("/event/{id}")
    public EventDto updateEvent(@RequestParam int id, @RequestParam int user_id,@RequestParam String event,@RequestParam String time){
        Event event1 = eventService.upadate(id,user_id,event,time);
        return EventDto.toDto(event1);
    }



    @DeleteMapping("/event/{id}")
    public void deleteEvent(@PathVariable int id){
        eventService.deleteById(id);
    }

    @GetMapping("/event/{id}")
    public EventDto getEventById(@PathVariable int id){
        Event event = eventService.getById(id);
        return EventDto.toDto(event);
    }

}
