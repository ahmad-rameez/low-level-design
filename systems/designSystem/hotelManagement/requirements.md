## Hotel Management System

### Requirements

1. The system should allow users to search and browse hotels/rooms by location (city/geo), date range (check-in, check-out), room type (capacity/bed type/amenities), and price range
2. The system should provide real-time availability check per night, per hotel, per room type
3. The system should support booking cancellations with policies (non-refundable, partial refund with cutoff)
4. The system should handle payment workflow with states (Pending → Completed → Refunded/Failed)
5. The system should support dynamic daily/seasonal pricing where price can vary per day
6. The system should support multiple roles: Customer, Admin
7. The system should provide user dashboard to view past and upcoming bookings
8. The system should allow users to reserve a room (single room per booking)
9. The system should provide Admin panel to add/remove/update hotel/room/pricing/policies
10. The system should have a background scheduler to process expired HELD bookings and restore inventory


### APIS

1. GET /search/?searchTerms
2. GET /v1/hotels/{hotelId} -> name, rating, images etc etc
3. GET /v1/hotels/{hotelId}/availability -> Room Status + pricing
4. POST /v1/hotels/{hotelId}/bookings -> 
5. POST /v1/hotels/{hotelId}/payments
6. GET /v1/hotels/{hotelId}/cancel
7. Admin Related APIs