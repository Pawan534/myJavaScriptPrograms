let restaurant = {
    name: 'Santosh Dhaba',
    guestCapacity: 100,
    guestCount: 0,
    checkSeatAvailability: function(partySize){
        let seatAvailable = this.guestCapacity - this.guestCount 
        if(seatAvailable >= partySize)
            return true
        else
            return false
    },
    seatParty: function(partySize) {
        this.guestCount = this.guestCount + partySize
    },
    removeParty: function(partySize){
        this.guestCount = this.guestCount - partySize
    }
}

restaurant.seatParty(15);
console.log(restaurant.checkSeatAvailability(15))
restaurant.removeParty(15);
console.log(restaurant.checkSeatAvailability(15))
