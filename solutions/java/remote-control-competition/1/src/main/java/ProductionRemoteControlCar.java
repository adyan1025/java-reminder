class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int victories = 0;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(
            other.getNumberOfVictories(),
            this.getNumberOfVictories()
        );
    }
}
