package iteration3;

import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;


public class GreenReplacementCardBO {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String countryOfBirth;
    private HomeAddress homeAddress;
    private String reasonForReplacement;
    private ArrayList<GreenReplacementCardBO> forms;

    public GreenReplacementCardBO(int id, String firstName, String middleName, String lastName, Date dateOfBirth, String countryOfBirth, HomeAddress homeAddress, String reasonForReplacement) {

    }

    /**
     * Getter & Setter methods
     */
    public void setId(int id){
    }
    public int getId(){
        return -1;
    }
    public void setFirstName(String firstName){
    }
    public String getFirstName(){
        return null;
    }
    public void setMiddleName(String middleName){
    }
    public String getMiddleName(){
        return null;
    }
    public void setLastName(String lastName){

    }
    public String getLastName(){
        return null;
    }
    public void setDateOfBirth(Date dateOfBirth){

    }
    public Date getDateOfBirth(){
        return null;
    }
    public void setCountryOfBirth(String countryOfBirth){
    }
    public Date getCountryOfBirth(){
        return null;
    }
    public void setHomeAddress(HomeAddress homeAddress){

    }
    public String getHomeAddress(){
        return null;
    }
    public void setReasonForReplacement(String reasonForReplacement){

    }
    public String getReasonForReplacement(){
        return null;
    }

    /**
     * Validates country of birth exists
     * @param countryOfBirth
     * @return bool
     */
    public Boolean isValidCountry(String countryOfBirth){
        return false;
    }

    /**
     * Retrieves form with matching form id.
     * @param formId
     * @return GreenReplacementCardBO
     */
    public GreenReplacementCardBO getForm(int formId){
        return null;
    }
}