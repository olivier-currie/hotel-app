package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Room;
import com.hotel.hotel_app.models.RoomPrimaryKey;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, RoomPrimaryKey> {
    @Query(value = """
            SELECT r.* from room r
            JOIN hotel h ON r.hotel_id
            JOIN hotelchain hc ON h.chain_name = hc.name
            WHERE h.address LIKE %:area%
            AND hc.name = :chainName
            AND r.capacity >= :roomCapacity
            AND h.rating >= :hotelRating
            AND h.num_rooms >= :minRooms 
            AND r.price <= :maxPrice
            AND NOT EXISTS (
            SELECT * FROM booking b 
            WHERE b.hotel_id = r.hotel_id 
            AND b.room_number = r.room_number
            AND b.start_date <= :userEndDate
            AND b.end_date >= :userStartDate
            )
            SELECT * FROM renting re 
            WHERE re.hotel_id = r.hotel_id 
            AND re.room_number = r.room_number
            AND re.start_date <= :userEndDate
            AND re.end_date >= :userStartDate
            )
            """, nativeQuery = true)
}