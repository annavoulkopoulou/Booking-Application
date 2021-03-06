/**
 *Αυτή η κλάση αναπαριστά ένα κατάλυμα με τα χαρακτηριστικά του και τις παροχές του
 */

import java.io.Serial;
import java.util.ArrayList;

public class Accommodation implements java.io.Serializable {

    private String name;
    private String location;
    private String price;
    private  String sqmeter;
    private String stars;
    private  String rooms;
    private String capacity;
    ArrayList<Reservations> reservations = new ArrayList<>();
    ArrayList<Reservations> cancellations= new ArrayList<>();

    @Serial
    private static final long serialVersionUID = 9029685098267757690L;


    private boolean breakfast, wifi, ac, parking, cleaning_services;

    /**
     * Ο προκαθορισμένος κατασκευαστής
     */
    public Accommodation() {
        name = null;
        location = null;
        price = null;
        sqmeter = null;
        stars = null;
        rooms = null;
        capacity = null;

        breakfast = false;
        wifi = false;
        ac = false;
        parking = false;
        cleaning_services = false;
    }

    /**
     * Κατασκευαστής που αρχικοποιεί τις παραμέτρους της κλάσης
     */
    public Accommodation(String aname, String alocation,String aprice, String asqmeter, String astars, String arooms, String acapacity, boolean abreakfast,
                         boolean awifi, boolean aac, boolean aparkin, boolean acleaning_services) {
        name = aname;
        location = alocation;
        price = aprice;
        sqmeter = asqmeter;
        stars = astars;
        rooms = arooms;
        capacity = acapacity;

        breakfast = abreakfast;
        wifi = awifi;
        ac = aac;
        parking = aparkin;
        cleaning_services = acleaning_services;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSqmeter() {
        return sqmeter;
    }

    public void setSqmeter(String sqmeter) {
        this.sqmeter = sqmeter;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public boolean isBreakfast() {return breakfast;}

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isCleaning_services() {
        return cleaning_services;
    }

    public void setCleaning_services(boolean cleaning_services) {
        this.cleaning_services = cleaning_services;
    }

    /**
     * μέθοδος που ελέγχει αν το κατάλυμα διαθέτει πρωινό
     * @return τη φράση παρέχει ή δεν παρέχει αντίστοιχα
     */
    public String hasBreakfast(){
        if(isBreakfast()){
            return "Παρέχει";
        }
        return "Δεν παρέχει";
    }

    /**
     * μέθοδος που ελέγχει αν το κατάλυμα διαθέτει wifi
     * @return τη φράση παρέχει ή δεν παρέχει αντίστοιχα
     */
    public String hasWifi(){
        if(isWifi()){
            return "Παρέχει";
        }
        return "Δεν παρέχει";
    }

    /**
     * μέθοδος που ελέγχει αν το κατάλυμα διαθέτει parking
     * @return τη φράση παρέχει ή δεν παρέχει αντίστοιχα
     */
    public String hasParking(){
        if(isParking()){
            return "Παρέχει";
        }
        return "Δεν παρέχει";
    }

    /**
     * μέθοδος που ελέγχει αν το κατάλυμα διαθέτει air condition
     * @return τη φράση παρέχει ή δεν παρέχει αντίστοιχα
     */
    public String hasAc(){
        if(isAc()){
            return "Παρέχει";
        }
        return "Δεν παρέχει";
    }

    /**
     * μέθοδος που ελέγχει αν το κατάλυμα παρέχει υπηρεσίες καθαρισμού
     * @return τη φράση παρέχει ή δεν παρέχει αντίστοιχα
     */
    public String hasCleaningservice(){
        if(isCleaning_services()){
            return "Παρέχει";
        }
        return "Δεν παρέχει";
    }
}
