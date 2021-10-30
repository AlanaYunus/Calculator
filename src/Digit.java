public enum Digit {

    C("C", 100),
    XC("XC", 90),
    L("L", 50),
    XL("XL", 40),
    X("X", 10),
    IX("IX", 9),
    V("V", 5),
    IV("IV", 4),
    I("I", 1);

    private String roman;
    private int arab;

    Digit(String roman, int arab) {
        this.roman = roman;
        this.arab = arab;
    }

    public String getRoman() {
        return roman;
    }

    public int getArab() {
        return arab;
    }


}
