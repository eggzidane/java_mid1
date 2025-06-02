package lang.immutable.address;

public class ImmutableAddress {

    //어떻게 만들든 필드값을 안바뀌게한다 -> 불변객체
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
