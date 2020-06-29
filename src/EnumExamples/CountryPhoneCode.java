package EnumExamples;

public enum CountryPhoneCode {

    ArmeniaGY(PhoneCode.Gyumri, "AMGY"),
    ArmeniaVN(PhoneCode.Vanadzor, "AMVN"),
    ArmeniaYR(PhoneCode.Yerevan, "AMYR");

    private PhoneCode phoneCode;
    private String countryName;

    private CountryPhoneCode(PhoneCode phoneCode, String countryName) {
        this.phoneCode = phoneCode;
        this.countryName = countryName;
    }

    public static CountryPhoneCode findByCountryName(String countryName) {
        for (int i = 0; i < CountryPhoneCode.values().length; i++) {
            if (CountryPhoneCode.values()[i].countryName == countryName) {
                return CountryPhoneCode.values()[i];
            }
        }
        return null;
    }
}
