package vn.sapo.pattern.builder.javadesignpatterns;

public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
