package com.sekh.bookingticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sekh.bookingticket.app.entities.Ticket;
import com.sekh.bookingticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(TicketBookingManagementApplication.class, args);
	
	TicketBookingService ticketBookingService=context.getBean("ticketBookingService", TicketBookingService.class );
	
	Ticket ticket=new Ticket();
	ticket.setBookingDate(new Date());
	ticket.setSourceStation("dhaka");
	ticket.setDestStation("Khulna");
	ticket.setPassengerName("MM");
	ticket.setEmail("mahadi@gmail.com");
	ticketBookingService.createTicket(ticket);
	
	}
}
