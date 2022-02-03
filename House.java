package platform.codingnomads.co.corespring.lab;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class House {
    private String ownerName;
    private int numBedrooms;
    private int numBathrooms;
}
