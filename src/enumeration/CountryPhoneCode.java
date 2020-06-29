package enumeration;

public enum  CountryPhoneCode {


    EUROPE ("+1","DE" ),
    AMERICA ("","USA"),
    AFRICA ("","ALG"),
    ASIA ("","ARM");

    public PhoneCode phoneCode;
    public String countryName;

    CountryPhoneCode (PhoneCode phoneCode,String countryName){
        this.phoneCode = phoneCode;
        this.countryName = countryName;
    }


}
