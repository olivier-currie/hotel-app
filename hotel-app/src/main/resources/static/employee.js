function showPage(pageID) {
    document.getElementById("hotelPage").hidden = true;
    document.getElementById("checkInPage").hidden = true;
    document.getElementById("viewPage").hidden = true;

    document.getElementById(pageID).hidden = false;

    if (pageID === "hotelPage") {
        loadHotels();
    } else if (pageID === "checkInPage") {
        loadBookings();
    } else if (pageID === "viewPage") {
        loadViews();
    }
}

async function createNewHotel() {
    const chainName = document.getElementById("chainName").value;
    const name = document.getElementById("name").value;
    const numRooms = document.getElementById("numRooms").value;
    const rating = document.getElementById("rating").value;
    const address = document.getElementById("address").value;

    try {
        const response = await fetch("/api/hotels", {method: "POST", headers: {"Content-Type": "application/json"}, body: `{"chainName": "${chainName}", "name": "${name}", "numRooms": "${numRooms}", "rating": "${rating}", "address": "${address}"}`});
        if (response.ok) {
            document.getElementById("hotelForm").reset();
        }
    } catch (error) {
        console.error("fail:", error);
    }
}

async function loadHotels() {
    const hotelDisplay = document.getElementById("hotelDisplay");

    try {
        const response = await fetch("/api/hotels/getall");
        const hotels = await response.json();

        if (hotels.length === 0) {
            hotelDisplay.innerHTML = "<p>No hotels registered</p>"
            return;
        }

        hotels.forEach(hotel => {
            const hotelDiv = document.createElement("div");

            hotelDiv.innerHTML = `
            <div class="hotelInfo">
                <h4>Hotel ${hotel.name}</h4>
                <p>ID: ${hotel.hotelID}</p>
                <p>Chain: ${hotel.chainName}</p>
                <p>Rooms: ${hotel.numRooms}</p>
                <p>Rating: ${hotel.rating}</p>
                <p>Address: ${hotel.address}</p>
            </div>`;

            hotelDisplay.appendChild(hotelDiv);
        });
    } catch (error) {
        console.error("fail:", error);
    }
}

async function loadBookings() {
    const bookingDisplay = document.getElementById("bookingDisplay");

    try {
        const response = await fetch("/api/bookings/getall");
        const bookings = await response.json();

        if (bookings.length === 0) {
            bookingDisplay.innerHTML = "<p>No bookings exist</p>"
            return;
        }

        bookings.forEach(booking => {
            const bookingDiv = document.createElement("div");

            bookingDiv.innerHTML = `
            <div class="bookingInfo">
                <h4>Booking: #${booking.bookingID}</h4>
                <p></p>
                <p></p>
                <p></p>
                <p></p>
                <p></p>
                <button onclick="changeToRenting(${booking.bookingID})">Change to Renting</button>
            </div>`;

            bookingDisplay.appendChild(hotelDiv);
        });
    } catch (error) {
        console.error("fail:", error);
    }
}

async function changeToRenting(bookingID) {
    // try {
    //     const response = await fetch("/api/bookings", {method: "PUT", headers: {"Content-Type": "application/json"}, body: `{"booking_id": "${chainName}", "name": "${name}", "numRooms": "${numRooms}", "rating": "${rating}", "address": "${address}"}`});
    //     if (response.ok) {
    //         loadBookings();
    //     }
    // } catch (error) {
    //     console.error("fail:", error);
    // }
}

function createNewRenting() {

}

async function loadViews() {
    const areaResults = document.getElementById("viewAreaResults");
    const capacityResults = document.getElementById("viewCapacityResults");

    try {
        const areaResponse = await fetch("/api/availableroomsperarea");
        const areas = await areaResponse.json();
        const capacityResponse = await fetch("/api/hoteltotalcapacity");
        const capacities = await capacityResponse.json();

        if (areas.length === 0) {
            areaResults.innerHTML = "<p>No view available</p>"
        } else {
            areas.forEach(area => {
                const areaDiv = document.createElement("div");
                areaDiv.innerHTML = `
                <div class="areaInfo">
                    <h4>Area: </h4>
                    <p></p>
                    <p></p>
                    <p></p>
                    <p></p>
                    <p></p>
                </div>`
            })
        }

        if (capacities.length === 0) {
            capacityResults.innerHTML = "<p>No view available</p>"
        } else {

        }


    } catch (error) {
        console.error("fail:", error);
    }
}