package com.devsuperior.dslist.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;
}
