class ParkingSystem {
    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType){
            case 1: 
                if(big-- >0){
                    return true;
                }
                else return false;
            case 2:
                if(medium-- >0) return true;
                else return false;
            case 3: 
                if(small-- >0) return true;
                else return false;
        }
        return false;
    }
}



// lee's solution :



    int[] count;
    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }
