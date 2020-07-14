# Write the function nearestBusStop(street) that takes a 
# non-negative int street number, and returns the nearest 
# bus stop to the given street, where buses stop every 8th street, 
# including street 0, and ties go to the lower street, 
# so the nearest bus stop to 12th street is 8th street, 
# and the nearest bus stop to 13 street is 16th street.



def fun_nearestbusstop(street):
	laststop = 0
	while(laststop < street):
		laststop += 8
	firststop = laststop-8
	result1 = laststop-street
	result2 = street-firststop
	if(result1==result2):
		return firststop
	elif(result1< result2):
	    return laststop
	else:
	    return firststop
	return -1
