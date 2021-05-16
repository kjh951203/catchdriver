
package taxiteam;

public class PaymentCancelled extends AbstractEvent {

    private Long id;
    private Long matchId;
    private String customer;

    public Long getId() {
        return id;
    }

    public void setMatchId(Long id) {
        this.id = id;
    }
    public Long getMatchId() {
        return matchId;
    }

    public void setId(Long matchId) {
        this.matchId = matchId;
    }
    public String getStudent() {
        return customer;
    }

    public void setStudent(String customer) {
        this.customer = customer;
    }
}
