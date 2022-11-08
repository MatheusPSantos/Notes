const coins = [200, 100, 50, 20, 10, 5, 2, 1];

function getChange(totalPayable, cashPaid) {
    var change = [];
    var length = coins.length;
    var remaining = cashPaid - totalPayable; // we reduce this below

    for (var i = 0; i < length; i++) { // loop through array of notes & coins:
        var coin = coins[i];

        var times_coin_fits = Math.floor(remaining / coin); // no partial coins
        if (times_coin_fits >= 1) { // check coin fits into the remaining amount

            for (var j = 0; j < times_coin_fits; j++) { // add coin to change x times
                change.push(coin);
                remaining = remaining - coin;  // subtract coin from remaining
            }
        }
    }
    return change;
}
