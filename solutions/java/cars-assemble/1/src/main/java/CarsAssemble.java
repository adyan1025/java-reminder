public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rawRate = (double) speed * 221;
        if (speed >= 5 && speed <= 8) {
            return rawRate * 0.9;
        }
        else if (speed == 9) {
            return rawRate * 0.8;
        }
        else if (speed == 10) {
            return rawRate * 0.77;
        }
        return rawRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
