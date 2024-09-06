package com.wrfrn.wakfu.dto;

import lombok.Data;

@Data
public class CharacterDTO {
    private Integer characterId;
    private String characterName;
    private Integer characterLvl;
    private Integer chests;
    private ClassDTO classDTO;
    private UserDTO userDTO;


}

