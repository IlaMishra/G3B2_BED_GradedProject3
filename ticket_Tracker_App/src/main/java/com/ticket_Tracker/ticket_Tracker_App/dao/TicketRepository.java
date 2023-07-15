package com.ticket_Tracker.ticket_Tracker_App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket_Tracker.ticket_Tracker_App.entity.Ticket;

 

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}