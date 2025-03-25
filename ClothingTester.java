import java.util.*;
/**
 * Class main class with the main method
 * The runner for the code
 * @author Adelle.Kang
 * @version 1.0.0
 */
public class ClothingTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            
            System.out.println("Would you like to purchase clothing? (y/n): ");
            String checker = in.nextLine();
            if(checker.equals("n")){
                break;
            }
            System.out.println();
            System.out.println("--------------------");

            System.out.println("Enter your size (s, m, l): ");
            String size = in.nextLine();
            System.out.println();
            System.out.println("Enter the material of your clothing (cotton, polyester, wool): ");
            String material = in.nextLine();
            System.out.println();
            System.out.println("Enter the gender of the clothing (women, men, unisex): ");
            String gender = in.nextLine();
            System.out.println();
            System.out.println();
            Clothing clothing = new Clothing(size, material, gender);
            System.out.println(clothing);

            System.out.println();
            System.out.println("--------------------");

            System.out.println("What would you like to purchase? (outerwear/top/bottom): ");
            String choice = in.nextLine();
            System.out.println();
            if(choice.equals("outerwear")){
                System.out.println("Would you like a hood (y/n)?: ");
                String hood = in.nextLine();
                boolean hoodd = false;
                if(hood.equals("y")){
                    hoodd = true;
                }
                else if(hood.equals("n")){
                    hoodd = false;
                }
                System.out.println();
                System.out.println("Would you like a zipper (y/n)?: ");
                String zipper = in.nextLine();
                boolean zipperr = false;
                if(zipper.equals("y")){
                    zipperr = true;
                }
                else if(zipper.equals("n")){
                    zipperr = false;
                }

                Outerwear outerwear = new Outerwear(size, material, gender, hoodd, zipperr);
                System.out.println();
                System.out.println();
                System.out.println(outerwear);

            }
            else if(choice.equals("top")){
                System.out.println("Long sleeve or short sleeve? (l/s)?: ");
                String sleeve = in.nextLine();
                System.out.println();
                boolean sleevee = false;
                if(sleeve.equals("l")){
                    sleevee = false;
                }
                else if(sleeve.equals("s")){
                    sleevee = true;
                }

                System.out.println("Would you like a collar (y/n)?: ");
                String collar = in.nextLine();
                boolean collarr = false;
                if(collar.equals("y")){
                    collarr = true;
                }
                else if(collar.equals("n")){
                    collarr = false;
                }

                Tops tops = new Tops(size, material, gender, sleevee, collarr);
                System.out.println();
                System.out.println();
                System.out.println(tops);
            }
            else if(choice.equals("bottom")){
                System.out.println("Long pants or shorts? (l/s)?: ");
                String length = in.nextLine();
                System.out.println();
                boolean lengthh = false;
                if(length.equals("l")){
                    lengthh = false;
                }
                else if(length.equals("s")){
                    lengthh = true;
                }

                System.out.println("Would you like pockets (y/n)?: ");
                String pocket = in.nextLine();
                boolean pockett = false;
                if(pocket.equals("y")){
                    pockett = true;
                }
                else if(pocket.equals("n")){
                    pockett = false;
                }

                Bottoms bottoms = new Bottoms(size, material, gender, lengthh, pockett);
                System.out.println();
                System.out.println();
                System.out.println(bottoms);
            }
            else{
                System.out.println("Sorry... not available. Come back next time!");
            }

            System.out.println();
            System.out.println("Order has been sent in!");
            System.out.println();
            System.out.println("--------------------");
            System.out.println("--------------------");
        }

        System.out.println("Thank you! See you next time!");

    }
}
