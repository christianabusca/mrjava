import java.util.Scanner;

public class ControlConsole {
	
	/* Choices for the console */
	static final int guess = 1;
	static final int correction = 2;
	static final int justice = 3;
	static final int nested = 4;
	static final int fruitloop = 5;
	static final int whileloop = 6;
	static final int dowhile = 7;
	static final int exit = 8;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* Passing through the method choices that have the choices of the simulation */

		/* Initializing the choice to 0 */
		int choice = 0;

		/*
		 * Creating a while loop to create a continuous use of console until the user
		 * press the specific number that exits the console itself.
		 */

		while (choice != exit && choice != 8) {
			choices();
			/*
			 * This will ask the user to enter their choice based on the method of choice()
			 */
			System.out.println("\nEnter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case guess:
				/*
				 * We will pass another method here that simulates how if's work on Java by
				 * guessing whether the number is greater, less than, or equal than 0
				 */
				System.out.println("\n|--------------------------------------------------|");
				System.out.println("|     This code showcase just the if statement     |");
				System.out.println("|--------------------------------------------------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				System.out.print("Enter a number: ");
				int number = scanner.nextInt();
				ifs(number);
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				break;

			/**/

			case correction:
				System.out.println("\n|--------------------------------------------------|");
				System.out.println("|     This code showcase the if else statement     |");
				System.out.println("|--------------------------------------------------|\n");
				/**/
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				System.out.print("Enter a number: ");
				int conditional1 = scanner.nextInt();
				ifelses(conditional1);
				/**/
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				/**/
				break;

			/**/

			/**/

			case justice:
				System.out.println("\n|---------------------------------------------------|");
				System.out.println("|     This code showcase about the switch cases     |");
				System.out.println("|---------------------------------------------------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				System.out.println("\n|----------------------------------------|");
				System.out.println("|     Operations on Switch Cases <33     |");
				System.out.println("|----------------------------------------|\n");

				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				System.out.println("\n|---------------------------|");
				System.out.println("|Please Select from the Menu|");
				System.out.println("|---------------------------|");
				System.out.println("|        1. Addition        |");
				System.out.println("|       2. Subtraction      |");
				System.out.println("|     3. Multiplication     |");
				System.out.println("|        4. Division        |");
				System.out.println("|---------------------------|\n");

				System.out.print("Enter a number: ");
				int switches = scanner.nextInt();
				int a = 0, b, c;

				switch (switches) {
				case 1:
					System.out.print("Enter the first number: ");
					b = scanner.nextInt();
					System.out.print("Enter the second number: ");
					c = scanner.nextInt();
					a = b + c;
					break;
				case 2:
					System.out.print("Enter the first number: ");
					b = scanner.nextInt();
					System.out.print("Enter the second number: ");
					c = scanner.nextInt();
					a = b - c;
					break;
				case 3:
					System.out.print("Enter the first number: ");
					b = scanner.nextInt();
					System.out.print("Enter the second number: ");
					c = scanner.nextInt();
					a = b * c;
					break;
				case 4:
					System.out.print("Enter the first number: ");
					b = scanner.nextInt();
					System.out.print("Enter the second number: ");
					c = scanner.nextInt();
					a = b / c;
					break;
				default:
					System.out.println("\n|----------------------------------------|\n"
							+ "|     Invalid Message Try Again! -_-     |\n"
							+ "|----------------------------------------|\n");
					try {
						// Sleep for 3 seconds (3000 milliseconds)
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// Handle the interrupted exception if necessary
						e.printStackTrace();
					}
					break;

				}

				/**/
				System.out.println("\n|---------------------------------------------------------|");
				System.out.println("|             The result of your input is: " + a + "             |");
				System.out.println("|---------------------------------------------------------|\n");

				try {
					// Sleep for 3 seconds (3000 milliseconds)
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				break;

			/**/

			case nested:
				System.out.println("\n|---------------------------------------------------------|");
				System.out.println("|     This code showcase the nested if else statement     |");
				System.out.println("|---------------------------------------------------------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				/**/
				System.out.print("Enter a number: ");
				int conditional2 = scanner.nextInt();
				nested(conditional2);
				/**/
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				break;

			/**/

			case fruitloop:
				System.out.println("\n|---------------------------------------------------------|");
				System.out.println("|     This code showcase about the for loop condition     |");
				System.out.println("|---------------------------------------------------------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				/**/
				System.out.println("\n|-----------------------------|");
				System.out.println("|    Numbers that add (+2)    |");
				System.out.println("|-----------------------------|\n");
				/**/
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}

				System.out.print("Please enter the number: ");
				int forit = scanner.nextInt();
				int addNum = forit;
				System.out.println("\n|----------|");
				for (int i = 0; i < 5; i++) {
					addNum += 2;
					System.out.println("|    " + addNum + "    |");

				}
				System.out.println("|----------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				break;

			/**/

			case whileloop:
				System.out.println("\n|---------------------------------------------------------|");
				System.out.println("|    This code showcase about the while loop condition    |");
				System.out.println("|---------------------------------------------------------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				String[] allnames = { "Tessie", "Tita", "Venus", "Wendy", "Wynwyn", "Zia", "Arnel", "Benigno", "Coco",
						"Dennis", "Diether", "Enrique", "Ferdinand", "Jacinto", "Jericho", "John", "Jose", "Lou",
						"Manny", "Manuel", "Markus", "Paulo", "Piolo", "Ramon", "Richard", "Zoren", "Adolfo", "Alfonso",
						"Antonio", "Bernardo", "Carlos", "Cesar", "Diego", "Ernesto", "Fernando", "Francisco", "Franco",
						"Gilberto" };

				
				System.out.println("\n|---------------------------------------------------------|");
				System.out.println("|    Printing names using while loop with created list    |");
				System.out.println("|---------------------------------------------------------|\n");
				
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				
				// Initialize index variable
		        int index = 0;
		        
		        // While loop to print names from the array
		        while (index < allnames.length) {
		            System.out.println(allnames[index]);
		            index++; // Increment index to move to the next name
		        }
				
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				
				
				break;

			/**/

			case dowhile:
				System.out.println("\n|---------------------------------------------------------|");
				System.out.println("|   This code showcase about the do-while loop condition  |");
				System.out.println("|---------------------------------------------------------|\n");
				try {
					// Sleep for 3 seconds
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				System.out.println("Enter a number to add: ");
		        int numberToAdd = scanner.nextInt();

		        int totalSum = 0;

		        do {
		        	
		        	totalSum += numberToAdd;
		        	System.out.println("|----------|");
		        	System.out.println("|   " + totalSum + "    |");
		        	System.out.println("|----------|");
		        } while (totalSum < 250);
		        
		        System.out.println("\n|----------------------------------------------|");
				System.out.println("|    Total sum reached 250 or more: " + totalSum +"        |");
				System.out.println("|----------------------------------------------|\n");
				try {
					// Sleep for 5 seconds
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				break;

			/**/

			case exit:
				System.out.println("\n|----------------------------------------|");
				System.out.println("|     Thank you for using Simulators     |");
				System.out.println("|----------------------------------------|\n");
				break;

			/**/

			default:
				System.out.println("\n|----------------------------------------|\n"
						+ "|     Invalid Message Try Again! -_-     |\n"
						+ "|----------------------------------------|\n");
				try {
					// Sleep for 3 seconds (3000 milliseconds)
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// Handle the interrupted exception if necessary
					e.printStackTrace();
				}
				break;
			}
		}
		scanner.close();
	}

	static void choices() {

		/* First list of choices where it will first pop up. */

		System.out.println("\n|----------------------------------|");
		System.out.println("|     Welcome to Simulators!!!     |");
		System.out.println("|----------------------------------|\n");

		System.out.println("\n|---------------------------|");
		System.out.println("|Please Select from the Menu|");
		System.out.println("|---------------------------|");
		System.out.println("|       1. Just If's        |");
		System.out.println("|       2. Correction       |");
		System.out.println("|       3. Switching        |");
		System.out.println("|        4. Nested          |");
		System.out.println("|        5. For Loop        |");
		System.out.println("|     6. Printing While     |");
		System.out.println("|      7. Do While Loop     |");
		System.out.println("|          8. Exit          |");
		System.out.println("|---------------------------|\n");
	}

	static void ifs(int number) {
		/*
		 * We will create an if method here, where we will ask a user for a number then
		 * pass through a conditional statement.
		 */
		if (number < 0) {
			System.out.println("\n|-------------------------------------|");
			System.out.println("| The digit you enter is less than 0  |");
			System.out.println("|-------------------------------------|\n");
		}
		if (number > 0) {
			System.out.println("\n|-------------------------------------|");
			System.out.println("|The digit you enter is greater than 0|");
			System.out.println("|-------------------------------------|\n");
		}
		if (number == 0) {
			System.out.println("\n|-------------------------------------|");
			System.out.println("|  The digit you enter is equal to 0  |");
			System.out.println("|-------------------------------------|\n");
		}

	}

	static void ifelses(int conditional1) {
		/**/
		if (conditional1 % 2 == 0) {
			System.out.println("\n|---------------------------|");
			System.out.println("| The number given is even  |");
			System.out.println("|---------------------------|\n");
		} else {
			System.out.println("\n|---------------------------|");
			System.out.println("|  The number given is odd  |");
			System.out.println("|---------------------------|\n");
		}

	}

	static void nested(int conditional2) {
		/**/
		if (conditional2 > 0) {
			System.out.println("\n|-------------------------------------|");
			System.out.println("|The digit you enter is greater than 0|");
			System.out.println("|-------------------------------------|\n");
			try {
				// Sleep for 3 seconds (3000 milliseconds)
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// Handle the interrupted exception if necessary
				e.printStackTrace();
			}
			if (conditional2 % 2 == 0) {
				System.out.println("\n|--------------------------------|");
				System.out.println("| And, the number given is even  |");
				System.out.println("|--------------------------------|\n");
			} else {
				System.out.println("\n|-------------------------------|");
				System.out.println("| And, the number given is odd  |");
				System.out.println("|-------------------------------|\n");
			}

		} else if (conditional2 < 0) {
			System.out.println("\n|-------------------------------------|");
			System.out.println("| The digit you enter is less than 0  |");
			System.out.println("|-------------------------------------|\n");

		} else {
			System.out.println("\n|-------------------------------------|");
			System.out.println("|  The digit you enter is equal to 0  |");
			System.out.println("|-------------------------------------|\n");
		}

	}

	/**/

}
