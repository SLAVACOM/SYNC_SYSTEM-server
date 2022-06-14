package com.samsung.dto;

import com.samsung.domain.Event;
import liquibase.pro.packaged.E;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventDto {

    private long id;
    private int user_id;
    private String time;
    private String event;

    public static EventDto toDto(Event event){
        return new EventDto(event.getId(),event.getUsers_id(), event.getTime(),event.getEvent());
    }
    public static Event toDomainObject(EventDto eventDto){
            return new Event(eventDto.getId(),eventDto.getUser_id(),eventDto.getTime(),eventDto.getEvent());
    }
}
