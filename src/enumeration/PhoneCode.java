package enumeration;

public enum PhoneCode {
    ARM ("+374","AM"),
    RUS ("+7","RU"),
    USA ("+1","US"),
    DEU ("+49","DE"),
    FRA("+33","FR");

    private final String phoneCode;
    private final String countriname;

    PhoneCode(String phoneCode , String countriname){
        this.phoneCode = phoneCode;
        this.countriname = countriname;

    }

    public String getCountriname() {
        return this.countriname;
    }

    public String getPhoneCode() {
        return this.phoneCode;
    }
    public static PhoneCode findByPhoneCode (String phoneCode) {
        for (int i = 0; i < PhoneCode.values().length; i++) {
            if (PhoneCode.values()[i].phoneCode == phoneCode) {
                return PhoneCode.values()[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PhoneCode{" +
                "phoneCode='" + phoneCode + '\'' +
                ", countriname='" + countriname + '\'' +
                '}';
    }
}
