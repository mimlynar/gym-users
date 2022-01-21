package com.mmlynarczyk.gymusers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDetails {

    String firstName;
    String lastName;
    String gymCode;
    String gymAddress;
}
