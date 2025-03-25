import java.util.*;
public class Tops extends Clothing {
    private boolean shortSleeve;
    private boolean hasCollar;

    public Tops (String size, String material, String gender, boolean shortSleeve, boolean hasCollar){
        super(size, material, gender);
        this.shortSleeve = shortSleeve;
        this.hasCollar = hasCollar;
    }

    public boolean getSleeve(){
        return shortSleeve;
    }
    public void setSleeve(boolean shortSleeve){
        this.shortSleeve = shortSleeve;
    }

    public boolean getCollar(){
        return hasCollar;
    }
    public void setCollar(boolean hasCollar){
        this.hasCollar = hasCollar;
    }

    public String toString(){
        String str = "";
        String sleeve;
        String collar;
        
        if(shortSleeve){
            sleeve = "Short";
        }
        else{
            sleeve = "Long";
        }

        if(hasCollar){
            collar = "Collar";
        }
        else{
            collar = "No Collar";
        }

        str += "Current LookUp:" + "\n" + "Size: " + getSize() + "\n" + "Material: " + getMaterial() + "\n" + "Gender: " + getGender() + "\n" + "Sleeve: " + sleeve + "\n" + "Collar: " + collar;

        return str;
    }
}
