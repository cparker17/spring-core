package platform.codingnomads.co.corespring.lab;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Office {
    private String ownerName;
    private int numLeaseHolders;
    private int stories;
}
