# isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
# Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
# represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
# a right triangle and False otherwise. You may wish to write a helper function,
# distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
# almostEqual (instead of ==) when comparing floats.
import math
def isrighttriangle(x1, y1, x2, y2, x3, y3):
	# your code goes here
	   distance1 = math.floor(math.sqrt((pow(x2-x1),2) + (pow(y2-y1),2)))
	   distance2 = math.floor(math.sqrt((pow(x2-x3),2) + (pow(y2-y3),2)))
	   distance3 = math.floor(math.sqrt((pow(x3-x1),2) + (pow(y3-y1),2)))
	   distance1 = math.pow((distance1),2)
	   distance2 = math.pow((distance2),2)
	   distance3 = math.pow((distance3),2)
	   if(distance1 == distance2+distance3 or distance2 == distance1+distance3 or distance3 == distance1+distance2):
		   return True
	   return False	   
