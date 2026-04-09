package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Room;
import com.hotel.hotel_app.models.RoomPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.sql.Date;

@Repository
public interface RoomRepository extends JpaRepository<Room, RoomPrimaryKey> {
    @Query(value = """
            SELECT r.* FROM room r
            JOIN hotel h ON r.hotel_id = h.hotel_id
            JOIN hotelchain hc ON h.chain_name = hc.name
            WHERE h.address LIKE %:location%
            AND (hc.name = :chainName OR hc.name = "")
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
            AND NOT EXISTS (
            SELECT * FROM renting re 
            WHERE re.hotel_id = r.hotel_id 
            AND re.room_number = r.room_number
            AND re.start_date <= :userEndDate
            AND re.end_date >= :userStartDate
            )
            """, nativeQuery = true)

    List<Room> findValidRooms(
            @Param("location") String location,
            @Param("chainName") String chainName,
            @Param("roomCapacity") long roomCapacity,
            @Param("hotelRating") long hotelRating,
            @Param("minRooms") long minRooms,
            @Param("maxPrice") double maxPrice,
            @Param("userEndDate") Date userEndDate,
            @Param("userStartDate") Date userStartDate
    );
}