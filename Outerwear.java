import java.util.*;
public class Outerwear extends Clothing {

    private boolean hasHood;
    private boolean hasZip;

    public Outerwear (String size, String material, String gender, boolean hasHood, boolean hasZip){
        super(size, material, gender);
        this.hasHood = hasHood;
        this.hasZip = hasZip;
    }

    public boolean getHood(){
        return hasHood;
    }
    public void setHood(boolean hasHood){
        this.hasHood = hasHood;
    }

    public boolean getZip(){
        return hasZip;
    }
    public void setZip(boolean hasZip){
        this.hasZip = hasZip;
    }

    @Override
    public String toString(){
        String str = "";
        String hood;
        String zip;
        
        if(hasHood){
            hood = "Hood";
        }
        else{
            hood = "None";
        }

        if(hasZip){
            zip = "Zipper";
        }
        else{
            zip = "No-Zipper";
        }

        str += "Current LookUp:" + "\n" + "Size: " + getSize() + "\n" + "Material: " + getMaterial() + "\n" + "Gender: " + getGender() + "\n" + "Hood: " + hood + "\n" + "Zipper: " + zip;

        return str;
    }
}
