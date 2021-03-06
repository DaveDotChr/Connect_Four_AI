package Connect_Four;

import Player.Teams;

public class Field {
    
    private Teams Color;
    private boolean Set;
    private int x_pos;
    private int y_pos;
    private static int FieldCount = 1;
    public double prediction = 1.0;
    private boolean setable;
    private String[] predictionColor = {"1","","","","","","",""};


    public Field(int x_pos, int y_pos){
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.Set = false;
        this.Color = Teams.neutral;
        //System.out.println("Field " + FieldCount + " created" + x_pos + " <x-y> " + y_pos);
        FieldCount++;
    }


    public void Fill (Teams setTeam){
        this.Color = setTeam;
        this.Set = true;
    }

    public boolean CheckIfSet(){
        return this.Set;
    }

    public Teams getColor(){
        return Color;
    }

    /** 
     * @Description Takes color String as Input
     * @return true if match, false if no match
    */ 
    public boolean colorMatch(Teams match){
        return match == this.Color;
    }


    /**
     * @Description First Array Element is x, second is y coordinate
     * @return Array with coordinates
     */

    public int[] getCoordinates(){
        int[] re = {x_pos, y_pos};
        return re;
    }

    public void setSetable(boolean bool){
        this.setable = bool;
    }

    public boolean isSetable(){
        return this.setable;
    }

    public void calculatePrediction(){
        //TODO Auslagern in Calculations Klasse
        this.prediction = 9;
    }

    public String getPrediction(){
        if(this.Set == true){
            return " X ";
        }
        if(this.setable == false){
            return "0.0";
        }
        return String.valueOf(this.prediction);
    }

    public void setPrediction(double prediction){
        this.prediction = prediction;
    }
    
}
