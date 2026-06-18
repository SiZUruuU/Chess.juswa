package ControlPanel;

public class mousePositionCalc {

    //Helper Method to get X position digits
    public int mouseXPos(int num){

        int digit = 0;

        while (num != 0){
            num /= 10;
            digit++;
        }
        return digit;
    }

    //Helper Method to get Y position digits
    public int mouseYPos(int num){

        int digit = 0;

        while (num != 0){
            num /= 10;
            digit++;
        }
        return digit;
    }
    
}
