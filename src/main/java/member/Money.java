package member;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Money {
    private String memberId;
    private String pw;
    private String name;
    private String day;
    private int money;
}
