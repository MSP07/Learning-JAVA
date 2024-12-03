/*approach
  simulation
  we just can take 3 variables and assign them big,medium,small
  we just take a vector and assign first three indices with that so that
  lookup is easy in bool function then we check for the count of given big,medium,small
  if it exists we decr the count and return true else we return false*/
class ParkingSystem {
    int[] car = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        car[0] = big;
        car[1] = medium;
        car[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(car[carType-1]!=0){
            car[carType-1]--;
            return true;
        }
        return false;
    }
}
