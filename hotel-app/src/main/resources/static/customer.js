document.addEventListener("DOMContentLoaded", () => {
    const searchForm = document.getElementById("searchForm");
    searchForm.addEventListener("input", () => {
        performSearch();
    })
})

async function performSearch() {
    const userStartDate = document.getElementById("userStartDate").value;
    const userEndDate = document.getElementById("userEndDate").value;
    const roomCapacity = document.getElementById("roomCapacity").value;
    const location = document.getElementById("location").value || "";
    const chainName = document.getElementById("chainName").value || "";
    const hotelRating = document.getElementById("hotelRating").value;
    const minRooms = document.getElementById("minRooms").value || 0;
    const maxPrice = document.getElementById("maxPrice").value || 999999;

    if (!userStartDate || !userEndDate || new Date(userStartDate) >= new Date(userEndDate)) {
        document.getElementById("roomResults").innerHTML = "<p>Please select valid dates</p>";
        return;
    }

    try {
        const response = await fetch(`/api/rooms/available?userStartDate=${userStartDate}&userEndDate=${userEndDate}&roomCapacity=${roomCapacity}&location=${location}&chainName=${chainName}&hotelRating=${hotelRating}&minRooms=${minRooms}&maxPrice=${maxPrice}`);
        const rooms = await response.json();
        renderRooms(rooms);

    } catch (error) {
        console.error("fail:", error);
        document.getElementById("roomResults").innerHTML = "<p>it's over</p>";
    }

}

function renderRooms(rooms) {
    const container = document.getElementById("roomResults");
    container.innerHTML = "";

    if (rooms.length === 0) {
        container.innerHTML = "<p>No available rooms match your parameters</p>";
        return;
    }

    rooms.forEach(room => {
        const roomDiv = document.createElement("div");

        roomDiv.innerHTML = `
        <div class="roomInfo">
            <h4>Room ${room.roomNumber}</h4>
            <p>Price: ${room.price}</p>
            <button onclick="bookRoom(${room.hotelID}, ${room.roomNumber})">Book Room</button>
        </div>`;

        container.appendChild(roomDiv);
    });
}

function bookRoom(hotelID, roomNumber) {
    const userStartDate = document.getElementById("userStartDate").value;
    const userEndDate = document.getElementById("userEndDate").value;

}