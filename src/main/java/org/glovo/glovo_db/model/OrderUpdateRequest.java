package org.glovo.glovo_db.model;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import java.util.Date;

@Data
public class OrderUpdateRequest {
    private Date modificationDateTime;
    private double totalAmount;
    @NotNull
    private String mobile;
}
