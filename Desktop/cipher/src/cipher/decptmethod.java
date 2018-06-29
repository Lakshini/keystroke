/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Madushi
 */
public class decptmethod {
    
    String decryptTxt="";
    String finaltext="";
    String text1="";
    int keyascii=0;
    private ArrayList<Character> decrypttext;
    
    private char[] myList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char[] myList1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String text2="abcdefghijklmnopqrstuvwxyz";
    public decptmethod(){
        this.decrypttext = new ArrayList<>();
    }
    public void decrypt(String Text, String key){
        key=key.toLowerCase();
      Text=Text.toLowerCase();
      for(int i=0;i<key.length();i++){
           keyascii+=(int)key.charAt(i);
            keyascii=Math.abs(keyascii)%10;
            
    }
       
        for(int i=0;i<26-keyascii;i++){
   
            getMyList1()[i] = getMyList()[i+keyascii];
    }for(int i=26-keyascii;i<26;i++){
   
            getMyList1()[i] = getMyList()[i-26+keyascii];
}
       
        for(Character elem : getMyList1()){
        text1+=elem;
    }
       
       
        String parts[]=Text.split("\\*");
        for(int i=0;i<parts.length;i++){
           
            decryptTxt+=new StringBuffer(parts[i]).reverse().toString();
            
        }
        while(decryptTxt.charAt(decryptTxt.length()-1)=='x'){
        if(decryptTxt.charAt(decryptTxt.length()-1)=='x'){
            decryptTxt=decryptTxt.substring(0,decryptTxt.length()-1);
            
        }}
       
        for(int i=0;i<decryptTxt.length();i++){
            char letter = decryptTxt.charAt(i);
           if (Character.isLetter(letter))
        {
            getDecrypttext().add(myList[text1.indexOf(String.valueOf(letter))]);
             
        }else{
               getDecrypttext().add(letter);
           }
            
    }for(Character x:getDecrypttext()){
        finaltext+=x;
    }
    JOptionPane.showMessageDialog(null, "Decrypted text -: "+finaltext);
    }

    
    public char[] getMyList() {
        return myList;
    }

    /**
     * @param myList the myList to set
     */
    public void setMyList(char[] myList) {
        this.myList = myList;
    }

    /**
     * @return the myList1
     */
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
     * @return the decrypttext
     */
    public ArrayList<Character> getDecrypttext() {
        return decrypttext;
    }

    /**
     * @param decrypttext the decrypttext to set
     */
    public void setDecrypttext(ArrayList<Character> decrypttext) {
        this.decrypttext = decrypttext;
    }
    
}
