package enumeration;

public enum  CountryPhoneCode {


    EUROPE ("+1","DE" ),
    AMERICA ("+","USA"),
    AFRICA ("AM","ALG"),
    ASIA ("","ARM");

    public String phoneCode;
    public String countryName;

    CountryPhoneCode (String phoneCode, String countryName){
        this.phoneCode = phoneCode;
        this.countryName = countryName;
    }


}
