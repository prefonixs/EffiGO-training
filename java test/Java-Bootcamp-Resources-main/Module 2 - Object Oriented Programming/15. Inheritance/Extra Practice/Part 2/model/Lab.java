package model;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labEquipments;

    public Lab(){
        labEquipments=new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index){
        return labEquipments.get(index).clone();
    }

    public void setLabEquipment(LabEquipment labEquipment,int index){
        labEquipments.set(index, labEquipment.clone());
    }

    public void addLabEquipment(LabEquipment labEquipment){
        labEquipments.add(labEquipment.clone());
    }
}
