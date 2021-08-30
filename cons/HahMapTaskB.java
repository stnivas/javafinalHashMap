import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.Map.*;

public class HashMapTaskB{
	    static Scanner input=new Scanner(System.in);
//Question1		
	public HashMap<String,String> map(){
   	  HashMap<String,String> hashMap=new HashMap<String,String>(); 
	  return hashMap;	  
    }
		
	public static void main(String[] args){
	     HashMapTaskB obj=new HashMapTaskB();
	     System.out.println("enter your choice");
	     int choice=input.nextInt();
	     
	switch(choice){
		case 1:
		        HashMap<String,String> hashMap=obj.map();
				System.out.println("HashMap="+hashMap);
				System.out.println("HashMap size="+hashMap.size());
			   
		break;