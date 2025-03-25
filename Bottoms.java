import java.util.*;
public class Bottoms extends Clothing {
    

    private boolean isShort;
    private boolean hasPockets;

    public Bottoms (String size, String material, String gender, boolean isShort, boolean hasPockets){
        super(size, material, gender);
        this.isShort = isShort;
        this.hasPockets = hasPockets;
    }

    public boolean getLength(){
        return isShort;
    }
    public void setLength(boolean isShort){
        this.isShort = isShort;
    }

    public boolean getPockets(){
        return hasPockets;
    }
    public void setPocket(boolean hasPockets){
        this.hasPockets = hasPockets;
    }

    public String toString(){
        String str = "";
        String pocket;
        String length;
        
        if(getPockets()){
            pocket = "Pockets";
        }
        else{
            pocket = "None";
        }

        if(getLength()){
            length = "Shorts";
        }
        else{
            length = "Long Pants";
        }

        str += "Current LookUp:" + "\n" + "Size: " + getSize() + "\n" + "Material: " + getMaterial() + "\n" + "Gender: " + getGender() + "\n" + "Pockets: " + pocket + "\n" + "Length: " + length;

        return str;
    }




}
