import java.util.*; 
package com.example;
 
class LibraryManagementSystem { 
 
    static final int ALLOWED_DAYS = 14; 
    static final int FINE_PER_DAY = 5; 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        // User details 
        System.out.print("Enter User Name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter User ID: "); 
        int id = sc.nextInt(); 
 
        System.out.print("Enter number of books issued: "); 
        int books = sc.nextInt(); 
 
        sc.nextLine(); // consume newline 
 
        List<String> bookList = new ArrayList<>(); 
 
        for (int i = 0; i < books; i++) { 
            System.out.print("Enter book name " + (i + 1) + ": "); 
            bookList.add(sc.nextLine()); 
        } 
 
        System.out.print("Enter number of days books were borrowed: "); 
        int days = sc.nextInt(); 
 
        // Fine calculation 
        int fine = 0; 
        if (days > ALLOWED_DAYS) { 
            fine = (days - ALLOWED_DAYS) * FINE_PER_DAY; 
        } 
 
        // Output 
        System.out.println("\n===== LIBRARY DETAILS ====="); 
        System.out.println("Name: " + name); 
        System.out.println("ID: " + id); 
        System.out.println("Books Issued: " + books); 
        System.out.println("Book List: " + bookList); 
        System.out.println("Days Borrowed: " + days); 
        System.out.println("Total Fine: Rs. " + fine); 
        System.out.println("Druthendra"); 

        
    } 
} 
 
