public class Lasagna {
    int expectedMinutes = 40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expectedMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int amountInOven){
        return expectedMinutesInOven() - amountInOven;
    }
        
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
        
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesCooked) {
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + minutesCooked;
    }
        
        
}
