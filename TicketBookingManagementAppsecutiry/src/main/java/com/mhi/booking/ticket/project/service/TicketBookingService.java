package com.mhi.booking.ticket.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhi.booking.ticket.project.dao.TicketBookingDao;
import com.mhi.booking.ticket.project.entity.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketBookingDao.delete(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, Ticket ticket) {
		// TODO Auto-generated method stub
		Ticket ticket1=ticketBookingDao.findOne(ticketId);
		if(ticket1.getTicketId() == ticket.getTicketId()){
			ticket1=ticketBookingDao.save(ticket);
		}

		return ticket1;
	}

}
