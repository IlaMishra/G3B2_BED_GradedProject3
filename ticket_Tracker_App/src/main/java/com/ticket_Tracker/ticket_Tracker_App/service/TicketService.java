package com.ticket_Tracker.ticket_Tracker_App.service;

import java.util.List;

import com.ticket_Tracker.ticket_Tracker_App.entity.Ticket;

public interface TicketService {

	public List<Ticket> getAllTickets(String query);

	public void saveTicket(Ticket tkt);

	public int deleteTicket(int tkt_num);

	public Ticket findByNum(int tkt_num);

//	List<Ticket> searchTickets(String query);

}