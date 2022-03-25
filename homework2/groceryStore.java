package homework2;

import java.util.Scanner;

// GroceryStore class.
public class groceryStore {

    // Fields of a class.
    String productType;
    int productAmount;

    // Constructor method of grocery store.
    public groceryStore(String productName, int productWeigh){

        // Parameters
        productType = productName;
        productAmount = productWeigh;

    }

    // This is main method of greenGrocery class.
    public static void main(String[] args){
        // Generating instances to groceryStore class.
        groceryStore apple = new groceryStore("apple", 30); // Created and instance for Apple.
        groceryStore pea = new groceryStore("pea", 50); // Created an instance for Pea.
        groceryStore cherry = new groceryStore("cherry", 70); // Created an instance for cherry.

        // Finding the weights of products.
        System.out.println("The amount of apple: " + apple.productAmount + " kg");
        System.out.println("The amount of pea: " + pea.productAmount + " kg");
        System.out.println("The amount of cherry: " + cherry.productAmount + " kg");

        // Prompting the user to get a fruit they like.
        System.out.println("Please enter the type of fruit you would like to get: ");
        Scanner scanner = new Scanner(System.in);
        String fruitType = scanner.next();

        // Prompting the user to get the amount of fruit they want.
        System.out.println("Please enter the amount of fruit you would like to get: ");
        Integer fruitAmount = scanner.nextInt();

        // If the user enters more kg's that warehouse already has:
        if (apple.productAmount<fruitAmount || cherry.productAmount<fruitAmount || pea.productAmount<fruitAmount)  {
            System.out.println("There are not enough amount of fruit at warehouse.");

            // Warehouse arrangement after sale.
        } else if (fruitType.equals(apple.productType)) {
            apple.productAmount -= fruitAmount;
            System.out.println("There are " + apple.productAmount + " kg's apple left.");
        } else if (fruitType.equals(pea.productType)){
            pea.productAmount -= fruitAmount;
            System.out.println("There are " + pea.productAmount + " kg's pea left.");
        } else if (fruitType.equals(cherry.productType)){
            cherry.productAmount -= fruitAmount;
            System.out.println("There are " + cherry.productAmount + " kg's cherry left.");
        }

    }

}

