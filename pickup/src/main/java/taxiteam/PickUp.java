package taxiteam;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="PickUp_table")
public class PickUp {

    @Id
    private Long matchId;
    private String driver;
    private String customer;

    @PostPersist
    public void onPostPersist(){
        PickupAssigned pickupAssigned = new PickupAssigned();
        BeanUtils.copyProperties(this, pickupAssigned);
        pickupAssigned.publishAfterCommit();
    }
    
    @PostRemove
    public void onPostRemove(){
        PickupCancelled pickupCancelled = new PickupCancelled();
        BeanUtils.copyProperties(this, pickupCancelled);
        pickupCancelled.publishAfterCommit();

    }


    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }




}
