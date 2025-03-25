import java.util.*;
public class Clothing {

    private String size;
    private String material;
    private String gender;

    public Clothing(String size, String material, String gender){
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString(){
        String str = "";
        str += "Current LookUp:" + "\n" + "Size: " + getSize() + "\n" + "Material: " + getMaterial() + "\n" + "Gender: " + getGender();
        return str;

    }
}