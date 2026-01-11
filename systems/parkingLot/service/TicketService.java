package parkingLot.service;

import parkingLot.domain.ParkingTicket;
import parkingLot.domain.Vehicle;
import parkingLot.repository.TicketRepository;

import java.util.UUID;

public class TicketService {
    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

//    public ParkingTicket generateTicket(Vehicle vehicle, UUID slotId) {
//        System.out.println("[SERVICE] Generating ticket for vehicle: " + vehicle.getVehicleNumber());
//
//        ParkingTicket ticket = new ParkingTicket(vehicle.getVehicleNumber(), slotId);
//        ticketRepository.save(ticket);
//
//        System.out.println("[SERVICE] Ticket generated successfully: " + ticket.getId());
//        return ticket;
//    }
//
//    public Optional<Ticket> getTicket(UUID ticketId) {
//        System.out.println("[SERVICE] Retrieving ticket: " + ticketId);
//        return ticketRepository.findById(ticketId);
//    }
//
//    public void deactivateTicket(UUID ticketId) {
//        System.out.println("[SERVICE] Deactivating ticket: " + ticketId);
//        ticketRepository.deactivateTicket(ticketId);
//    }


}
