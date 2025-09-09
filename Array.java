//Take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.*;
class Array{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Marks of how many childern:");
int n=sc.nextInt();
int Marks[]=new int [n];
System.out.println("Enetr your marks:");
for(int i=0; i<n; i++){
Marks[i]=sc.nextInt();
}
System.out.println("Enter the number you want to find:");
int x=sc.nextInt();
for(int i=0; i<n; i++){
if(Marks[i]==x){
System.out.println(Marks[i]+" is present at index " +i);
}
}
}
}