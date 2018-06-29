/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Madushi
 */
public class substitution {
    String text1="";
   String key = "Madushi";
   int keyascii=0;
   private ArrayList<Character> encrupttext;
   private ArrayList<String> subtext;
   char [] ciphertxt1={};
   //char [] encrypttxt={};
     //private ArrayList<Long> mylist;
   // private ArrayList<Long> releases;
    private char[] myList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char[] myList1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String myList2="abcdefghijklmnopqrstuvwxyz";
    public substitution(){
        this.encrupttext = new ArrayList<>();
        this.subtext = new ArrayList<>();
    }
    public String substitution(String key,String text){
       
      key=key.toLowerCase();
      text=text.toLowerCase();
      for(int i=0;i<key.length();i++){
           keyascii+=(int)key.charAt(i);
           keyascii=Math.abs(keyascii)%10;
            
    }
       
        for(int i=0;i<26-keyascii;i++){
   
            getMyList1()[i] = getMyList()[i+keyascii];
    }for(int i=26-keyascii;i<26;i++){
   
            getMyList1()[i] = getMyList()[i-26+keyascii];
}
        
        System.out.print("Cipher text-:");
        System.out.println(getMyList1());
       
        for(int i=0;i<text.length();i++){
            char letter = text.charAt(i);
           if (Character.isLetter(letter))
        {
            
                getEncrupttext().add(getMyList1()[myList2.indexOf(String.valueOf(letter))]);
               
        }else{
               getEncrupttext().add(letter);
           }
            
    }for(Character elem : encrupttext){
        text1+=elem;
    }
        
        return text1;
        
    }

    
    public ArrayList<Character> getEncrupttext() {
        return encrupttext;
    }

   
    public void setEncrupttext(ArrayList<Character> encrupttext) {
        this.encrupttext = encrupttext;
    }
    public String permutation(String Text){
        String Text1="";
        String encrypt="";
       
        for(int i=0;i<(4-(Text.length()%4));i++){
            Text1+='x';
           
        }Text+=Text1;
      
        
        for(int i=0;i<Text.length();i=i+4){
            encrypt+=new StringBuffer(Text.substring(i,i+4)).reverse().toString();
            encrypt+="*";
        }
      
        return encrypt;
    }

    
    public char[] getMyList1() {
        return myList1;
    }

    /**
     * @param myList1 the myList1 to set
     */
    public void setMyList1(char[] myList1) {
        this.myList1 = myList1;
    }

    /**
     * @return the myList
     */
    public char[] getMyList() {
        return myList;
    }

    /**
     * @param myList the myList to set
     */
    public void setMyList(char[] myList) {
        this.myList = myList;
    }


  
}
