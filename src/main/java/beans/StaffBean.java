package beans;

import database.entities.StaffEntity;

/**
 * Created by Olga on 17.08.2017.
 */
public class StaffBean {

    private String name;
    private String position;

    public StaffBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition(){return position;}

    public void setPosition(String position){this.position = position;}


    public StaffEntity toEntity() {
        StaffEntity entity = new StaffEntity();
        entity.setName(name);
        entity.setPosition(position);
        return entity;
    }
}
