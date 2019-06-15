package com.mhi.booking.ticket.project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhi.booking.ticket.project.entity.Ticket;
import com.mhi.booking.ticket.project.service.TicketBookingService;
//@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
//@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RequestMapping(value="api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Ticket createTicket(@RequestBody Ticket ticket)
	{
		System.out.println(ticket);
		System.out.println(ticket.getTicketId());
		System.out.println(ticket.getPassengerName());
		return ticketBookingService.createTicket(ticket);
	}
	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId){
		
		return ticketBookingService.getTicketById(ticketId);
	}
	@GetMapping(value="/ticket/alltickets")
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingService.getAllTickets();
	}
	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId){
		ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value="/ticket/{ticketId}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateTicket(@PathVariable("ticketId") Integer ticketId,@RequestBody Ticket ticket){
		ticketBookingService.updateTicket(ticketId,ticket);
	}

}
