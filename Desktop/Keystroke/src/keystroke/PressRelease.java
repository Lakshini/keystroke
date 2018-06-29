/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Madushi
 */
public class PressRelease {
    private ArrayList<Long> presses;
    private ArrayList<Long> releases;
    private ArrayList<Long> errorPresses;
    private ArrayList<Long> errorReleases;

    public PressRelease() {
        this.presses = new ArrayList<>();
        this.releases=new ArrayList<>();
        this.errorPresses=new ArrayList<>();
        this.errorReleases=new ArrayList<>();
    }
    
    public void press(java.awt.event.KeyEvent keyEvent){
        Long time = System.currentTimeMillis();
        
        
        
        if ((keyEvent.getKeyCode() != keyEvent.VK_BACK_SPACE))  {
            getPresses().add(time);
    }
//         for(long elem : presses){
//        System.out.println(elem+"  "+"jid");
//   }
//    }
    }
    public void release(java.awt.event.KeyEvent keyEvent){
       Long time = System.currentTimeMillis();
        
        if ((keyEvent.getKeyCode() != KeyEvent.VK_BACK_SPACE))  {
            getReleases().add(time);
    }
    }

    /**
     * @return the presses
     */
    public ArrayList<Long> getPresses() {
        return presses;
    }

    /**
     * @param presses the presses to set
     */
    public void setPresses(ArrayList<Long> presses) {
        this.presses = presses;
    }

    /**
     * @return the releases
     */
    public ArrayList<Long> getReleases() {
        return releases;
    }

    /**
     * @param releases the releases to set
     */
    public void setReleases(ArrayList<Long> releases) {
        this.releases = releases;
    }

    /**
     * @return the errorPresses
     */
    public ArrayList<Long> getErrorPresses() {
        return errorPresses;
    }

    /**
     * @param errorPresses the errorPresses to set
     */
    public void setErrorPresses(ArrayList<Long> errorPresses) {
        this.errorPresses = errorPresses;
    }

    /**
     * @return the errorReleases
     */
    public ArrayList<Long> getErrorReleases() {
        return errorReleases;
    }

    /**
     * @param errorReleases the errorReleases to set
     */
    public void setErrorReleases(ArrayList<Long> errorReleases) {
        this.errorReleases = errorReleases;
    }
}
