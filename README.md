# couponizer

In this project the goal was to develop an app to improve the user experience for a mobile game by delivering a helper tool, to find out which coupon camp is currently available in a given continent, city or city level depending on the request of the user. 

Every city has the same cycle from Vanguard, to Martyr, to Liberty Camp, but based on the opening date of a city the first camp available might differ between the three.
The UI in the **frame** class delivers three different selection opportunities, so the user can define which camp, which continent and which city level he is looking for.

After selection the UI sends a request to the **Calculator** class, to display the cities which satisfy the request. The algorithm in the **Calculator** class calculates the cycle which is requested, because there are three different cycles, one starting with Vanguard, one with Martyr and one with Liberty. When the cycle is defined, the algorithm works through the city list and returns all cities in the given cycle. 

The **City** and **Continents** classes are object oriented classes, to simplify the calculation process.
