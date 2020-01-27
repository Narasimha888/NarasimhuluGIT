import java.io.*;
import  java.util.*;
class A
{
public static void main(String...aa){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=n-1,l=1;
for(int i=0;i<n;i++){
for(int m=0;m<k;m++){
System.out.print(" ");}
for(int j=0;j<=i;j++){
System.out.print(l+" ");
l++;}
k--;
System.out.println();}
}}