public enum VsePlanet {
    MERCURY("Күнгө эң жакын планета"),
    VENUS("Күн системасындагы экинчи турган планета"),
    EARTH("Биз жашап жаткан жер"),
    JUPITER("Күн системасындагы эң чоң планета"),
    SATURN("Чоңдугу боюнча экинчи орунда турат. Шакекчеси менен таанымал"),
    URANUS("Газга толо планета"),
    NEPTUNE("Бул планетада амалдын ылдамдыгы саатына 2000 км ге жетет"),
    PLUTO("Плутон күндү 248 жылда бир жолу айланып чыгат");

    private String word;

    VsePlanet(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
