package com.mhi.booking.ticket.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhi.booking.ticket.project.entity.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

	

}
