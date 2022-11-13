import java.util.*;

public class Main {
    public static void main(String[] args) {

        Account Bennie = new Account("Bennie Schroeder", 1761, 18);
        Map<Account, String> usernameList = new HashMap<>();
        usernameList.put(Bennie, "schroederb");
        System.out.println(usernameList);
        Bennie.balance = 120;
        //System.out.println("1 " + usernameList.getOrDefault( Bennie, "cheese"));
        //System.out.println("2 " + usernameList.keySet());


        Scanner scannerInput = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Hello, welcome to Keenie banking.");
        System.out.println("Would you like to (1) create an account or (2) check your balance?");
        int intInput = scannerInput.nextInt();
        if(intInput == 1) {

            System.out.println("");
            System.out.println("To create an account, you must be 18 years of age or older.");
            System.out.println("How old are you?:");
            int newAge = scannerInput.nextInt();

            System.out.println("");
            if(newAge < 18) {

                System.out.println("You are not old enough to have a bank account, exiting program.");

            } else {
                System.out.println("");
                System.out.println("Please type in your first and last name.");
                System.out.println("Your username will be your last name and the first letter of");
                System.out.println("your first name. For example, John Cena -> 'cenaj'. ");

                String newName = scannerString.nextLine();
                System.out.println("");
                System.out.println("** Your account name will be "
                        + extractLastName(newName).toLowerCase()
                        + newName.toLowerCase().charAt(0) + ". **");

                System.out.println("");
                System.out.println("Now, please type the last four of your Social Security number:");
                int newSSN = scannerInput.nextInt();

                while (newSSN > 9999 || newSSN < 999) {
                    System.out.println("Please enter a valid number!");
                    newSSN = scannerInput.nextInt();
                    continue;
                }
                Account user = new Account(newName, newSSN, newAge);
                usernameList.put(user, user.username);
                System.out.println("Account successfully created!");
                while(true) {

                    System.out.println("");
                    System.out.println("Your balance is $" + user.balance);
                    System.out.println("Would you like to withdraw or deposit?");
                    String bankOption = scannerString.nextLine();
                    if (bankOption.contains("withdraw")) {
                        System.out.println("How much would you like to withdraw?");
                        int withdrawAmount = scannerInput.nextInt();
                        if(withdrawAmount < 0 || withdrawAmount > user.balance) {
                            System.out.println("It doesn't work like that, dumbass.");
                        } else {
                            user.balance -= withdrawAmount;
                        }
                    } else if (bankOption.contains("deposit")) {
                        System.out.println("How much would you like to deposit?");
                        int depositAmount = scannerInput.nextInt();
                        if(depositAmount < 0) {
                            System.out.println("It doesn't work like that, dumbass.");

                        } else {
                            user.balance += depositAmount;
                        }
                    } else if (bankOption.contains("break")) {
                        break;
                    }

                }

            }

        } else if (intInput == 2) {
            System.out.println("");
            System.out.println("Please enter your username:");
            String usernameInput = scannerString.nextLine();
            if(usernameList.containsValue(usernameInput)) {
                while(true) {

                    System.out.println("");
                    System.out.println("Your balance is $" + (Bennie.balance));
                    System.out.println("Would you like to withdraw or deposit?");
                    String bankOption = scannerString.nextLine();
                    if (bankOption.contains("withdraw")) {
                        System.out.println("How much would you like to withdraw?");
                        int withdrawAmount = scannerInput.nextInt();
                        if(withdrawAmount < 0 || withdrawAmount > Bennie.balance) {
                            System.out.println("It doesn't work like that, dumbass.");

                        } else {
                            Bennie.balance -= withdrawAmount;
                        }
                    } else if (bankOption.contains("deposit")) {
                        System.out.println("How much would you like to deposit?");
                        int depositAmount = scannerInput.nextInt();
                        if(depositAmount < 0) {
                            System.out.println("It doesn't work like that, dumbass.");

                        } else {
                            Bennie.balance += depositAmount;
                        }
                    } else if (bankOption.contains("break")) {
                        break;
                    }

                }
            }
        }





    }


    public static String extractLastName(String firstAndLast) {
        return firstAndLast.substring(firstAndLast.indexOf(" ") + 1);
    }



}
