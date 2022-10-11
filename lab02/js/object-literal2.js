var hotel = {
    name : 'Park',
    rooms : 120,
    booked: 70,
    checkValidity : function (){
        return this.rooms - this.booked;
    }
}

var elName = document.getElementById('hotelName');
elName.textContent = hotel.name;

var elRooms = document.getElementById('roons');
elRooms.textContent = hotel.checkValidity();