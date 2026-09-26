class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    private boolean vulnerable = false;
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean vulnerable = true;
    private boolean preparedSpell = false;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        vulnerable = false;
        preparedSpell = true;
    }

    @Override
    public boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return preparedSpell ? 12 : 3;
    }

    
    
}
