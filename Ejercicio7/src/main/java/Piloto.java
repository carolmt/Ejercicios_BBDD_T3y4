import java.time.LocalDate;
import java.util.Date;

public class Piloto {
    private int driverid;
    private String code;
    private String forename;
    private String surname;
    private Date dob;
    private String nationality;
    private int constructorid;
    private String url;

    public Piloto() {
    }
    //cuando creemos un piloto hay que poner driverid nulo en el main
    public Piloto( String code, String forename, String surname, Date dobNuevo, String nationality, String url) {
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dobNuevo;
        this.nationality = nationality;
        this.url = url;
    }

    public Piloto(int driverid, String code, String forename, String surname, Date dob, String nationality, String url) {
        this.driverid = driverid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
    }
    public Piloto(String code, String forename, String surname, Date dob, String nationality, int constructorid, String url) {
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
        this.constructorid = constructorid;
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public java.sql.Date getDob() {
        return (java.sql.Date) dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getConstructorid() {
        return constructorid;
    }

    public void setConstructorid(int constructorid) {
        this.constructorid = constructorid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String devolverStringDob (LocalDate dob) {
        String fecha = dob.toString();
        return fecha;
    }


    @Override
    public String toString() {
        return "Piloto{" +
                "driverid=" + driverid +
                ", code='" + code + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", nationality='" + nationality + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
