package EnumExamples;

import com.jfk.enumerations.Country;

public enum PhoneCode {

    Gyumri("(+374)312", "GY"),
    Vanadzor("(+374)322", "VN"),
    Yerevan("(+374)10", "YR");

    private String code;
    private String cityName;

    private PhoneCode(String code, String cityName) {
        this.code = code;
        this.cityName = cityName;
    }

    public static PhoneCode findByPhoneCode(String code) {
        for (int i = 0; i < PhoneCode.values().length; i++) {
            if (PhoneCode.values()[i].code == code) {
                return PhoneCode.values()[i];
            }
        }
        return null;
    }
}