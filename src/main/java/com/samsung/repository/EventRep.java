package com.samsung.repository;

import com.samsung.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRep extends JpaRepository<Event,Long> {
}
