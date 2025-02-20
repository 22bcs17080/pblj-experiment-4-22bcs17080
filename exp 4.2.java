//Aim: Create a program to collect and store all the cards to assist the users in finding all the cards in a given symbol using Collection interface.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Card class to store symbol and number
class Card {
private String symbol;
private String number;
// Constructor
public Card(String symbol, String number) {
this.symbol = symbol;
this.number = number;
}
public String getSymbol() {
return symbol;
}
@Override
public String toString() {
return "Card: " + number + " of " + symbol;
}
}
public class CardCollectionSystem {
static List<Card> cardCollection = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
while (true) {
System.out.println("\n--- Card Collection System ---");
System.out.println("1. Add a Card");
System.out.println("2. Find Cards by Symbol");
System.out.println("3. Display All Cards");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline
switch (choice) {
case 1:
addCard();
break;
case 2:
findCardsBySymbol();
break;
case 3:
displayAllCards();
break;
case 4:
System.out.println("Exiting Card Collection System.");
scanner.close();
return;
default:
System.out.println("Invalid choice! Please try again.");
}
}
}
// Add a new card
public static void addCard() {
System.out.print("Enter Card Symbol (Hearts, Spades, Diamonds, Clubs): ");
String symbol = scanner.nextLine();
System.out.print("Enter Card Number (e.g., Ace, 2, King): ");
String number = scanner.nextLine();
cardCollection.add(new Card(symbol, number));
System.out.println("Card added successfully!");
}
// Find and display all cards of a given symbol
public static void findCardsBySymbol() {
System.out.print("Enter Symbol to search for (Hearts, Spades, Diamonds, Clubs): ");
String symbol = scanner.nextLine();
boolean found = false;
System.out.println("\nCards in " + symbol + ":");
for (Card card : cardCollection) {
if (card.getSymbol().equalsIgnoreCase(symbol)) {
System.out.println(card);
found = true;
}
}
if (!found) {
System.out.println("No cards found with the symbol " + symbol);
}
}
// Display all stored cards
public static void displayAllCards() {
if (cardCollection.isEmpty()) {
System.out.println("No cards stored!");
} else {
System.out.println("\nAll Cards:");
for (Card card : cardCollection) {
System.out.println(card);
}
}
}
}
