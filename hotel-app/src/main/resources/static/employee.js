function showPage(pageID) {
    document.getElementById("hotelPage").hidden = true;
    document.getElementById("checkInPage").hidden = true;
    document.getElementById("viewPage").hidden = true;

    document.getElementById(pageID).hidden = false;
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

    // try {
    //     const response = await fetch("/api/bookings/getall");
    //     const hotels = await response.json();
    //
    //     if (hotels.length === 0) {
    //         hotelDisplay.innerHTML = "<p>No hotels registered</p>"
    //     }
    //
    //     hotels.forEach(hotel => {
    //         const hotelDiv = document.createElement("div");
    //
    //         hotelDiv.innerHTML = `
    //         <div class="hotelInfo">
    //             <h4>Hotel ${hotel.name}</h4>
    //             <p>ID: ${hotel.hotelID}</p>
    //             <p>Chain: ${hotel.chainName}</p>
    //             <p>Rooms: ${hotel.numRooms}</p>
    //             <p>Rating: ${hotel.rating}</p>
    //             <p>Address: ${hotel.address}</p>
    //         </div>`;
    //
    //         bookingDisplay.appendChild(hotelDiv);
    //     });
    // } catch (error) {
    //     console.error("fail:", error);
    // }
}

function createNewRenting() {

}

// function views() {
//
// }