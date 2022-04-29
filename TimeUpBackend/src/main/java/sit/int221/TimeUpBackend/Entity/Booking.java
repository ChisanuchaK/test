package sit.int221.TimeUpBackend.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbooking" , nullable = false)
    private Integer idBooking;

    @Column(name = "bookingName" , length = 100 , nullable = false)
    private String bookingName;

    @Column(name = "bookingEmail" , length = 100 , nullable = false)
    private String bookingEmail;


    @ManyToOne
    @JoinColumn(name = "eventCategoryName"  , nullable = false)
    private EventCategory eventCategoryName;


    @Column(name = "eventStartTime" ,nullable = false )
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date eventStartTime;

    @Column(name = "eventDuration" , nullable = false)
    private Integer eventDuration;

    @Column(name = "eventNotes", length = 500)
    private String eventNotes;


}
