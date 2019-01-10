package the.daniel.session;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 16:44
 */
@Data
@NoArgsConstructor
public class Session {

    //用户唯一标识
    private String userId;

    private String userName;

    public Session(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userId + ":" + userName;
    }
}
