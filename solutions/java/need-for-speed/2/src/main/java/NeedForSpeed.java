class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.battery = 100;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getBattery() {
        return battery;
    }

    public boolean batteryDrained() {
        return battery - batteryDrain < 0;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int drivesNeeded = (int) Math.ceil((double) distance / car.getSpeed());
        int drivesAvailable = car.getBattery() / car.getBatteryDrain();
        return drivesAvailable >= drivesNeeded;
    }
}
