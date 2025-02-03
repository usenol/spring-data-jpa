package com.usenol.dto;

import com.usenol.entities.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOHome {
    private Long id;
    private BigDecimal price;
    private List<DTORoom> rooms = new ArrayList<>();
}
