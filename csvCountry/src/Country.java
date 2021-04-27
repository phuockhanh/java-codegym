public class Country {
    public String dns;
    public String dns2;
    public String zip_code;
    public String zip_code2;
    public String zip_country;
    public String country;

    public Country(String dns, String dns2, String zip_code, String zip_code2, String zip_country, String country) {
        this.dns = dns;
        this.dns2 = dns2;
        this.zip_code = zip_code;
        this.zip_code2 = zip_code2;
        this.zip_country = zip_country;
        this.country = country;
    }
    public String toString(){
        return dns+", " + dns2+", " + zip_code+", "+ zip_code2+", "+zip_country+", "+country+"\n";
    }
}
