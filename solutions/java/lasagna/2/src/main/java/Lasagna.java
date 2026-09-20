public class Lasagna {
    int expectedMinutes = 40;
    
    public int expectedMinutesInOven() {
        return expectedMinutes;
    }

    public int remainingMinutesInOven(int amountInOven){
        return expectedMinutesInOven() - amountInOven;
    }
        
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
        
    public int totalTimeInMinutes(int layers, int minutesCooked) {
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + minutesCooked;
    }
        
        
}
