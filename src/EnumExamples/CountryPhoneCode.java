package EnumExamples;

public enum CountryPhoneCode {

    Armenia("+374", "AM"),
    Russia("+7", "RU"),
    Georgia("+995", "GEO");

    private String phoneCode;
    private String countryName;

    private CountryPhoneCode(String phoneCode, String countryName) {
        this.phoneCode = phoneCode;
        this.countryName = countryName;
    }

    public static CountryPhoneCode findByPhoneCode(String phoneCode) {
        for (int i = 0; i < CountryPhoneCode.values().length; i++) {
            if (CountryPhoneCode.values()[i].phoneCode == phoneCode) {
                return CountryPhoneCode.values()[i];
            }
        }
        return null;
    }
}
