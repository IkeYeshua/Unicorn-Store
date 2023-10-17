package store.data.models;

import lombok.Data;

import javax.swing.event.TreeSelectionEvent;
import java.util.Set;
import java.util.TreeSet;

@Data

public class Buyer extends User {
    private String firstname;
    private String lastName;
    private String address;
    private Set<String> deliveryAddresses = new TreeSet<String>();
}
