class PassengerPlane extends Plane {
    protected int maxPassengers;

    public PassengerPlane(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}