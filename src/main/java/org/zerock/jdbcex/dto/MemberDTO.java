package org.zerock.jdbcex.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private String mid;
    private String mpw;
    private String mname;
    private String uuid;

}
