package net.runelite.client.plugins.fishing;

import java.time.Instant;
import lombok.Value;
import net.runelite.api.coords.WorldPoint;

@Value
public class AerialFishingSpot {

    private final WorldPoint loc;
    private final Instant time;
}
