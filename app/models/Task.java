package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Task extends Model {
    
    @Required
    public String title;
    public boolean done;
    
    public Task(String title) {
        this.title = title;
    }
    
    public String toString() {
        return title;
    }
}
