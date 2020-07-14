# Write the (very short) function handtodice(hand) that takes a hand, which is a 3-digit
# integer, and returns 3 values, each of the 3 dice in the hand. For example:
# assert(handToDice(123) == (1,2,3))
# assert(handToDice(214) == (2,1,4))
# assert(handToDice(422) == (4,2,2))
# Hint: You might find // and % useful here, and also getKthDigit().
import math
def handtodice(hand):
    # your code goes here
    my_data=[]
    while(hand > 0):
        data = hand %10
        my_data.append(data)
        hand = math.floor(hand/10)
    return (my_data[2], my_data[1], my_data[0])
